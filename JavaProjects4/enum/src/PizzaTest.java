public class PizzaTest {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.setStatus(Pizza.PizzaStatus.ORDERED);

        System.out.println("a customer ordered a pizza  : " + pizza.getStatus());

        pizza.setStatus(Pizza.PizzaStatus.READY);
        System.out.println("\npizza is ready for delivering : " + pizza.getStatus());

        pizza.setStatus(Pizza.PizzaStatus.DELIVERED);
        System.out.println("\npizza successfully delivered : " + pizza.getStatus());

    }
}
