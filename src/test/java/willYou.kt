import org.junit.Assert
import org.junit.Test

class willYou {
    @Test
    fun test1() {
        val young = true
        val beautiful = true
        val loved = true
        Assert.assertFalse(KCommonTask.willYou(young, beautiful, loved))
    }

    @Test
    fun test2() {
        val young = true
        val beautiful = false
        val loved = true
        Assert.assertTrue(KCommonTask.willYou(young, beautiful, loved))
    }

    @Test
    fun test3() {
        val young = false
        val beautiful = false
        val loved = false
        Assert.assertFalse(KCommonTask.willYou(young, beautiful, loved))
    }

    @Test
    fun test4() {
        val young = false
        val beautiful = false
        val loved = true
        Assert.assertTrue(KCommonTask.willYou(young, beautiful, loved))
    }

    @Test
    fun test_1() {
        val young = false
        val beautiful = true
        val loved = true
        Assert.assertTrue(KCommonTask.willYou(young, beautiful, loved))
    }

    @Test
    fun test_2() {
        val young = true
        val beautiful = true
        val loved = false
        Assert.assertTrue(KCommonTask.willYou(young, beautiful, loved))
    }

}