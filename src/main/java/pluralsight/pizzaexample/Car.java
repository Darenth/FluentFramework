package pluralsight.pizzaexample;

public class Car {

    private int gear;
    private String model;
    private String mark;

    private Car(CarBuilder carBuilder) {
        gear = carBuilder.gear;
        model = carBuilder.model;
        mark = carBuilder.mark;
    }


    public static class CarBuilder {
        public int gear;
        public String model;
        public String mark;


        public CarBuilder setGear(int value) {
            gear = value;
            return this;
        }

        public CarBuilder setModel(String value) {
            model = value;
            return this;
        }


        public CarBuilder setMark(String value) {

            mark = value;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }
}
