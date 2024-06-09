import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;


public class TestCalculatorCsv {
    @ParameterizedTest
    @CsvFileSource(resources = "/add.csv", numLinesToSkip = 1)
    void test(int a, int b, int result){
        Calculator math = new Calculator();
        assertEquals(math.add(a,b),result);
    }
}
