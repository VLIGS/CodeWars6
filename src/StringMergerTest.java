import org.junit.Test;
import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void bananasTest() {
        assertTrue("I am going bananas", StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }


    //'RVXZ]d/!C"nfY:v1_`=wZ"m:oT3k8bTkCRVXZ]d/!C"nfY:ytR'R3a)]\;"^e]usm'KW%2B"H-A%OEgg;35A^NenmjL'
    // is a merge of
    // 'RVXZ]d/!C"nfY:ytR'R3a)]\;"^e]usm''
    // and
    // 'RVXZ]d/!C"nfY:v1_`=wZ"m:oT3k8bTkCKW%2B"H-A%OEgg;35A^NenmjL'


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
