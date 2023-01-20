DROP TABLE IF EXISTS dog;
CREATE TABLE dog
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    name   VARCHAR(50) NOT NULL,
    height DOUBLE(8)   NOT NULL,
    weight DOUBLE(8)   NOT NULL,
    age    INT(8)      NOT NULL
);
