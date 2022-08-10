class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int visited[]=new int[V];
        int dfsvisited[]=new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
            if(check(adj,i,visited,dfsvisited)==true)
            return true;
            }
        }
        return false;
        
    }
    static boolean check(ArrayList<ArrayList<Integer>> adj,int node, int visited[],int dfsvisited[])
    {
        visited[node]=1;
        dfsvisited[node]=1;
        for(int neighbour:adj.get(node))
        {
            if(visited[neighbour]==0)
            {
            if(check(adj,neighbour,visited,dfsvisited))
            return true;
            }
            else if(dfsvisited[neighbour]==1)
            return true;
        }
        dfsvisited[node]=0;
        return false;
    }
}
