import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min

object KCommonTask {

    fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
        if (a + b == c)
            return true
        if (a * b == c)
            return true
        if ((a - b) == c)
            return true
        if (a * c == b || b * c == a)
            return true
        return false
    }

    fun arithmeticExpression_top1(a: Int, b: Int, c: Int): Boolean {
        return when {
            a + b == c -> true
            a - b == c -> true
            a * b == c -> true
            a == b * c -> true
            else -> false
        }
    }

    fun tennisSet(score1: Int, score2: Int): Boolean {
        val minScore = min(score1, score2)
        val maxScore = max(score1, score2)
        return when {
            maxScore == 6 && minScore < 5 -> true
            maxScore == 7 && minScore in 5..6 -> true
            else -> false
        }
    }

    fun tennisSet_top1(score1: Int, score2: Int): Boolean {
        val (loser, winner) = listOf(score1, score2).sorted()
        return winner == 6 && loser < 5 || winner == 7 && loser in 5..6
    }

    fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean) = !(young && beautiful) == loved

    fun willYou_top(young: Boolean, beautiful: Boolean, loved: Boolean) = (young && beautiful) != loved

    fun metroCard(lastNumberOfDays: Int): MutableList<Int> {
        return when (lastNumberOfDays) {
            31 -> mutableListOf(28, 30, 31)
            else -> mutableListOf(31)
        }
    }

    fun arrayPacking_my(a: MutableList<Int>): Int {
        var str = a[a.size - 1].toString(2).padStart(8, '0')
        a.subList(0, a.size - 1).asReversed().forEach { item ->
            str += item.toString(2).padStart(8, '0')
        }
        return str.toInt(2)
    }

    fun arrayPacking(a: MutableList<Int>) = a.mapIndexed { i, n -> n shl 8 * i }.sum()

    fun arrayPacking_top2(a: MutableList<Int>): Int {
        return a.map { Integer.toBinaryString(it).padStart(8, '0') }.reversed().joinToString("").toInt(2)
    }

    fun rangeBitCount_my(a: Int, b: Int): Int {
        return (a..b).joinToString("") { Integer.toBinaryString(it) }.replace("0", "").count()
    }

    fun rangeBitCount(a: Int, b: Int) = (a..b).sumBy { Integer.bitCount(it) }

    fun mirrorBits(a: Int) = a.toString(2).reversed().toInt(2)

    /* C++
    int mirrorBits(int a) {
    int r = 0;
    for (; a; a >>= 1)
        r = r << 1 | a & 1;
    return r;
}

    * */

    fun leastFactorial(n: Int): Int {
        var r = 1
        for (it in 1..n) {
            r *= it
            if (r >= n)
                break
        }
        return r
    }

    fun leastFactorial_top1(n: Int) = (1..n).reduce { a, b -> if (a < n) a * b else return@reduce a }

    fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
        var cnt = 0
        (l..r).forEach { if ((n - it) >= it && (n - it) <= r) cnt++ }
        return cnt
    }

    fun countSumOfTwoRepresentations2_top1(n: Int, l: Int, r: Int) = (l..n / 2).filter { n - it <= r }.count()

    fun magicalWell(a: Int, b: Int, n: Int) = (n downTo 1).mapIndexed { cnt, _ -> ((a + cnt) * (b + cnt)) }.sum()

    fun magicalWell_top1(a: Int, b: Int, n: Int) = (0 until n)
            .map { (a + it) * (b + it) }
            .sum()

    fun lineUp(commands: String): Int {
        var p1 = 0
        var p2 = 0
        var count = 0
        for (c in commands) {
            when (c) {
                'A' -> {
                    p1 += 2; p2 -= 2
                }
                'R' -> {
                    p1++; p2--
                }
                'L' -> {
                    p1--; p2++
                }
            }
            if (Math.abs(p1) > 3)
                p1 = (if (p1 > 0) 1 else -1) * (if (c == 'A') p1.absoluteValue - 3 - 1 else 0)
            if (p2.absoluteValue > 3)
                p2 = (if (p2 > 0) 1 else -1) * (if (c == 'A') p2.absoluteValue - 3 - 1 else 0)
            if ((p1.absoluteValue == p2.absoluteValue && p1.absoluteValue == 2) || (p1 == p2 && p1 == 0))
                count++
        }
        return count
    }

    fun lineUp_top1(commands: String): Int {

        var currValid = true

        return commands.map {
            when (it) {
                'L' -> currValid = !currValid
                'R' -> currValid = !currValid
                'A' -> currValid
                else -> currValid
            }
            currValid
        }.count { it }
    }

    fun additionWithoutCarrying(param1: Int, param2: Int): Int {
        var p1 = param1
        var p2 = param2
        var result = ""
        while (p1 != 0 || p2 != 0) {
            result = (((p1 % 10) + (p2 % 10)) % 10).toString() + result
            p1 /= 10
            p2 /= 10
        }
        return if (result.isNullOrBlank()) 0 else result.toInt()
    }
    /*
    *
    * C++
    int additionWithoutCarrying(int a, int b) {
    int y = 0;
    int p = 1;
    for(; a || b; a /= 10, b /= 10, p *= 10)
        y += (a % 10 + b % 10) % 10 * p;
    return y;
    }
    * */
    /* C
    int appleBoxes(int k) {
        return (1-(k&1)*2)*(k+1)*k/2;
    }
    */

    fun appleBoxes_my(k: Int) = (1..k).map { if (it.and(1) == 0) it * it else -(it * it) }.sum()

    fun appleBoxes(k: Int) = (1 - (k.and(1)) * 2) * (k + 1) * k / 2

    fun appleBoxes_top1(k: Int) = Math.pow(-1.0, k.toDouble()).toInt() * (k + 1) * k / 2

    fun increaseNumberRoundness(n: Int) = "$n".split("0").filter { it.isNotBlank() }.count() > 1

    fun increaseNumberRoundness_top(n: Int) = "$n".trimEnd('0').contains('0')

    /* C++
    bool increaseNumberRoundness(int n) {
    while (n%10==0)
        n/=10;
    while (n%10)
        n/=10;
    return n;
    }
    * */

    fun rounders_(n: Int): Int {
        var vn = n
        var result = 1
        var correction = 0
        while (vn != 0) {
            correction = if (vn < 10) correction else if (((vn % 10) + correction) < 5) 0 else 1
            result = if (vn < 10) result * ((vn % 10) + correction) else result * 10
            vn /= 10
        }
        return result
    }


    fun rounders(n: Int): Int {
        var vn = n
        var result = 1
        var correction = 0
        while (vn >= 10) {
            correction = if ((vn % 10 + correction) < 5) 0 else 1
            result *= 10
            vn /= 10
        }
        return result * (vn % 10 + correction)
    }
    /* C++
    int rounders(int v) {
        int y = 1;
        for (; v > 10; y *= 10)
        v = (v + 5) / 10;
        return v * y;
    }
     */

    /**
     * 5
     * 5/2 = 2 and 5%2 = 1
     * 3/2 = 1 and 3%2 = 1
     * 2/2 = 1 and 2%2 = 0
     * 1 < 2 then return
     * */
    fun candles(candlesNumber: Int, makeNew: Int): Int {
        var leftOver = candlesNumber
        var additionalCandles = 0
        while (leftOver >= makeNew) {
            additionalCandles += (leftOver / makeNew)
            leftOver = (leftOver / makeNew) + (leftOver % makeNew)
        }
        return candlesNumber + additionalCandles
    }
    /*C++
    int candles(int c, int n) {
    return c >= n ? n + candles(c - n + 1, n) : c;
    }
    * */

    fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
        return inputArray.map { if (it == elemToReplace) substitutionElem else it }.toMutableList()
    }

    fun firstReverseTry(arr: MutableList<Int>) =
            arr.apply {
                if (isNotEmpty())
                    set(0, last().also {
                        set(lastIndex, first())
                    })
            }

    fun concatenateArrays(a: MutableList<Int>, b: MutableList<Int>) = a + b

    fun removeArrayPart(inputArray: MutableList<Int>, l: Int, r: Int): MutableList<Int> {
        return inputArray.filterIndexed { index, _ -> !(index in l..r) }.toMutableList()
    }

    fun makeArrayConsecutive2(statues: MutableList<Int>) =
            statues.max()!! - statues.min()!! - statues.lastIndex

    fun weakNumbers(n: Int): MutableList<Int> {
        fun weakness(x: Int): Int {
            fun divCount(y: Int): Int = (y - 1 downTo 1).count { y % it == 0 }
            val d = divCount(x)
            return (x - 1 downTo 1).count { d < divCount(it) }
        }

        val arr = (1..n).map { i -> weakness(i) }
        return mutableListOf(arr.max()!!, arr.count { it == arr.max() })
    }

    fun rectangleRotation(a: Int, b: Int): Int {
        val m = Math.ceil(a / Math.sqrt(2.0))
        val n = Math.ceil(b / Math.sqrt(2.0))
        var r = m * n + (m - 1) * (n - 1)
        r = if (r % 2 != 0.0) {
            r
        } else {
            r - 1
        }
        return r.toInt()
    }

}


