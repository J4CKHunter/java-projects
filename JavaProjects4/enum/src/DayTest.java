public class DayTest {
    Day day;

    public DayTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        DayTest firstDay = new DayTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        DayTest thirdDay = new DayTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        DayTest fifthDay = new DayTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        DayTest sixthDay = new DayTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        DayTest seventhDay = new DayTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
