package diner;

import org.jetbrains.annotations.NotNull;

public class Waitress {
    Order order;

    public void takeOrder(@NotNull Order order){
        this.order = order;
        order.execute();
    }
}
