# Write your MySQL query statement below
select e.employee_id, e.name, count(s.reports_to) as reports_count, round(avg(s.age),0) as average_age
from Employees e
join Employees s
on e.employee_id=s.reports_to
group by e.employee_id
order by e.employee_id;