class Sumofthreee
{
    int a,b,c;
    Sumofthreee(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void display()
    {
        System.out.println("Sum of three = "+(a+b+c));
    }
}
class SumofthreeNumber1
{
    public static void main(String args[])
    {
        Sumofthreee obj=new Sumofthreee(10,10,10);
        obj.display();
    }
}               