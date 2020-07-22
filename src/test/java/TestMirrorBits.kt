import org.junit.Assert
import org.junit.Test

class TestMirrorBits {
    @Test
    fun test1() {
        val a = 97
        val expectedOutput = 67
        val test = KCommonTask.mirrorBits(a)
        Assert.assertEquals(expectedOutput, test)
    }
}