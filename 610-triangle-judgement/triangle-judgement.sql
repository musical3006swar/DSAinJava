# Write your MySQL query statement below
select 
    x,
    y,
    z,
    if(x+y>z, if(y+z>x,if(z+x>y,'Yes','No'),'No'),'No') as triangle
from Triangle;