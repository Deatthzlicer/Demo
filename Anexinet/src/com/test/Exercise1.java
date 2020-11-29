 package com.test;

public class Exercise1 {

	public static void main(String[] args) {
		// ADicion de numeros sin operadores arismeticos;

		// Formalizar el calculo en bytes
		// Ciclar hasta remover los residuos y llegar a la igualidad
		// esa formalizacion llegara sobre el desplazamiento de todas sus posiciones en
		// el calculo fuera de los residuos

		System.out.println(sumarSinOperadores(7, 9));

	}

	private static int sumarSinOperadores(int i, int j) {
		while (j != 0) {

			int bitSet = i & j;
			System.out.println(bitSet);
			i = i ^ j;
			System.out.println(i);
			j = bitSet << 1;
			System.out.println(j);

		}
		System.out.println();

		return i;
	}

}
