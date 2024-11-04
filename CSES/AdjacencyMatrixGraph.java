import java.util.*;

class AdjacencyMatrixGraph {
    private int[][] am; 
    private int nov; 

    public AdjacencyMatrixGraph(int v) {
        this.nov = v;
        am = new int[v][v]; 
    }

    public void addEdge(int from, int to, boolean undirected) {
        am[from - 1][to - 1] = 1; 
        if (undirected) {
            am[to - 1][from - 1] = 1;
        }
    }
    
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
        
        
        int vertices = scanner.nextInt();
        
        ;
        int edges = scanner.nextInt();
        
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(vertices);
        
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            graph.addEdge(from, to, true); 
        }
        
        
        graph.printGraph();
        
        scanner.close();
    }
}
