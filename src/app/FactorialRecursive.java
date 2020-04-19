package app;

import java.math.BigInteger;

public class FactorialRecursive implements FactorialCalculator {
  @Override
  public BigInteger compute(int number) {
    if (number == 0) {
      return BigInteger.ONE;
    }

    return BigInteger.valueOf(number).multiply(factorial(number-1));
  }
}
