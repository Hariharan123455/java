class hariharan
{
    int num,sum=0;
    hariharan(int n)
    {
        num=n;
    }
    void display()
    {
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of series : "+sum);
    }
}
class hariharantest
{
    public static void main(String args[])
    {
         hariharan s=new hariharan(5);
         s.display();

    }
}