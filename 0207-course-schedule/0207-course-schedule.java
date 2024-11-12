class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int inDegree[] = new int[numCourses];

        for(int dep[] : prerequisites) {
            
            int node1 = dep[0];
            int node2 = dep[1];
            // if(ad.get(node2) == null)
            //     adj.put(node2, new ArrayList<>());
            // adj.get(node2).add(node1);
            adj.computeIfAbsent(node2, f -> new ArrayList<>()).add(node1);
            inDegree[node1]++;

        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++)
            if(inDegree[i] == 0)
                q.add(i);

        int completionCount = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            completionCount++;

            for(int adjNode : adj.computeIfAbsent(node, f -> new ArrayList<>())) {
                inDegree[adjNode]--;
                if(inDegree[adjNode] == 0)
                    q.add(adjNode);
            }
        }
        return completionCount == numCourses;
    }
}