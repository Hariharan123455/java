import java.util.*;
class info
{
    int mark[]=new int[5];
    Scanner sc=new Scanner(System.in);
    String name;
    int i,reg,sum=0,avg;
    info()
    {
        System.out.println("Enter the name : ");
        name=sc.nextLine();
        System.out.println("Enter Reg number : ");
        reg=sc.nextInt();
        for(i=0;i<5;i++)
        {
            System.out.println("Mark "+(i+1));
            mark[i]=sc.nextInt();
            sum+=mark[i];
        }
        avg=sum/5;

    }
    void display()
    {
        System.out.println("Your name is "+name);
        System.out.println("Your Reg number is "+reg);
        System.out.println("Your Mark avg is "+avg);

    }

}
class sdtinfo
{
    public static void main(String args[])
    {
        info obj=new info();
        obj.display();
    }
}