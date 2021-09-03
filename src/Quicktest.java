
import org.junit.Test;

import static junit.framework.TestCase.*;

public class Quicktest {
    @Test
    public void testkaratsuba1(){
        int a=221;
        int b=523;
        assertEquals (a*b,Main.mult_karatsuba(a,b));
    }
    @Test
    public void testkaratsuba2(){
        int a=2211;
        int b=23;
        assertEquals (a*b,Main.mult_karatsuba(b,a));
    }
    @Test
    public void testkaratsuba3(){
        int a=-300;
        int b=102;
        assertEquals (a*b,Main.mult_karatsuba(a,b));
    }
    @Test
    public void testkaratsuba4(){
        int a=-10042;
        int b=-111;
        assertEquals (a*b,Main.mult_karatsuba(a,b));
    }
    @Test
    public void testkaratsuba5(){
        int a=2131;
        int b=5234;
        assertEquals (a*110,Main.mult_karatsuba(a,b));
    }

}
