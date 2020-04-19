package app;

import java.math.BigInteger;

public interface FactorialCalculator {
  BigInteger compute(int number);

  default BigInteger factorial(int number) {
    if(number < 0) {
      throw new IllegalArgumentException("Please enter non-negative number");
    }

    return compute(number);
  }
}
