import java.util.*;
class Addition
{
    int add(int no1,int no2)
    {
        return no1+no2;
    }
}
public class sum
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        n1=s.nextInt();
        System.out.println("Enter the second number");
        n2=s.nextInt();
        Addition obj = new Addition();
        System.out.println("The sum of "+n1+" and "+n2+" = "+obj.add(n1,n2));
    }
}
