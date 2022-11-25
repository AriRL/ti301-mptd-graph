/*
 * ITESS-TICS
 * MPTD Y EyOD
 * Agosto-Diciembre 2022
 * TI-301
 * Desc: Representacion de grafo
 */
package MTPD_EyOD;

/**
 *
 * @author Ari
 */
public class Graph {

    private final int NUM_VERTEX_MAX = 100; //<final> 

    private int vertex[]; //clase tipo arreglo tipo int con valor nulo
    private int numVertex; //valor cero
    private int edge[][];
    private int numEdges;

    public Graph() {
        init();
    }

    public Graph(int numVertex) {
        init();
    }

    private void init() {
        vertex = new int[NUM_VERTEX_MAX];
        edge = new int[NUM_VERTEX_MAX][2];
    }

    public void setVertex(int numVertex) {
        this.numVertex = numVertex;
        for (int i = 0; i < numVertex; i++) {
            this.vertex[i] = i;
        }
    }

    public void setEdge(int i, int j) {
        edge[numEdges][0] = i;
        edge[numEdges][1] = j;

        numEdges++;
    }

    public String toString() {
        String out = "Graph----\n";
        
        out += "vertices : [";
        for (int i = 0; i < numVertex; i++) {
            out += i + i <= numVertex -1? " ":" , ";
        }
        out += "]\n";
        
        out += "edges : [";
        for (int i = 0; i < numEdges; i++){
            out += "{" + edge[i][0] + ", " + edge[i][1] +  "), ";
        }
        out += "]\n";
        
        return out;
         
        /*String out = "Graph Vertex: ";
        for (int i = 0; i < numVertex; i++) {
            out += i + ", ";
        }
        return out;*/
    }
}
