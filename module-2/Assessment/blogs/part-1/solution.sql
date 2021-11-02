-- Select all columns from posts that are published
SELECT *
From posts
Where
published = True;
  

-- Select posted_by and body from comments that have a body and were created after Oct. 15, 2019
 SELECT 
  posted_by,
  body
FROM
  comments
WHERE
body IS NOT NULL
AND
created > '10-15-2019';    

-- Select the name and published states from posts ordered by when they were created, earliest first
SELECT 
  name,
  published
FROM
  posts
ORDER BY
created ASC;      

-- Select the created date and the count of all the comments created on that date
SELECT
COUNT(*)
created
FROM
posts;



-- Select the post name, comment posted_by and comment body for all posts created after Oct. 1st, 2019

