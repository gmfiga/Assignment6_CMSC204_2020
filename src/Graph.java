import java.util.ArrayList;
import java.util.Set;

public class Graph implements GraphInterface<Town, Road> {
    @Override
    public Road getEdge(Town sourceVertex, Town destinationVertex) {
        return null;
    }

    @Override
    public Road addEdge(Town sourceVertex, Town destinationVertex, int weight, String description) {
        return null;
    }

    @Override
    public boolean addVertex(Town town) {
        return false;
    }

    @Override
    public boolean containsEdge(Town sourceVertex, Town destinationVertex) {
        return false;
    }

    @Override
    public boolean containsVertex(Town town) {
        return false;
    }

    @Override
    public Set<Road> edgeSet() {
        return null;
    }

    @Override
    public Set<Road> edgesOf(Town vertex) {
        return null;
    }

    @Override
    public Road removeEdge(Town sourceVertex, Town destinationVertex, int weight, String description) {
        return null;
    }

    @Override
    public boolean removeVertex(Town town) {
        return false;
    }

    @Override
    public Set<Town> vertexSet() {
        return null;
    }

    @Override
    public ArrayList<String> shortestPath(Town sourceVertex, Town destinationVertex) {
        return null;
    }

    @Override
    public void dijkstraShortestPath(Town sourceVertex) {

    }
}
