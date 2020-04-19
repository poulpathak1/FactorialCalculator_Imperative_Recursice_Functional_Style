package app;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public interface  FactorialCalculatorTest {

  FactorialCalculator createFactorialCalculator();

  @Test
  default void canary(){
    assertTrue(true);
  }

  @Test
  default void checkFactorialForOneDigitNumber() {
    var factorialCalculator = createFactorialCalculator();

    assertAll(
      () -> assertEquals(BigInteger.ONE, factorialCalculator.factorial(0)),
      () -> assertEquals(BigInteger.ONE, factorialCalculator.factorial(1)),
      () -> assertEquals(BigInteger.TWO, factorialCalculator.factorial(2)),
      () -> assertEquals(BigInteger.valueOf(6), 
        factorialCalculator.factorial(3)),
      () -> assertEquals(BigInteger.valueOf(120), 
        factorialCalculator.factorial(5)),
      () -> assertEquals(BigInteger.valueOf(3628800),
        factorialCalculator.factorial(10)));
    }

  @Test
  default void checkFactorialForTwoDigitNumber() {
    var factorialCalculator = createFactorialCalculator();

    BigInteger value = new BigInteger(
      "30414093201713378043612608166064768844377641568960512000000000000");
    assertEquals(value, factorialCalculator.factorial(50));
  }

  @Test
  default void factorialForNegativeNumber() {
    var factorialCalculator = createFactorialCalculator();

    var ex = assertThrows(IllegalArgumentException.class,
      () -> factorialCalculator.factorial(-1));

    assertEquals("Please enter non-negative number", ex.getMessage());
  }
}
