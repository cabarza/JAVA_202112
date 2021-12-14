-- 1.- Listar todos los usuarios ordenados por fecha de creación

select * from users order by created_at asc;


-- 2.- Listar todos los tweets del usuario Kobe

select u.first_name, t.* from tweets t
inner join users u on t.user_id = u.id;

select t.* from tweets t, users u 
where u.id = t.user_id and u.first_name = 'Kobe';


-- 3.- Listar los seguidres de Kobe

select fru.* from users fru
inner join follows f on f.follower_id = fru.id
inner join users fdu on fdu.id = f.followed_id
where fdu.first_name = 'Kobe';


-- 4.- Listar a quien sigue Allen
select fdu.* from users fdu
inner join follows f on f.followed_id = fdu.id
inner join users fru on fru.id = f.follower_id
where fru.first_name = 'Allen';


-- 5.- Listar todos los tweets favoritos de Vince

select tu.first_name, t.* from tweets t
inner join faves f on f.tweet_id = t.id
inner join users u on f.user_id = u.id
inner join users tu on tu.id = t.user_id
where u.first_name = 'Vince';
