package overriding;

class Engine {
    private String type;
    public Engine(String type) {
        this.type = type;}
    public void start() {
        System.out.println("Engine started");}
    public void stop() {
        System.out.println("Engine stopped");}}

class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;}
    
    public void start() {
        System.out.println("Car started");
        engine.start();}
    
    public void stop() {
        System.out.println("Car stopped");
        engine.stop();}
        
    public String getMake() {
        return make;}

    public String getModel() {
        return model;}}


public class TestComposition {
    public static void main(String[] args) {
        Engine e = new Engine("V6");
        Car myCar = new Car("Toyota", "Fortuner", e);
        myCar.start();
        myCar.stop();}}
