package app;

import java.util.ArrayList;
import java.util.List;

import salesModule.*;
import salesModule.common.*;
import salesModule.item.*;

public class main {

	public main() {
	}

	public static void main(String[] args) {
		// Inicializo Modulo de Compras
		SalesModule salesModule = SalesModule.getSingletonInstance();

		// Inicializo Estados de Items
		Promotion promocion = new Promotion(2);
		Liquidation liquidacion = Liquidation.getSingletonInstance();
		New nuevo = New.getSingletonInstance();

		// Inicializo Items
		ClothingItem camisa = new ClothingItem(Type.SHIRT, 10, nuevo);
		ClothingItem pantalon = new ClothingItem(Type.PANTS, 15, promocion);
		ClothingItem saco = new ClothingItem(Type.JACKET, 20, liquidacion);

		// Inicializo un carro de compras
		List<ClothingItem> carrito = new ArrayList<>();
		carrito.add(camisa);
		carrito.add(pantalon);
		carrito.add(saco);

		// Realizo compra en efectivo del carrito
		salesModule.cashPayment(carrito);

		// Realizo compra con tarjeta del carrito
		salesModule.cardPayment(carrito, 3);

		// Veo las ganancias del dia
		double ventasDelDia = salesModule.earningsOfTheDay(Commons.currentDateAndTime());
		System.out.println(ventasDelDia);
	}

}
