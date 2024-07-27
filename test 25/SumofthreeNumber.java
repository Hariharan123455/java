class Sumofthree
{
    int a,b,c;
    Sumofthree(int x,int y,int z)
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
class SumofthreeNumber
{
    public static void main(String args[])
    {
        Sumofthree obj=new Sumofthree(10,10,10);
        obj.display();
    }
}