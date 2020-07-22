import org.junit.Assert
import org.junit.Test

class TestArrayPacking {
    @Test
    fun test1() {
        val arr = mutableListOf(24, 85, 0)
        val expectedOutput = 21784
        val test = KCommonTask.arrayPacking(arr)
        Assert.assertEquals(expectedOutput, test)
    }
}