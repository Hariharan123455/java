class arrTest2 
{
  public static void main(String arg[])
  {
    int a[] = {12,23,45,13,32,44};

    System.out.println("Enter the Array values");
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