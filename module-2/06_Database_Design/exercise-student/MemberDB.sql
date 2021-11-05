BEGIN TRANSACTION;
DROP TABLE IF EXISTS member, interest_group, member_group, event, event_group CASCADE;

CREATE TABLE member (
  member_number serial,
  last_name varchar(50) UNIQUE NOT NULL,
  first_name varchar(25) UNIQUE NOT NULL,
  email_address varchar(50) UNIQUE NOT NULL,
  phone_number int,
  date_of_birth date NOT NULL,
  reminder_emails boolean NOT NULL,
  CONSTRAINT PK_member PRIMARY KEY (member_number)
  );
  
  CREATE TABLE interest_group(
  group_number serial,
  name varchar (80) UNIQUE NOT NULL,
  CONSTRAINT PK_interest_group PRIMARY KEY (group_number)
 );
  
  CREATE TABLE member_group(
  member_number int NOT NULL,
  group_number int NOT NULL,
  CONSTRAINT PK_member_group PRIMARY KEY (member_number , group_number),
  CONSTRAINT FK_1 FOREIGN KEY (group_number) REFERENCES interest_group(group_number),
  CONSTRAINT FK_2 FOREIGN KEY (member_number) REFERENCES member(member_number)
  );
  CREATE TABLE event(
  event_number serial,
  event_name varchar(65) NOT NULL,
  event_description varchar(200) NOT NULL,
  start_date_time date NOT NULL,
  duration int CHECK(duration>30) ,
  group_number int NOT NULL,
  CONSTRAINT PK_event PRIMARY KEY (event_number),
  CONSTRAINT FK_group_event FOREIGN KEY(group_number) REFERENCES interest_group(group_number)
  
);
  
  CREATE TABLE event_member(
  event_number int NOT NULL,
  member_number int NOT NULL,
  CONSTRAINT PK_event_member PRIMARY KEY (event_number,member_number),
  CONSTRAINT FK_event_1 FOREIGN KEY (event_number) REFERENCES event(event_number),
  CONSTRAINT FK_event_2 FOREIGN KEY (member_number) REFERENCES member(member_number)
  );
  
  COMMIT;
  ROLLBACK;
  
  