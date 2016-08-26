package CoffeeProgram;

/**
 * Created by student on 26-Aug-16.
 */

import org.junit.*;

public class CafeTest {

    public static final int NO_MILK = 0;
    public static final int NO_BEANS =0;
    public static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();

    private Cafe cafe;

    @Before
    public void before() {
        cafe = new Cafe();
    }
    @Test
    public void canBrewEspresso () {
        //given
        withBeans();

        //when it occured
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //then
        //1 - is it an espresso

        Assert.assertEquals("Wrong Coffee Type", CoffeeType.Espresso, coffee.getType());

    }

    public void withBeans() {
        cafe.restockBeans(ESPRESSO_BEANS);
    }

}
