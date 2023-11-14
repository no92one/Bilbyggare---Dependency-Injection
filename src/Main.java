public class Main {
    public static void main(String[] args) {

        ElEngine elEngine = new ElEngine();
        DiselEngine diselEngine = new DiselEngine();
        BensinEngine bensinEngine = new BensinEngine();

        Car elCar = new Car(elEngine);
        Car bensinCar = new Car(diselEngine);
        Car diselCar = new Car(bensinEngine);


        elCar.engine.start();
        bensinCar.engine.start();
        diselCar.engine.start();
    }
}