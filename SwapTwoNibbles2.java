public class SwapTwoNibbles2{
    public static void main(String[]args)
    {
        int x=100;
        System.out.println(swapNibbles(x));
    }
    
    public static int swapNibbles(int x){
        return ((x&0x0F)<<4|(x&0xF0)>>4);
    }
}
