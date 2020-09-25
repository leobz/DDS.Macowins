# DDS.Macowins
Diseño de Sistema (Ejemplo): Módulo de Ventas Indumentaria

[Ver UML Actualizado desde Lucid Chart ]( https://www.lucidchart.com/invitations/accept/4aa148cc-0cfc-48ff-ab42-ca71da904437)

Version 1.0.0   
Diagrama de Clases:

![alt text](https://github.com/leobz/DDS.Macowins/blob/master/class_diagram.png "Diagrama de Clases")


Caso de Uso:

![alt text](https://github.com/leobz/DDS.Macowins/blob/master/use_case.png  "Caso de Uso")



### Requerimientos:


La conocida empresa de ropa formal para caballeros, Macowins, es capaz de darle soporte a la venta de prendas. Un fragmento de la grabación del analista con el cliente:

“Queremos saber el precio de venta de una prenda y sus tipos, los tipos de prenda son: sacos, pantalones, camisas.

El cálculo de la prenda es, el precio propio de la prenda modificado según el estado de la prenda, que pueden ser:
Nueva: en este caso no modifican el precio base.
Promoción: Le resta un valor fijo decidido por el usuario.
Liquidación: Es un 50% del valor del producto.

Ah, un requerimiento más: Macowins registra las ventas de estas prendas y necesita saber las ganancias de un determinado día. 

“Cada venta tiene asociada las prendas que se vendieron, su cantidad y la fecha de venta. 
Las ventas pueden ser en efectivo o con tarjeta, tienen el mismo comportamiento que en efectivo (el cual no modifica el precio), solo que se le aplica un recargo según la cantidad de cuotas seleccionadas (cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda).”
