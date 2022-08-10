
      static class Pair {
          int node;
          int parent;

          Pair(int node, int parent) {
              this.node = node;
              this.parent = parent;
          }
      }

      boolean detectCycleBFS(ArrayList<ArrayList<Integer>> adj) {

          boolean visited[] = new boolean[adj.size()];
          Arrays.fill(visited, false);
          for (int i = 0; i < adj.size(); i++) {
              Queue<Pair> q = new LinkedList<>();
              if (visited[i] == false)
                  q.add(new Pair(i, -1));
              while (q.size() != 0) {
                  Pair check_node = q.poll();
                  int node = check_node.node;
                  int parent = check_node.parent;
                  for (int neighbour_node : adj.get(node)) {
                      if (visited[neighbour_node] == false) {
                          visited[neighbour_node] = true;
                          q.add(new Pair(neighbour_node, node));
                      } else if (neighbour_node != parent)
                          return true;
                  }
              }
          }
          return false;
