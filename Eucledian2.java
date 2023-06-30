public class Eucledian2 {
    public static void main(String [] args)
    {
        int a,b,g;
        a=35;
        b=10;
        g=gcd(a,b);
        System.out.println("GCD(" + a + " , " + b+ ") = " + g);
        a=31;
        b=2;
        g=gcd(a,b);
        System.out.println("GCD(" + a + " , " + b+ ") = " + g);
    }

    public static int gcd(int a,int b) 
    {
        if(a==0)
        return b;
        else
        {
            return gcd(b%a,a);
        }
    }
}
