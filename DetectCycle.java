
class  DetectCycle  {
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
         boolean[] visited = new boolean[V];

       
        for (int i = 0; i < V; i++) {
            if (!visited[i]) { 
                if (dfs(i, visited, adj, -1)) { 
                    return true; 
                }
            }
        }
        return false; 
    }

   
    private boolean dfs(int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int parent) {
        visited[v] = true;

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) { 
                if (dfs(neighbor, visited, adj, v)) { 
                    return true;
                }
            } else if (neighbor != parent) { 
                return true;
            }
        }
        return false;
    }
}
