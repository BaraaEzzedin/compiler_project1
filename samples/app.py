products = []
categories = []
site_name = "Shop"

def home():
    return render_template(
        "products.html",
        products=products,
        categories=categories,
        site_name=site_name
    )