package Test;

import Codility.CountingElements.PermCheck;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest extends TestCase {

    PermCheck permCheck = new PermCheck();

    @Test
    void asd() {
        int[] input = {4,1,3,2};
        int result = permCheck.solution(input);
//        Assert.assertThat(result).isEqualsTo(1);
    }

    @Test
    void asd2() {
        int[] input = {1,2,3};
        int result = permCheck.solution(input);
//        Assert.assertThat(result).isEqualsTo(1);
    }

    @Test
    void asd3() {
        int[] input = {1,4,3};
        int result = permCheck.solution(input);
//        Assert.assertThat(result).isEqualsTo(0);
    }




}