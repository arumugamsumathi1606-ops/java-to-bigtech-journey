Select e.name, d.dept_name
from employee e
inner join department d
on e.dept_name = d.dept_name
where e.name like 'S%'
and d.dept_name = 'IT';