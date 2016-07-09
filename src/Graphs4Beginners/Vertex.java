package Graphs4Beginners;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String data;
    List<Edge> edges;
    Status visitedStatus;

    Vertex(String data) {
        this.data = data;
        this.edges = new ArrayList<Edge>();
        visitedStatus = Status.Unvisited;
    }

    public void visit() {
        System.out.println("Visiting : " + data);
        visitedStatus = Status.Visited;
    }
}
