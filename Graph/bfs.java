      ArrayList<Integer>
      BFS(ArrayList<ArrayList<Integer>> adj) {
          ArrayList<Integer> ans = new ArrayList<>();
          Queue<Integer> q = new LinkedList<>();
          boolean visited[] = new boolean[adj.size() + 1];
          Arrays.fill(visited, false);
          //disconnected components as well as connected components
          for (int i = 1; i < adj.size(); i++) {
              if (visited[i] == false)

                  q.add(i);
              visited[i] = true;
              while (q.size() != 0) {
                  Integer node = q.poll();
                  ans.add(node);
                  for (Integer node_child : adj.get(node)) {
                      if (visited[node_child] == false) {
                          q.add(node_child);
                          visited[node_child] = true;
                      }
                  }
              }
          }
          return ans;
      }
