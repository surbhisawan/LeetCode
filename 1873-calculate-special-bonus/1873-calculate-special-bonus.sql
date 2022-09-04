select employee_id, salary as bonus
from employees
where name not like 'm%' and employee_id%2=1
union
select employee_id, 0
from employees
where name like 'm%' or employee_id%2=0
order by employee_id;