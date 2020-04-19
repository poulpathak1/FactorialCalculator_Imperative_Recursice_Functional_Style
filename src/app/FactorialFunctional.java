package app;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FactorialFunctional implements FactorialCalculator {

  @Override
  public BigInteger compute(int number) {
    return IntStream.rangeClosed(1, number)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);

  }
}
