import org.junit.Assert.assertEquals
import org.junit.Test

class TestCountSumOfTwoRepresentations2 {
    @Test
    fun test1() {
        val n = 6
        val l = 2
        val r = 4
        val expectedOutput = 2
        val test = KCommonTask.countSumOfTwoRepresentations2(n, l, r)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test4() {
        val n = 24
        val l = 8
        val r = 16
        val expectedOutput = 5
        val test = KCommonTask.countSumOfTwoRepresentations2(n, l, r)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test5() {
        val n = 24
        val l = 12
        val r = 12
        val expectedOutput = 1
        val test = KCommonTask.countSumOfTwoRepresentations2(n, l, r)
        assertEquals(expectedOutput, test)
    }

    @Test
    fun test6() {
        val n = 93
        val l = 24
        val r = 58
        val expectedOutput = 12
        val test = KCommonTask.countSumOfTwoRepresentations2(n, l, r)
        assertEquals(expectedOutput, test)
    }

}