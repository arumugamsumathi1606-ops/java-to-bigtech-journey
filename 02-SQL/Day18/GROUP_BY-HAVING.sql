SELECT Department, Avg(Salary) as Salary
FROM Employee
GROUP BY Department
HAVING Avg(Salary) > 60000;