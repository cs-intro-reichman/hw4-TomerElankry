public class Primes {
    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       System.out.println("Prime numbers up to "+n+":");
       int count=0;
       int i = 2;
       double per=0;
       while (i<=n)
       {
          if(isPrime(i))
          { 
            count++;
            System.out.println(i);
          }
          i++;
       }
       per= ((double)count/n)*100;

       System.out.println("There are "+count+" primes between "+ "2 and "+n+" ("+(int)per+"% are primes)");
    }

    public static boolean isPrime(int s)
    {
        int j = 2;
        if(s==2) return true;
        while (j<s)
        {
            if(s%j==0) return false;
            j++;
        }
        return true;
    }
    
}