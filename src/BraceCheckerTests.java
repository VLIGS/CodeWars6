import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BraceCheckerTests {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

}

//"[({})](]" false
//"(){}[]" true
//"(}" false
//"[(])" false
//"([{}])" true