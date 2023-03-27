-- Database creation sql
CREATE TABLE Employees (
    employee_id INT NOT NULL,
    role CHAR(1) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    PRIMARY KEY (employee_id)
);
    
CREATE TABLE Roles (
	role CHAR(1) NOT NULL,
    read_access TINYINT NOT NULL,
    write_access TINYINT NOT NULL,
    create_access TINYINT NOT NULL,
    PRIMARY KEY (role)
);
 -- Add foreign key
ALTER TABLE employees
ADD CONSTRAINT role_fk
FOREIGN KEY (role)
REFERENCES Roles(role)

CREATE TABLE Financial (
    employee_id INT NOT NULL,
    salary INT,
    tenure_months INT,
    PRIMARY KEY (employee_id)
)

ALTER TABLE employees
ADD CONSTRAINT fin_fk
FOREIGN KEY (employee_id)
REFERENCES financial(employee_id)

INSERT INTO financial
VALUES 
(0, 100000, 38),
(1, 100000, 26),
(2, 80000, 26),
(3, 80000, 20),
(4, 70000, 30),
(5, 70000, 22)

INSERT INTO roles
VALUES 
('A', 1, 1, 1),
('M', 1, 1, 0),
('U', 1, 0, 0)

-- Should be done last due to foreign key restraints on other tables
INSERT INTO Employees
VALUES 
(0, 'A', "John", "Doe"),
(1, 'A', "Jane", "Doe"),
(2, 'M', "Kevin", "Mulrooney"),
(3, 'M', "Delilah", "Tees"),
(4, 'U', "Maddie", "Goldman"),
(5, 'U', "Stephen", "Smith")

INSERT INTO financial
VALUES
(6, 90000, 6),
(7, 89000, 8),
(8, 110000, 12),
(9, 68000, 3),
(10, 95000, 18)

INSERT INTO employees
VALUES
(6, 'A', "Joe", "Danger"),
(7, 'M', "Isabella", "Martinez"),
(8, 'A', "Courtney", "McNeil"),
(9, 'U', "Clarice", "Marston"),
(10,'U', "Mary-Beth", "Morgan")

-- Join employees with financial on employee_id
SELECT *
FROM employees as e
INNER JOIN financial as f ON e.employee_id=f.employee_id
-- Display role, salary and tenure months from the joined table from employees and financial
SELECT e.role, f.salary, f.tenure_months
FROM employees as e
INNER JOIN financial as f ON e.employee_id=f.employee_id
-- First, last name and salary of highest earner
SELECT e.first_name, e.last_name, MAX(f.salary)
FROM employees as e
INNER JOIN financial as f ON e.employee_id=f.employee_id
-- Find name of person making the most salary, no salary included
SELECT first_name, last_name
FROM
    (SELECT e.first_name, e.last_name, MAX(f.tenure_months)
    FROM employees as e
    INNER JOIN financial as f ON e.employee_id=f.employee_id) temp
-- Show highest salaries of each role
SELECT role, MAX(salary)
FROM employees as e
INNER JOIN financial as f ON e.employee_id=f.employee_id
GROUP BY role
-- Show highest earners in each role by name
SELECT first_name, last_name, role
FROM
    (SELECT first_name, last_name, role, MAX(salary)
    FROM employees as e
    INNER JOIN financial as f ON e.employee_id=f.employee_id
    GROUP BY role) temp