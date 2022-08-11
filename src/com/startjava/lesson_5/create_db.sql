CREATE DATABASE Jaegers;

CREATE TABLE Jaegers (
	id serial PRIMARY KEY,
	modelName VARCHAR ( 50 ) UNIQUE NOT NULL,
	mark  char(6) NOT NULL,
	height INT2,
	weight INT2,
    status char(10),
    origin char(10),
    launch INT2,
    kaijuKill INT2
);
