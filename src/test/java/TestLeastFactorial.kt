import org.junit.Assert
import org.junit.Test

class TestLeastFactorial {
    @Test
    fun test1() {
        val n = 17
        val expectedOutput = 24
        val test = KCommonTask.leastFactorial(n)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test2() {
        val n = 1
        val expectedOutput = 1
        val test = KCommonTask.leastFactorial(n)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test3() {
        val n = 5
        val expectedOutput = 6
        val test = KCommonTask.leastFactorial(n)
        Assert.assertEquals(expectedOutput, test)
    }

}