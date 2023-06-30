import java.util.Scanner;
public class Leaders2
{
    public static void main(String [] args)
    {
        Scanner hi = new Scanner(System.in);
        int size=hi.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=hi.nextInt();
        }
        printLeader(arr,size);
    }
    
    public static void printLeader(int arr[],int size)
    {
        int max_from_right=arr[size-1];
        System.out.print(max_from_right+" ");
        
        for(int i=size-2;i>=0;i--)
        {
            if(max_from_right<arr[i])
            {
                max_from_right=arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
}
