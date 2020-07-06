package lambdas.excercise1;

public class StringProcessor {

  private StringOperation operation = s -> s; // defaultowe zachowanie

  public String process(String s) {
    return operation.operation(s);
  }

  public void setOperation(StringOperation operation) {
    this.operation = operation;
  }
}
