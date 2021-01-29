-- 数据字典 Data Dictionary
-- map形式的
-- todo key主键
create table info
(
    key    varchar(64)        not null comment '键',
    key_name    varchar(64)   not null comment '键名',
    key_value   varchar(2048) null comment '数值',
    create_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
    update_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);

-- map in map 形式
-- todo (key,sub_key)主键
create table info
(
    key    varchar(64)        not null comment '键',
    key_name    varchar(64)   not null comme '键名',
    sub_key    varchar(64)        not null comment '子键',
    key_value   varchar(2048) null comment '数值',
    code_order  int           null,
    create_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
    update_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);

-- 动态-1
-- key_type 可以为json等形式，应用通过 key_type 进行初始化的判断。
-- todo (key)主键 key_type索引
create table info
(
    key    varchar(64)        not null comment '键',
    key_name    varchar(64)   not null comment '键名',
    key_type    varchar(64)        not null comment '键类型',
    key_value   varchar(2048) null comment '数值',
    create_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
    update_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);

-- 动态-2
-- 通过 operation 可以使用">,<,in"等操作形式
-- todo (key)主键 key_type索引，operation索引
create table info
(
    key    varchar(64)        not null comment '键',
    key_name    varchar(64)   not null comment '键名',
    key_type    varchar(64)        not null comment '键类型',
    operation   varchar(64)        not null comment '操作',
    key_value   varchar(2048) null comment '数值',
    create_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
    update_time timestamp     default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);


-- 有必要时候，可以将各个索引拆分成表，以减少重复数据