import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BraceCheckerTests {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("[]"));
    }

    @Test
    public void testValid1() {
        assertEquals(true, checker.isValid("{}"));
    }

    @Test
    public void testValid2() {
        assertEquals(true, checker.isValid("(){}[]"));
    }
    @Test
    public void testValid3() {
        assertEquals(true, checker.isValid("([{}])"));
    }
    /**
    @Test
    public void testValid4() {
        assertEquals(true, checker.isValid("({})[({})]"));
    }
    **/
}
