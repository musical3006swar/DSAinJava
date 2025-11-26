select e.name as Employee
from Employee e
join Employee m
on e.managerID=m.id
where m.salary<e.salary;