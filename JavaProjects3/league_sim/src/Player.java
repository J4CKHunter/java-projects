public abstract class Player {

    private String name;
    private int age,name;

    public Player(String name, int number) {
        this.name = name;
        this.age = number;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int number) {
        this.age = number;
    }
}
