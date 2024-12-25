import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass localNumber = new MainClass();
        int number = localNumber.getLocalNumber();
        Assert.assertEquals("Value is not 14", 14, number);
    }
}
