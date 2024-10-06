import java.util.*;

// i am giving only actual logic that can be easily get run on leetcode and gfg platform

public class ShortestPathInGraph {
    public static int shortestPathLength(int V, List<List<Integer>> edges, int start, int end) {
      
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (List<Integer> edge : edges) {
            graph.get(edge.get(0)).add(edge.get(1));
            graph.get(edge.get(1)).add(edge.get(0)); // Undirected graph
        }
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        queue.offer(new int[]{start, 0}); // 
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNode = current[0];
            int depth = current[1];

         
            if (currentNode == end) {
                return depth;
            }

         
            for (int neighbor : graph.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, depth + 1});
                }
            }
        }

    
        return -1;
    }
}
