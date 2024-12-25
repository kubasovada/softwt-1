import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainClassTest {
    MainClass localString = new MainClass();

    @Test
    public void getClassString() {
        String result = localString.getClassString();
        assertThat(result, anyOf(containsString("Hello"), containsString("hello")));
      }

    }