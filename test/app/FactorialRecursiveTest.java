package app;

class FactorialRecursiveTest implements FactorialCalculatorTest{
  public FactorialCalculator createFactorialCalculator() {
    return new FactorialRecursive();
  }
}
