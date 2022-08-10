class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int ans[]=new int[V];
        int indegree[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int neighbour:adj.get(i))
            {
               indegree[neighbour]++; 
            }
            
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }
        int ind=0;
        while(q.size()!=0)
        {
            int node=q.poll();
            ans[ind++]=node;
            for(int neighbour_node:adj.get(node))
            {
                indegree[neighbour_node]--;
                if(indegree[neighbour_node]==0)
                q.add(neighbour_node);
            }
        }
        return ans;
    }
}
