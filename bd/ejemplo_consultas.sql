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

-- INSERT

select * from users;


INSERT INTO users (first_name, last_name, handle, birthday, created_at)
VALUES ('Elias', 'Apablaza', 'eapa', '1980-07-20', CURDATE());


create table users_resume(
  id int not null auto_increment,
  user_id int not null references users(id),
  first_name varchar(100),
  last_name varchar(100),
  birthday DATE,
  primary key (id));


select * from users_resume;

insert into users_resume(user_id, first_name, last_name, birthday)
select id, first_name, last_name, birthday from users;

-- 1.- Insertar un nuevo usuario
INSERT INTO users (first_name, last_name, handle, birthday, created_at)
VALUES ('Elias', 'Apablaza', 'eapa', '1980-07-20', NOW());

-- 2.- Hacer que Kobe siga a este nuevo usuario}
select * from follows;

insert into follows (followed_id, follower_id, created_at)
values(11, 1, now());

-- 3.- Que el nuevo usuario marque como favorito todos los tweets
select * from faves;

insert into faves (user_id, tweet_id, created_at)
select 11, id, now() from tweets;

-- 4.- Que el nuevo usuario haga un nuevo tweet
select * from tweets;

insert into tweets(tweet, user_id, created_at)
values ('Tweet 1', 11, now()),
        ('Tweet 2', 11, now());



-- UPDATE

update tweets set tweet = 'Este es mi nuevo Tweet', updated_at = now() where id = 15;


update tweets t 
  inner join users u on u.id = t.user_id
set t.tweet = concat('Tweet del usuario ', u.first_name, ' ', u.last_name),
  t.updated_at = now()
where u.id = 11;

-- 1.- Actualizar el handle name del nuevo usuario
update users set handle = 'elias', updated_at= now() where id = 11;

-- 2.- Actualizar el tweet del usuario e incluir su handle name en el
update tweets t
inner join users u on u.id = t.user_id 
set t.tweet = concat(t.tweet, ' ', u.handle), 
  t.updated_at = now()
where t.id = 15;

-- DELETE

select * from users;
select * from users_resume;

delete from users_resume where user_id = 6;

delete from users where id = 6;

-- 1.- Hacer que Kobe deje de seguir al nuevo usuario

delete from follows where followed_id = 11 and follower_id = 1;



