create database ep;
use ep;
create table employee(eid int primary key , e_name varchar(20),e_rank varchar(3), city varchar(15), salary int );
insert into employee values
	(100, "Raju", "C","Hyderabad", 600),
    (101, "Rahul", "A","Lahore", 601),
    (102, "Bharath", "B","Delhi", 600),
    (103, "David", "A","Mumbai", 600),
    (104, "Kishore", "C","Hyderabad", 602),
    (105, "Kumar", "C","Mumbai", 602),
    (106, "Eswar", "A","Delhi", 603),
    (107, "Praveen", "C","Hyderabad", 604),
    (108, "Lohith", "B","Delhi", 601),
    (109, "Mohan", "C","Delhi", 601);
    delete from employee where eid="Mohan";
    delete from employee;
    desc employee;
    select *from employee;
    select *from employee;
    update employee set e_name="Raju" where eid=100;
    desc employee;
    select *from employee;
    update employee set salary=salary+602;
    create table army (aid int primary key , a_name varchar(10), a_rank varchar(3),city varchar(20), m_id int );
    insert into army value
	(200, "Arun", "A","Delhi",601),
    (201, "Hari", "B","Hyderabad",601),
    (202, "Gopi", "C","Lahore",602),
    (203, "Jayanth", "A","Delhi",601),
    (204, "Deepak", "B","Mumbai",600),
    (205, "Nandu", "C","Hyderabad",600),
    (206, "Mohan", "A","Lahore",603),
    (207, "Kamal", "B","Hyderabad",605),
    (208, "Gopal", "A","Delhi",602),
    (209, "Raju", "C","Delhi",601);
    desc army;
    select *from army;
    alter table army drop column a_name;
    select * from army;