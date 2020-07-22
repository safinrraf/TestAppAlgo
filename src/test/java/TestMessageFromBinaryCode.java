import org.junit.Assert;
import org.junit.Test;

public class TestMessageFromBinaryCode {
    @Test
    public void test1() {
        final String code = "010010000110010101101100011011000110111100100001";
        final String expectedOutput = "Hello!";
        final String test = CommonTasks.messageFromBinaryCode(code);
        Assert.assertEquals(expectedOutput, test);
    }

    @Test
    public void test2() {
        final String code = "01001101011000010111100100100000011101000110100001100101001000000100011001101111011100100110001101100101001000000110001001100101001000000111011101101001011101000110100000100000011110010110111101110101";
        final String expectedOutput = "May the Force be with you";
        final String test = CommonTasks.messageFromBinaryCode(code);
        Assert.assertEquals(expectedOutput, test);
    }

}
