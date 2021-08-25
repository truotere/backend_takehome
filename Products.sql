CREATE TABLE products (
    id INTEGER PRIMARY KEY,
    name TEXT,
    category TEXT
);

CREATE TABLE product_price_history (
    name TEXT,
    price REAL,
    start_date DATE,
    end_date DATE,
    FOREIGN KEY (name) REFERENCES products(name)
);

SELECT *
FROM products
JOIN product_price_history
    ON products.name = product_price_history.name;