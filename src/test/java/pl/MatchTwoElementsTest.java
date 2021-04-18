package pl;

import org.junit.Assert;
import static pl.MatchTwoElements.matchTwoElements;
import static pl.MatchTwoElements.matchTwoElements2;

class MatchTwoElementsTest {

    @org.junit.jupiter.api.Test
    void givenTwoStringIfEquals() {
        // given
        String string1 = "MARA";
        String string2 = "RAMA";

        // when
        boolean b = matchTwoElements(string1, string2);

        // then
        Assert.assertNotEquals(b,false);
        Assert.assertEquals(b,true);
    }

    @org.junit.jupiter.api.Test
    void givenTwoStringIfEquals2() {
        // given
        String string1 = "MARA";
        String string2 = "RAMA";

        // when
        boolean b = matchTwoElements2(string1, string2);

        // then
        Assert.assertNotEquals(b,false);
        Assert.assertEquals(b,true);
    }

}