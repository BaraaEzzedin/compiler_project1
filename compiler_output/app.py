import json

def jsonLoad(path):
    with open(path, "r", encoding="utf-8") as f:
        return json.load(f)

def jsonSave(path, data):
    with open(path, "w", encoding="utf-8") as f:
        json.dump(data, f, indent=4)

import os
from flask import Flask, render_template, redirect, url_for, request, send_from_directory
from werkzeug.utils import secure_filename
app = Flask(__name__)
UPLOAD_FOLDER = "static/images"
app.config["UPLOAD_FOLDER"] = UPLOAD_FOLDER
products = jsonLoad("./products.json")
@app.route("/")
def list_products():
    return render_template("list.html", products=products)

@app.route("/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        name = request.form.get("name")
        price = request.form.get("price")
        description = request.form.get("description").strip()
        image = request.files["image"]
        filename = None
        if image and image.filename != "":
            filename = secure_filename(image.filename)
            image_path = os.path.join(app.config["UPLOAD_FOLDER"], filename)
            image.save(image_path)
        else:
            filename = None

        product = {"id": len(products) + 1, "name": name, "price": price, "description": description, "image": filename}
        products.append(product)
        jsonSave("./products.json", products)
        return redirect(url_for("list_products"))

    return render_template("add.html")

@app.route("/products/<int:product_id>")
def view_product(product_id):
    for product in products:
        if product["id"] == product_id:
            return render_template(f"products/{product_id}.html")


    return "Product not found"

@app.route("/products/<int:product_id>/edit", methods=["GET", "POST"])
def edit_product(product_id):
    if request.method == "POST":
        for product in products:
            if product["id"] == product_id:
                product["name"] = request.form.get("name")
                product["price"] = request.form.get("price")
                product["description"] = request.form.get("description").strip()
                image = request.files.get("image")
                if image and image.filename != "":
                    filename = secure_filename(image.filename)
                    image_path = os.path.join(app.config["UPLOAD_FOLDER"], filename)
                    image.save(image_path)
                    product["image"] = filename

                jsonSave("./products.json", products)
                return redirect(url_for("list_products"))


        return "Product not found"

    return send_from_directory("templates/products", str(product_id) + "_edit.html")

if __name__ == "__main__":
    app.run(debug=True)

