import org.junit.Test;
import static org.junit.Assert.*;

public class StringMergerTest {
    @Test
    public void bananasTest() {
        assertFalse("Codewars are not codwars", StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }
    @Test
    public void differentLength() {
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }
    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
    }
}
