public class Road implements Comparable<Road> {

    String name;
    int distance;
    Town source;
    Town destination;

    public Road(Town source, Town destination, int distance, String name) {
        this.name = name;
        this.distance = distance;
        this.source = source;
        this.destination = destination;
    }

    public Road(Town source, Town destination, String name) {
        this.name = name;
        this.distance = 1;
        this.source = source;
        this.destination = destination;
    }

    public boolean contains(Town town){

    }

    public java.lang.String toString(){

    }

    public String getName() {
        return name;
    }

    public Town getSource() {
        return source;
    }

    public Town getDestination() {
        return destination;
    }

    public int getWeight() {
        return distance;
    }

    @Override
    public int compareTo(Road o) {
        return 0;
    }

}
