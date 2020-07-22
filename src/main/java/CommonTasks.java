import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class CommonTasks {
    static int largestNumber(int n) {
        int sum = 0;
        int bound = n + 1;
        for (int num = 1; num < bound; num++) {
            sum = 9 * (num == 1 ? 1 : 10 ^ (num - 1));
        }
        return sum;
    }

    static boolean variableName(String name) {
        return Pattern.matches("^[a-zA-Z_]{1}[a-zA-Z_0-9]*", name);
    }

    static String alphabeticShift(String inputString) {
        String result = "";
        for (int i = 0; i < inputString.length(); i++)
            result += (char) ((inputString.charAt(i) + 1) > 122 ? 97 : inputString.charAt(i) + 1);
        return result;
    }

    static boolean chessBoardCellColor(String cell1, String cell2) {
        boolean result = true;
        final int toPos = Math.abs(cell1.charAt(0) - cell2.charAt(0)) + Math.abs(cell1.charAt(1) - cell2.charAt(1));
        for (int i = 0; i < toPos; i++)
            result = !result;
        return result;
    }

    static int circleOfNumbers_my(int n, int firstNumber) {
        return (n / 2) > firstNumber ? firstNumber + (n / 2) : firstNumber - (n / 2);
    }

    /*Top from CodeSignal*/
    static int circleOfNumbers(int n, int firstNumber) {

        return ((firstNumber + n / 2) % n);

    }

    static int depositProfit(int deposit, int rate, int threshold) {
        int year = 0;
        float fdeposit = deposit;
        while (fdeposit < threshold) {
            fdeposit += (fdeposit * (rate / 100f));
            year++;
        }
        return year;
    }

    static int absoluteValuesSumMinimization_my(int[] a) {
        int result = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int tmp = 0;
            for (int j = 0; j < a.length; j++)
                tmp += Math.abs(a[j] - a[i]);
            if (tmp < minSum) {
                minSum = tmp;
                result = a[i];
            } else if (tmp == minSum && a[i] < result) {
                result = a[i];
            }
        }
        return result;
    }

    static int absoluteValuesSumMinimization(int[] a) {
        return a[(a.length - 1) / 2];
    }

    static boolean stringsRearrangement_draft(String[] inputArray) {
        int totalDifferences = 0;
        long uniqueCharsCnt = 0;
//        Arrays.sort(inputArray);
        final int totalCharsCnt = inputArray.length * inputArray[0].length();
        final StringBuilder str = new StringBuilder(inputArray.length * inputArray[0].length())
                .append(inputArray[inputArray.length - 1]);
        final int len = inputArray[0].length();
        for (int j = 0; j < inputArray.length - 1; j++) {
            for (int i = 0; i < len; i++)
                if (inputArray[j].charAt(i) != inputArray[j + 1].charAt(i))
                    totalDifferences++;
            str.append(inputArray[j]);
        }
        uniqueCharsCnt = str.toString().chars().distinct().count();
        System.out.println(String.format("uniqueCharsCnt=%d totalCharsCnt=%d totalDifferences=%d wordLen=%d",
                uniqueCharsCnt, totalCharsCnt, totalDifferences, inputArray[0].length())
        );
//        if ((totalDifferences >= inputArray.length) || (totalDifferences < (inputArray.length - 1))) {
//            return false;
//        } else {
//            return true;
//        }
        return totalDifferences > inputArray.length ? false :
                totalDifferences == inputArray.length && totalDifferences != len ? true :
                        totalDifferences == inputArray.length - 1 ? true : false;
    }

    static Map<Integer, String> getNextNeighborhoodForStr(final String str, final String[] deckArr) {
        final Map<Integer, String> neighborhood = new HashMap<>();
        final int len = deckArr[0].length();
        for (int j = 0; j < deckArr.length; ++j) {
            int diff = 0;
            for (int i = 0; i < len; ++i)
                if (str.charAt(i) != deckArr[j].charAt(i))
                    diff++;
            if (diff == 1) {
                neighborhood.put(j, deckArr[j]);
                break;
            }
        }
        return neighborhood;
    }

    static String[] removeItemByIndexFromStringArr(final String[] deckArr, final int index) {
        final String[] resultArr = new String[deckArr.length - 1];
        if (deckArr.length == 1)
            return resultArr;

        System.arraycopy(deckArr, index == 0 ? 1 : 0, resultArr, 0, index == 0 ? deckArr.length - 1 : index);
        if (index > 0)
            System.arraycopy(deckArr, index + 1, resultArr, index, deckArr.length - 1 - index);
        return resultArr;
    }

    static boolean stringsRearrangement(String[] inputArray) {
        Arrays.sort(inputArray);
        final List<String> neighborhoodIndexArr = new ArrayList<>(inputArray.length);
        boolean reverseSearch = false;
        String[] deckArr = removeItemByIndexFromStringArr(inputArray, 0);
        neighborhoodIndexArr.add(inputArray[0]);
        String tmp = inputArray[0];
        while (deckArr.length > 0) {
            final Map<Integer, String> nextNeighborhoodMap = getNextNeighborhoodForStr(tmp, deckArr);
            if (nextNeighborhoodMap.size() > 0) {
                tmp = nextNeighborhoodMap.entrySet().iterator().next().getValue();
                deckArr = removeItemByIndexFromStringArr(deckArr, nextNeighborhoodMap.entrySet().iterator().next().getKey());
                neighborhoodIndexArr.add(tmp);
            } else {
                if (!reverseSearch) {
                    tmp = neighborhoodIndexArr.get(0);
                    reverseSearch = true;
                } else {
                    break;
                }
            }
        }
        return neighborhoodIndexArr.size() == inputArray.length;
    }

    static int candies(int n, int m) {
        return (m / n) * n;
    }

    static int[] extractEachKth(int[] inputArray, int k) {
        return IntStream.range(0, inputArray.length)
                .filter(i -> ((i + 1) % k) != 0)
                .map(i -> inputArray[i])
                .toArray();
    }

    static char firstDigit(String inputString) {
        return inputString.replaceAll("[^0-9]", "").charAt(0);
    }

    static int differentSymbolsNaive_my(String s) {
        final HashSet<Character> set = new HashSet<>(26);
        IntStream.range(0, s.length()).forEach(i -> set.add(s.charAt(i)));
        return set.size();
    }

    static int differentSymbolsNaive(String s) {
        return (int) s.chars().distinct().count();
    }

    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int result = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (i + k > inputArray.length)
                break;
            int tmp = IntStream.of(Arrays.copyOfRange(inputArray, i, i + k)).sum();
            if (tmp > result)
                result = tmp;
        }
        return result;
    }

    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        // The height after x days (up - down) * (x - 1) + up
        // We want dh <= (u - d) * (x - 1) + u
        // (dh - u) / (u - d) + 1 <= x
        return Math.max(0, (int) Math.ceil((double) (desiredHeight - upSpeed) / (upSpeed - downSpeed))) + 1;
    }

    static int growingPlant_my(int upSpeed, int downSpeed, int desiredHeight) {
        int cnt = 0;
        int currentHeight = 0;
        while (true) {
            currentHeight += upSpeed;
            cnt++;
            if (currentHeight >= desiredHeight)
                break;
            currentHeight -= downSpeed;
        }
        return cnt;
    }

    static int lateRide(int n) {
        int hours = n / 60;
        int minutes = n % 60;
        return hours / 10 + hours % 10 + minutes / 10 + minutes % 10;
    }

    static int lateRide_my(int n) {
        int time = (n / 60) * 100 + (n - ((n / 60) * 60));
        int sum = 0;
        do {
            sum += time % 10;
        } while ((time /= 10) != 0);
        return sum;
    }

    /*Top from COdeSignal*/
    static int phoneCall(int min1, int min2_10, int min11, int s) {
        int t1 = min1 + min2_10 * 9;
        if (s >= t1) {
            return 10 + (s - t1) / min11;
        }
        if (s >= min1) {
            return (s - min1) / min2_10 + 1;
        }
        return 0;
    }

    static int phoneCall_my(int min1, int min2_10, int min11, int s) {
        int minute = 0;
        minute = (s -= min1) >= 0 ? 1 : 0;
        minute += Math.min(s / min2_10, 9);
        minute += (s / min2_10) < 9 ? 0 : (s - (Math.min(s / min2_10, 9) * min2_10)) / min11;
        return minute;
    }

    static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int packValue;
        packValue = (value1 > value2) ? (Math.max(maxW - weight1, -1)) >= 0 ? value1 : 0
                : (Math.max(maxW - weight2, -1)) >= 0 ? value2 : 0;
        maxW -= (packValue > 0) ? ((value1 > value2) ? weight1 : weight2) : 0;
        packValue += (value1 > value2) ? (Math.max(maxW - weight2, -1)) >= 0 ? value2 : 0
                : (Math.max(maxW - weight1, -1)) >= 0 ? value1 : 0;
        return packValue;
    }

    static int knapsackLight_top(int value1, int weight1, int value2, int weight2, int maxW) {
        int val = 0;
        if (weight1 + weight2 <= maxW) return value1 + value2;
        if (weight1 <= maxW) val = value1;
        if (weight2 <= maxW && value2 > val) val = value2;
        return val;

    }

    static String longestDigitsPrefix_my(String inputString) {
        final String[] arr = inputString.split("[^\\d+]");
        return arr.length > 0 ? arr[0] : "";
    }

    static String longestDigitsPrefix(String inputString) {
        return inputString.replaceAll("^(\\d*).*", "$1");
    }

    static int digitDegree(int n) {
        int degree = 0;
        int tmp = n;
        int sum = 0;
        if (((int) Math.log10(n) + 1) == 1)
            return 0;
        while (true) {
            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            degree++;
            if (((int) Math.log10(sum) + 1) == 1)
                break;
            tmp = sum;
            sum = 0;
        }
        return degree;
    }

    static boolean bishopAndPawn(String bishop, String pawn) {
        return Math.abs(bishop.charAt(0) - pawn.charAt(0)) == Math.abs(bishop.charAt(1) - pawn.charAt(1));
    }

    /*Top from CodeSignal*/
    static boolean isBeautifulString_top1(String s) {
        int[] c = new int[26];

        for (int i : s.getBytes()) c[i - 'a']++;

        for (int i = 1; i < 26; i++)
            if (c[i] > c[i - 1]) return false;

        return true;
    }

    /*Top 2 from CodeSignal*/
    static boolean isBeautifulString(String s) {
        List<Integer> l = Arrays.stream("zyxwvutsrqponmlkjihgfedcba".split("")).mapToInt(i ->
                s.length() - s.replace(i, "").length()).boxed().collect(Collectors.toList());
        List<Integer> a = l.stream().collect(Collectors.toList());
        Collections.sort(l);
        return l.equals(a);
    }

    static boolean isBeautifulString_my(String inputString) {
        final NavigableMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < inputString.length(); ++i)
            if (map.containsKey(inputString.charAt(i)))
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            else
                map.put(inputString.charAt(i), 1);
        return IntStream.rangeClosed('a', map.lastKey() - 1)
                .filter(c -> !map.containsKey((char) c) || !map.containsKey((char) (c + 1)) || map.get((char) c) < map.get((char) (c + 1)))
                .count() == 0;
    }

    static String findEmailDomain(String address) {
        final String[] addr = address.split("@");
        return addr[addr.length - 1];
    }

    static boolean checkPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    static String buildPalindrome(String st) {
        final StringBuilder stringBuilder = new StringBuilder();
        final String reverse = stringBuilder.append(st).reverse().toString();
        String s = st;
        for (int i = 0; i < st.length(); i++) {
            stringBuilder.setLength(0);
            if (stringBuilder.append(s).reverse().toString().equals(s))
                break;
            s = st + reverse.substring(st.length() - 1 - i);
        }
        return s;
    }

    static int electionsWinners(int[] votes, int k) {
        int result = 0;
        for (int i = 0; i < votes.length; ++i) {
            boolean lessThan = false;
            for (int j = 0; j < votes.length; ++j) {
                if ((i != j) && (votes[i] + k) <= votes[j]) {
                    lessThan = true;
                    break;
                }
            }
            if (!lessThan)
                result++;
        }
        return result;
    }

    static boolean isMAC48Address(String inputString) {
        return inputString.matches("([0-9A-F]{2}-){5}[0-9A-F]{2}");
    }

    static boolean isDigit(char symbol) {
        return symbol >= 48 && symbol <= 57;
    }

    static String lineEncoding(String s) {
        char c = s.charAt(0);
        String tmp = String.valueOf(c);
        String result = "";
        for (int i = 1; i < s.length(); ++i) {
            if (c == s.charAt(i)) {
                tmp += s.charAt(i);
            } else {
                result += (tmp.length() < 2 ? "" : tmp.length()) + String.valueOf(c);
                c = s.charAt(i);
                tmp = String.valueOf(c);
            }
        }
        result += (tmp.length() < 2 ? "" : tmp.length()) + String.valueOf(c);
        return result;
    }

    /*top1*/
    static String lineEncoding_top_1(String s) {
        Matcher m = Pattern.compile("([a-z])\\1*").matcher(s);
        String result = "";
        while (m.find()) {
            int len = m.group(0).length();
            char cha = m.group(0).charAt(0);
            result += (len == 1 ? "" : len) + "" + cha;
        }
        return result;
    }

    /*top 2*/
    static String lineEncoding_top_2(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        s += ' ';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) count++;
            else {
                if (count > 1) {
                    result.append(count);
                }
                result.append(s.charAt(i - 1));
                count = 1;
            }
        }
        return result.toString();
    }

    static int chessKnight(String cell) {
        final boolean atVertBorder = cell.charAt(0) == 'a' || cell.charAt(0) == 'h';
        final boolean atHorizBorder = cell.charAt(1) == '1' || cell.charAt(1) == '8';
        final boolean atNearVertBorder = cell.charAt(0) == 'b' || cell.charAt(0) == 'g';
        final boolean atNearHorizBorder = cell.charAt(1) == '2' || cell.charAt(1) == '7';
        final boolean atBestVertLine = cell.charAt(0) >= 'c' && cell.charAt(0) <= 'f';
        final boolean atBestHorizLine = cell.charAt(1) >= '3' && cell.charAt(1) <= '6';
        if (atVertBorder && atHorizBorder) {
            return 2;
        } else if (atNearVertBorder && atHorizBorder) {
            return 3;
        } else if (atBestVertLine && atBestHorizLine) {
            return 8;
        } else if ((atNearVertBorder && atBestHorizLine) || (atNearHorizBorder && atBestVertLine)) {
            return 6;
        }
        return 4;
    }

    static int chessKnight_top1(String cell) {
        int moves = 8;
        if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
            moves -= 2;
        }
        if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
            moves -= 2;
        }
        if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
            moves /= 2;
        }
        if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
            moves /= 2;
        }
        return moves;
    }

    static int[] intToArray(final int n) {
        final int[] arr = new int[(int) Math.log10(n) + 1];
        int tmp = n, i = 0;
        while (tmp != 0) {
            arr[arr.length - 1 - i++] += tmp % 10;
            tmp /= 10;
        }
        return arr;
    }

    static int deleteDigit_my(int n) {
        final int[] intArr = intToArray(n);
        int pos = 1, skipIndex = 0, tmp = 0, max = 0;
        while (skipIndex < intArr.length) {
            for (int i = 0; i < intArr.length; ++i)
                if (i != skipIndex) {
                    tmp *= (pos++ == 1 ? 0 : 10);
                    tmp += intArr[i];
                }
            if (tmp > max)
                max = tmp;
            skipIndex++;
            pos = 1;
            tmp = 0;
        }
        return max;
    }

    static int deleteDigit(int n) {
        int max = 0;
        for (int t = 1; t < n; t *= 10)
            max = Math.max(n / 10 / t * t + n % t, max);
        return max;
    }

    static String longestWord_my(String text) {
        final String[] arr = text.split("[^a-zA-Z]");
        String maxStr = "";
        for (String str : arr)
            if (str.trim().length() > maxStr.length())
                maxStr = str.trim();
        return maxStr;
    }

    /*top from CodeSignal*/
    static String longestWord(String text) {
        return Arrays.stream(text.split("\\W+")).max(Comparator.comparingInt(String::length)).get();
    }

    static boolean validTime(String time) {
        final String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) <= 24 && Integer.parseInt(arr[1]) <= 60;
    }

    static int sumUpNumbers(String inputString) {
        return Arrays.stream(inputString.split("[^0-9]"))
                .filter(m -> m.length() > 0)
                .mapToInt(m -> Integer.parseInt(m))
                .sum();
    }

    static int sumUpNumbers_top1_from_CodeSignal(String inputString) {
        return Arrays.stream(inputString.split("\\D+")).
                filter(s -> !s.isEmpty()).
                mapToInt(Integer::new).sum();
    }

    static int differentSquares(int[][] matrix) {
        final Set<Integer> uniqueSquares = new HashSet<>();
        for (int i = 0; i < matrix.length - 1; i++) {
            Integer hash;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                hash = matrix[i][j]
                        + (10 * matrix[i][j + 1])
                        + (100 * matrix[i + 1][j])
                        + (1000 * matrix[i + 1][j + 1]);
                uniqueSquares.add(hash);
            }
        }
        return uniqueSquares.size();
    }

    static int arrToInt(final Integer[] arr) {
        int result = 0, pos = 0;
        for (int i = 0; i < arr.length; i++) {
            result *= (pos++ == 0 ? 1 : 10);
            result += arr[i];
        }
        return result;
    }

    static int digitsProduct_top_from_CodeSignal(int product) {
        if (product == 0)
            return 10;
        if (product < 10)
            return product;

        String r = "";
        for (int d = 9; d > 1; d--)
            for (; product % d == 0; product /= d)
                r = d + r;
        return product == 1 ? new Integer(r) : -1;
    }

    static int digitsProduct(int product) {
        if (product == 0)
            return 10;
        if (product == 1)
            return 1;

        final List<Integer> arr_other = new ArrayList<>();

        int tmp = product;
        while (tmp != 1) {
            for (int i = 9; i > 0; i--) {
                if ((tmp % i) == 0) {
                    tmp /= i;
                    if (i == 1) {
                        return -1;
                    } else
                        arr_other.add(i);
                    break;
                }
            }
        }
        final Integer[] result = new Integer[arr_other.size()];
        arr_other.toArray(result);
        Arrays.sort(result);

        return arrToInt(result);
    }

    static String[] fileNaming(String[] names) {
        final String[] result = new String[names.length];
        int pos = 0;
        for (String name : names)
            if (Arrays.asList(result).contains(name)) {
                int occurenceCount = 0;
                while (true)
                    if (!Arrays.asList(result).contains(name + "(" + ++occurenceCount + ")")) {
                        result[pos++] = name + "(" + occurenceCount + ")";
                        break;
                    }
            } else
                result[pos++] = name;
        return result;
    }


    static String messageFromBinaryCode(String code) {
        final StringBuilder stb = new StringBuilder();
        for (int i = 0; i < code.length(); i += 8) {
            byte t = Byte.valueOf(code.substring(i, i + 8), 2);
            stb.append((char) t);
        }
        return stb.toString();
    }

    static String messageFromBinaryCode_top_from_CodeSignal(String code) {
        return new String(new BigInteger(code, 2).toByteArray());
    }

    static int[][] spiralNumbers(int n) {
        final int[][] result = new int[n][n];
        final int numberOfSquares = (n / 2) + (n % 2 != 0 ? 1 : 0);
        int value = 1;
        for (int i = 0; i < numberOfSquares; i++) {
            final int idx = n - (2 * i);
            final int perimeterLength = Math.max((4 * idx - 4), 1);
            int row = 1;
            int col = 0;
            for (int j = 1; j <= perimeterLength; j++) {
                final boolean TOP = (j <= idx);
                final boolean BOTTOM = j > (2 * idx - 1) && j < (3 * idx - 2);
                final boolean RIGHT_SIDE = (j > idx && j <= (2 * idx - 1));
                final int k = (TOP ? 0 :
                        RIGHT_SIDE ? row++ :
                                BOTTOM ? idx - 1 :
                                        --row) + i;
                final int l = (TOP ? col++ :
                        RIGHT_SIDE ? idx - 1 :
                                BOTTOM ? --col - 1 :
                                        0) + i;
                result[k][l] = value++;
            }
        }
        return result;
    }

    static int[][] spiralNumbers_top_from_Codesignal(int n) {
        int[][] array = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int down = n - 1;

        for (int counter = 1; counter <= n * n; ) {
            for (int x = left; x <= right; x++)
                array[top][x] = counter++;
            top++;

            for (int y = top; y <= down; y++)
                array[y][right] = counter++;
            right--;

            for (int x = right; x >= left; x--)
                array[down][x] = counter++;
            down--;

            for (int y = down; y >= top; y--)
                array[y][left] = counter++;
            left++;
        }

        return array;
    }

    static boolean sudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            int square = 0;
            int squareNumMask = 511;
            int row = 0;
            int rowNumMask = 511;
            int column = 0;
            int columnNumMask = 511;
            for (int j = 0; j < 9; j++) {
                row += grid[i][j];
                rowNumMask ^= (1 << grid[i][j] - 1);
                column += grid[j][i];
                columnNumMask ^= (1 << (grid[j][i] - 1));
                square += grid[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3];
                squareNumMask ^= (1 << (grid[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - 1));
            }
            if (square != 45 || row != 45 || column != 45
                    || rowNumMask != 0
                    || squareNumMask != 0
                    || columnNumMask != 0)
                return false;
        }
        return true;
    }

    static int extraNumber(int a, int b, int c) {
        return (a == b) ? c :
                (b == c) ? a : b;
    }

    static int extraNumber_top_from_Codesignal(int a, int b, int c) {
        return a ^ b ^ c;
    }

    static boolean isInfiniteProcess(int a, int b) {
        return a > b || (b - a) % 2 != 0;
    }

    int killKthBit(int n, int k) {
        return n &= ~(1 << (k - 1));
    }

    static int secondRightmostZeroBit_top1(int n) {
        return ~(n |= -~n) & -~n;
    }

    static int secondRightmostZeroBit(int n) {
        return (~n & (~n - 1)) & -(~n & (~n - 1));
    }

    static int swapAdjacentBits(int n) {
        return ((n & 0xAAAAAAAA) >> 1) | ((n & 0x55555555) << 1);
    }

    static int differentRightmostBit(int n, int m) {
        return (n ^ m) & -(n ^ m);
    }

    static int equalPairOfBits(int n, int m) {
        return ~(n ^ m) & -~(n ^ m);
    }

    static int leastFactorial_top1(int n) {
        int k = 1, c = 1;
        while (k < n) k *= c++;
        return k;
    }

    int magicalWell_top1(int a, int b, int n) {
        return n * a * b + (a + b) * n * (n - 1) / 2 + n * (n - 1) * (2 * n - 1) / 6;
    }

    int additionWithoutCarrying(int param1, int param2) {
        if (param1 == 0 || param2 == 0) {
            return param1 + param2;
        }
        return additionWithoutCarrying(param1 / 10, param2 / 10) * 10 + (param1 + param2) % 10;
    }

    int appleBoxes(int k) {
        return ((int) pow(-1, k)) * k * (k + 1) / 2;
    }

    int rounders(int value) {
        return value < 10 ? value : value % 10 >= 5 ? rounders(value / 10 + 1) * 10 : rounders(value / 10) * 10;
    }

    int candles(int candlesNumber, int makeNew) {
        return candlesNumber + (candlesNumber - 1) / (makeNew - 1);
    }

    int countBlackCells(int n, int m) {
        int max = 1;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0 && m % k == 0)
                max = k;
        }
        return n + m + max - 2;
    }
    /*C++
int countBlackCells(int n, int m) {
    return n + m + std::__gcd(n, m) - 2;
}

int countBlackCells_my(int n, int m) {
    int gcd = std::__gcd(m, n);
    int mx = std::max(n,m);

    return (m + n - 1) + ((gcd <= 1) ? 0 : ((mx / (mx / gcd)) - 1));
}
    * */

    int[] createArray(int size) {
        return IntStream.range(0, size).map(i -> 1).toArray();
    }

    List arrayReplace(List<Integer> i, Integer e, Integer s) {
        Collections.replaceAll(i, e, s);
        return i;
    }

    int[] firstReverseTry(int[] a) {
        int n = a.length - 1;
        if (n > 0)
            a[0] = a[0] ^ a[n] ^ (a[n] = a[0]);
        return a;
    }

    int[] concatenateArrays(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
    }

    int[] removeArrayPart(int[] inputArray, int l, int r) {
        return IntStream.range(0, inputArray.length)
                .filter(i -> i < l || i > r)
                .map(i -> inputArray[i])
                .toArray();
    }

    int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        return statues[statues.length - 1] - statues[0] - statues.length + 1;
    }

    boolean isPower(int n) {
        return IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> pow(i, j) == n).anyMatch(k -> k == true)).anyMatch(i -> i == true);
    }

    int isSumOfConsecutive2(int n) {
        int count = 0, i, m;

        for (i = 1, m = i; m < n; i++, m += i) {
            if ((n - m) % (i + 1) == 0) {
                count++;
            }
        }
        return count;
    }

    static int squareDigitsSequence_1(int a0) {
        int sum = 0;
        int result = 1;
        int tmp = a0;
        final Set<Integer> set = new HashSet<>();
        set.add(a0);
        while (set.add(sum)) {
            sum = 0;
            for (; tmp != 0; tmp /= 10)
                sum += pow(tmp % 10, 2);
            tmp = sum;
            result++;
        }
        return result;
    }

    static int squareDigitsSequence(int a0) {
        int sum;
        int tmp = a0;
        final Set<Integer> set = new HashSet<>();
        set.add(a0);
        do {
            sum = 0;
            for (; tmp != 0; tmp /= 10)
                sum += pow(tmp % 10, 2);
            tmp = sum;
        } while (set.add(sum));
        return set.size() + 1;
    }

    static int pagesNumberingWithInk(int current, int numberOfDigits) {
        int nextNumber = current;
        do {
            numberOfDigits -= ((int) Math.log10(nextNumber) + 1);

            nextNumber++;
        } while (((int) Math.log10(nextNumber) + 1) <= numberOfDigits);
        return nextNumber - 1;
    }

    static int getSumOfDigits(final int x) {
        int sumOfDigitis = 0;
        int tmp = x;
        for (; tmp != 0; tmp /= 10)
            sumOfDigitis += (tmp % 10);
        return sumOfDigitis;
    }

    static int comfortableNumbers(int l, int r) {
        int pairs = 0;
        int sumOfDigitis;
        int sumOfDigitis2;
        int rangeTo;
        for (int i = l; i < r; i++) {
            sumOfDigitis = getSumOfDigits(i);
            rangeTo = Math.min(i + sumOfDigitis, r);
            for (int j = (i + 1); j <= rangeTo; j++) {
                sumOfDigitis2 = getSumOfDigits(j);
                pairs += (i >= (j - sumOfDigitis2) && i <= (j + sumOfDigitis2)) ? 1 : 0;
            }
        }
        return pairs;
    }

    static int countDivisors(int n) {
        int cnt = 0;
        for (int i = 1; i <= sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    cnt++;
                else
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }

    static int rectangleRotation_my(int a, int b) {
        int OyCrossPoint = (int) sqrt((pow(b / 2, 2)) * 2);

        int topPoint = (int) ((sqrt((pow(a / 2, 2)) * 2) - sqrt((pow(b / 2, 2)) * 2)) / 2 + sqrt((pow(b / 2, 2)) * 2));

        int topDownPoint = (int) ((sqrt((pow(a / 2, 2)) * 2) + sqrt((pow(b / 2, 2)) * 2)) / 2 - sqrt((pow(b / 2, 2)) * 2));

        return (int) (((((OyCrossPoint * 2 + 1) * topDownPoint) + (pow(topPoint - topDownPoint, 2))) * 2) + (OyCrossPoint * 2 + 1));
    }

    static int rectangleRotation(int a, int b) {
        int m, n, result;
        m = (int) (a / sqrt(2));
        n = (int) (b / sqrt(2));
        result = m * n + (m + 1) * (n + 1);
        return (result & 1) != 0 ? result : (result - 1);
    }

}
