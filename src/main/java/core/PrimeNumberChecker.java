package core;

public class PrimeNumberChecker {
       public Boolean validate(final Integer primeNumber) {
              for (int i = 2; i < primeNumber; i++) {
                     if (primeNumber % i == 0) {return false;}}
              
              return true;
}
/*       public static void main(String[] args) {
	   System.out.println(validate(4));
		
	}*/
}

