CREATE TABLE MINION
(
    ID             IDENTITY PRIMARY KEY,
    NAME           VARCHAR(255),
    COLOR          VARCHAR(10),
    VERSION      INT
);

CREATE TABLE TOY
(
    MINION  BIGINT NOT NULL,
    NAME    VARCHAR(255)
);
