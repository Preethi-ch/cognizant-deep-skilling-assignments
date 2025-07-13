
CREATE TABLE department (
  id BIGINT PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE employee (
  id BIGINT PRIMARY KEY,
  name VARCHAR(255),
  salary DOUBLE,
  department_id BIGINT,
  CONSTRAINT fk_dept FOREIGN KEY (department_id) REFERENCES department(id)
);
