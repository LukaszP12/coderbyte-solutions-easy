package Coderbyte.Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathGraphDemo {

    static class Graph {
        int V;
        List<List<Integer>> adj;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(i, new ArrayList<>());
            }
        }

        // add edge to graph
        void addEdge(int s, int d) {
            adj.get(s).add(d);
        }

        // bfs function to find path
        // from source to sink
        boolean BFS(int s, int d) {
            if (s == d)
                return true;

            boolean[] visited = new boolean[V];

            Queue<Integer> queue = new LinkedList<>();

            visited[s] = true;
            queue.offer(s);

            List<Integer> edges;

            while (!queue.isEmpty()) {
                s = queue.poll();

                // get all the adjacent vertices of the dequeued vertex s.
                edges = adj.get(s);
                for (int curr : edges) {
                    if (curr == d)
                        return true;

                    if (!visited[curr]) {
                        visited[curr] = true;
                        queue.offer(curr);
                    }
                }
            }

            return false;
        }

    }

    // return true if there is a path from 1 to 2
    static boolean findPath(int[][] M) {
        // source and destination
        int s = -1, d = -1;
        int N = M.length;
        int V = N * N + 2;
        Graph g = new Graph(V);

        // graph with n*n node
        // each cell consider as node
        int k = 1; // number of current vertex
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (M[i][j] != 0) {

                    // connect all 4 ajacent
                    // cell to current cell
                    if (isSafe(i, j + 1, M))
                        g.addEdge(k, k + 1);
                    if (isSafe(i, j - 1, M))
                        g.addEdge(k, k - 1);
                    if (i < N - 1 && isSafe(i + 1, j, M))
                        g.addEdge(k, k + N);
                    if (i > 0 && isSafe(i - 1, j, M))
                        g.addEdge(k, k - N);
                }

                if (M[i][j] == 1) {
                    s = k;
                }

                if (M[i][j] == 2) {
                    d = k;
                }
                k++;
            }
        }

        return g.BFS(s, d);
    }

    static boolean isSafe(int i, int j, int[][] M) {
        int N = M.length;
        if ((i < 0 || i >= N)
                || (j < 0 || j >= N)
                || M[i][j] == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] M = {{0, 3, 0, 1},
                {3, 0, 3, 3},
                {2, 3, 3, 3},
                {0, 3, 3, 3}};

        System.out.println(findPath(M));
    }
}
