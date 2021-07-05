/*
* Quick Union algorithm (better than quick find)
* 
* Initialize:  N time
* Union:  height of tree time
* Find:  height of tree time
*
* Created by: Alexander Ng
* Date: July 04, 2021
*/



public class QuickUnion{
    private int[] id;
    
    public QuickUnion(int n){
        id = new id[n];
        for(int i =0; i<n; i++){
            id[i] = i;
        }
    }
    
    private int root(int i){
        while(i != id[i])
            i = id[i];
        return i;
    }
    
    // Checks if roots are equal
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    
    public void union(int p, int q){
        // Find roots first
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
