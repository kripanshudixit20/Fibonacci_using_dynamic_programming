import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class test {

    private final Map<BigInteger, BigInteger> results = new HashMap<>();

    public BigInteger calculate(BigInteger n) {
        if (results.containsKey(n)) { //check if already calculated and stored
            return results.get(n);
        } else {
            if (n.compareTo(BigInteger.ZERO) == 0) {
                results.put(BigInteger.ZERO, BigInteger.ZERO); //store the result
                return results.get(BigInteger.ZERO);
            } else if (n.compareTo(BigInteger.ONE) == 0) {
                results.put(BigInteger.ONE, BigInteger.ONE); //store the result
                return results.get(BigInteger.ONE);
            } else {
                results.put(n, calculate(n.subtract(BigInteger.ONE)).add(calculate(n.subtract(BigInteger.valueOf(2))))); //store the result
                return results.get(n);
            }
        }
    }

    public static void main(String...args)
    {
        test ob = new test();
        System.out.println(ob.calculate(new BigInteger("5")));
    }
}
