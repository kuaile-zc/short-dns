-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS test;

CREATE TABLE test
(
    id   BIGINT(20)   NOT NULL COMMENT 'id',
    name VARCHAR(100) NULL DEFAULT NULL COMMENT 'name',
    des  VARCHAR(100) NULL DEFAULT NULL COMMENT 'describe',
    PRIMARY KEY (id)
);
