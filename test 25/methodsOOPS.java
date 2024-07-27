class methods
{
    double r,d,w,c;
    methods()
    {
        r=12;
        d=3.14*r*r;
       System.out.println("Area of cricle : "+d); 
    }
    methods(double x,double y)
    {
          r=x;
          d=y;
          System.out.println("Area of Retangle : "+r*d);
    }
    methods(double m)
    {
     w=m;
     c=Math.pow(w,2);
     System.out.println("Area of Square : "+c);
    }
}
class methodsOOPS
{
    public static void main(String args[])
    {
        methods area=new methods();
        methods sq=new methods(2);
        methods Retangle=new methods(2,10);

    }
}