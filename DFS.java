/**
 * 
 */
package BFS;

import java.io.*;
import java.lang.*;
import java.util.*;

import Input_File.fileFactory;

/**
 * @author Saif_sust_2013331007
 *
 */
public class DFS {

	/**
	 * @param args
	 */
	private Stack<Integer> stack = new Stack<>();
	private Vector<Integer> Edge[];
	private int u, v, s, e;
	private boolean[] visited;

	@SuppressWarnings("rawtypes")
	private void solution() throws Exception {
		int numNode, numEdge;
		numNode = scanner.nextInt();
		numEdge = scanner.nextInt();
		Edge = new Vector[numNode + 5];
		for (int i = 0; i <= numNode; i++) {
			Edge[i] = new Vector<Integer>();
		}
		int i = 0;
		for (i = 0; i < numEdge; i++) {
			u = scanner.nextInt();
			v = scanner.nextInt();
			Edge[u].add(v);
		}
		visited = new boolean[numNode + 5];
		Arrays.fill(visited, false);
		s = scanner.nextInt();
		dfs(s);

	}

	private void dfs(int s) {
		stack.clear();
		stack.push(s);
		visited[s] = true;
		while (!stack.isEmpty()) {
			int top = stack.peek();
			stack.pop();
			System.out.println();
			for (int i = 0; i < Edge[top].size(); i++) {
				u = Edge[top].get(i);
				if (!visited[u]) {
					System.out.print(u+" ");
					visited[u] = true;
					stack.push(u);
				}
			}

		}
	}

	public static void main(String[] args) {
		try {
			new DFS().solution();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Scanner scanner = fileFactory.scanner();

}
