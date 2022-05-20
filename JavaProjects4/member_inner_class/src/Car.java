public class Car {

    private int speed;
    private int distance;
    private Make make;

    public static String staticField = "staticField";


    public Car(){}

    public Car(int speed, int distance, Make make) {
        this.speed = speed;
        this.distance = distance;
        this.make = make;
    }

    protected class Make{
        private String brand;
        private String model;
        private String year;

        public Make(String brand, String model, String year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void accessTest(){
            System.out.println(staticField);
            System.out.println("object variable " + speed + " " + distance);
            getBrand();

        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Make [brand=" + brand + ", model=" + model + ", year=" + year + "]";
        }

    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public void go (int newDistance){distance += newDistance;}

    public void accelerate(int newSpeed){speed = newSpeed;}

    public void stop(){speed = 0;}

    @Override
    public String toString() {
        return "Car [speed=" + speed + ", distance=" + distance + ", make=" + make + "]";
    }

}

