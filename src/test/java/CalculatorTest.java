import calcu.Calculator;
import org.junit.Assert;
import org.junit.Test;
import calcu.Calculator;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator(4,4);
        double expected = 4 + 4;
        double actual = calculator.sum();
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator(0,4);
        double expected = 0 - 4;
        double actual = calculator.subtraction();
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator(100,2);
        double expected = 100 * 2;
        double actual = calculator.multiplication();
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator(8,16);
        double expected = 8 / 16 ;
        double actual = calculator.division();
        Assert.assertEquals(expected,actual,2);
    }

}
