CREATE TABLE "bicicleta" (
  "id" serial NOT NULL,
  "qrcode" character varying(4) NOT NULL,
  "km" character varying(4) NOT NULL,
  "totem" character varying(50) NOT NULL,
  "alugada"  boolean NOT NULL
);
