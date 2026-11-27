select * from (select name, salary, DENSE_RANK() over (order By Salary DESC)
as salary_rank 
from Employee) ranked
where salary_rank = 2;