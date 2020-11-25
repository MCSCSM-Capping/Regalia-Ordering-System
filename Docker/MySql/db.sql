CREATE TABLE  states(
    STATE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(45) NOT NULL DEFAULT ''
    );



INSERT INTO states (STATE_ID, NAME) VALUES (1, 'Alabama');
INSERT INTO states (STATE_ID, NAME) VALUES (2, 'Alaska');
INSERT INTO states (STATE_ID, NAME) VALUES (3, 'Arizona');
INSERT INTO states (STATE_ID, NAME) VALUES (4, 'Arkansas');
INSERT INTO states (STATE_ID, NAME) VALUES (5, 'California');
INSERT INTO states (STATE_ID, NAME) VALUES (6, 'Colorado');
INSERT INTO states (STATE_ID, NAME) VALUES (7, 'Connecticut');
INSERT INTO states (STATE_ID, NAME) VALUES (8, 'Delaware');
INSERT INTO states (STATE_ID, NAME) VALUES (9, 'Florida');
INSERT INTO states (STATE_ID, NAME) VALUES (10, 'Georgia');
INSERT INTO states (STATE_ID, NAME) VALUES (11, 'Hawaii');
INSERT INTO states (STATE_ID, NAME) VALUES (12, 'Idaho');
INSERT INTO states (STATE_ID, NAME) VALUES (13, 'Illinois');
INSERT INTO states (STATE_ID, NAME) VALUES (14, 'Indiana');
INSERT INTO states (STATE_ID, NAME) VALUES (15, 'Iowa');
INSERT INTO states (STATE_ID, NAME) VALUES (16, 'Kansas');
INSERT INTO states (STATE_ID, NAME) VALUES (17, 'Kentucky');
INSERT INTO states (STATE_ID, NAME) VALUES (18, 'Louisiana');
INSERT INTO states (STATE_ID, NAME) VALUES (19, 'Maine');
INSERT INTO states (STATE_ID, NAME) VALUES (20, 'Maryland');
INSERT INTO states (STATE_ID, NAME) VALUES (21, 'Massachusetts');
INSERT INTO states (STATE_ID, NAME) VALUES (22, 'Michigan');
INSERT INTO states (STATE_ID, NAME) VALUES (23, 'Minnesota');
INSERT INTO states (STATE_ID, NAME) VALUES (24, 'Mississippi');
INSERT INTO states (STATE_ID, NAME) VALUES (25, 'Missouri');
INSERT INTO states (STATE_ID, NAME) VALUES (26, 'Montana');
INSERT INTO states (STATE_ID, NAME) VALUES (27, 'Nebraska');
INSERT INTO states (STATE_ID, NAME) VALUES (28, 'Nevada');
INSERT INTO states (STATE_ID, NAME) VALUES (29, 'New Hampshire');
INSERT INTO states (STATE_ID, NAME) VALUES (30, 'New Jersey');
INSERT INTO states (STATE_ID, NAME) VALUES (31, 'New Mexico');
INSERT INTO states (STATE_ID, NAME) VALUES (32, 'New York');
INSERT INTO states (STATE_ID, NAME) VALUES (33, 'North Carolina');
INSERT INTO states (STATE_ID, NAME) VALUES (34, 'North Dakota');
INSERT INTO states (STATE_ID, NAME) VALUES (35, 'Ohio');
INSERT INTO states (STATE_ID, NAME) VALUES (36, 'Oklahoma');
INSERT INTO states (STATE_ID, NAME) VALUES (37, 'Oregon');
INSERT INTO states (STATE_ID, NAME) VALUES (38, 'Pennsylvania');
INSERT INTO states (STATE_ID, NAME) VALUES (39, 'Rhode Island');
INSERT INTO states (STATE_ID, NAME) VALUES (40, 'South Carolina');
INSERT INTO states (STATE_ID, NAME) VALUES (41, 'South Dakota');
INSERT INTO states (STATE_ID, NAME) VALUES (42, 'Tennessee');
INSERT INTO states (STATE_ID, NAME) VALUES (43, 'Texas');
INSERT INTO states (STATE_ID, NAME) VALUES (44, 'Utah');
INSERT INTO states (STATE_ID, NAME) VALUES (45, 'Vermont');
INSERT INTO states (STATE_ID, NAME) VALUES (46, 'Virginia');
INSERT INTO states (STATE_ID, NAME) VALUES (47, 'Washington');
INSERT INTO states (STATE_ID, NAME) VALUES (48, 'West Virginia');
INSERT INTO states (STATE_ID, NAME) VALUES (49, 'Wisconsin');
INSERT INTO states (STATE_ID, NAME) VALUES (50, 'Wyoming');



CREATE TABLE roles (
        ROLE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
        NAME VARCHAR(45) NOT NULL DEFAULT ''
    );


INSERT INTO roles (ROLE_ID, NAME) VALUES (1, 'USER');
INSERT INTO roles (ROLE_ID, NAME) VALUES (2, 'ADMIN');




CREATE TABLE department (
    DPT_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(80) NOT NULL DEFAULT ''
    );


INSERT INTO department (DPT_ID, NAME) VALUES (1, 'Academic Affairs');
INSERT INTO department (DPT_ID, NAME) VALUES (2, 'Academic Enhancement');
INSERT INTO department (DPT_ID, NAME) VALUES (3, 'Academic Grants');
INSERT INTO department (DPT_ID, NAME) VALUES (4, 'Accommodations Accessibility');
INSERT INTO department (DPT_ID, NAME) VALUES (5, 'Advancement Office');
INSERT INTO department (DPT_ID, NAME) VALUES (6, 'Advancement Services');
INSERT INTO department (DPT_ID, NAME) VALUES (7, 'Advising Academic Services');
INSERT INTO department (DPT_ID, NAME) VALUES (8, 'Annual Fund Office');
INSERT INTO department (DPT_ID, NAME) VALUES (9, 'Athletics');
INSERT INTO department (DPT_ID, NAME) VALUES (10, 'Budget, Planning &amp; Analysis');
INSERT INTO department (DPT_ID, NAME) VALUES (11, 'Business Office');
INSERT INTO department (DPT_ID, NAME) VALUES (12, 'CFO');
INSERT INTO department (DPT_ID, NAME) VALUES (13, 'Campus Ministry');
INSERT INTO department (DPT_ID, NAME) VALUES (14, 'Center for Career Services');
INSERT INTO department (DPT_ID, NAME) VALUES (15, 'Center for Multicultural Affairs');
INSERT INTO department (DPT_ID, NAME) VALUES (16, 'College Activities');
INSERT INTO department (DPT_ID, NAME) VALUES (17, 'College Marketing &amp Communications');
INSERT INTO department (DPT_ID, NAME) VALUES (18, 'Computer Store');
INSERT INTO department (DPT_ID, NAME) VALUES (19, 'Counseling Center');
INSERT INTO department (DPT_ID, NAME) VALUES (20, 'Digital Publication Center');
INSERT INTO department (DPT_ID, NAME) VALUES (21, 'Dining Services');
INSERT INTO department (DPT_ID, NAME) VALUES (22, 'Enrollment Management');
INSERT INTO department (DPT_ID, NAME) VALUES (23, 'Executive Affairs');
INSERT INTO department (DPT_ID, NAME) VALUES (24, 'First Year Programs Leadership Dev');
INSERT INTO department (DPT_ID, NAME) VALUES (25, 'Grounds');
INSERT INTO department (DPT_ID, NAME) VALUES (26, 'Health Services');
INSERT INTO department (DPT_ID, NAME) VALUES (27, 'Housing Residential Life');
INSERT INTO department (DPT_ID, NAME) VALUES (28, 'Human Resources');
INSERT INTO department (DPT_ID, NAME) VALUES (29, 'Information Technology');
INSERT INTO department (DPT_ID, NAME) VALUES (30, 'Institutional Research Planning');
INSERT INTO department (DPT_ID, NAME) VALUES (31, 'International Student Services');
INSERT INTO department (DPT_ID, NAME) VALUES (32, 'Learning Center');
INSERT INTO department (DPT_ID, NAME) VALUES (33, 'Liberty Partnership');
INSERT INTO department (DPT_ID, NAME) VALUES (34, 'Library');
INSERT INTO department (DPT_ID, NAME) VALUES (35, 'MIPO');
INSERT INTO department (DPT_ID, NAME) VALUES (36, 'Marist International Programs');
INSERT INTO department (DPT_ID, NAME) VALUES (37, 'Mechanical Services');
INSERT INTO department (DPT_ID, NAME) VALUES (38, 'Media Center');
INSERT INTO department (DPT_ID, NAME) VALUES (39, 'NYC Executive Center');
INSERT INTO department (DPT_ID, NAME) VALUES (40, 'Payroll');
INSERT INTO department (DPT_ID, NAME) VALUES (41, 'Physical Plant');
INSERT INTO department (DPT_ID, NAME) VALUES (42, 'Physician Assistant Program');
INSERT INTO department (DPT_ID, NAME) VALUES (43, 'Postal Services');
INSERT INTO department (DPT_ID, NAME) VALUES (44, 'Presidents Office');
INSERT INTO department (DPT_ID, NAME) VALUES (45, 'Purchasing');
INSERT INTO department (DPT_ID, NAME) VALUES (46, 'Registrars Office');
INSERT INTO department (DPT_ID, NAME) VALUES (47, 'School Social Behavioral Sciences');
INSERT INTO department (DPT_ID, NAME) VALUES (48, 'School of Communication the Arts');
INSERT INTO department (DPT_ID, NAME) VALUES (49, 'School of Computer Science Math');
INSERT INTO department (DPT_ID, NAME) VALUES (50, 'School of Liberal Arts');
INSERT INTO department (DPT_ID, NAME) VALUES (51, 'School of Management');
INSERT INTO department (DPT_ID, NAME) VALUES (52, 'School of Professional Programs');
INSERT INTO department (DPT_ID, NAME) VALUES (53, 'School of Science');
INSERT INTO department (DPT_ID, NAME) VALUES (54, 'Security');
INSERT INTO department (DPT_ID, NAME) VALUES (55, 'Student Affairs');
INSERT INTO department (DPT_ID, NAME) VALUES (56, 'Student Financial Services');
INSERT INTO department (DPT_ID, NAME) VALUES (57, 'Upward Bound');
INSERT INTO department (DPT_ID, NAME) VALUES (58, 'Other');



CREATE TABLE degree (
    DEGREE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(45) NOT NULL DEFAULT ''
    );


INSERT INTO degree (DEGREE_ID, NAME) VALUES (1, 'Associates Degree');
INSERT INTO degree (DEGREE_ID, NAME) VALUES (2, 'Bachelors Degree');
INSERT INTO degree (DEGREE_ID, NAME) VALUES (3, 'Masters Degree');
INSERT INTO degree (DEGREE_ID, NAME) VALUES (4, 'Doctoral Degree');



CREATE TABLE ceremony (
    CEREMONY_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(45) NOT NULL DEFAULT ''
    );



INSERT INTO ceremony (CEREMONY_ID, NAME) VALUES (1, 'Friday Evening(Adult & Masters)');
INSERT INTO ceremony (CEREMONY_ID, NAME) VALUES (2, 'Saturday (Traditional Bachelors)');
INSERT INTO ceremony (CEREMONY_ID, NAME) VALUES (3, 'Friday & Saturday');



CREATE TABLE capsize (
    CAPSIZE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    INCHES VARCHAR(45) NOT NULL DEFAULT '',
    FITTED VARCHAR(45) NOT NULL DEFAULT ''
    );



INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (1, '21 1/4', '6 3/4');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (2, '21 5/8', '6 7/8');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (3, '22', '7');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (4, '22 3/8', '7-1/8');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (5, '22 3/4', '7-1/4');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (6, '23 1/8', '7 3/8');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (7, '23 1/2', '7 1/2');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (8, '23 7/8', '7 5/8');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (9, '24 1/4', '7 3/4');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (10, '24 5/8', '7 7/8');
INSERT INTO capsize (CAPSIZE_ID, INCHES, FITTED) VALUES (11, '25', '8');

CREATE TABLE users (
    USER_ID BIGINT(4) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    EMAIL VARCHAR(45) NULL,
    USERNAME VARCHAR(45) NULL,
    FIRST_NAME VARCHAR(45) NULL,
    LAST_NAME VARCHAR(45) NULL,
    ENABLED TINYINT NULL,
    PHONE_NUMBER VARCHAR(15) NULL,
    WEIGHT INT NULL,
    HEIGHT VARCHAR(10),
    GRANTING_INSTITUTION VARCHAR(45) NULL,
    GRANTING_CITY VARCHAR(45) NULL,
    LAST_UPDATED DATETIME NOT NULL,
    CEREMONY_ID BIGINT(4) NULL,
    CAP_SIZE_ID BIGINT(4) NULL,
    DEGREE_ID BIGINT(4) NULL,
    DEPARTMENT_ID BIGINT(4) NULL,
    STATE_ID BIGINT(4) NULL,
  INDEX `CEREMONY_ID_FK_idx` (`CEREMONY_ID` ASC) VISIBLE,
  INDEX `CAP_SIZE_ID_FK_idx` (`CAP_SIZE_ID` ASC) VISIBLE,
  INDEX `DEGREE_ID_FK_idx` (`DEGREE_ID` ASC) VISIBLE,
  INDEX `DEPARTMENT_ID_FK_idx` (`DEPARTMENT_ID` ASC) VISIBLE,
  INDEX `STATE_ID_FK_idx` (`STATE_ID` ASC) VISIBLE,
  CONSTRAINT `CEREMONY_ID_FK`
    FOREIGN KEY (`CEREMONY_ID`)
    REFERENCES `Regalia_Ordering_System`.`ceremony` (`CEREMONY_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `CAP_SIZE_ID_FK`
    FOREIGN KEY (`CAP_SIZE_ID`)
    REFERENCES `Regalia_Ordering_System`.`capsize` (`CAPSIZE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `DEGREE_ID_FK`
    FOREIGN KEY (`DEGREE_ID`)
    REFERENCES `Regalia_Ordering_System`.`degree` (`DEGREE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `DEPARTMENT_ID_FK`
    FOREIGN KEY (`DEPARTMENT_ID`)
    REFERENCES `Regalia_Ordering_System`.`department` (`DPT_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `STATE_ID_FK`
    FOREIGN KEY (`STATE_ID`)
    REFERENCES `Regalia_Ordering_System`.`states` (`STATE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE users_roles (
    USER_ID BIGINT(4) NOT NULL,
    ROLE_ID BIGINT(4) NOT NULL,
  INDEX `USER_ID_FK_idx` (`USER_ID` ASC) VISIBLE,
  INDEX `ROLE_ID_FK_idx` (`ROLE_ID` ASC) VISIBLE,
  CONSTRAINT `USER_ID_FK`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `Regalia_Ordering_System`.`users` (`USER_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ROLE_ID_FK`
    FOREIGN KEY (`ROLE_ID`)
    REFERENCES `Regalia_Ordering_System`.`roles` (`ROLE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`,`GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('Anton.Kochnev1@marist.edu', '63491070', 'Anton', 'Kochnev', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('1', '2');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('mike.rob@marist.edu', '85514432', 'Mike', 'Rob', '0', '5556668888', '150','6-2', 'Marvel', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('2', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('john.smith@marist.edu', '08966798', 'John', 'Smith', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('3', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('chris.johnson@marist.edu', '58705902', 'Chris', 'Johnson', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('4', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('brian.knobel@marist.edu', '12728178', 'brain', 'Knobel', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('5', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('brandon.lang@marist.edu', '72567979', 'brandon', 'lang', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('6', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('dan.kelerchian@marist.edu', '23262733', 'dan', 'kelerchain', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('7', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('rob.rotta@marist.edu', '61644225', 'rob', 'rotta', '0', '9179134628', '200','6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('8', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('lisa.ann@marist.edu', '37551341', 'lisa', 'ann', '0', '9179134628', '200', '6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('9', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('sleepy.joe@marist.edu', '54548820', 'Joe', 'Biden', '0', '0123456789', '200', '6-1', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('10', '1');
INSERT INTO `Regalia_Ordering_System`.`users` (`EMAIL`, `USERNAME`, `FIRST_NAME`, `LAST_NAME`, `ENABLED`, `PHONE_NUMBER`, `WEIGHT`, `HEIGHT`, `GRANTING_INSTITUTION`, `GRANTING_CITY`, `LAST_UPDATED`, `CEREMONY_ID`, `CAP_SIZE_ID`, `DEGREE_ID`, `DEPARTMENT_ID`, `STATE_ID`) VALUES ('steven.buglione1@marist.edu', '20084250', 'Steven', 'Buglione', '0', '(914) 625-8293', '170', '5-10', 'Marist', 'New York', '2020-10-20 00:00:00', '1', '1', '1', '1', '1');
INSERT INTO `Regalia_Ordering_System`.`users_roles` (`USER_ID`, `ROLE_ID`) VALUES ('11', '2');
