import java.util.*;

class arrTest1 {
    public static void main(String arg[])
{
    int a[] = new int[5];
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the Array values");
    for(int i=0;i<a.length;i++)
 {
    a[i] = Sc.nextInt();
 }
 System.out.println("The Array values are");
 for(int i=0;i<a.length;i++)
 {
    System.out.println(a[i]);
 }
 System.out.println("The Array values are in reverse order");
 for(int i=a.length-1;i>=0;i--)
{

    System.out.println(a[i]);
   }
}
}