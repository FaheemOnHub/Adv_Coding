// public class EQUI2 {
//     static int eqbmindex(int array[], int n) {
//         for (int i = 0; i < n; ++i) {
//             int lsum = 0;
//             for (int j = 0; j < i; j++)
//                 lsum += array[j];
            
//             int rsum = 0;
//             for (int j = i + 1; j < n; j++)
//                 rsum += array[j];
            
//             if (lsum == rsum)
//                 return i;
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int array[] = {-2, 5, 3, 1, 2, 6, -4, 2};
//         int arraysize = array.length;
//         System.out.println("Equilibrium Index is: " + eqbmindex(array, arraysize));
//     }
// }

import java.util.Scanner;
public class EQUI2
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
        System.out.println(equibrium(arr,size));
    }
    
    public static int equibrium(int arr[],int n)
    {
        for (int i=0;i<n;++i)
        {
            int lsum=0;
            for(int j=0;j<i;j++)
            lsum=lsum+arr[j];
            
            int rsum=0;
            for(int j=i+1;j<n;j++)
            rsum=rsum+arr[j];
            
            if(lsum==rsum)
            return i;
        }
        return -1;
    }
}
