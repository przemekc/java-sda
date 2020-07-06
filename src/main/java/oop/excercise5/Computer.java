package oop.excercise5;

public class Computer {

  private Processor processor;
  private GraphicCard graphicCard;
  private PowerSuply powerSuply;

  Computer(Processor processor, GraphicCard graphicCard, PowerSuply powerSuply) {
    this.processor = processor;
    this.graphicCard = graphicCard;
    this.powerSuply = powerSuply;
  }

  public String description() {
    return "Computer components: \n" +
        processor.getName() + "\n" +
        graphicCard.getName() + "\n" +
        powerSuply.getName() + "\n";
  }
}
