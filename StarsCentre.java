import java.util.*;

class StarsCentre
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--)
 {

            for (int j = rows; j > i; j--) 
{
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) 
{
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}