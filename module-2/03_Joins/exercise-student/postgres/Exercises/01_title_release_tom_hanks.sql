-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)
SELECT
title, release_date
FROM
movie
JOIN movie_actor ON movie_actor.movie_id = movie.movie_id



