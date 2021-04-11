import java.util.LinkedList;

public class AdjacencyListGraph {
    int vertex;
    LinkedList<Integer> list[];

    public AdjacencyListGraph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i <vertex ; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
    }

    public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
            if(list[i].size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph(7);
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