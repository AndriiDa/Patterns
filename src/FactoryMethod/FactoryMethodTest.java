package FactoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryComputerSelector computerSelector = new FactoryComputerSelector();

        Computer computer = computerSelector.getComputer(ComputerType.DESKTOP);
        computer.calc();

        Computer computer1 = computerSelector.getComputer(ComputerType.NOTEBOOK);
        computer1.calc();

        Computer computer2 = computerSelector.getComputer(ComputerType.TABLET);
        computer2.calc();

    }


}













