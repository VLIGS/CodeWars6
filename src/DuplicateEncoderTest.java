import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DuplicateEncoderTest {
    @Test
    public void test1() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));

    }

    @Test
    public void test2() {

        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}
