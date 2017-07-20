package testJava;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateNumber {

	public static void duplicateNumber(int[] arraynumbers) {

		System.out.println("Arraywith duplicates:");

		for (int i = 0; i < arraynumbers.length; i++) {
			System.out.println(arraynumbers[i]);
		}

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arraynumbers.length; i++) {
			set.add(arraynumbers[i]);
		}

		System.out.println("Array without duplicates");
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
	}

	public static void main(String[] args) {
		duplicateNumber(new int[] { 2, 3, 4, 5, 3, 5 });
	}
}
