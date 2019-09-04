public int[] findRedundantConnection(int[][] edges){
    UnionFind s = new UnionFind(edges.length);
    for(int[] edge : edges){
        if(!s.union(edge[0], edge[1])){
            return edge;
        }
    }
    return null;
}