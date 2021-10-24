-- 6. The genres of "The Wizard of Oz" (3 rows)
   SELECT
   movie_id,
   genre_name
FROM
movie_genre
JOIN genre ON genre.genre_id
WHERE
 movie_id = 'The Wizard Of Oz';   

