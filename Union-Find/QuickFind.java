/*
* Quick Find algorithm for Dynamic connectivity
*
* Created by: Alexander Ng
* Date: July 04, 2021
*/


public class QuickFind{

    private int[] id;

    // instantiate id array
    public QuickFind(int n){
        id = new int[n];
        for(int i =0; i<n; i++)
            id[i] = i;
    }

    // Checks whether p and q are connected
    public boolean connected(int p, int q){
        // p and q are connected when they are equal, b/c of how union works
        return id[p] == id[q];
    }

    // Connects p and q. Changes all entries connected to p to q
    public void union(int p, int q){
        int pId = id[p];
        int qId = id[q];

        for(int i = 0; i<id.length; i++){
            if(id[i] == pId)
                id[i] = qId;
        }
    }
}
