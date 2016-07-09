package Graphs4Beginners;

public class Edge {
    Vertex to;
    int weight;

    Edge(Vertex toVertex, int weight) {
        to = toVertex;
        this.weight = weight;
    }
}

