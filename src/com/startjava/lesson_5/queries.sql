SELECT * FROM jaegers;

SELECT * FROM jaegers
WHERE status != 'Destroyed';

SELECT * FROM jaegers
WHERE mark IN ('Mark-1', 'Mark-6');

SELECT * FROM jaegers
ORDER BY mark DESC;

SELECT * FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers);

SELECT * FROM jaegers
WHERE kaijukill = (SELECT MIN(kaijukill) FROM jaegers);

SELECT * FROM jaegers
WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers);

SELECT AVG(weight) AS Average FROM jaegers;

UPDATE jaegers SET kaijukill = kaijukill + 1
WHERE status = 'Active';

DELETE FROM jaegers WHERE status = 'Destroyed';

--psql kristinaglushkova -h 127.0.0.1 -d jaegers -f /Users/kristinaglushkova/Desktop/StartJava/src/com/startjava/lesson_5/init_db.sql -f /Users/kristinaglushkova/Desktop/StartJava/src/com/startjava/lesson_5/queries.sql