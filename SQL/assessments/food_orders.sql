customers
-- Drop existing database if it exists
DROP DATABASE IF EXISTS food_delivery_db;

-- Create the database
CREATE DATABASE food_delivery_db;
USE food_delivery_db;

-- Create tables with appropriate constraints (Primary Keys, Foreign Keys, NOT NULL)

CREATE TABLE User (
    user_id INT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE Restaurant (
    restaurant_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    phone VARCHAR(20) UNIQUE,
    description TEXT
);

CREATE TABLE DeliveryPerson (
    delivery_person_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone VARCHAR(20) UNIQUE,
    current_location VARCHAR(255)
);

CREATE TABLE Admin (
    admin_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE MenuItem (
    menu_item_id INT PRIMARY KEY,
    restaurant_id INT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    image_url VARCHAR(255),
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant(restaurant_id)
);

CREATE TABLE OrderTable (
    order_id INT PRIMARY KEY,
    user_id INT,
    restaurant_id INT,
    delivery_person_id INT,
    order_date_time DATETIME NOT NULL,
    total_amount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (restaurant_id) REFERENCES Restaurant(restaurant_id),
    FOREIGN KEY (delivery_person_id) REFERENCES DeliveryPerson(delivery_person_id)
);

CREATE TABLE OrderDetails (
    order_id INT,
    menu_item_id INT,
    quantity INT NOT NULL,
    PRIMARY KEY (order_id, menu_item_id),
    FOREIGN KEY (order_id) REFERENCES OrderTable(order_id),
    FOREIGN KEY (menu_item_id) REFERENCES MenuItem(menu_item_id)
);

--
-- Data Insertion (DML Operations)
--

-- Insert 5 records into each table. Use realistic data.

-- User table
INSERT INTO User (user_id, username, email, password) VALUES
(1, 'Alice', 'alice@example.com', 'hashed_pass_1'),
(2, 'Bob', 'bob@example.com', 'hashed_pass_2'),
(3, 'Charlie', 'charlie@example.com', 'hashed_pass_3'),
(4, 'Diana', 'diana@example.com', 'hashed_pass_4'),
(5, 'Eve', 'eve@example.com', 'hashed_pass_5');

-- Restaurant table
INSERT INTO Restaurant (restaurant_id, name, address, phone, description) VALUES
(101, 'Pasta Paradise', '123 Main St', '555-1234', 'Authentic Italian cuisine.'),
(102, 'Burger Barn', '456 Oak Ave', '555-5678', 'Gourmet burgers and fries.'),
(103, 'Sushi Spot', '789 Pine Ln', '555-9012', 'Fresh and delicious sushi.'),
(104, 'The Green Leaf', '101 Elm Blvd', '555-3456', 'Organic and vegan.'),
(105, 'Taco Town', '202 Maple Dr', '555-7890', 'Mexican food.');

-- DeliveryPerson table
INSERT INTO DeliveryPerson (delivery_person_id, name, phone, current_location) VALUES
(201, 'David', '555-1111', 'Downtown'),
(202, 'Frank', '555-2222', 'Uptown'),
(203, 'Grace', '555-3333', 'Midtown'),
(204, 'Heidi', '555-4444', 'East Side'),
(205, 'Ivan', '555-5555', 'West Side');

-- Admin table
INSERT INTO Admin (admin_id, name, email) VALUES
(301, 'Administrator', 'admin@food-delivery.com'),
(302, 'Moderator', 'mod@food-delivery.com'),
(303, 'Support', 'support@food-delivery.com'),
(304, 'Billing', 'billing@food-delivery.com'),
(305, 'Marketing', 'marketing@food-delivery.com');

-- MenuItem table
INSERT INTO MenuItem (menu_item_id, restaurant_id, name, description, price) VALUES
(1, 101, 'Spaghetti Carbonara', 'Classic spaghetti with egg and bacon.', 15.50),
(2, 101, 'Lasagna', 'Layers of pasta with meat and cheese.', 17.00),
(3, 102, 'Classic Cheeseburger', 'Beef patty with cheese, lettuce, tomato.', 12.00),
(4, 102, 'Veggie Burger', 'Beyond meat patty with avocado.', 13.50),
(5, 103, 'California Roll', 'Crab, avocado, and cucumber roll.', 9.00),
(6, 103, 'Sashimi Platter', 'Assortment of fresh fish.', 25.00),
(7, 104, 'Quinoa Salad', 'Salad with quinoa, nuts, and greens.', 11.00),
(8, 105, 'Beef Tacos', 'Three tacos with seasoned beef.', 10.50);

-- OrderTable
INSERT INTO OrderTable (order_id, user_id, restaurant_id, delivery_person_id, order_date_time, total_amount) VALUES
(1001, 1, 101, 201, '2025-05-09 18:30:00', 32.50),
(1002, 2, 102, 202, '2025-05-09 19:00:00', 12.00),
(1003, 3, 103, 203, '2025-05-09 19:15:00', 9.00),
(1004, 4, 104, 204, '2025-05-09 20:00:00', 11.00),
(1005, 5, 105, 205, '2025-05-09 21:00:00', 10.50);

-- OrderDetails
INSERT INTO OrderDetails (order_id, menu_item_id, quantity) VALUES
(1001, 1, 1),
(1001, 2, 1),
(1002, 3, 1),
(1003, 5, 1),
(1004, 7, 1),
(1005, 8, 1);


--
-- Queries (Joins, Subqueries, Aggregate Functions)
--

-- Join: Get user's name and the restaurant they ordered from
SELECT u.username, r.name AS restaurant_name
FROM User u
JOIN OrderTable o ON u.user_id = o.user_id
JOIN Restaurant r ON o.restaurant_id = r.restaurant_id;

-- Subquery: Find the restaurants that offer a menu item with a price greater than 20
SELECT name
FROM Restaurant
WHERE restaurant_id IN (
    SELECT restaurant_id
    FROM MenuItem
    WHERE price > 20
);

-- Aggregate Function: Calculate the average total amount of all orders
SELECT AVG(total_amount) AS average_order_amount
FROM OrderTable;

-- Group By & Having: Find restaurants with more than 1 order
SELECT r.name, COUNT(o.order_id) AS total_orders
FROM Restaurant r
JOIN OrderTable o ON r.restaurant_id = o.restaurant_id
GROUP BY r.name
HAVING total_orders > 1;


--
-- DML Operations

-- Update: Change the location of a delivery person
UPDATE DeliveryPerson
SET current_location = 'North Side'
WHERE delivery_person_id = 201;

-- Delete: Delete a menu item
DELETE FROM MenuItem
WHERE menu_item_id = 6;



USE food_delivery_db;
SELECT * FROM menuitem;