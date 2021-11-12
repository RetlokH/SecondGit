package hek.git.one;

import java.util.Objects;

public class OneNrTwo {
    private final String name;


    public OneNrTwo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneNrTwo oneNrTwo = (OneNrTwo) o;
        return Objects.equals(name, oneNrTwo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "OneNrTwo{}";
    }
}
