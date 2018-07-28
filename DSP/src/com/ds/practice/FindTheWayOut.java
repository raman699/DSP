package com.ds.practice;

public class FindTheWayOut {

	public static void main(String[] args) {
		int ar[][] = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };
		int i = 0, j = 0, dir = 1, posi = 0, posj = 0;
		while (true) {

			if (ar[i][j] == 0) {

				if (dir == 1) {
					j++;
				} else if (dir == 2) {
					i++;
				} else if (dir == 3) {
					j--;
				} else if (dir == 0) {
					i--;
				}

			} else if (ar[i][j] == 1) {
				if (dir == 3) {
					dir = 0;
				} else
					dir++;
				if (dir == 1) {
					j++;
				} else if (dir == 2) {
					i++;
				} else if (dir == 3) {
					j--;
				} else if (dir == 0) {
					i--;
				}
			}
			if ((i < 0 || i > ar.length - 1 || j < 0 || j > ar.length - 1)) {
				if (i < 0) {
					posi = 0;
					posj = j;
				} else if (i > ar.length - 1) {
					posi = ar.length;
					posj = j;
				}
				if (j < 0) {
					posj = 0;
					posi = i;
				}
				if (j > ar.length - 1) {
					posj = ar.length;
					posi = i;
				}
				break;

			}
		}
		System.out.println(posi + "   " + posj);
	}

}
