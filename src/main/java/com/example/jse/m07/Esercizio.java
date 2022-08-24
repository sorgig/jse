package com.example.jse.m07;

public class Esercizio {
	public static void main(String[] args) {
		int[] data = { 12, 5, 0, -5, -85 };

		int x = max(data);
		System.out.println(x);
								//unchecked è più rischiosa ma più snella, non ti costringe a mettere il try catch
		try {                  //mettiamo il codice che potrebbe tirare un'eccezione
			int[] data2 = null;
			x = max(data2);
			System.out.println(x);
		} catch (EsercizioException ex) {
			System.out.println(ex.getMessage()); // checked exception serve try catch
		}
	}

	public static int max(int[] array) throws EsercizioException {
		if (array == null || array.length == 0) {
//			throw new IllegalArgumentException("array non può essere vuoto o null"); // throw è eccezione, eccezioni
//																						// iniziano per illegal, le eccezioni sono classi
//		} // è una eccezione unchecked quindi non serve try catch
			throw new EsercizioException("array non può essere vuoto o null");
		}
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}
		return result;
	}

}
