import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("20000000"), new BigInteger("100000000")));
        thread.start();
        
    }

    private static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power){
            this.base = base;
            this.power = power;
        }
        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow(base, power));
        }
    }

    private static BigInteger pow(BigInteger base, BigInteger power){
        BigInteger result = BigInteger.ONE;
        for(BigInteger i = BigInteger.ONE; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)){
            result = result.multiply(base);

        }
        return result;
    }
}
