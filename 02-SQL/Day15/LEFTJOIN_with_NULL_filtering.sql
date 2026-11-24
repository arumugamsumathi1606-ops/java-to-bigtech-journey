SELECT e.name, e.dept_id, d.dept_name
FROM Employee e
LEFT JOIN Departments d
ON e.dept_id = d.dept_id
where d.dept_id IS NULL;
