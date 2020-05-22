import java.math.BigDecimal;

public class OverloadingTests {

    public static final int a;
    public static final String b;
    //public static final int c;
    static {
        a=10;
    }

    static {
        b="Sree";
    }

    public OverloadingTests(){
        //c=2;
    }


    private void test(Object obj) {

    }

    private String test(String obj) {

        return null;
    }

    double test(float f) {

        return 0.0;
    }

    protected int test(int a) {
        return 0;
    }

    public BigDecimal test(Integer a) {
        return new BigDecimal(0);
    }


}
