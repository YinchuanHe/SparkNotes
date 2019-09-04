// UnionFind has 2 Basic method and the constructor
// 2 fields int[] parents and int[]ranks
// parents stores root node of each node eg: node i's parent is parents[i]
// ranks stores rank value for each root node eg root node j's rank is ranks[j]
public class UnionFind {
    private int[] parents;
    private int[] ranks;

    // The constructor: n is the total number of edges 
    // eg: For [[1,2],[1,3],[2,3]] n = 3
    // Therefore it's possible having 4 nodes "o-o-o-o"
    // Thats why when we create parents and ranks array with n+1 length
    // the constructor assume every node is a root node (no connection)
    // So every nodes has the same rank = 1
    public UnionFind(int n){
        parents = new int[n + 1];
        ranks = new int[n + 1];
        for (int i = 0; i < parents.length; i++){
            parents[i] = i;
            ranks[i] = 1;
        } 
    }

    // The find method take a node in and return its root node
    // At the same time, the find method also flaten the tree structure
    // by move the node (which passed into find method once) derectly
    // connect to its root node.
    // Therefore, the time complexity for find() is amortized O(1)
    public int find(int x){
        while(parents[x] != x){
            parents[x] = parents[parents[x]];
            x = parents[x];
        }
        return x;
    }

    // The union method takes 2 nodes in and return a boolean
    // First use find() find the root nodes for these 2 nodes
    // If the 2 nodes are in the same cluster/tree (has same root) return false
    // If the 2 nodes are NOT in same cluster/tree (differ root) merge the one 
    // with lower rank to the higher rank root
    // If they have same rank just merge one to the other one and 
    // increase the other's rank value
    // NOTE: The graph structure is actually formed up inside union() when
    // doing the merge process
    public boolean union(int x, int y){
        int xParent = find(x);
        int yParent = find(y);
        if (xParent == yParent) return false;

        if(ranks[xParent] > ranks[yParent]){
            parents[yParent] = xParent;
        }else if(ranks[xParent] < ranks[yParent]){
            parents[xParent] = yParent;
        }else {
            parents[xParent] = yParent;
            ranks[yParent]++;
        }

        return true;
    }
    
}