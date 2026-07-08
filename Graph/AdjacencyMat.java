package Graph;

public class AdjacencyMat {
    int vertices;
    int adjacencyMatrix[][];

    AdjacencyMat(int v) {
        vertices = v;
        this.adjacencyMatrix = new int[v][v];
    }

    void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    void displayMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMat adj = new AdjacencyMat(5);
        adj.addEdge(0, 1);
        adj.addEdge(0, 4);
        adj.addEdge(1, 4);
        adj.addEdge(1, 0);
        adj.addEdge(1, 2);
        adj.addEdge(1, 3);
        adj.addEdge(2, 3);
        adj.addEdge(2, 1);
        adj.addEdge(3, 1);
        adj.addEdge(3,2);
        adj.addEdge(3, 4);
        adj.addEdge(4, 0);
        adj.addEdge(4, 1);
        adj.addEdge(4, 2);
        adj.addEdge(4, 3);
        adj.displayMatrix();




    }
}
