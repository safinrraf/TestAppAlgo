import org.junit.Assert
import org.junit.Test

class TestTennisSet {
    @Test
    fun test1() {
        val score1 = 3
        val score2 = 6
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertTrue(test)
    }

    @Test
    fun test2() {
        val score1 = 8
        val score2 = 5
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertFalse(test)
    }

    @Test
    fun test3() {
        val score1 = 6
        val score2 = 5
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertFalse(test)
    }

    @Test
    fun test4() {
        val score1 = 7
        val score2 = 7
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertFalse(test)
    }

    @Test
    fun test5() {
        val score1 = 6
        val score2 = 4
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertTrue(test)
    }

    @Test
    fun test6() {
        val score1 = 7
        val score2 = 5
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertTrue(test)
    }

    @Test
    fun test7() {
        val score1 = 7
        val score2 = 2
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertFalse(test)
    }

    @Test
    fun test9() {
        val score1 = 4
        val score2 = 10
        val test = KCommonTask.tennisSet(score1, score2)
        Assert.assertFalse(test)
    }
}