class Solution {
    public int makeConnected(int n, int[][] connections) {
        // if there are not enough cables to connect all computers, return -1
        if (connections.length < n - 1) {
            return -1;
        }
        
        // initialize parent array for Union-Find algorithm
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        // union connected computers
        for (int[] connection : connections) {
            int parent1 = findParent(parent, connection[0]);
            int parent2 = findParent(parent, connection[1]);
            if (parent1 != parent2) {
                parent[parent1] = parent2;
            }
        }
        
        // count the number of disjoint sets (connected components)
        int numSets = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) {
                numSets++;
            }
        }
        
        // the number of cables needed is equal to the number of disjoint sets minus 1
        return numSets - 1;
    }
    
    // find the parent of the given node in the Union-Find algorithm
    private int findParent(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = findParent(parent, parent[node]);
        }
        return parent[node];
    }
}