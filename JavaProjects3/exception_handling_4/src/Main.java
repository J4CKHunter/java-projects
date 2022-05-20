public class Main {
    public static void main(String[] args) {


        try{
            Personel p1 = new Personel(18);
            System.out.println("p1 yasi : " + p1.getAge());

            Personel p2 = new Personel(-300);
            System.out.println("p2 yasi : " + p2.getAge());

            Personel p3 = new Personel(20);
            System.out.println("p3 yasi : " + p3.getAge());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            Personel p4 = new Personel(19);
            System.out.println("p4 yasi : " + p4.getAge());
        }

    }
}
