package model2;

import java.math.BigInteger;
import java.util.List;

public class App {

    public static void main(String[] args) {

/*        PrimeGenerator prime = new PrimeGenerator();
        List<BigInteger> primes =  prime.getPrimes();
        System.out.println("App " + primes.get(0));
        System.out.println("App " + primes.get(1));*/

/*        KeyGenerator gen = PrivateKeyGenerator.getInstance();
        List<BigInteger> primes = gen.getKeys();
        System.out.println("App " + primes.get(0));
        System.out.println("App " + primes.get(1));*/


        Sender sender = new Sender();
        List<BigInteger> primes = sender.getPublicKey();
        System.out.println("App " + primes.get(0));
        System.out.println("App " + primes.get(1));



/*        KeyGenerator gen = PublicKeyGenerator.getInstance();
        List<BigInteger> primes = gen.getKeys();
        System.out.println("App " + primes.get(0));
        System.out.println("App " + primes.get(1));*/

/*        SecondaryPrimeGenerator sec = new SecondaryPrimeGenerator();
        System.out.println(sec.getPrime());*/
    }
}
