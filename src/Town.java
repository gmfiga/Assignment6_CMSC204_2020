import java.util.Objects;

public class Town implements Comparable<Town>{

    String name;

    public Town(String name) {
        this.name = name;
    }

    public Town(Town templateTown){

    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return Objects.equals(name, town.name);
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Town o) {
        return 0;
    }
}
