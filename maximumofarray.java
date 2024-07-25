import java.util.*;
class maximumarray
{
    public static void main(String []args)
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println(" array size is 5 ");
        int arr[]=new int[10];
        int i,temp=0;
        int max=arr[0];

        for( i=0;i<5;i++)
        {
         arr[i]=Sc.nextInt();
        } 

        for( i=0;i<5;i++)
        {
           if(max<arr[i])
           {
            max=arr[i];
           }
        } 


        System.out.print("maximumarray array = "+max);

    }
}