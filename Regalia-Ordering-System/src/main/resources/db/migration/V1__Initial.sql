CREATE TABLE STATES (
    STATE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(45) NOT NULL DEFAULT ''
    );



INSERT INTO STATES (STATE_ID, NAME) VALUES (1, 'Alabama');
INSERT INTO STATES (STATE_ID, NAME) VALUES (2, 'Alaska');
INSERT INTO STATES (STATE_ID, NAME) VALUES (3, 'Arizona');
INSERT INTO STATES (STATE_ID, NAME) VALUES (4, 'Arkansas');
INSERT INTO STATES (STATE_ID, NAME) VALUES (5, 'California');
INSERT INTO STATES (STATE_ID, NAME) VALUES (6, 'Colorado');
INSERT INTO STATES (STATE_ID, NAME) VALUES (7, 'Connecticut');
INSERT INTO STATES (STATE_ID, NAME) VALUES (8, 'Delaware');
INSERT INTO STATES (STATE_ID, NAME) VALUES (9, 'Florida');
INSERT INTO STATES (STATE_ID, NAME) VALUES (10, 'Georgia');
INSERT INTO STATES (STATE_ID, NAME) VALUES (11, 'Hawaii');
INSERT INTO STATES (STATE_ID, NAME) VALUES (12, 'Idaho');
INSERT INTO STATES (STATE_ID, NAME) VALUES (13, 'Illinois');
INSERT INTO STATES (STATE_ID, NAME) VALUES (14, 'Indiana');
INSERT INTO STATES (STATE_ID, NAME) VALUES (15, 'Iowa');
INSERT INTO STATES (STATE_ID, NAME) VALUES (16, 'Kansas');
INSERT INTO STATES (STATE_ID, NAME) VALUES (17, 'Kentucky');
INSERT INTO STATES (STATE_ID, NAME) VALUES (18, 'Louisiana');
INSERT INTO STATES (STATE_ID, NAME) VALUES (19, 'Maine');
INSERT INTO STATES (STATE_ID, NAME) VALUES (20, 'Maryland');
INSERT INTO STATES (STATE_ID, NAME) VALUES (21, 'Massachusetts');
INSERT INTO STATES (STATE_ID, NAME) VALUES (22, 'Michigan');
INSERT INTO STATES (STATE_ID, NAME) VALUES (23, 'Minnesota');
INSERT INTO STATES (STATE_ID, NAME) VALUES (24, 'Mississippi');
INSERT INTO STATES (STATE_ID, NAME) VALUES (25, 'Missouri');
INSERT INTO STATES (STATE_ID, NAME) VALUES (26, 'Montana');
INSERT INTO STATES (STATE_ID, NAME) VALUES (27, 'Nebraska');
INSERT INTO STATES (STATE_ID, NAME) VALUES (28, 'Nevada');
INSERT INTO STATES (STATE_ID, NAME) VALUES (29, 'New Hampshire');
INSERT INTO STATES (STATE_ID, NAME) VALUES (30, 'New Jersey');
INSERT INTO STATES (STATE_ID, NAME) VALUES (31, 'New Mexico');
INSERT INTO STATES (STATE_ID, NAME) VALUES (32, 'New York');
INSERT INTO STATES (STATE_ID, NAME) VALUES (33, 'North Carolina');
INSERT INTO STATES (STATE_ID, NAME) VALUES (34, 'North Dakota');
INSERT INTO STATES (STATE_ID, NAME) VALUES (35, 'Ohio');
INSERT INTO STATES (STATE_ID, NAME) VALUES (36, 'Oklahoma');
INSERT INTO STATES (STATE_ID, NAME) VALUES (37, 'Oregon');
INSERT INTO STATES (STATE_ID, NAME) VALUES (38, 'Pennsylvania');
INSERT INTO STATES (STATE_ID, NAME) VALUES (39, 'Rhode Island');
INSERT INTO STATES (STATE_ID, NAME) VALUES (40, 'South Carolina');
INSERT INTO STATES (STATE_ID, NAME) VALUES (41, 'South Dakota');
INSERT INTO STATES (STATE_ID, NAME) VALUES (42, 'Tennessee');
INSERT INTO STATES (STATE_ID, NAME) VALUES (43, 'Texas');
INSERT INTO STATES (STATE_ID, NAME) VALUES (44, 'Utah');
INSERT INTO STATES (STATE_ID, NAME) VALUES (45, 'Vermont');
INSERT INTO STATES (STATE_ID, NAME) VALUES (46, 'Virginia');
INSERT INTO STATES (STATE_ID, NAME) VALUES (47, 'Washington');
INSERT INTO STATES (STATE_ID, NAME) VALUES (48, 'West Virginia');
INSERT INTO STATES (STATE_ID, NAME) VALUES (49, 'Wisconsin');
INSERT INTO STATES (STATE_ID, NAME) VALUES (50, 'Wyoming');



CREATE TABLE ROLES (
        ROLE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
        NAME VARCHAR(45) NOT NULL DEFAULT ''
    );


INSERT INTO ROLES (ROLE_ID, NAME) VALUES (1, 'USER');
INSERT INTO ROLES (ROLE_ID, NAME) VALUES (2, 'ADMIN');
INSERT INTO ROLES (ROLE_ID, NAME) VALUES (3, 'DEV');



CREATE TABLE DEPARTMENT (
    DPT_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(80) NOT NULL DEFAULT ''
    );


INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (1, 'Academic Affairs');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (2, 'Academic Enhancement');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (3, 'Academic Grants');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (4, 'Accommodations Accessibility');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (5, 'Advancement Office');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (6, 'Advancement Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (7, 'Advising Academic Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (8, 'Annual Fund Office');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (9, 'Athletics');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (10, 'Budget, Planning &amp; Analysis');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (11, 'Business Office');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (12, 'CFO');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (13, 'Campus Ministry');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (14, 'Center for Career Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (15, 'Center for Multicultural Affairs');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (16, 'College Activities');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (17, 'College Marketing &amp Communications');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (18, 'Computer Store');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (19, 'Counseling Center');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (20, 'Digital Publication Center');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (21, 'Dining Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (22, 'Enrollment Management');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (23, 'Executive Affairs');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (24, 'First Year Programs Leadership Dev');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (25, 'Grounds');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (26, 'Health Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (27, 'Housing Residential Life');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (28, 'Human Resources');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (29, 'Information Technology');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (30, 'Institutional Research Planning');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (31, 'International Student Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (32, 'Learning Center');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (33, 'Liberty Partnership');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (34, 'Library');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (35, 'MIPO');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (36, 'Marist International Programs');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (37, 'Mechanical Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (38, 'Media Center');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (39, 'NYC Executive Center');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (40, 'Payroll');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (41, 'Physical Plant');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (42, 'Physician Assistant Program');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (43, 'Postal Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (44, 'Presidents Office');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (45, 'Purchasing');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (46, 'Registrars Office');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (47, 'School Social Behavioral Sciences');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (48, 'School of Communication the Arts');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (49, 'School of Computer Science Math');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (50, 'School of Liberal Arts');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (51, 'School of Management');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (52, 'School of Professional Programs');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (53, 'School of Science');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (54, 'Security');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (55, 'Student Affairs');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (56, 'Student Financial Services');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (57, 'Upward Bound');
INSERT INTO DEPARTMENT (DPT_ID, NAME) VALUES (58, 'Other');



CREATE TABLE DEGREE (
    DEGREE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(45) NOT NULL DEFAULT ''
    );


INSERT INTO DEGREE (DEGREE_ID, NAME) VALUES (1, 'Associates Degree');
INSERT INTO DEGREE (DEGREE_ID, NAME) VALUES (2, 'Bachelors Degree');
INSERT INTO DEGREE (DEGREE_ID, NAME) VALUES (3, 'Masters Degree');
INSERT INTO DEGREE (DEGREE_ID, NAME) VALUES (4, 'Doctoral Degree');



CREATE TABLE CEREMONY (
    CEREMONY_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(45) NOT NULL DEFAULT ''
    );



INSERT INTO CEREMONY (CEREMONY_ID, NAME) VALUES (1, 'Friday Evening(Adult & Masters)');
INSERT INTO CEREMONY (CEREMONY_ID, NAME) VALUES (2, 'Saturday (Traditional Bachelors)');



CREATE TABLE CAPSIZE (
    CAPSIZE_ID BIGINT(4) AUTO_INCREMENT PRIMARY KEY,
    INCHES VARCHAR(45) NOT NULL DEFAULT '',
    FITTED VARCHAR(45) NOT NULL DEFAULT ''
    );



INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (1, '21 1/4', '6 3/4');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (2, '21 5/8', '6 7/8');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (3, '22', '7');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (4, '22 3/8', '7-1/8');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (5, '22 3/4', '7-1/4');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (6, '23 1/8', '7 3/8');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (7, '23 1/2', '7 1/2');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (8, '23 7/8', '7 5/8');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (9, '23 7/8', '7 5/8');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (10, '24 1/4', '7 3/4');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (11, '24 5/8', '7 7/8');
INSERT INTO CAPSIZE (CAPSIZE_ID, INCHES, FITTED) VALUES (12, '25', '8');
