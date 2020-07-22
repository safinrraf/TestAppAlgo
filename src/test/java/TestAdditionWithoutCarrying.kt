import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class TestAdditionWithoutCarrying {
    @Test
    fun test1() {
        val param1 = 456
        val param2 = 1734
        val expectedOutput = 1180
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test2() {
        val param1 = 99999
        val param2 = 0
        val expectedOutput = 99999
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test3() {
        val param1 = 999
        val param2 = 999
        val expectedOutput = 888
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test4() {
        val param1 = 0
        val param2 = 0
        val expectedOutput = 0
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test5() {
        val param1 = 54321
        val param2 = 54321
        val expectedOutput = 8642
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test6() {
        val param1 = 54321
        val param2 = 56789
        val expectedOutput = 0
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test11() {
        val param1 = 55150
        val param2 = 47444
        val expectedOutput = 92594
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test12() {
        val param1 = 35405
        val param2 = 3622
        val expectedOutput = 38027
        val test = KCommonTask.additionWithoutCarrying(param1, param2)
        assertEquals(expectedOutput, test)
    }

}