select 
round(sum(if(od=cdd,1,0)*100)/count(od),2) as immediate_percentage
from (select
        delivery_id, 
        customer_id ,
        min(order_date) as od ,
        min(customer_pref_delivery_date) as cdd
    from Delivery
    group by customer_id) as nt;