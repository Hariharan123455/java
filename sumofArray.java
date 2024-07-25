import java.util.*;
class sumofarray
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" array size is 5 ");
        int arr[]=new int[10];
        int i,sum=0;

        for( i=1;i<5;i++)
        {
         arr[i]= Sc.nextInt();
         sum+=arr[i];
        } 
        System.out.print("Sumof array = "+sum);

    }
}