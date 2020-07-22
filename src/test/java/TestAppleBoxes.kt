import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class TestAppleBoxes {
    @Test
    fun test1() {
        val k=5
        val expectedOutput = -15
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test2() {
        val k=15
        val expectedOutput = -120
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test3() {
        val k=36
        val expectedOutput = 666
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test4() {
        val k=1
        val expectedOutput = -1
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test5() {
        val k=14
        val expectedOutput = 105
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test6() {
        val k=12
        val expectedOutput = 78
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test7() {
        val k=9
        val expectedOutput = -45
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test8() {
        val k=40
        val expectedOutput = 820
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

    @Test
    fun test9() {
        val k=37
        val expectedOutput = -703
        val test = KCommonTask.appleBoxes(k)
        assertEquals(expectedOutput,test)
    }

}