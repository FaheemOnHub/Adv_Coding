public class BoothsAlgo2
{
    public static void main(String[] args)
    {
        int multiplicand=14;
        int multiplier=6;
        
        int product=0;
        
        int multiplicandBits=Integer.toBinaryString(multiplicand).length();
        
        for(int i=0;i<multiplicandBits;i++)
        {
            int currentBit=(multiplicand & 0b1);
            if(currentBit==1)
            {
                product=product+multiplier;
            }
            multiplier<<=1;
            multiplicand>>=1;
        }
        System.out.println("Result "+product);
    }
}
