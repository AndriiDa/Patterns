package creationalPatterns.factoryMethod;

public class Dell implements Computer {
    @Override
    public void calc() {
        System.out.println("Calc | Dell");
    }

    @Override
    public void ram() {
        System.out.println("4Gb | Dell");
    }
}
