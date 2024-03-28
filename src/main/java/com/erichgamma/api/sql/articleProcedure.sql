DROP PROCEDURE IF EXISTS insertUsersLoop;
DROP PROCEDURE IF EXISTS insertArticlesLoop;

CREATE PROCEDURE insertUsersLoop()
BEGIN
    DECLARE i INT DEFAULT 1;
    WHILE i <= 10
        DO
            INSERT INTO users(id, username, password, name)
            VALUES (i, concat('username', i), concat('password', i), concat('name', i));
            SET i = i + 1;
END WHILE;
END;

CREATE PROCEDURE insertArticlesLoop()
BEGIN
    DECLARE i INT DEFAULT 1;
    WHILE i <= 50
        DO
            INSERT INTO articles(id, title, content, user_id, register_date)
            VALUES (i, concat('title', i), concat('content', i), (i % 10 + 1), concat('registerDate', i));
            SET i = i + 1;
END WHILE;
END;

CALL insertUsersLoop;
CALL insertArticlesLoop;
-- SELECT * FROM articles;
-- SELECT * FROM users;
