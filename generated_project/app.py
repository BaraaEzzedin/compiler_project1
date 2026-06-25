from flask import Flask, render_template, redirect, url_for, request
import os
from werkzeug.utils import secure_filename

app = Flask(__name__)

UPLOAD_FOLDER = "static/images"
products = [{"id": 1, "name": "Product 1"}, {"id": 2, "name": "Product 2"}]

@app.route("/")
def list_products():
        return render_template("list.html", products=products)

@app.route("/add")
def add_product():
        if request.method == "POST":
            name = request.form.get("name")
            price = request.form.get("price")
            description = request.form.get("description")
            image = request.files["image"]
            if image and image.filename != "":
                filename = secure_filename(image.filename)
                image_path = os.path.join(app.config["UPLOAD_FOLDER"], filename)
                image.save(image_path)
            else:
                filename = None
            product = {"id": len(products) + 1, "name": name, "price": price, "description": description, "image": image}
            products.append(product)
            return redirect(url_for("list_products"))
        return render_template("add.html")

@app.route("/product/<int:product_id>")
def view_product(product_id):
        for product in products:
            if product["id"] == product_id:
                return render_template("view.html", product=product)
        return "Product not found"

@app.route("/delete/<int:product_id>")
def delete_product(product_id):
        global products
        product = next((p for p in products if p["id"] == product_id), None)
        if product == None:
            return "Not Found"
        image_path = os.path.join(app.config["UPLOAD_FOLDER"], product["image"])
        if product["image"] != "default.jpg" and os.path.exists(image_path):
            os.remove(image_path)
        new_products = []
        for p in products:
            if p["id"] != product_id:
                new_products.append(p)
        products = new_products
        return redirect(url_for("list_products"))


if __name__ == "__main__":
    app.run(debug=True)
