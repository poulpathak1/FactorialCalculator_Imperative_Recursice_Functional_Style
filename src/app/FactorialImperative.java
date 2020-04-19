package app;

import java.math.BigInteger;

public class FactorialImperative implements FactorialCalculator {
  @Override
  public BigInteger compute(int number) {
    var product = BigInteger.ONE;

    for (int i = 1; i <= number; i++) {
      product = product.multiply(BigInteger.valueOf(i));
    }

    return product;
  }
}
