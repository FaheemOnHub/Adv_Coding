import java.util.Scanner;
class fahem
{
    public static void main(String[]args)
    {
        Scanner hi = new Scanner(System.in);
        int size=hi.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=hi.nextInt();
        }

        System.out.println(maxProduct(arr));
    
    }
    public static int maxProduct(int [] arr)
    {
        int n=arr.length;
        int prefixProduct=1;
        int suffixProduct=1;
        int maxProduct=arr[0];
        
        for (int i=0;i<n;i++)
        {
            prefixProduct=prefixProduct==0 ? 1:prefixProduct;
            suffixProduct=suffixProduct==0 ? 1: suffixProduct;
            
            prefixProduct=prefixProduct*arr[i];
            suffixProduct=suffixProduct*arr[n-1-i];
            
            maxProduct=Math.max(maxProduct,Math.max(prefixProduct,suffixProduct));
        }
        return maxProduct;
    }
}
