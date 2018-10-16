create schema weather
	authorization postgres;

create table weather.weather(
	id serial primary key,
	data date,
	cidade varchar(30),
	temperatura_min varchar(30),
	temperatura_max varchar(30),
	pressao varchar(30),
	humidade varchar(30),
	descricao varchar(50),
	velocidadevento varchar(30),
	icon varchar(30)
);


select * from weather.weather

delete from weather.weather

select * from weather.weather;
