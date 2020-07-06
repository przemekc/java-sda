package oop.excercise5;

public class ComputerFactory {

  public Computer createComputer(String processorName, String graphicCardName, String powerSupllyName) {
    return new Computer(
        new Processor((processorName)),
        new GraphicCard(graphicCardName),
        new PowerSuply((powerSupllyName))
    );
  }
}
