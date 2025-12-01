# Write your MySQL query statement below
select max(num) as num
from (select num
from MyNumbers
group by 1
having count(num)=1) as st
;
