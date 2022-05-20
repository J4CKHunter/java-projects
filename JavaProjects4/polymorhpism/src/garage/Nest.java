package garage;

import animal.Bird;

public class Nest {
    protected String name;

    public Nest(String name) {
        this.name = name;
    }

    public void perch(Bird bird){
        System.out.println("\n" + bird + " has landed the nest: " + name);
        bird.land();
    }

    @Override
    public String toString() {
        return "Nest{" +
                "name='" + name + '\'' +
                '}';
    }
}
