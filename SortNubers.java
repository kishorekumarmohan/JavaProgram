package testJava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SortNubers {

	public static void main(String[] args) {

		int[] num = { 2, 4, 8, 5, 3, 10 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {

				if (num[i] < num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;

				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println("numbers after sort:" + num[i]);
		}

	}

	// TODO Auto-generated method stub

}
