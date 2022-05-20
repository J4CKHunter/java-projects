public class Main {
    public static void main(String[] args) {

//        basicSize();
//        size();
    }

    public static void basicSize(){
        SizeBasic basicSize = SizeBasic.MEDIUM;
        System.out.println(basicSize);
    }

    public static void size(){
        Size size = Size.LARGE;

        System.out.println("values : ");
        for (Size s :Size.values()) {
            System.out.println(" " + s + " " + s.getAbbreviation() + " " + s.getNo());
        }
        System.out.println("\n" + size.getDescription());

        System.out.println("\npicked size's name : " + size.name());
        System.out.println("picked size's bbreviation : " + size.getAbbreviation());
        System.out.println("picked size's no : " +  size.getNo());

        int ordinal = size.ordinal();
        System.out.println("picked sizes ordinal : " + ordinal);

    }


}
