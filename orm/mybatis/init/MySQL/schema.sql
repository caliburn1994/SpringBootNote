create schema if not exists mydb collate utf8mb4_0900_ai_ci;

create table if not exists city
(
    city_id int auto_increment
        primary key,
    name varchar(255) null,
    state varchar(255) null,
    country varchar(255) null
);

create table if not exists user
(
    user_id int auto_increment
        primary key,
    name varchar(255) null,
    gender varchar(255) null,
    height in  null,
    city_id int null,
    constraint user_city_city_id_fk
        foreign key (city_id) references city (city_id)
);

