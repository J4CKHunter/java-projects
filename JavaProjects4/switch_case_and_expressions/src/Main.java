import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        switchExampleOne();
//        switchExampleTwo();
//        switchExpressionsExampleOne();
        switchExpressionsExampleTwo();
    }
    public static void switchExampleOne(){

//        case'e verilen değer blank final olamaz.
//        final int j;
//        j = new Random().nextInt(5);


        /*değişken final olsa bile değeri method call ile belirleniyorsa bu çağrının sonucu runtime'da
        belirlenir ve sabite değişken olamaz. bu yüzden de kullanılamaz.*/

//        case'e verilen değer için aşağıdaki yapı constant değildir.
//        final int j = new Random().nextInt(5);

//        case'e verilen değer için aşağıdaki yapı constant değildir.
//        int temp = new Random().nextInt(5);
//        final int j = temp;

        int month = new Random().nextInt(12) + 1;
        System.out.println("generated value of month : " + month);

        String monthString;

        switch (month){
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);
    }

    public static void switchExampleTwo(){

        Random random = new Random();
        int numDays;
        int month = random.nextInt(12) + 1;
        int year = random.nextInt(2022) + 1;

        System.out.println("Generated month : " + month);
        System.out.println("Generated year : " + year);

        switch (month){

            case 1 : case 3 : case 5 :
            case 7 : case 8 : case 10 :
            case 12 :
                numDays = 31;
                break;

            case 4 : case 6 :
            case 9 : case 11:
                numDays = 30;
                break;

            case 2 :
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;

            default:
                numDays = 0;
                System.out.println("Invalid month");
                break;
        }

        System.out.println(month + "th month of " + year + " has " + numDays + " days");
    }

    public static void switchExpressionsExampleOne(){

//        yaptığımız ilk örneği switch expression haline getirebiliriz

        int month = new Random().nextInt(12) + 1;
        System.out.println("generated value of month : " + month);

//        String monthString = switch (month){
//            case 1 -> "January";
//            case 2 -> "February";
//            case 3 -> "March";
//            case 4 -> "April";
//            case 5 -> "May";
//            case 6 -> "June";
//            case 7 -> "July";
//            case 8 -> "August";
//            case 9 -> "September";
//            case 10 -> "October";
//            case 11 -> "November";
//            case 12 -> "December";
//            default -> "Invalid month";
//        };
//
//        System.out.println(monthString);

        System.out.println(switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Invalid day");
        });

    }

    public static void switchExpressionsExampleTwo(){

        int day = new Random().nextInt(7) + 1;

        int letterNumberOfTheDay = switch (day){
            case 1, 5 , 7 -> {
                System.out.println(day + "th day has " + 6 + " letters");
                yield 6;
            }
            case 2 -> {
                System.out.println(day + "th day has " + 7 + " letters");
                yield 7;
            }

            case 4, 6 -> {
                System.out.println(day + "th day has " + 8 + " letters");
                yield 8;
            }

            case 3 -> {
                System.out.println(day + "th day has " + 9 + " letters");
                yield 9;
            }

            default -> returnMinusOne();

        };

        System.out.println("the day " + day + " has " + letterNumberOfTheDay + " days");

    }

    public static int returnMinusOne(){return -1;}
}
