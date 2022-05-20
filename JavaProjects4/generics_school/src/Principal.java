public class Principal extends AssistantPrincipal{
    private double budget;


    public Principal(int no, String name, String major, boolean priviledge, double budget) {
        super(no, name, major, priviledge);
        this.budget = budget;
    }

    @Override
    public void work() {
        teach();
        sign();
        purchase();
    }

    @Override
    public void teach() {
        System.out.println("Principal is teaching.");
    }

    @Override
    public void sign() {
        System.out.println("Principal is signing.");
    }

    public void purchase(){
        System.out.println("Principal is purchasing.");
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "priviledge=" + priviledge +
                ", no=" + no +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", major='" + major + '\'' +
                '}';
    }
}
