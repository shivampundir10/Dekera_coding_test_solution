import java.util.Scanner;
public class Main {
public static void main(String args[])
{
int num, quotient, i=1,j;
int binary_number[] = new int[100];
Scanner scan = new Scanner(System.in);

    System.out.println("Input a Decimal Number : ");
    num = scan.nextlnt();
    
    quotient = num;
    
    while(quotient != 0)
    {
        binary_number[i++] = quotient%2;
        quotient = quotient/2;
    }
    System.out.println("Binary number is: ");
    for(j=i; j>0; j--)
    {
        System.out.println(binary_number[j]);
    }
    System.out.println("\n");
}
}
