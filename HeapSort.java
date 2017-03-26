package Programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

interface direction {
	public static String dir = "res/input.txt";
}

public class HeapSort {

	private static void minHeap(int node, int last) {
		if (node > last)
			return;
		int left, right, parent, child;
		left = getLeftNode(node);
		right = getRightNode(node);
		parent = getParentNode(node);
		child = node;
		int countNode = node;
		while (countNode > 1) {

			if (array[child] < array[parent]) {
				swap(parent, child);
				child = getParentNode(countNode);
				parent = getParentNode(child);
				countNode = child;
			} else
				break;
		}

		minHeap(left, last);
		minHeap(right, last);
	}

	private static void swap(int parentNode, int childNode) {
		int temp = array[parentNode];
		array[parentNode] = array[childNode];
		array[childNode] = temp;

	}

	private static int getParentNode(int node) {
		return Math.floorDiv(node, 2);
	}

	private static int getLeftNode(int node) {
		return node * 2;
	}

	private static int getRightNode(int node) {
		return node * 2 + 1;
	}

	private static void heapSort(int n) {

		for (int i = 1; i <= n; i++) {
			minHeap(1, n);
			sortArray[i] = array[1];
			array[1] = inf;
		}
		for (int i = 1; i <= n; i++)
			array[i] = sortArray[i];

	}

	public static void main(String[] args) {

		int size = 100;
		// System.out.println(inf);
		int n= 10;
		//int n = fileConnectionFactory.getScanner().nextInt();
		for (int i = 1; i <= n; i++)
			 array[i] = rand.nextInt(size);
			//array[i] = fileConnectionFactory.getScanner().nextInt();
		fileConnectionFactory.close();
		for (int i = 1; i <= n; i++)
			System.out.print(i + "\t");
		System.out.println();
		for (int i = 1; i <= n; i++)
			System.out.print(array[i] + "\t");
		System.out.println();
		
		
		heapSort(n);
		
		for (int i = 1; i <= n; i++)
			System.out.print(array[i] + "\t");
		System.out.println();

	}

	private static int inf = (int) 1e8;
	private static Random rand = new Random();
	private static int[] array = new int[1000];
	private static int[] sortArray = new int[1000];
}

class fileConnectionFactory implements direction {
	private fileConnectionFactory() {
		try {
			reader = new FileReader(dir);
			buffer = new BufferedReader(reader);
			scanner = new Scanner(buffer);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static Scanner getScanner() {
		return instance.scanner;
	}

	public static void close() {
		try {
			instance.reader.close();
			instance.buffer.close();
			instance.scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private FileReader reader;
	private static fileConnectionFactory instance = new fileConnectionFactory();
	private BufferedReader buffer;
	private Scanner scanner;
}