package Graphs4Beginners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    Harness - Creates graph from the available classes
 */
public class Harness {
    public void createGraph() {
        Vertex s = new Vertex("s");
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");

        // Create edges
        s.edges.add(new Edge(a, 8));   // s --(8)--> a
        a.edges.add(new Edge(b, 10));  // a --(10)--> b
        b.edges.add(new Edge(c, 5));   // b --(5)--> c
        d.edges.add(new Edge(c, 2));   // d --(2)--> c

        // Create Moar Edges... SO. MANY. EDGES!!!
        s.edges.add(new Edge(b, 7));   // s --(7)--> b
        c.edges.add(new Edge(d, 3));   // c --(3)--> d

        // Create the Graph
        Set<Vertex> vertexes = new HashSet<Vertex>();
        vertexes.add(s);
        vertexes.add(a);
        vertexes.add(b);
        vertexes.add(c);
        vertexes.add(d);

        Graph g = new Graph(vertexes);

        // Do depthFirst Search from s
//        g.depthFirstSearch(s);

        // Do BreadthFirstSearch from s
//        g.breadthFirstSearch(s);

        // Search routes from s -> d
        g.depthFirstSearchRoute(d, a);
    }
}

