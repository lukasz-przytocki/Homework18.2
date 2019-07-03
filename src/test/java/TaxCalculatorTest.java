import org.junit.Assert;
import org.junit.Test;

public class TaxCalculatorTest {

    @Test
    public void shouldReturn0() {
        //given
        TaxCalculator taxCalculator = new TaxCalculator();
        //when
        double tax = taxCalculator.calculate(556.02);
        //then
        Assert.assertEquals(tax, 0, 0.001);

    }

    @Test
    public void shouldReturn1() {
        //given
        TaxCalculator taxCalculator = new TaxCalculator();
        //when
        double tax = taxCalculator.calculate(3095);
        //then
        Assert.assertEquals(tax, 1, 0.001);

    }

    @Test
    public void shouldReturn14839_019() {
        //given
        TaxCalculator taxCalculator = new TaxCalculator();
        //when
        double tax = taxCalculator.calculate(85528);
        //then
        Assert.assertEquals(tax, 14839.019, 0.001);

    }

    @Test
    public void shouldReturn14839_34() {
        //given
        TaxCalculator taxCalculator = new TaxCalculator();
        //when
        double tax = taxCalculator.calculate(85529);
        //then
        Assert.assertEquals(tax, 14839.34, 0.001);

    }

    @Test
    public void shouldReturn1000000_3() {
        //given
        TaxCalculator taxCalculator = new TaxCalculator();
        //when
        double tax = taxCalculator.calculate(3164157);
        //then
        Assert.assertEquals(tax, 1000000.3, 0.001);

    }

}
