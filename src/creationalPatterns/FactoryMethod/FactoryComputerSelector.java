package creationalPatterns.FactoryMethod;

public class FactoryComputerSelector {
    public Computer getComputer(ComputerType computerType) {
        Computer computer = null;
        switch (computerType) {
            case DESKTOP:
                computer = new Dell();
                break;

            case NOTEBOOK:
                computer = new HP();
                break;

            case TABLET:
                computer = new Samsung();
                break;
        }
        return computer;
    }
}
