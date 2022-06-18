package pluralsight.pizzaexample;

public class App {


    public static void main(String[] args){
        Pizza pizza = new Pizza.PizzaBuilder(12)
                                .cheese(true)
                                .ham(true)
                                .build();
        // deliver pizza


        Car car = new Car.CarBuilder()
                .setMark("aa")
                .setModel("bbb")
                .setGear(1)
                .build();
    }
}
