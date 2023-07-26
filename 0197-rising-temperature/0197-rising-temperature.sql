# Write your MySQL query statement below
SELECT w1.id from Weather as w1 
INNER JOIN Weather w2
ON dateDiff(w1.recordDate,w2.recordDate) = 1 AND w1.temperature > w2.temperature;