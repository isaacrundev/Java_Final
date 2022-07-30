CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;
CREATE SEQUENCE IF NOT EXISTS employee_seq;

CREATE TABLE IF NOT EXISTS employee(
    employee_id BIGINT NOT NULL DEFAULT nextval('employee_seq') PRIMARY KEY,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL
    email VARCHAR(100) NOT NULL
    gender VARCHAR(100) NOT NULL
);


CREATE SEQUENCE IF NOT EXISTS clients_seq;
CREATE TABLE IF NOT EXISTS clients(
   companyName BIGINT NOT NULL DEFAULT nextval('clients_seq') PRIMARY KEY,
   contactPerson VARCHAR(100) NOT NULL,
   phoneNumber VARCHAR(100) NOT NULL,
   emailAddress VARCHAR(100) NOT NULL,
   department VARCHAR(100) NOT NULL,
   position VARCHAR(100) NOT NULL,
   notes VARCHAR(100) NOT NULL
);


CREATE SEQUENCE IF NOT EXISTS products_seq;
CREATE TABLE IF NOT EXISTS products(
    products_id BIGINT NOT NULL DEFAULT nextval('products_seq') PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);