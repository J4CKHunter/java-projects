public class HandballPlayer extends Player {
    public HandballPlayer() {
        super();
    }

    public HandballPlayer(String name, double age, double height, double weight) {
        super(name, age, height, weight);
    }

    @Override
    public double getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(double age) {
        super.setAge(age);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}