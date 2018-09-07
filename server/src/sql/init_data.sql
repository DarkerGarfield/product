INSERT INTO t_category (name, create_time, update_time)
VALUES ('热榜', now(), now()),
       ('好吃的', now(), now());


INSERT INTO t_product (name, price, stock, description, icon, status, category_id)
VALUES ('皮蛋粥', 0.01, 39, '好吃的皮蛋粥', '//fuss10.elemecdn.com/0/49/65d10ef215d3c770ebb2b5ea962a7jpeg.jpeg', false, 1),
       ('慕斯蛋糕', 10.90, 200, '美味爽口', '//fuss10.elemecdn.com/9/93/91994e8456818dfe7b0bd95f10a50jpeg.jpeg', true, 2),
       ('蜜汁鸡翅', 0.02, 982, '好吃', '//fuss10.elemecdn.com/7/4a/f307f56216b03f067155aec8b124ejpeg.jpeg', false, 1);
