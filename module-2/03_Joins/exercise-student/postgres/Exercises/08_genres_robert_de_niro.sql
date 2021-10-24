-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT
  person_name,
  genre_name,
  release_date
 FROM
  person
 JOIN movie_actor ON person.person_id = movie_actor.actor_id
 JOIN movie ON movie_actor.movie_id = movie.movie_id
 JOIN  movie_genre ON movie_genre.movie_id = movie_actor.movie_id
 JOIN genre ON movie_genre.genre_id = genre.genre_id
 WHERE
 person_name = 'Robert De Niro'
 Order BY DATE() > 2010;

