SELECT 
    e.employee_id,
    IF(
        COUNT(e.department_id) > 1,
        (
            SELECT department_id
            FROM Employee
            WHERE employee_id = e.employee_id
              AND primary_flag = 'Y'
            LIMIT 1
        ),
        (
            SELECT department_id
            FROM Employee
            WHERE employee_id = e.employee_id
            LIMIT 1
        )
    ) AS department_id
FROM Employee e
GROUP BY e.employee_id;
