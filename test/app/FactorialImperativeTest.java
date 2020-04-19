package app;

public class FactorialImperativeTest implements FactorialCalculatorTest {
  public FactorialCalculator createFactorialCalculator() {
    return new FactorialImperative();
  }
}
