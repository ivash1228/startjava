SELECT * FROM jaegers;

SELECT * FROM jaegers
WHERE status != 'Destroyed';

SELECT * FROM jaegers
WHERE mark = 'Mark-1' OR mark = 'Mark-6';

SELECT * FROM jaegers
ORDER BY mark DESC;

SELECT * FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers);

SELECT * FROM jaegers
WHERE kaijukill = (SELECT MIN(kaijukill) FROM jaegers);

SELECT * FROM jaegers
WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers);

SELECT AVG(weight) AS Average FROM jaegers;

SELECT modelname, kaijukill + 1 as kaijukill FROM jaegers
WHERE modelname = (SELECT modelname FROM jaegers WHERE status = 'Active');

--DELETE FROM jaegers WHERE status = 'Destroyed';

--psql kristinaglushkova -h 127.0.0.1 -d jaegers -f /Users/kristinaglushkova/Desktop/StartJava/src/com/startjava/lesson_5/init_db.sql -f /Users/kristinaglushkova/Desktop/StartJava/src/com/startjava/lesson_5/queries.sql