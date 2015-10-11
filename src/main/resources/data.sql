INSERT INTO priority(id, name,priority) VALUES(1,'Urgent', 100)
INSERT INTO persons(id, age,gender,name,nickname,password)
VALUES(1, 67,1,'Piter','Pit','123');
INSERT INTO emails(id,PERSON_FROM_ID,PERSON_TO_ID,subject,message,priority_id)
VALUES (1,1,1,'test subject','TEST message',1);