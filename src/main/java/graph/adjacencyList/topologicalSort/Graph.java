package graph.adjacencyList.topologicalSort;

import java.util.*;

class Graph {
    List<List<Integer>> graph;
    HashMap<Integer, Integer> incomingDegree;
    int nodes;
    Queue<Integer> sourceQueue;

    Graph(int nodes) {
        graph = new ArrayList<>();
        incomingDegree = new HashMap<>();
        sourceQueue = new LinkedList<>();
        this.nodes = nodes;


        for (int i = 0; i < nodes; i++) {
            graph.add(i, new ArrayList<>());
            incomingDegree.put(i, 0);
        }
    }

    public void addEdge(int a, int b) {
        graph.get(a).add(b);
        incomingDegree.put(b, incomingDegree.get(b) + 1);
    }

    public List<Integer> topologicalSort() {

        for (Map.Entry<Integer, Integer> entry : incomingDegree.entrySet()) {
            if (entry.getValue() == 0) {
                sourceQueue.add(entry.getKey());
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!sourceQueue.isEmpty()) {
            int source = sourceQueue.remove();
            result.add(source);

            List<Integer> childrenList = graph.get(source);

            for (Integer child : childrenList) {
                incomingDegree.put(child, incomingDegree.get(child) - 1);

                if (incomingDegree.get(child) == 0) {
                    sourceQueue.add(child);
                }
            }
        }

        if (result.size() != nodes) {
            System.out.println("Cycle is there in graph");
            return new ArrayList<>();
        }

        return result;
    }

}