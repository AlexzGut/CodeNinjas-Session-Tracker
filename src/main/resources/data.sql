-- DELETE FROM belt;

INSERT INTO sensei VALUES 
	('Alexander', 'Gutierrez'),
	('Navaz', 'Beheshti'),
	('Vishal', 'Thapa'),
    ('Sayuru','S');

INSERT INTO belt VALUES 
	('white'),
	('yellow'),
	('orange'),
	('green'),
	('blue'),
	('purple'),
	('brown'),
	('red'),
	('black');

INSERT INTO level VALUES 
	(1),
	(2),
	(3),
	(4),
	(5),
	(6),
	(7),
	(8),
	(9),
	(10);

INSERT INTO task VALUES 
	('build 1'),
	('build 2'),
	('build 3'),
	('quest'),
	('adventure');

--INSERT INTO ninja (firstName, lastName, beltColor, levelNumber, taskName, sensei)VALUES ('Adrian', 'S', 1, 7, 2, 1);

-- Queries
--SELECT n.firstName AS "First Name",
--	n.lastName AS "Last Name",
--	SUBSTRING(UPPER(b.beltColor), 1, 1)  + SUBSTRING(b.beltColor, 2, LEN(b.beltColor)) AS "Belt",
--	l.levelNumber AS "Level",
--	t.taskName AS "Working On",
--	s.firstName AS "Last Hamdled by"
--FROM ninja as n
--	INNER JOIN belt as b
--		ON n.beltColor = b.belt_id
--	INNER JOIN level as l
--		ON n.levelNumber = l.level_id
--	INNER JOIN task as t
--		ON n.taskName = t.task_id
--	INNER JOIN sensei as s
--		ON n.sensei = s.sensei_id;
--
--SELECT * FROM sensei;
--SELECT * FROM belt;
--SELECT * FROM level;
--SELECT * FROM task;

