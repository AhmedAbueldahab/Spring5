CREATE TABLE IF NOT EXISTS students (
  roll_num bigint(5) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  age int(3) NOT NULL,
  PRIMARY KEY (roll_num)
);

INSERT INTO students (roll_num, name, age) VALUES
	(1, 'Mahesh', 19),
	(2, 'Krishna', 18);