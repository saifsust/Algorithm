/**
 *
 */
package apr;

import java.util.*;
import java.io.*;
import java.lang.*;

/**
 * @author Saif_sust_2013331007
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		try {
			new QuickSort().Solution();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

class QuickSort {
	private int array[], size;

	private void Sort(int first, int last) {

		int i, j, pivote;
		pivote = array[first];

		i = first;
		j = last;

		while (i < j) {
			while (pivote < array[j] && i < j)
				j--;
			while (pivote >= array[i] && i <= j)
				i++;
			if (i <= j) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		if (first < last) {
			int temp2 = array[first];
			array[first] = array[j];
			array[j] = temp2;
			Sort(first, j - 1);
			Sort(j + 1, last);
		}
	}

	protected void Solution() {
		while (scanner.hasNext()) {
			size = scanner.nextInt();
			if (size == 0)
				break;
			array = new int[size + 2];
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
			}
			Sort(0, size - 1);
			// Arrays.sort(array,0,size);
			for (int i = 0; i < size; i++) {
				System.out.print(" " + array[i]);
			}
			System.out.println();

		}
	}

	//private Scanner scanner = new Scanner(System.in);
	 private Scanner scanner = fileFactory.scanner();
}
