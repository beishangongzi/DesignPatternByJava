abstract public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    abstract void display();

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
