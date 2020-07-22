import org.junit.Assert
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TestIncreaseNumberRoundness {
    @Test
    fun test1() {
        val n = 902200100
        assertTrue(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test2() {
        val n = 11000
        assertFalse(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test3() {
        val n = 99080
        assertTrue(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test4() {
        val n = 1022220
        assertTrue(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test5() {
        val n = 106611
        assertTrue(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test6() {
        val n = 234230
        assertFalse(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test7() {
        val n = 888
        assertFalse(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test8() {
        val n = 100
        assertFalse(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test9() {
        val n = 1000000000
        assertFalse(KCommonTask.increaseNumberRoundness(n))
    }

    @Test
    fun test10() {
        val n = 103456789
        assertTrue(KCommonTask.increaseNumberRoundness(n))
    }

}