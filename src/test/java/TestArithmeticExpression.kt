import org.junit.Assert
import org.junit.Test

class TestArithmeticExpression {
    @Test
    fun test1() {
        val a = 1
        val b = 2
        val c = 1
        val test = KCommonTask.arithmeticExpression(a, b, c)
        Assert.assertFalse(test)
    }
}