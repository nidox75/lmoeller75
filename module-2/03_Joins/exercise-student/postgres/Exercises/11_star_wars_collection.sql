-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)
SELECT *
 -- movie_id,
 -- title,
  --release_date
FROM
  movie
JOIN collection ON collection.collection_id = movie.collection_id
WHERE
collection_name = 'Star Wars' AND title = 'Star Wars'
ORDER BY
release_date DESC;    
