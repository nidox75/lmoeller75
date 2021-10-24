-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
SELECT DISTINCT
  person_name,
  genre_name 
FROM
  person
JOIN movie_actor ON movie_actor.actor_id = person.person_id
JOIN movie_genre ON movie_genre.movie_id = movie_actor.movie_id
JOIN genre ON genre.genre_id = movie_genre.genre_id
WHERE 
  person_name = 'Christopher Lloyd';    