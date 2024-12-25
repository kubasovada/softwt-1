import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass localNumber = new MainClass();
    @Test
    public void testGetLocalNumber() {
        int number = localNumber.getLocalNumber();
        Assert.assertEquals("Value is not 14", 14, number);
    }

    @Test
    public void testGetClassNumber() {
        int classNumber = localNumber.getClassNumber();
        Assert.assertTrue("classNumber less 45 ("+classNumber + "), but must be > 45" , classNumber > 45);

    }

    }