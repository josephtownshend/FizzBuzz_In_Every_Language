import org.junit.jupiter.api.Test

class TestFizzBuzz extends GroovyTestCase {


  @Test
  void testFizz() {
    assert "Fizz" == FizzBuzzer.fizzBuzz(3);

  }

  @Test
  void testBuzz() {
    assert "Buzz" == FizzBuzzer.fizzBuzz(5);

  }

}

