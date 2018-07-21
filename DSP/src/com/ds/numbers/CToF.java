package com.ds.numbers;

public class CToF {

	public static void main(String... s) {

		int fmax = 300;
		int step = fmax / 20;
		int cel = 0;
		System.out.println("F     C");
		for (int f = 0; f <= fmax; f = f + step) {
			cel = (int) (5.0 / 9 * (f - 32));
			System.out.println(f + "     " + cel);

		}
	}

}
