import Graph.Graph;

public class App {
    public static void main(String[] args) throws Exception {
        Graph graph1 = new Graph();

        graph1.addVertex('A');
        graph1.addVertex('B');
        graph1.addVertex('C');
        graph1.addVertex('D');
        graph1.addVertex('E');
        // graph1.addVertex('F');

        graph1.addEdge('A', 'B', 1);
        graph1.addEdge('A', 'C', 1);
        graph1.addEdge('A', 'D', 1);
        graph1.addEdge('A', 'E', 1);
        graph1.addEdge('B', 'A', 1);
        graph1.addEdge('B', 'C', 1);

        // System.out.println(graph1);
        System.out.println("DFS");
        // graph1.DFS();
        System.out.println("BFS");
        graph1.BFS();
    }
}
