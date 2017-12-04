CREATE TABLE Handlebar(
	handlebarID varchar(100) NOT NULL,
	width varchar(50) NOT NULL,
	handlebarMaterialType ENUM('Carbon', 'Metal Alloy', 'Metal') NOT NULL,
	PRIMARY KEY(handlebarID)
);

CREATE TABLE Crankset(
	cranksetID varchar(100) NOT NULL,
	PRIMARY KEY(cranksetID)
);

CREATE TABLE Wheel( 
	wheelID varchar(50) NOT NULL,
	wheelSize int NOT NULL,
	PRIMARY KEY(wheelID)
);

CREATE TABLE Frame( 
	frameID varchar(50) NOT NULL,
	frameType ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	frameMaterialType ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	PRIMARY KEY(frameID)
);

CREATE TABLE Shifter(
	shifterID varchar(50) NOT NULL,
	family ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	PRIMARY KEY(shifterID)
);

CREATE TABLE Brake( 
	brakeID varchar(50) NOT NULL,
	brakeType ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	PRIMARY KEY(brakeID)
);

CREATE TABLE FrontShock(
	frontShockID varchar(50) NOT NULL,
	fs_travel_mm int NOT NULL,
	PRIMARY KEY(frontShockID)
);

CREATE TABLE RearShock( 
	rearShockID varchar(50) NOT NULL,
	rs_travel_mm int NOT NULL,
	PRIMARY KEY(rearShockID)
);

CREATE TABLE Derailleur(
	derailleurID varchar(50) NOT NULL,
	PRIMARY KEY(derailleurID)
);

CREATE TABLE Manufacturer( 
	manufacturerName varchar(50) NOT NULL,
	address varchar(50) NOT NULL,
	website varchar(150) NOT NULL,
	PRIMARY KEY(manufacturerName)
);

CREATE TABLE Bike(
	modelName varchar(50) NOT NULL,
	manufacturerName varchar(50) NOT NULL,
	derailleurID varchar(50) NOT NULL,
	rearShockID varchar(50) NOT NULL,
	frontShockID varchar(50) NOT NULL,
	brakeID varchar(50) NOT NULL,
	shifterID varchar(50) NOT NULL,
	frameID varchar(50) NOT NULL,
	wheelID varchar(50) NOT NULL,
	cranksetID varchar(50) NOT NULL,
	handlebarID varchar(50) NOT NULL,
	price int NOT NULL,
	year int NOT NULL,
	picture varbinary(MAX) NOT NULL,
	FOREIGN KEY(manufacturerName) references Manufacturer(manufacturerName),
	FOREIGN KEY(derailleurID) references Derailleur(derailleurID),
	FOREIGN KEY(rearShockID) references RearShock(rearShockID),
	FOREIGN KEY(frontShockID) references FrontShock(frontShockID),
	FOREIGN KEY(brakeID) references Brake(brakeID),
	FOREIGN KEY(shifterID) references Shifter(shifterID),
	FOREIGN KEY(frameID) references Frame(frameID),
	FOREIGN KEY(wheelID) references Wheel(wheelID),
	FOREIGN KEY(cranksetID) references Crankset(cranksetID), 
	FOREIGN KEY(handlebarID) references Handlebar(handlebarID),
	PRIMARY KEY(modelName)
);
