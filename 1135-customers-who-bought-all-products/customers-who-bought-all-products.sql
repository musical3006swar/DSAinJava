select customer_id
from (select c.customer_id,count(distinct(c.product_key)) as x
    from Customer c
    group by c.customer_id) as nt
where nt.x=(select count(*) from Product);