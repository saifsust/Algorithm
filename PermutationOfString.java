import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

	private String string;
	private char[] charArray;
	private static List<String> permutedStringList = new ArrayList<>();

	private void permutation(String string, int node) {

		int size = string.length() - 1;
		if (node == size) {
			permutedStringList.add(string);
		}

		for (int i = node; i <= size; i++) {
			string = swap(string, node, i);
			permutation(string, node + 1);
			//string = swap(string, node, i); //backTruc
		//	System.out.println(string);
		}

	}

	private String swap(String str, int nodeIndex, int secondaryIndex) {
		char temp;
		charArray = str.toCharArray();
		temp = charArray[nodeIndex];
		charArray[nodeIndex] = charArray[secondaryIndex];
		charArray[secondaryIndex] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String str="ABCD";
		new PermutationOfString().permutation(str, 0);
		//System.out.println(str);
		System.out.println(permutedStringList.size());
		for (int i = 0; i < permutedStringList.size(); i++) {
			System.out.println(permutedStringList.get(i));
		}
	}

}
