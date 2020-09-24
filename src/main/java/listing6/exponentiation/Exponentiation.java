package listing6.exponentiation;

public class Exponentiation {
    public long calc(long base, long naturalRate) {
        long result;
        if (naturalRate <= 1) {
            return base;
        }
        result = calc(base*base, naturalRate/2);
        return result;
    }
}
