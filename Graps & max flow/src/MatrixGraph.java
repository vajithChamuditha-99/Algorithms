/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.*/





/**

 *

 * @author Admin

 */

public class MatrixGraph {

    public int size; //number of vertices
    public boolean[][] adjacencyMatrix;


    public MatrixGraph(int _size){

        size = _size;

        adjacencyMatrix = new boolean[size][size];

    }

    //insert an edge

    void addEdge(int fromId, int toId){

        adjacencyMatrix[fromId][toId] = true;

    }



    void printMe(){

        for(int i=0; i<size; i++){

            for(int j=0; j<size; j++)

                System.out.print(adjacencyMatrix[i][j] ? "1 " : "0 ");

            System.out.println();

        }

    }



    public static void main(String[] args) {

        MatrixGraph g = new MatrixGraph(7);

        g.addEdge(0, 1);

        g.addEdge(0, 2);

        g.addEdge(0, 3);

        g.addEdge(1, 4);

        g.addEdge(2, 0);

        g.addEdge(2, 4);

        g.addEdge(2, 5);

        g.addEdge(3, 5);

        g.addEdge(4, 6);

        g.addEdge(5, 2);

        g.addEdge(5, 4);

        g.addEdge(5, 6);

        g.printMe();

    }



}

