package DSA_GATE.Assignment1;
import java.math.BigInteger;

public class question5 {
    public static BigInteger fact(int n){
        BigInteger result=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(fact(n));
    }
}
