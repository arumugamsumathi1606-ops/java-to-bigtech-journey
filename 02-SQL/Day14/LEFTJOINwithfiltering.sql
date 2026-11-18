SELECT e.emp_id, e.name, d.dept_id, d.dept_name
FROM Employee e
LEFT JOIN Departments d
ON e.name = d.dept_name;