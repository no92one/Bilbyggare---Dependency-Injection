public class Car {
    public Engine engine;
    public Seat seat;
    public Gear gear;

    public Car(Engine engine, Seat seat, Gear gear) {
        this.engine = engine; // 3 type - el, bensin & disel
        this.seat = seat; // 2 types - Leather & fabric
        this.gear = gear; // 2 typs - manuel & automatic
    }
}
