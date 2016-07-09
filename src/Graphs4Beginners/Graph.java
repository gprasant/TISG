package Graphs4Beginners;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph {
    Set<Vertex> vertices;

    Graph(Set<Vertex> vertices) {
        this.vertices = vertices;
    }

    // Depth first search - same as depth First Traversal
    public void depthFirstSearch(Vertex startAt){
        startAt.visitedStatus = Status.Visited;
        for(Edge e : startAt.edges) {
            Vertex neighbor = e.to;
            if (neighbor.visitedStatus == Status.Unvisited) {
                depthFirstSearch(neighbor);
            }
        }
        startAt.visit();
    }

    public void breadthFirstSearch(Vertex start) {
        Queue<Vertex> q = new LinkedList<Vertex>();
        q.add(start);
        while (q.size() > 0) {
            Vertex node = q.remove();
            if(node.visitedStatus != Status.Visited) {
                node.visit();
                for( Edge e : node.edges) {
                    Vertex adjNode = e.to;
                    q.add(adjNode);
                }
            }
        }
    }

    public void depthFirstSearchRoute(Vertex start, Vertex destination) {
        if (start.equals(destination)) {
            destination.visit();
            return;
        }
        start.visitedStatus = Status.Visited;
        for(Edge e : start.edges) {
            Vertex neighbor = e.to;
            if (neighbor.visitedStatus == Status.Unvisited) {
                depthFirstSearchRoute(neighbor, destination);
            }
        }
        start.visit();
    }
}
