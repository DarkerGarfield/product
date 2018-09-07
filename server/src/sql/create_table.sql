create table t_category (
  id          int unsigned         auto_increment primary key
  comment '',
  name        varchar(50) not null
  comment '商品类型名称',
  create_time datetime    not null default now()
  comment '创建时间',
  update_time datetime    not null default now()
  on update now()
  comment '更新时间'

)
  ENGINE = InnoDB
  charset = 'utf8'
  comment '商品类型';


create table t_product (
  id          int unsigned                    auto_increment primary key
  comment '自增主键',
  name        varchar(50)            not null
  comment '商品名称',
  price       decimal(6, 2) unsigned not null
  comment '单价',
  stock       int unsigned           not null
  comment '商品库存',
  description varchar(500) comment '商品描述',
  icon        varchar(100)           not null
  comment '商品介绍图片地址',
  status      bool                   not null default true
  comment 'true: 上架  false：下架',
  category_id int unsigned           not null
  comment '商品类型'
)
  ENGINE = InnoDB
  charset = 'utf8'
  comment '商品信息';