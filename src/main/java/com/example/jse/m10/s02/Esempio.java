package com.example.jse.m10.s02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Esempio {
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		data.add("Ciao");
		data.add("tutto molto interessante");
		data.add(null);
		System.out.println(data);
		System.out.println(data.size());
		if (data.contains("paperino")) {
			System.out.println(data);
		} else {
			System.out.println("Non c'è");
		}
		if (data.contains("Ciao")) {
			System.out.println("C'è");
		}
		// ritorna la posizione del valore che gli passo
		int pos = data.indexOf("paperino");
		System.out.println(pos);
		pos = data.indexOf("Ciao");
		System.out.println(pos);

		// 3 loop diversi per stampare l'arraylist di stringhe
		for (int i = 0; i < data.size(); i++) {
			String cur = data.get(i);
			System.out.println(cur);
		}
		// nel for each java crea ed inizializza per noi la variabile
		for (String cur2 : data) {
			System.out.println(cur2);
		}

		// iteratore su stringhe
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			String cur3 = it.next();
			System.out.println(cur3);
		}
		// fai un array di stringhe da un ArrayList
		String[] array = new String[data.size()];
		System.out.println(Arrays.toString(array));
		data.toArray(array);
		System.out.println(Arrays.toString(array));
	}

}
