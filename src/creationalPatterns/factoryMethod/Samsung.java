package creationalPatterns.factoryMethod;

public class Samsung implements Computer {
    @Override
    public void calc() {
        System.out.println("Calc | Samsung");
    }

    @Override
    public void ram() {
        System.out.println("4 Gb | Samsung");
    }
}
