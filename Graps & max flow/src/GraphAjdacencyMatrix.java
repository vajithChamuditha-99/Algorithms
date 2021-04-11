public class GraphAjdacencyMatrix {
    int vertex;
    int[][] matrix;

    public GraphAjdacencyMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination) {
        //add edge
        matrix[source][destination]=1;

        //add bak edge for undirected graph
        matrix[destination][source] = 1;
    }

    public void printGraph() {
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 1; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + (i+1) + " is connected to:");
            for (int j = 0; j <vertex ; j++) {
                if(matrix[i][j]==1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAjdacencyMatrix graph = new GraphAjdacencyMatrix(7);
        graph.addEdge(0, 1);

        graph.addEdge(0, 2);

        graph.addEdge(0, 3);

        graph.addEdge(1, 4);

        graph.addEdge(2, 0);

        graph.addEdge(2, 4);

        graph.addEdge(2, 5);

        graph.addEdge(3, 5);

        graph.addEdge(4, 6);

        graph.addEdge(5, 2);

        graph.addEdge(5, 4);

        graph.addEdge(5, 6);


        graph.printGraph();
    }
}