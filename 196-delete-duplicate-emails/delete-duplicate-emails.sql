delete q
from  Person p
 join Person q
on p.email=q.email
and p.id<q.id;