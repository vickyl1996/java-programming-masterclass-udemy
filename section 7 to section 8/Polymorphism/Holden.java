public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

}
