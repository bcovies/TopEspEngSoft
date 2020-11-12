CREATE TABLE "bike_user" (
  "id" serial NOT NULL,
  "id_bike" integer NOT NULL,
  "id_usuario" integer NOT NULL,
  "valor" numeric (5,2) NOT NULL,
  "km"  numeric (5,2) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id_bike) REFERENCES bicicleta (id),
  FOREIGN KEY (id_usuario) REFERENCES usuario (id)
);
