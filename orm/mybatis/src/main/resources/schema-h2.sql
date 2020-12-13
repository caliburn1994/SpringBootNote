create table if not exists city
(
    city_id int auto_increment
        primary key,
    name    varchar(255) null,
    state   varchar(255) null,
    country varchar(255) null
);

create table if not exists user
(
    user_id     int auto_increment primary key,
    city_id     int          null,
    name        varchar(255) null,
    gender      varchar(255) null,
    height      int          null,
    create_time datetime,
    constraint user_city_city_id_fk
        foreign key (city_id) references city (city_id)
);
