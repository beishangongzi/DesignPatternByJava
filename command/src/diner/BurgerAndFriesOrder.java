package diner;

public class BurgerAndFriesOrder implements Order{
    Cook cook;

    public BurgerAndFriesOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.makeBurger();
        cook.makeFries();
    }
}
