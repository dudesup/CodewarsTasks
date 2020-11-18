import java.util.Arrays;

class GapInPrimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(2, 3, 40)));
    }

    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if(n-i+1<g) return null;
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j <= i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}