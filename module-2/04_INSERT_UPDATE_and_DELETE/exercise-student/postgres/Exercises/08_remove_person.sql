-- 8. Remove "Penn Jillette" from the person table 
-- You'll have to remove data from another table before you can make him "disappear" (Get it? Because he's a magician...) (1 row each)
BEGIN TRANSACTION;
DELETE actor_id FROM movie_actor WHERE actor_id = Penn Jillette;
DELETE person_name FROM person WHERE person_name = Penn Jillette;
ROLLBACK;
COMMIT;

