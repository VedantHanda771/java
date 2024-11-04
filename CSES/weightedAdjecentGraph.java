import java.util.Scanner;

class WeightedAdjacencyMatrixGraph {
    private int[][] am; // adjacency matrix
    private int nov; // number of vertices

    // Constructor to initialize the graph with the given number of vertices
    public WeightedAdjacencyMatrixGraph(int v) {
        this.nov = v;
        am = new int[v][v]; // initialize the adjacency matrix with default 0s
    }

    // Method to add a weighted edge between two vertices
    public void addEdge(int from, int to, int weight, boolean undirected) {
        am[from - 1][to - 1] = weight; // adjusting for 1-based index
        if (undirected) {
            am[to - 1][from - 1] = weight;
        }
    }

    // Method to print the adjacency matrix
    public void printGraph() {
        for (int i = 0; i < nov; i++) {
            for (int j = 0; j < nov; j++) {
                System.out.print(am[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of vertices and edges
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        WeightedAdjacencyMatrixGraph graph = new WeightedAdjacencyMatrixGraph(vertices);

        System.out.println("Enter each edge (from to weight):");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(from, to, weight, true); // assuming undirected graph
        }

        System.out.println("Weighted Adjacency Matrix:");
        graph.printGraph();

        scanner.close();
    }
}
