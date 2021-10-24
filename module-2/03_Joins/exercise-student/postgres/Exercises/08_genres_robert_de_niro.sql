-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT
  person_name,
  genre_name,
  release_date
FROM
  person
JOIN movie_actor ON movie_actor.actor_id = person.person_id
JOIN movie_genre ON movie_genre.movie_id = movie_actor.movie_id
JOIN genre ON genre.genre_id = movie_genre.genre_id
Join movie_actor ON movie_actor.movie_id = movie.movie_id
WHERE 
  person_name = 'Robert De Niro'
  release_date = '2010';  

