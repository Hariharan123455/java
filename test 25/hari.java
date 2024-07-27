class calc
{
    int num ,div;
    calc()
    {
        num=10;
        div=5;
    }
    void display()
    {
       System.out.println("Remaider : "+num%div);
       System.out.println("quotient : "+num/div);
    }

}
class hari
{
    public static void main (String []args)
    {
        calc s=new calc();
        s.display();
    }

}