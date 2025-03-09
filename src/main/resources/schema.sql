--DROP TABLE ninja;
--DROP TABLE belt;
--DROP TABLE level;
--DROP TABLE task;
--DROP TABLE sensei;

-- Table definitions
CREATE TABLE ninja (
	ninja_id INTEGER NOT NULL IDENTITY(1,1),
	firstName VARCHAR(100),
	lastName VARCHAR(100),
	beltColor INTEGER NOT NULL,
	levelNumber INTEGER NOT NULL,
	taskName INTEGER NOT NULL,
	sensei INTEGER,
	updatedON DATE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE sensei (
	sensei_id INTEGER NOT NULL IDENTITY(1,1),
	firstName VARCHAR(100),
	lastName VARCHAR(100)
);

CREATE TABLE belt (
	belt_id INTEGER NOT NULL IDENTITY(1,1),
	beltColor VARCHAR(30) NOT NULL
);

CREATE TABLE level (
	level_id INTEGER NOT NULL IDENTITY(1,1),
	levelNumber INTEGER NOT NULL
);

CREATE TABLE task (
	task_id INTEGER NOT NULL IDENTITY(1,1),
	taskName VARCHAR(50) NOT NULL
);

-- Primary Keys
ALTER TABLE ninja
	ADD CONSTRAINT ninja_pk
	PRIMARY KEY (ninja_id);

ALTER TABLE sensei
	ADD CONSTRAINT sensei_pk
	PRIMARY KEY (sensei_id)

ALTER TABLE belt
	ADD CONSTRAINT belt_pk
	PRIMARY KEY (belt_id);

ALTER TABLE level
	ADD CONSTRAINT level_pk
	PRIMARY KEY (level_id);

ALTER TABLE task
	ADD CONSTRAINT task_pk
	PRIMARY KEY (task_id);

-- Foreign Keys (relationships)

-- A Ninja must have one and only one belt
-- A Belt may be wear by zero or more ninjas
ALTER TABLE ninja
	ADD CONSTRAINT ninja_belt_color_fk
	FOREIGN KEY (beltColor)
	REFERENCES belt(belt_id);

-- A Ninja may be assisted by zero or one Sensei
-- A Sensei may assis zero or more Ninjas
ALTER TABLE ninja
	ADD	CONSTRAINT ninja_sensei_fk
	FOREIGN KEY (sensei)
	REFERENCES sensei(sensei_id);

-- A Ninja must be in one and only one level
-- A Level may be for zero or more Ninjas
ALTER TABLE ninja
	ADD CONSTRAINT ninja_levelNumber_fk
	FOREIGN KEY (levelNumber)
	REFERENCES level(level_id);

-- A Ninja must work on one and only one Task
-- A Task may be assigned to zero or more Ninjas
ALTER TABLE ninja 
	ADD CONSTRAINT ninja_taskName_fk
	FOREIGN KEY (taskName)
	REFERENCES task(task_id);

-- Check constraints 
ALTER TABLE level
	ADD CONSTRAINT level_levelNumber_between_0_AND_11
	CHECK (levelNumber BETWEEN 1 AND 11);


