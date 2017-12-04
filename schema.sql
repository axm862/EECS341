CREATE TABLE Handlebar(
	handlebarID varchar(100) NOT NULL,
	width int NOT NULL,
	handlebarMaterialType ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	PRIMARY KEY(handlebarID)
);

CREATE TABLE Crankset(
	cranksetID varchar(100) NOT NULL,
	PRIMARY KEY(cranksetID)
);

CREATE TABLE Wheel(
	wheelID varchar(100) NOT NULL,
	wheelSize decimal NOT NULL,
	PRIMARY KEY(wheelID)
);

CREATE TABLE Frame(
	frameID varchar(100) NOT NULL,
	frameType varchar(100) NOT NULL,
	frameMaterialType varchar(100) NOT NULL,
	PRIMARY KEY(frameID)
);

CREATE TABLE Shifter(
	shifterID varchar(100) NOT NULL,
	family varchar(100) NOT NULL,
	PRIMARY KEY(shifterID)
);

CREATE TABLE Brake(
	brakeID varchar(100) NOT NULL,
	brakeType varchar(100) NOT NULL,
	PRIMARY KEY(brakeID)
);

CREATE TABLE FrontShock(
	frontShockID ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	fs_travel_mm int NOT NULL,
	PRIMARY KEY(frontShockID)
);

CREATE TABLE RearShock(
	rearShockID varchar(100) NOT NULL,
	rs_travel_mm int NOT NULL,
	PRIMARY KEY(rearShockID)
);

CREATE TABLE Derailleur(
	derailleurID varchar(100) NOT NULL,
	PRIMARY KEY(derailleurID)
);

CREATE TABLE Manufacturer(
	manufacturerName varchar(100) NOT NULL,
	address varchar(150) NOT NULL,
	website varchar(150) NOT NULL,
	PRIMARY KEY(manufacturerName)
);

CREATE TABLE Bike(
	modelName varchar(100) NOT NULL,
	manufacturerName varchar(100) NOT NULL,
	derailleurID varchar(100) NOT NULL,
	rearShockID varchar(100) NOT NULL,
	frontShockID ENUM('option1', 'option2', 'option3', 'option4') NOT NULL,
	brakeID varchar(100) NOT NULL,
	shifterID varchar(100) NOT NULL,
	frameID varchar(100) NOT NULL,
	wheelID varchar(100) NOT NULL,
	cranksetID varchar(100) NOT NULL,
	handlebarID varchar(100) NOT NULL,
	price decimal NOT NULL,
	year int NOT NULL,
	picture LONGBLOB NOT NULL,
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
