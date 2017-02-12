package creationalPatterns.FactoryMethod;

public class HP implements Computer {
    @Override
    public void calc() {
        System.out.println("Calc | HP");
    }

    @Override
    public void ram() {
        System.out.println("2 Gb | HP");
    }
}
