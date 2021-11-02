-- 9. Remove "Memento" from the movie table
-- You'll have to remove data from two other tables before you can remove it (13 rows, 2 rows, 1 row)


DELETE
  
movie_actor.movie_id,
movie_genre.movie_id,
movie.movie_id
 FROM
  movie
  JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
  JOIN movie_genre ON movie_genre.movie_id = movie.movie_id
 WHERE
  title = 'Memento';
  