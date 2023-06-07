import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test
    public void testInput_NormalCase() {
        String input = "1\n10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        main.main(new String[]{});
    }

    @Test
    public void testInput_NoPrimeNumbersCase() {
        String input = "1\n0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        main.main(new String[]{});
    }

    @Test
    public void testInput_BadInputCase() {
        String input = "1\nbad\n10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        main.main(new String[]{});
    }
}
