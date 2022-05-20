public class Personel {

    private int age;

    public Personel(int age) {
        setAge(age);
    }

    public Personel() {
        setAge(0);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 ){
            IllegalArgumentException e = new IllegalArgumentException("Yas negatif olamaz");
            throw e;
        }
        else{
            this.age = age;
        }
    }
}
