import java.util.*;
class findvaluearray
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" array size is 5 ");
    int arr[]=new int[10];
    int i,f=0;

    for( i=1;i<=5;i++)
    {
    arr[i]=sc.nextInt();
    } 

    System.out.println("Enter the yours value ");
    int value=sc.nextInt();

    for( i=1;i<=5;i++)
    {
    if(arr[i]==value);
    {
    f=1;
    break;
    }
    }


    if(f==1)
    {
    System.out.println("that value possition is ="+i);
    }
    else
    {
    System.out.println("this value is not there");
    }
    }
}