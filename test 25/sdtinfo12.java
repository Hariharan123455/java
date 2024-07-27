import java.util.*;
class info1
    {
        int mark[]=new int[4];
        Scanner sc=new Scanner(System.in);
        String name;
        int i,reg,sum=0,avg;
        info1()
        {
            System.out.println("Enter the name : ");
            name=sc.nextLine();
            System.out.println("Enter Reg number : ");
            reg=sc.nextInt();
            for(i=0;i<4;i++)
            {
                System.out.println("Mark "+(i+1));
                mark[i]=sc.nextInt();
                sum+=mark[i];
            }
            avg=sum/4;
    
        }
        void display()
        {
            System.out.println("Your name is "+name);
            System.out.println("Your Reg number is "+reg);
            System.out.println("Your Mark avg is "+avg);
        }
         
        void avg()
        {
            if(avg>=90)
            {
                System.out.println("Grade is A ");
            }
            else if(90>avg&&avg>=80)
            {
                System.out.println("Grade is B ");
            }
            else if(80>avg&&70<=avg)
            {
                System.out.println("Grade is C ");
            }
            else if(70>avg&&60<=avg)
            {
                System.out.println("Grade is D ");
            }
            else if(60>avg&&avg>=50)
            {
                System.out.println("Grade is E ");
            }
            else
            {
                System.out.println("It is Fail ");
            }
        }
    
    }
    class sdtinfo12   
     {
        public static void main(String args[])
        {
            info1 obj=new info1();
            obj.display();
            obj.avg();
        }
    }