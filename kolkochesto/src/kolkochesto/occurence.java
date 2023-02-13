package kolkochesto;

import java.util.*;

public class occurence {

	public static Map<Integer, Integer> occ(int[] arr) {
		
		int len = arr.length;
		Map<Integer, Integer> boxOfNumbers = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			int key = arr[i];
			if (boxOfNumbers.containsKey(key)) {
				int value = boxOfNumbers.get(key);
				boxOfNumbers.put(key, value + 1);
			} else {
				boxOfNumbers.put(key, 1);
			}
		}
		return boxOfNumbers;
		
	}

	public static void main(String[] args) {

		int[] array = {6,345,34,2,34,25,234,246,26,73,345,34,764,346,36,26};
		System.out.println(occ(array));

	}

}