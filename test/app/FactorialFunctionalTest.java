package app;

public class FactorialFunctionalTest implements FactorialCalculatorTest {
  public FactorialCalculator createFactorialCalculator() {
      return new FactorialFunctional();
  }
}
