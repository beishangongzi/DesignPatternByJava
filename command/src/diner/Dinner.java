package diner;

public class Dinner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress);
        customer.setOrder(new BurgerAndFriesOrder(cook));
        customer.hungry();
    }
}
