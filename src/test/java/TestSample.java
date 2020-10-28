import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample {
    static int i=0;

    @Test
    @Parameters("temp")
    public void test1(String temp) throws InterruptedException {
        System.out.println(temp +i);
        i++;
    }

    @Parameters("temp")
    @Test
    public void test2(String temp) throws InterruptedException {
        System.out.println(temp +i);
        i++;
        int k=1/0;
    }
}
