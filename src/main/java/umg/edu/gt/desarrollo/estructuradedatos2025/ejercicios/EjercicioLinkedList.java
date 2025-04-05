package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.Iterator;
import java.util.LinkedList;

public class EjercicioLinkedList {

	// Problema 1: Eliminar duplicados dejando solo la primera aparición
	public static LinkedList<Integer> eliminarDuplicados(LinkedList<Integer> lista) {
		LinkedList<Integer> resultado = new LinkedList<>();
		for (Integer num : lista) {
			if (!resultado.contains(num)) {
				resultado.add(num);
			}
		}
		return resultado;
	}

	// Problema 2: Invertir elementos sin usar otra lista
	public static void invertirLista(LinkedList<String> lista) {
		int size = lista.size();
		for (int i = 0; i < size / 2; i++) {
			String temp = lista.get(i);
			lista.set(i, lista.get(size - 1 - i));
			lista.set(size - 1 - i, temp);
		}
	}

	// Problema 3: Intercalar dos listas ordenadas
	public static LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
		LinkedList<Integer> resultado = new LinkedList<>();
		Iterator<Integer> it1 = lista1.iterator();
		Iterator<Integer> it2 = lista2.iterator();

		Integer val1 = it1.hasNext() ? it1.next() : null;
		Integer val2 = it2.hasNext() ? it2.next() : null;

		while (val1 != null || val2 != null) {
			if (val1 != null && (val2 == null || val1 <= val2)) {
				resultado.add(val1);
				val1 = it1.hasNext() ? it1.next() : null;
			} else if (val2 != null) {
				resultado.add(val2);
				val2 = it2.hasNext() ? it2.next() : null;
			}
		}
		return resultado;
	}
}

/** INSTRUCCIONES
 Escriba el algoritmo que resuelve el problema en esta clase.
Debe crear un package llamado umg.edu.gt.test.EjercicioLinkedList que corresponda al Test de esta clase.
Genere un Test por cada ejemplo y fuerce que uno de esos Test falle, puede implementar retornar un resultado
y compararlo con el esperado.
 */
	
	// Usando LinkedList de Java Collections, resuelva los siguientes problemas
	// Problema 1: Dada una LinkedList<Integer>, escribir un método que elimine los valores duplicados, dejando solo la primera aparición de cada número.
	// Problema 2: Implementar un método que invierta los elementos de una LinkedList<String> sin usar otra lista o ArrayList.
	// Problema 3: Dadas dos listas enlazadas ordenadas de enteros, escribir un método que devuelva una nueva LinkedList<Integer> con los elementos de ambas listas intercalados en orden.

