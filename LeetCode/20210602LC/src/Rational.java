public class Rational {
    private long numerator; // 分子
    private long denominator; // 分母
    private long integer; // 整数
    private boolean negative = false; // 负数
    private boolean isZero = false; // 分母为 0
    private long totalNumerator; // 参与运算的分子, 整数 + 分数

    public static long parseNumerator(String s){
        // 提取分子
        return Long.parseLong(s.substring(0,s.indexOf('/')));
    }

    public static long parseDenominator(String s){
        // 提取分母
        return Long.parseLong(s.substring(s.indexOf('/')+1));
    }

    public Rational(long n,long d){
        // 输入时分母不为0, 但经过计算可能会出现0的情况
        if (0 == d){
            isZero = true;
            return;
        }
        // 如果分子小于0, 表示为负数
        if (n < 0){
            negative = !negative;
        }
        // 在输入时, 分母不可能小于0, 但经过计算可能出现小于0的情况
        if (d < 0){
            negative = !negative;
        }
        // 如果输入的是假分数, 需要将其调整为真分数 5/3 --> 1 2/3
        integer = n / d;
        numerator = n - integer * d;
        denominator = Math.abs(d);

        // 如果输入的分数不是最简分数, 则约分化简成最简分数 5/15 --> 1/5
        if (numerator > 1 || numerator < -1){
            long gcd = calcGCD(Math.abs(numerator),denominator); // 分子分母最大公约数
            if (gcd > 0){
                numerator /= gcd;
                denominator /= gcd;
            }
        }
        totalNumerator = numerator + integer * denominator;
    }

    // 求分子分母的最大公约数
    private long calcGCD(long a,long b){
        if (0 == b){
            return a;
        }
        return calcGCD(b,a%b);
    }
    public Rational Add(Rational r){
        long n = totalNumerator * r.denominator + denominator * r.totalNumerator;
        long d = denominator * r.denominator;
        return new Rational(n,d);
    }
}
