package listing6.exponentiation;

public class Exponentiation {
    long factor = 1;
    public long calc(long base, long naturalRate) {
        long result;
        if (naturalRate == 1) {
            return base * factor;
        }
        if (naturalRate % 2 != 0) {
            factor = factor * base;
        }
        result = calc(base*base, naturalRate/2);
        return result;
    }
}
