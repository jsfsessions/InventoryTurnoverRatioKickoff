<!-- Depending on how you execute these statements it my require to add ";" after each statement or not -->

CREATE TABLE grouptable (userid VARCHAR(255) NOT NULL, groupid VARCHAR(255), PRIMARY KEY (userid));
CREATE TABLE usertable (userid VARCHAR(255) NOT NULL, password VARCHAR(255), PRIMARY KEY (userid));

<!-- password is 'tyler' but here is encryped with SHA-256 algorithm
INSERT INTO usertable (userid, password) VALUES ('jsfsessions@gmail.com', 'b258f8614815e4157b9eab23d55ac5d0ff77a97ef4a63800089141225d560eee');
<!-- password is 'leonard' but here is encryped with SHA-256 algorithm
INSERT INTO usertable (userid, password) VALUES ('leoprivacy@gmail.com', 'b76aefa8fe4304f650962fb4af77b4db4b13d34ac9615391126027232ec16822');

INSERT INTO grouptable (userid, groupid) VALUES ('jsfsessions@gmail.com', 'ADMINS');
INSERT INTO grouptable (userid, groupid) VALUES ('leoprivacy@gmail.com', 'USERS');

