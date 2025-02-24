//LEETCODE 2467. Most Profitable Path in a Tree


class Solution {
    List<List<Integer>> adj;
    int[] distFromBob;
    int n;

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        n = amount.length;
        adj = new ArrayList<>();
        distFromBob = new int[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        return dfs(0, -1, 0, bob, amount);
    }

    private int dfs(int src, int parent, int time, int bob, int[] amount) {
        int maxIncome = 0;
        int maxChild = Integer.MIN_VALUE;

        if (src == bob) {
            distFromBob[src] = 0;
        } else {
            distFromBob[src] = n;
        }

        for (int neighbor : adj.get(src)) {
            if (neighbor != parent) {
                maxChild = Math.max(maxChild, dfs(neighbor, src, time + 1, bob, amount));
                distFromBob[src] = Math.min(distFromBob[src], distFromBob[neighbor] + 1);
            }
        }

        if (distFromBob[src] > time) {
            maxIncome += amount[src];
        } else if (distFromBob[src] == time) {
            maxIncome += amount[src] / 2;
        }

        return maxChild == Integer.MIN_VALUE ? maxIncome : maxIncome + maxChild;
    }
}









