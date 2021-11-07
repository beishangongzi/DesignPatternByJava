public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly.");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
        DecoyDuck decoyDuck = new DecoyDuck();

        Duck model = new ModelDuck();

        mallardDuck.quack();
        rubberDuck.quack();
        decoyDuck.quack();
        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();

    }
}
