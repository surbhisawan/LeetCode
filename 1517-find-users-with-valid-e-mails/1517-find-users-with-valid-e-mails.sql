# Write your MySQL query statement below
SELECT * FROM Users 
WHERE mail REGEXP '^[a-zA-Z]+[a-zA-Z-._0-9]*@leetcode[.]com$';