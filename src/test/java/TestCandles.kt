import org.junit.Assert
import org.junit.Test

class TestCandles {

    @Test
    fun test1() {
        val candlesNumber = 5
        val makeNew = 2
        val expectedOutput = 9
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test2() {
        val candlesNumber = 1
        val makeNew = 2
        val expectedOutput = 1
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test3() {
        val candlesNumber = 3
        val makeNew = 3
        val expectedOutput = 4
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test4() {
        val candlesNumber = 11
        val makeNew = 3
        val expectedOutput = 16
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test5() {
        val candlesNumber = 15
        val makeNew = 5
        val expectedOutput = 18
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test6() {
        val candlesNumber = 14
        val makeNew = 3
        val expectedOutput = 20
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test7() {
        val candlesNumber = 12
        val makeNew = 2
        val expectedOutput = 23
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test8() {
        val candlesNumber = 6
        val makeNew = 4
        val expectedOutput = 7
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

    @Test
    fun test9() {
        val candlesNumber = 13
        val makeNew = 5
        val expectedOutput = 16
        val test = KCommonTask.candles(candlesNumber, makeNew)
        Assert.assertEquals(expectedOutput, test)
    }

}