package Graphs;

import java.util.Stack;

/**
 * Created by Nipun on 12/21/16.
 */
public class Graph {

    final int maxCount = 20;
    private int vertexCount ;
    private Vertex[] vertices = new Vertex[maxCount];
    private int[][] adjacencyList ;
    private Stack<Integer> stack ;


    public Graph(  ){
        this.vertexCount = 0;
        stack = new Stack<>();
        adjacencyList = new int[maxCount][maxCount];
    }

    //ADD VERTEX
    public void addVertex(char label){
        vertices[vertexCount++] = new Vertex(label);
    }

    //ADD EDGE
    public void addEdge(int start , int end){
        adjacencyList[start][end] = 1;
        adjacencyList[end][start] = 1;
    }

    //DISPLAY VERTEX
    public void displayVertex(int v){
        System.out.println(vertices[v].getLabel());
    }

    //GET ADJACENT NODES
    public int getAdjacentVertex(int v){
        for(int i = 0 ; i < vertexCount ; i++){
            if( adjacencyList[v][i]==1 && vertices[i].isVisted()){
                return i;
            }
        }
        return -1;
    }

    //DFS
    public void dfs(){
        vertices[0].setVisted(true);
        displayVertex(0);
        stack.push(0);

        while(!stack.isEmpty()){
            int v = getAdjacentVertex(stack.peek());
            if(v == -1){
                System.out.println("popping");
                stack.pop();
            }
            else{
                vertices[v].setVisted(true);
                displayVertex(v);
                stack.push(v);
            }

        }
    }


    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addEdge(0,1);
        graph.addVertex('C');
        //graph.addEdge(0,2);
        graph.addVertex('D');
       // graph.addEdge(2,3);
        //graph.addEdge(1,3);
        graph.addVertex('E');
        //graph.addEdge(3,4);



        graph.dfs();
    }



}
