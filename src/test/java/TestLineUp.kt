import org.junit.Assert
import org.junit.Test

class TestLineUp {

    @Test
    fun test1() {
        val commands = "LLARL"
        val expectedOutput = 3
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test2() {
        val commands = "RLR"
        val expectedOutput = 1
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test3() {
        val commands = ""
        val expectedOutput = 0
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test4() {
        val commands = "L"
        val expectedOutput = 0
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test5() {
        val commands = "A"
        val expectedOutput = 1
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test6() {
        val commands = "AAAAAAAAAAAAAAA"
        val expectedOutput = 15
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test7() {
        val commands = "RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL"
        val expectedOutput = 16
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test8() {
        val commands = "AALAAALARAR"
        val expectedOutput = 5
        val test = KCommonTask.lineUp(commands)
        Assert.assertEquals(expectedOutput, test)
    }

}