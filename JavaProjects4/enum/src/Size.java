public enum Size {
    SMALL("S",1), MEDIUM("M",2), LARGE("L",3), EXTRA_LARGE("XL",4);

    private String abbreviation;
    private int no;
    private static String description = "There are sizes.";

    private Size(String abbreviation, int no){
        this.abbreviation = abbreviation;
        this.no = no;
    }

    public String getAbbreviation(){return abbreviation;}
    public int getNo(){return no;}
    public String getDescription(){return description;}

}
