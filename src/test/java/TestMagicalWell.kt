import org.junit.Assert
import org.junit.Test

class TestMagicalWell {
    @Test
    fun test1() {
        val a = 1
        val b = 2
        val n = 2
        val expectedOutput = 8
        val test = KCommonTask.magicalWell(a, b, n)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test2() {
        val a = 1
        val b = 1
        val n = 1
        val expectedOutput = 1
        val test = KCommonTask.magicalWell(a, b, n)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test3() {
        val a = 6
        val b = 5
        val n = 3
        val expectedOutput = 128
        val test = KCommonTask.magicalWell(a, b, n)
        Assert.assertEquals(expectedOutput, test)
    }

}