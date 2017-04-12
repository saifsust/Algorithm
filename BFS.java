/**
 * 
 */
package BFS;

import java.util.*;

import Input_File.fileFactory;

import java.lang.*;
import java.io.*;

/**
 * @author Saif_sust_2013331007
 *
 */
public class BFS {

	/**
	 * @param args
	 */

	private Vector<Integer> Edge[];
	private boolean visited[];
	private Queue<Integer> Q = new LinkedList<Integer>();
	private int numNodes, startNode, nextNode, numEdges;

	private void Solution() throws Exception {
		while (scanner.hasNext()) {
			numNodes = scanner.nextInt();
			numEdges = scanner.nextInt();
			System.out.println(numNodes + " " + numEdges);
			Edge = new Vector[numNodes + 5];
			for (int i = 0; i <= numNodes + 2; i++) {
				Edge[i] = new Vector<Integer>();
			}
			visited = new boolean[numNodes + 5];
			Arrays.fill(visited, false);
			for (int i = 0; i < numEdges; i++) {
				startNode = scanner.nextInt();
				nextNode = scanner.nextInt();
				Edge[startNode].add(nextNode);
			}
			Arrays.fill(visited, false);
			int startingPoint = scanner.nextInt();
			bfs(startingPoint);
			for (int i = 0; i <= numNodes; i++) {
				System.out.println();
			}

		}

	}

	private void bfs(int startingPoint) throws Exception {
		Q.clear();
		Q.add(startingPoint);
		visited[startingPoint] = true;
		while (!Q.isEmpty()) {
			int node = Q.peek();
			Q.poll();
			for (int i = 0; i < Edge[node].size(); i++) {
				nextNode = Edge[node].get(i);
				// System.out.println(nextNode);
				if (!visited[nextNode]) {
					System.out.print(nextNode + " ");
					visited[nextNode] = true;
					Q.add(nextNode);
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws Exception {

		try {
			new BFS().Solution();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Scanner scanner = fileFactory.scanner();
}
