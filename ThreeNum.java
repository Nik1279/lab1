import java.util.Scanner;
public class ThreeNum{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the three numbers");
        int a =sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        System.out.println("average of number is"+(a+b+c)/3);
        if(a<=b && b<=c) System.out.println("sum of largest two numbers  is "+(b+c));
        else if(b<=a && b<=c)System.out.println("sum of largest two numbers  is"+(a+c));
        else
        System.out.println("sum of 8 " + (a+b));

    }
}