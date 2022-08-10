      ArrayList<ArrayList<Integer>> inputgraph() {
          Scanner sc = new Scanner(System.in);
          System.out.println("ENTER NUMBER OF VERTICES");
          int n = sc.nextInt();
          System.out.println("ENTER THE NUMBER OF EDGES");
          int m = sc.nextInt();
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
          for (int i = 0; i <= n; i++) {
              adj.add(new ArrayList<>());
          }
          for (int j = 0; j < m; j++) {
              System.out.println("ENTER THE VERTICES IN BETWEEN WHICH THERE ARE EDGES");
              int u = sc.nextInt();
              int v = sc.nextInt();
              adj.get(u).add(v);
              adj.get(v).add(u);
          }
          for (int i = 1; i <= n; i++) {
              System.out.println((i + "->" + adj.get(i)));
          }
          return adj;
      }
