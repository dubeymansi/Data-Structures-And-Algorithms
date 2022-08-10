     ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj) {
          ArrayList<Integer> ans = new ArrayList<>();
          boolean visited[] = new boolean[adj.size()];
          for (int i = 0; i < adj.size(); i++) {
              if (visited[i] == false)
                  DFSrecur(adj, ans, i, visited);

          }
          return ans;
      }

      static void DFSrecur(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, int node, boolean visited[]) {
          visited[node] = true;
          ans.add(node);
          for (Integer node_child : adj.get(node)) {
              if (visited[node_child] == false) {
                  DFSrecur(adj, ans, node_child, visited);
              }
          }
      }
