import org.junit.Assert
import org.junit.Test

class TestRangeBitCount {
    @Test
    fun test1() {
        val a = 2
        val b = 7
        val excpectedOutput = 11
        val test = KCommonTask.rangeBitCount(a, b)
        Assert.assertEquals(excpectedOutput, test)
    }
}