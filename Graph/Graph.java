package Graph;

import Queue.Queue;
import Stack.Stack;

public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];

        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    adjacencyMatrix[i][j] = -1;
                }
            }
        }
    }

    public void addVertex(char label) {
        vertexList[countVertex] = new Vertex(label);
        countVertex++;
    }

    private int indexVertex(char label) {
        for (int i = 0; i < maxVertex; i++) {
            if (label == vertexList[i].label) {
                return i;
            }
        }
        return -1;
    }

    public void addEdge(char label1, char label2, int weight) {
        int indexLabel1 = indexVertex(label1);
        int indexLabel2 = indexVertex(label2);

        if (indexLabel1 == -1 || indexLabel2 == -1) {
            System.out.println("Label doesn't exist");
        } else {
            adjacencyMatrix[indexLabel1][indexLabel2] = weight;
            adjacencyMatrix[indexLabel2][indexLabel1] = weight;
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                temp = temp + adjacencyMatrix[i][j] + "\t";
            }
            temp += "\n";
        }
        System.out.println(temp);
        return temp;
    }

    private void BFS(Vertex seed) {
        Queue<Vertex> queue = new Queue<Vertex>();
        queue.enqueue(seed);

        while (queue.isEmpty() == false) {
            Vertex x = queue.dequeue();
            if (x.flagVisited == false) {
                System.out.print(x.label + " ");
                x.flagVisited = true;
                for (int i = 0; i < countVertex; i++) {
                    if (adjacencyMatrix[indexVertex(x.label)][i] >= 1
                            && !vertexList[i].flagVisited) {
                        System.out.println("Get " + vertexList[i].label);

                        queue.enqueue(vertexList[i]);
                    }
                }
            }
        }

    }

    public void BFS() {
        BFS(vertexList[0]);
    }

    public void DFS() {
        DFS(vertexList[0]);
    }

    private void DFS(Vertex seed) {
        Stack<Vertex> stack = new Stack<Vertex>();
        stack.push(seed);
        while (stack.isEmpty() == false) {
            Vertex x = stack.pop();
            if (x.flagVisited == false) {
                System.out.println(x.label + " ");
                x.flagVisited = true;
                for (int i = countVertex - 1; i >= 0; i--) {
                    if (adjacencyMatrix[indexVertex(x.label)][i] >= 1 && !vertexList[i].flagVisited) {
                        System.out.println("Get " + vertexList[i].label);
                        stack.push(vertexList[i]);
                    }
                }
            }

        }
    }
    // public void show() {
    // for (int i = 0; i < maxVertex; i++) {
    // for (int j = 0; j < maxVertex; j++) {
    // if ((i == j) || ((i != j) && (adjacencyMatrix[i][j] == -1))) {
    // continue;
    // } else {
    // System.out.println(vertexList[i].label + " terhubung ke "
    // + vertexList[j].label + " dengan beban " + adjacencyMatrix[i][j]);
    // }
    // }
    // }
    // }
}
