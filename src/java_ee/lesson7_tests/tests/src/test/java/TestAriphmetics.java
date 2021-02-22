import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAriphmetics {
    Arifmetics a = new Arifmetics();

    @Before
    public void init(){
        a = new Arifmetics();
        System.out.println("Init test");
    }

    @After
    public void end(){
        System.out.println("Test over");
    }

    @Test
    public void testAdd(){
        int res = a.add(3, 7);
        if (res != 10) Assert.fail();
    }

    @Test
    public void testSub(){
        int res = a.sub(3, 7);
        if (res != -4) Assert.fail();
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException(){
        int x = 10, y = 0;
        if(a.div(x, y) == x && y == 0){
            throw new ArithmeticException();
        }
    }

    @Test(timeout = 1000)
    public void testN(){
        for(int i = 0; i < 1000; i++){
            System.out.println(i);
        }
    }
}
