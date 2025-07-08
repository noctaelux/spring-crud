CREATE TABLE producto
(
    id                 BIGINT NOT NULL,
    nombre             VARCHAR(255),
    descripcion        VARCHAR(255),
    sku                VARCHAR(255),
    precio             DOUBLE PRECISION,
    existencia         DOUBLE PRECISION,
    fecha_creacion     TIMESTAMP,
    fecha_modificacion TIMESTAMP,
    CONSTRAINT pk_producto PRIMARY KEY (id)
);