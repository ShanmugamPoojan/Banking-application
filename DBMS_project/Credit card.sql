create database CreditCardManagementSystem;
use CreditCardManagementSystem;

create table Personal_details(
	personalID varchar(25) primary key,
    qualification varchar(25),
    marital_status varchar(25),
    father_name varchar(25),
    mother_name varchar(25),
    dependence int);
    
create table Authentication_details(
	authenticationID varchar(25) primary key,
    contact_number varchar(25),
    emailID varchar(25),
    pancard_number varchar(25));
    
create table Employee_details(
	employeeID varchar(25) primary key,
    positions varchar(25),
    organisation varchar(25),
    institution varchar(25));

 create table Bank_details(
	bankID varchar(25) primary key,
    bank_name varchar(25),
    coustomer_count int,
    contact varchar(10),
    email varchar(25),
    address varchar(50));
    
create table Account_details(
	account_number varchar(25) primary key,
    account_type varchar(25),
    account_balance int,
    account_minbalance int,
    bankID varchar(25),
    foreign key(bankID) references Bank_details(bankID));

create table Transaction_details(
	transactionID varchar(25) primary key,
    card_number varchar(19),
	credit_score int,
	credited_amount int,
	repaid_amount int,
	balance_amount int,
	transaction_limit int);
    
create table Card_details( 
	card_number varchar(19) primary key,
    card_username varchar(25),
    card_network varchar(25),
    card_provider varchar(25),
    card_class varchar(25),
    card_validity date,
    transactionID varchar(25),
    Foreign key (card_transactionID) references Transaction_details(transactionID));

CREATE TABLE Rewards (
    card_number INT ,
    pointsEarned INT NOT NULL,
    pointsRedeemed INT NOT NULL,
    balancePoints INT NOT NULL,
    lastUpdated DATE NOT NULL,
    FOREIGN KEY (card_number) REFERENCES Card_details(card_number));

create table User_details(
	userID varchar(25) primary key,
    user_name varchar(25),
    account_number varchar(12),
    personal_details varchar(25),
    employee_details varchar(25),
    authentication_details varchar(25),
    card_number varchar(19),
    Foreign key (account_number) references Account_details (account_number),
    Foreign key (personal_details) references Personal_details (personalID),
    Foreign key (employee_details) references Employee_details (employeeID),
    Foreign key (authentication_details) references Authentication_details (authenticationID),
    Foreign key (card_number) references Card_details (card_number));


    
insert into Personal_details values
	('PID00001','Graduation','Yes','Father01','Mother01',3),
	('PID00002','Graduated','Yes','Father02','Mother02',3),
    ('PID00003','Ph D','No','Father03','Mother03',0),
    ('PID00004','Graduation','No','Father04','Mother04',3),
    ('PID00005','Under Graduation','No','Father05','Mother05',0),
    ('PID00006','Post Graduation','Yes','Father06','Mother016',5),
    ('PID00007','Graduation','Yes','Father07','Mother07',3),
    ('PID00008','Under Graduation','Yes','Father08','Mother08',4),
    ('PID00009','Graduated','N0','Father09','Mother09',3),
    ('PID00010','Graduated','Yes','Father10','Mother10',5);
    
insert into personal_details values
('PID00011','Graduated','Yes','Father11','Mother11',3),
('PID00012','Post Graduation','Yes','Father12','Mother12',4),
('PID00013','Under Graduation','No','Father13','Mother13',5),
('PID00014','Post Graduation','Yes','Father14','Mother14',4),
('PID00015','Graduated','Yes','Father15','Mother15',3),
('PID00016','Graduated','Yes','Father16','Mother16',5),
('PID00017','Under Graduated','Yes','Father17','Mother17',4),
('PID00018','Graduated','Yes','Father18','Mother18',5),
('PID00019','Graduated','Yes','Father19','Mother19',6),
('PID00020','Graduated','Yes','Father20','Mother20',4),
('PID00021','Under Graduation','Yes','Father21','Mother21',3),
('PID00022','Post Graduation','No','Father22','Mother22',4),
('PID00023','Post Graduation','Yes','Father23','Mother23',5),
('PID00024','Graduated','Yes','Father24','Mother24',3),
('PID00025','Post Graduation','Yes','Father25','Mother25',4),
('PID00026','Post Graduation','No','Father26','Mother26',5),
('PID00027','Post Graduation','Yes','Father27','Mother27',3),
('PID00028','Post Graduation','Yes','Father28','Mother28',4),
('PID00029','Under Graduation','Yes','Father29','Mother29',5),
('PID00030','Post Graduation','Yes','Father30','Mother30',3),
('PID00031','Post Graduation','No','Father31','Mother31',5),
('PID00032','Graduated','Yes','Father32','Mother32',6),
('PID00033','Post Graduation','Yes','Father33','Mother33',3),
('PID00034','Post Graduation','Yes','Father34','Mother34',4),
('PID00035','Post Graduation','No','Father35','Mother35',5),
('PID00036','Under Graduation','Yes','Father36','Mother36',4),
('PID00037','Under Graduation','Yes','Father37','Mother37',3),
('PID00038','Under Graduated','Yes','Father38','Mother38',5),
('PID00039','Post Graduation','No','Father39','Mother39',3),
('PID00040','Post Graduation','Yes','Father40','Mother40',4),
('PID00041','Graduated','Yes','Father41','Mother41',5),
('PID00042','Under Graduation','Yes','Father42','Mother42',4),
('PID00043','Post Graduation','Yes','Father43','Mother43',5),
('PID00044','Post Graduation','No','Father44','Mother44',3),
('PID00045','Post Graduation','Yes','Father45','Mother45',4),
('PID00046','Graduated','Yes','Father46','Mother46',5),
('PID00047','Post Graduation','Yes','Father47','Mother47',6),
('PID00048','Post Graduation','Yes','Father48','Mother48',4),
('PID00049','Under Graduation','No','Father49','Mother49',5),
('PID00050','Graduated','No','Father50','Mother50',3);





    
insert into Authentication_details values
	('AID00002','8856412364','user01@email','PAN452176'),
	('AID00002','9214756324','user02@email','PAN152364'),
    ('AID00003','8451136975','user03@email','PAN458469'),
    ('AID00004','7546981234','user04@email','PAN154896'),
    ('AID00005','9658463215','user05@email','PAN445975'),
    ('AID00006','6598741256','user06@email','PAN658556'),
    ('AID00007','8521469745','user07@email','PAN789658'),
    ('AID00008','9874584215','user08@email','PAN321458'),
    ('AID00009','9986545122','user09@email','PAN458679'),
    ('AID00010','7754885632','user10@email','PAN998564');
    
insert into Authentication_details values
    ('AID00011','8836895467','user11@email','PAN675890'),
    ('AID00012','9987654324','user12@email','PAN908765'),
    ('AID00013','9876547832','user13@email','PAN908766'),
    ('AID00014','8874946785','user14@email','PAN908767'),
    ('AID00015','9768543210','user15@email','PAN908768'),
    ('AID00016','9076543269','user16email' ,'PAN909769'),
    ('AID00017','8790675432','user17@email','PAN909770'),
    ('AID00018','7690435222','user18@email','PAN909771'),
    ('AID00019','8974530092','user19@email','PAN909772'),
    ('AID00020','9806432119','user20@email','PAN909773'),
    ('AID00021','7896444555','user21@email','PAN909774'),
    ('AID00022','7990765443','user22@email','PAN909775'),
    ('AID00023','8976005448','user23@email','PAN909776'),
    ('AID00024','7089543321','user24@email','PAN909777'),
    ('AID00025','9087886543','user25@email','PAN909778'),
    ('AID00026','8907665544','user26@email','PAN909779'),
    ('AID00027','9900935573','user27@email','PAN909780'),
    ('AID00028','8310958056','user28@email','PAN909781'),
    ('AID00029','8123081369','user29email','PAN909782'),
    ('AID00030','9743481282','user30@email','PAN909783'),
    ('AID00031','8861909148','user31@email','PAN909784'),
    ('AID00032','8050879054','user32@email','PAN909785'),
    ('AID00033','9986619171','user33@email','PAN909786'),
	('AID00034','9740774841','user34@email','PAN909787'),
	('AID00035','9741338308','user35@email','PAN909788'),
	('AID00036','9741338308','user36@email','PAN909789'),
	('AID00037','9741338308','user37@email','PAN909790'),
	('AID00038','8971857188','user38@email','PAN909791'),
	('AID00039','9611138141','user39@email','PAN909792'),
	('AID00040','8722939903','user40@email','PAN909793'),
	('AID00041','9380241501','user41@email','PAN909794'),
	('AID00042','7090891539','user42@email','PAN909795'),
	('AID00043','9844487898','user43@email','PAN909796'),
	('AID00044','96864138141','user44@email','PAN909797'),
	('AID00045','9353057921','user45@email','PAN9097898'),
	('AID00046','9164373243','user46@email','PAN9097899'),
	('AID00047','7411292326','user47@email','PAN9097900'),
	('AID00048','9663905849','user48@email','PAN9097901'),
	('AID00049','8073397373','user49@email','PAN9097902'),
	('AID00050','9535659757','user50@email','PAN9097903');
	
    
insert into Employee_details values
	('EID00001','Manager','XYZ cooperations',null),
	('EID00002','HR','XYZ cooperations',null),
    ('EID00003','Teacher',null,'ABC institution'),
    ('EID00004','Student',null,'MNO institution'),
    ('EID00005','Employee','GOG cooperations',null),
    ('EID00006','Student',null,'POM institution'),
    ('EID00007','Developer','EVG cooperations',null),
    ('EID00008','Engineer','HGD cooperations',null),
    ('EID00009','Manager','WDF cooperations',null);
    
    insert into Employee_details values
	('EID00011','Teacher','AUI cooperations',null),
    ('EID00012','Lawyer',' AYO coperations',null),
    ('EID00013','Doctor','NMJ cooperation',null),
    ('EID00014','Employee','UJK cooperations',null),
    ('EID00015','Manager','LKM cooperations',null),
    ('EID00016','Electrician','DDE cooperations',null),
    ('EID00017','Student','OOL cooperation',null),
    ('EID00018','Engineer','WHJ cooperations',null),
    ('EID00019','Lecture',null,'RTY cooperation'),
    ('EID00020','Proffessor','OLP cooperation',null),
    ('EID00021','Farmer','RPF cooperations',null),
    ('EID00022','HR','CNM cooperations',null),
    ('EID00023','Dean','KMM cooperations',null),
    ('EID00024','Clerk','POL cooperations',null),
    ('EID00025','Manager','YUI cooperations',null),
    ('EID00026','Employee','LPK cooperations',null),
    ('EID00027','Engineer','MBJ cooperations',null),
    ('EID00028','Student','GJK cooperations',null),
    ('EID00029','Lecture','WPL cooperations',null),
    ('EID00030','Engineer','JKP cooperations',null),
	('EID00031','Businessman','KLJ cooperations',null),
	('EID00032','Employee','POK cooperations',null),
    ('EID00033','Student','ERT cooperations',null),
    ('EID00034','Manager','ENT cooperations',null),
    ('EID00035','Physician','UIO cooperations',null),
    ('EID00036','Dentist','POB cooperations',null),
    ('EID00037','Manager','ZMK cooperations',null),
    ('EID00038','Student','UFD cooperations',null),
    ('EID00039','Cardiologist','NKJ cooperations',null),
    ('EID00040','Developer','KLO cooperations',null),
	('EID00041','Data scientist',null,'PGH cooperation'),
    ('EID00042','Cricketor',null,'OIU cooperation'),
    ('EID00043','Chemist','BNM cooperations',null),
    ('EID00044','Proffesor','VBN cooperations',null),
    ('EID00045','Employee',null,'KJO cooperation'),
	('EID00046','Manager','PIQ cooperations',null),
    ('EID00047','Developer',null,'JKP coopeeration'),
    ('EID00048','HR','BVG cooperations',null),
    ('EID00049','Dean','RTY cooperations',null),
    ('EID00050','Developer','LPQ cooperations',null);





    

insert into Account_details values
	('459756123648','Savings',50000,1000),
	('365499578456','Savings',5000,1000),
    ('021544578987','Savings',6000,1000),
    ('449785412658','Current',60000,5000),
    ('456328698745','Current',80000,5000),
    ('986523648561','Current',70000,5000),
    ('123654897544','Savings',20000,1000),
    ('254621358974','Current',40000,5000),
    ('112458665922','Savings',7000,1000),    
    ('774521036520','Savings',1000,1000);
    
    insert into Account_details values
	
    ('774521036520','Current',5000,1000),
    ('774521036520','Savings',9000,5000),
    ('774521036520','Savings',6000,3000),
    ('774521036520','Current',8000,4000),
    ('774521036520','Savings',7000,5000),
    ('774521036520','Current',5000,2000),
    ('774521036520','Savings',4000,1000),
    ('774521036520','Savings',2000,1000),
    ('774521036520','Current',3000,1000),
    ('774521036520','Savings',8000,4000),
    ('774521036520','Savings',6000,3000),
    ('774521036520','Current',5000,1000),
    ('774521036520','Savings',4000,1000),
    ('774521036520','Savings',9000,4000),
    ('774521036520','Current',5000,2000),
    ('774521036520','Savings',6000,3000),
    ('774521036520','Current',9000,3000),
    ('774521036520','Savings',8000,2000),
    ('774521036520','Savings',7000,4000),
    ('774521036520','Savings',6000,2000),
    ('774521036520','Current',8000,5000),
    ('774521036520','Savings',9000,4000),
    ('774521036520','Savings',7000,4000),
    ('774521036520','Current',5000,1000),
    ('774521036520','Savings',6000,4000),
    ('774521036520','Savings',8000,1000),
    ('774521036520','Current',5000,1000),
	('774521036520','Savings',4000,2000),
	('774521036520','Savings',5000,1000),
    ('774521036520','Savings',6000,2000),
	('774521036520','Current',9000,4000),
    ('774521036520','Savings',7000,4000),
    ('774521036520','Savings',8000,4000),
    ('774521036520','Current',9000,5000),
    ('774521036520','Savings',8000,5000),
    ('774521036520','Savings',7000,3000),
    ('774521036520','current',6000,3000),
    ('774521036520','Savings',9000,1000),
    ('774521036520','Savings',6000,1000),
    ('774521036520','Current',5000,1000);



    
    
    
insert into Transaction_details values
	('TID00001',12000,5000,600,15000),
	('TID00002',10000,5000,600,30000),
    ('TID00003',25000,20000,700,25000),
    ('TID00004',5000,500,500,15000),
    ('TID00005',10000,2000,400,15000),
    ('TID00006',12000,12000,700,15000),
    ('TID00007',20000,5000,500,35000),
    ('TID00008',10000,3000,400,20000),
    ('TID00009',7000,5000,600,15000),
    ('TID00010',20000,20000,800,20000);
    
    insert into Transaction_details values
	
    ('TID00011',70000,20000,800,20000),
    ('TID00012',60000,10000,500,30000),
    ('TID00013',40000,20000,500,30000),
    ('TID00014',60000,30000,400,20000),
    ('TID00015',20000,30000,800,10000),
    ('TID00016',40000,20000,300,23000),
    ('TID00017',20000,20000,200,30000),
    ('TID00018',30000,20000,300,35000),
	('TID00019',40000,20000,400,25000),
    ('TID00020',50000,20000,500,15000),
    ('TID00021',60000,20000,600,20000),
    ('TID00022',80000,20000,700,30000),
    ('TID00023',20000,10000,800,35000),
    ('TID00024',30000,20000,200,15000),
    ('TID00025',40000,30000,300,25000),
    ('TID00026',50000,10000,400,20000),
    ('TID00027',60000,20000,500,30000),
    ('TID00028',70000,30000,600,25000),
    ('TID00029',80000,10000,700,30000),
    ('TID00030',20000,20000,800,15000),
    ('TID00031',30000,10000,200,25000),
    ('TID00032',40000,30000,300,30000),
	('TID00033',50000,10000,400,35000),
    ('TID00034',60000,20000,500,15000),
    ('TID00035',70000,30000,600,25000),
    ('TID00036',80000,10000,700,20000),
    ('TID00037',20000,20000,800,35000),
    ('TID00038',30000,10000,200,30000),
    ('TID00039',40000,10000,300,25000),
    ('TID00040',50000,30000,400,35000),
    ('TID00041',60000,40000,500,25000),
    ('TID00042',70000,30000,600,30000),
    ('TID00043',80000,40000,600,25000),
    ('TID00044',20000,20000,700,20000),
    ('TID00045',30000,10000,800,25000),
    ('TID00046',40000,20000,800,15000),
	('TID00047',50000,30000,600,35000),
    ('TID00048',60000,30000,500,15000),
    ('TID00049',70000,30000,700,20000),
    ('TID00050',80000,20000,300,30000);
 


     
    
insert into Card_details values
	('6459 7851 2648 7854','User01','VISA','SBI','Gold','2030-05-23','TID00001'),
	('2642 2597 5454 6658','User02','MasterCard','SBI','Platinum','2031-05-13','TID00002'),
    ('4576 2145 6987 4563','User03','VISA','CNRB','Gold','2035-09-23','TID00003'),
    ('5488 4596 2541 3654','User04','RuPay','SBI','Standard','2029-07-31','TID00004'),
    ('6554 1254 2258 6989','User05','MasterCard','HDFC','Standard','2026-01-17','TID00005'),
    ('9588 2121 3659 6587','User06','MasterCard','ICICI','Gold','2036-03-19','TID00006'),
    ('5869 4587 5525 2365','User07','VISA','KMB','Platinum','2027-06-14','TID00007'),
    ('4457 9658 2235 1110','User08','RuPay','CNRB','Gold','2032-12-10','TID00008'),
    ('3365 2539 8564 2654','User09','VISA','AXIS','Standard','2029-11-07','TID00009'),
    ('2305 1023 3365 8647','User10','MasterCard','HDFC','Standard','2030-06-15','TID00010');
    
    insert into Card_details values

 ('1111 2222 3333 4444', 'User11', 'Visa', 'ICICI', 'Gold', '2031-07-20', 'TID00011'),
 ('5555 6666 7777 8888', 'User12', 'American Express', 'SBI', 'Platinum', '2029-12-05', 'TID00012'),
 ('9999 0000 1111 2222', 'User13', 'MasterCard', 'Axis', 'Silver', '2032-04-11', 'TID00013'),
 ('3333 4444 5555 6666', 'User14', 'Visa', 'HDFC', 'Standard', '2028-03-22', 'TID00014'),
 ('7777 8888 9999 0000', 'User15', 'American Express', 'ICICI', 'Gold', '2030-09-30', 'TID00015'),
 ('1234 5678 9101 1121', 'User16', 'Visa', 'SBI', 'Platinum', '2031-05-16', 'TID00016'),
 ('3141 5926 5358 9793', 'User17', 'MasterCard', 'Axis', 'Silver', '2032-10-25', 'TID00017'),
 ('2718 2818 2845 9045', 'User18', 'Visa', 'HDFC', 'Standard', '2029-07-13', 'TID00018'),
 ('1618 0339 8874 9894', 'User19', 'American Express', 'ICICI', 'Gold', '2033-01-29', 'TID00019'),
 ('1123 3445 5667 7889', 'User20', 'MasterCard', 'SBI', 'Platinum', '2028-11-10', 'TID00020'),
 ('9987 6543 2109 8765', 'User21', 'Visa', 'Axis', 'Silver', '2031-08-18', 'TID00021'),
 ('5432 1098 7654 3210', 'User22', 'MasterCard', 'HDFC', 'Standard', '2030-02-04', 'TID00022'),
 ('1357 2468 9753 8642', 'User23', 'Visa', 'ICICI', 'Gold', '2029-06-21', 'TID00023'),
 ('2468 1357 7531 8642', 'User24', 'American Express', 'SBI', 'Platinum', '2032-03-12', 'TID00024'),
 ('7890 1234 5678 9012', 'User25', 'MasterCard', 'Axis', 'Silver', '2031-11-07', 'TID00025'),
 ('2345 6789 0123 4567', 'User26', 'Visa', 'HDFC', 'Standard', '2028-09-15', 'TID00026'),
 ('6789 0123 4567 8901', 'User27', 'American Express', 'ICICI', 'Gold', '2030-05-23', 'TID00027'),
 ('3456 7890 1234 5678', 'User28', 'MasterCard', 'SBI', 'Platinum', '2031-12-19', 'TID00028'),
 ('9012 3456 7890 1234', 'User29', 'Visa', 'Axis', 'Silver', '2029-04-08', 'TID00029'),
 ('4567 8901 2345 6789', 'User30', 'MasterCard', 'HDFC', 'Standard', '2032-08-14', 'TID00030'),
 ('5678 9012 3456 7890', 'User31', 'Visa', 'ICICI', 'Gold', '2031-03-27', 'TID00031'),
 ('7890 2345 6789 0123', 'User32', 'American Express', 'SBI', 'Platinum', '2028-02-06', 'TID00032'),
 ('8901 2345 6789 0123', 'User33', 'MasterCard', 'Axis', 'Silver', '2030-10-03', 'TID00033'),
 ('0123 4567 8901 2345', 'User34', 'Visa', 'HDFC', 'Standard', '2032-01-15', 'TID00034'),
 ('3456 7890 1234 5678', 'User35', 'American Express', 'ICICI', 'Gold', '2029-09-29', 'TID00035'),
 ('6789 0123 4567 8901', 'User36', 'MasterCard', 'SBI', 'Platinum', '2031-07-12', 'TID00036'),
 ('8901 2345 6789 0123', 'User37', 'Visa', 'Axis', 'Silver', '2028-05-24', 'TID00037'),
 ('1234 5678 9012 3456', 'User38', 'MasterCard', 'HDFC', 'Standard', '2030-11-17', 'TID00038'),
 ('4567 8901 2345 6789', 'User39', 'Visa', 'ICICI', 'Gold', '2032-07-20', 'TID00039'),
 ('2345 6789 2344 1211', 'User40', 'Visa', 'SBI', 'Gold', '2032-07-22', 'TID00040'),
 ('9012 3456 7890 1234', 'User41', 'MasterCard', 'Axis', 'Silver', '2031-06-28', 'TID00041'),
 ('2345 6789 0123 4567', 'User42', 'Visa', 'HDFC', 'Standard', '2028-10-19', 'TID00042'),
 ('5678 9012 3456 7890', 'User43', 'American Express', 'ICICI', 'Gold', '2030-04-13', 'TID00043'),
 ('6789 0123 4567 8901', 'User44', 'MasterCard', 'SBI', 'Platinum', '2032-12-26', 'TID00044'),
 ('1234 5678 9012 3456', 'User45', 'Visa', 'Axis', 'Silver', '2029-08-09', 'TID00045'),
 ('2345 6789 0123 4567', 'User46', 'MasterCard', 'HDFC', 'Standard', '2031-04-21', 'TID00046'),
 ('3456 7890 1234 5678', 'User47', 'Visa', 'ICICI', 'Gold', '2028-12-11', 'TID00047'),
 ('4567 8901 2345 6789', 'User48', 'American Express', 'SBI', 'Platinum', '2030-03-01', 'TID00048'),
 ('5678 9012 3456 7890', 'User49', 'MasterCard', 'Axis', 'Silver', '2032-11-05', 'TID00049'),
 ('5678 9012 3456 7890', 'User50', 'MasterCard', 'CNRB', 'Silver', '2032-11-06', 'TID00050');

    
    
    
    
insert into User_details values
	('UID00001','User01','459756123648','PID00002','EID00002','AID00002','6459 7851 2648 7854'),
	('UID00002','User02','365499578456','PID00002','EID00002','AID00002','2642 2597 5454 6658'),
    ('UID00003','User03','021544578987','PID00003','EID00003','AID00003','4576 2145 6987 4563'),
    ('UID00004','User04','449785412658','PID00004','EID00004','AID00004','5488 4596 2541 3654'),
    ('UID00005','User05','456328698745','PID00005','EID00005','AID00005','6554 1254 2258 6989'),
    ('UID00006','User06','986523648561','PID00006','EID00006','AID00006','9588 2121 3659 6587'),
    ('UID00007','User07','123654897544','PID00007','EID00007','AID00007','5869 4587 5525 2365'),
    ('UID00008','User08','254621358974','PID00008','EID00008','AID00008','4457 9658 2235 1110'),
    ('UID00009','User09','112458665922','PID00009','EID00009','AID00009','3365 2539 8564 2654');
 
    
    insert into User_details values
('UID00011','User11', '112458665924',  'PID00011', 'EID00011', 'AID00011','3897 2509 8504 2657'),
('UID00012','User12', '112458665925',  'PID00012', 'EID00012', 'AID00011','3894 2549 8464 2604'),
('UID00013','User13', '112458665926', 'PID00013', 'EID00013', 'AID00013', '7789 8901 4567 6543'),
('UID00014','User14', '112458665927', 'PID00014', 'EID00014', 'AID00014', '8890 9012 5678 5432'),
('UID00015','User15', '112458665928', 'PID00015', 'EID00015', 'AID00015', '9901 0123 6789 4321'),
('UID00016','User16', '112458665929', 'PID00016', 'EID00016', 'AID00016', '1012 1234 7890 3210'),
('UID00017','User17', '112458665930', 'PID00017', 'EID00017', 'AID00017', '2123 2345 8901 2109'),
('UID00018','User18', '112458665931', 'PID00018', 'EID00018', 'AID00018', '3234 3456 9012 1098'),
('UID00019','User19', '112458665932', 'PID00019', 'EID00019', 'AID00019', '4345 4567 0123 0987'),
('UID00020','User20', '112458665933', 'PID00020', 'EID00020', 'AID00020', '5456 5678 1234 9876'),
('UID00021','User21', '112458665934', 'PID00021', 'EID00021', 'AID00021', '6567 6789 2345 8765'),
('UID00022','User22', '112458665935', 'PID00022', 'EID00022', 'AID00022', '7678 7890 3456 7654'),
('UID00023','User23', '112458665936', 'PID00023', 'EID00023', 'AID00023', '8789 8901 4567 6543'),
('UID00024','User24', '112458665937', 'PID00024', 'EID00024', 'AID00024', '9890 9012 5678 5432'),
('UID00025','User25', '112458665938', 'PID00025', 'EID00025', 'AID00025', '0901 0123 6789 4321'),
('UID00026','User26', '112458665939', 'PID00026', 'EID00026', 'AID00026', '1012 1234 7890 3210'),
('UID00027','User27', '112458665940', 'PID00027', 'EID00027', 'AID00027', '2123 2345 8901 2109'),
('UID00028','User28', '112458665941', 'PID00028', 'EID00028', 'AID00028', '3234 3456 9012 1098'),
('UID00029','User29', '112458665942', 'PID00029', 'EID00029', 'AID00029', '4345 4567 0123 0987'),
('UID00030','User30', '112458665943', 'PID00030', 'EID00030', 'AID00030', '5456 5678 1234 9876'),
('UID00031','User31', '112458665944', 'PID00031', 'EID00031', 'AID00031', '6567 6789 2345 8765'),
('UID00032','User32', '112458665945', 'PID00032', 'EID00032', 'AID00032', '7678 7890 3456 7654'),
('UID00033','User33', '112458665946', 'PID00033', 'EID00033', 'AID00033', '8789 8901 4567 6543'),
('UID00034','User34', '112458665947', 'PID00034', 'EID00034', 'AID00034', '9890 9012 5678 5432'),
('UID00035','User35', '112458665948', 'PID00035', 'EID00035', 'AID00035', '0901 0123 6789 4321'),
('UID00036','User36', '112458665949', 'PID00036', 'EID00036', 'AID00036', '1012 1234 7890 3210'),
('UID00037','User37', '112458665950', 'PID00037', 'EID00037', 'AID00037', '2123 2345 8901 2109'),
('UID00038','User38', '112458665951', 'PID00038', 'EID00038', 'AID00038', '3234 3456 9012 1098'),
('UID00039','User39', '112458665952', 'PID00039', 'EID00039', 'AID00039', '4345 4567 0123 0987'),
('UID00040','User40', '112458665953', 'PID00040', 'EID00040', 'AID00040', '5456 5678 1234 9876'),
('UID00041','User41', '112458665954', 'PID00041', 'EID00041', 'AID00041', '6567 6789 2345 8765'),
('UID00042','User42', '112458665955', 'PID00042', 'EID00042', 'AID00042', '7678 7890 3456 7654'),
('UID00043','User43', '112458665956', 'PID00043', 'EID00043', 'AID00043', '8789 8901 4567 6543'),
('UID00044','User44', '112458665957', 'PID00044', 'EID00044', 'AID00044', '9890 9012 5678 5432'),
('UID00045','User45', '112458665958', 'PID00045', 'EID00045', 'AID00045', '0901 0123 6789 4321'),
('UID00046','User46', '112458665959', 'PID00046', 'EID00046', 'AID00046', '1012 1234 7890 3210'),
('UID00047','User47', '112458665960', 'PID00047', 'EID00047', 'AID00047', '2123 2345 8901 2109'),
('UID00048','User48', '112458665961', 'PID00048', 'EID00048', 'AID00048', '3234 3456 9012 1098'),
('UID00049','User49', '112458665962', 'PID00049', 'EID00049', 'AID00049', '3529 9087 5677 1324'),
('UID00050','User50', '112458665963', 'PID00050', 'EID00050', 'AID00050', '9087 3456 0967 1264');




    
    
select user_name from User_details;
select * from Account_details;    
select * from Personal_details;
select * from Employee_details;
select * from Authentication_details;
select * from Card_details;


update Personal_details set father_name = 'Father10', mother_name ='Mother10' where personalID = 'PID00010';
update User_details set user_name = 'User10' where userID = 'UID00010';
update Authentication_details set contact_number = '8856412364' where authenticationID = 'AID00001';
update Card_details set card_username = 'User10' where card_transactionID = 'TID00010';