import java.util.ArrayList;

public class Club {

    private String name;
    private int foundationYear;

    public Club() {
        this.name="Nameless";
        this.foundationYear = 0;
    }

    public Club(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void takimOlustur(String teamName){
    }
}
