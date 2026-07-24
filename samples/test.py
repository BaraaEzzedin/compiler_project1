product = {
    "name": "Phone",
    "price": 300
}

render_template(
    "first.html",
    product=product
)

product = {
    "name": "Laptop",
    "price": 800
}

render_template(
    "second.html",
    product=product
)