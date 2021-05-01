package pl;

import org.junit.Assert;
import static pl.MatchTwoElements.matchTwoElements;

class MatchTwoElementsTest {

    @org.junit.jupiter.api.Test
    void givenTwoStringIfEquals() {
        // given
        String string1 = "MARA";
        String string2 = "RAMA";

        // when
        boolean b = matchTwoElements(string1, string2);

        // then
        Assert.assertTrue(b);
    }

    @org.junit.jupiter.api.Test
    void givenTwoStringIfEquals2() {
        // given
        String string1 = "MARA";
        String string2 = "RAMA";

        // when
        boolean b = matchTwoElements(string1, string2);

        // then
        Assert.assertTrue(b);
    }

    @org.junit.jupiter.api.Test
    void givenTwoStringIfEquals3() {
        // given
        String string1 = "ramaRAMA";
        String string2 = "ramarama";

        // when
        boolean b = matchTwoElements(string1, string2);

        // then
        Assert.assertTrue(b);
    }


    @org.junit.jupiter.api.Test
    void givenTwoStringIfEquals4() {
        // given
        String string1 = "r a ma";
        String string2 = "r ama";

        // when
        boolean b = matchTwoElements(string1, string2);

        // then
        Assert.assertTrue(b);
    }



}