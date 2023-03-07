CREATE DATABASE mortgages;

USE mortgages;

CREATE TABLE users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE records (
  id INT PRIMARY KEY AUTO_INCREMENT,
  payment DECIMAL(10, 2) NOT NULL,
  pending_fee DECIMAL(10, 2) NOT NULL,
  amortized_fee DECIMAL(10, 2) NOT NULL,
  interest DECIMAL(10, 2) NOT NULL,
  fee DECIMAL(10, 2) NOT NULL
);
