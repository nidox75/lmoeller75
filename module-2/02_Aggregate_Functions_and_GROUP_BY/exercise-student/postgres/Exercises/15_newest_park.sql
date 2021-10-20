-- 15. The name and date established of the newest national park.
-- (1 row)
SELECT
  
  MIN(date_established || park_name)
FROM
  park;
  
