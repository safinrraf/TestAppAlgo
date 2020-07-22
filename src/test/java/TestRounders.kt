import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class TestRounders {
    @Test
    fun test1() {
        val n = 15
        val expectedOutput = 20
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test2() {
        val n = 1234
        val expectedOutput = 1000
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test3() {
        val n = 1445
        val expectedOutput = 2000
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test3_1() {
        val n = 1435
        val expectedOutput = 1000
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test4() {
        val n = 14
        val expectedOutput = 10
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test5() {
        val n = 10
        val expectedOutput = 10
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test6() {
        val n = 7001
        val expectedOutput = 7000
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test7() {
        val n = 99
        val expectedOutput = 100
        val test = KCommonTask.rounders(n)
        assertEquals(expectedOutput, test)
    }
}