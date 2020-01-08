import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int next = keyboard.nextInt();
        displayAsWord(next);
    }
    private static String numberToWord(int number)
    {
        String value = null;
        switch (number)
        {
            case 0:
                value = "Zero";
                break;
            case 1:
                value = "One";
                break;
            case 2:
                value = "Two";
                break;
            case 3:
                value = "Three";
                break;
            case 4:
                value ="Four";
                break;
            case 5:
                value = "Five";
                break;
            case 6:
                value = "Six";
                break;
            case 7:
                value = "Seven";
                break;
            case 8:
                value = "Eight";
                break;
            case 9:
                value =  "Nine";
                break;
                default:
                {
                    System.out.println("Wrong number entered");
                }
        }
        return value;
    }
    private static int getPowerOfTen(int number)
    {
        int result = 1;
        while (number >= 10)
        {
            result = result * 10;
            number = number/10;
        }
        return  result;
    }
    public static void displayAsWord(int number)
    {
        int divisor = getPowerOfTen(number);
        int next = number;
        while (divisor >= 10)
        {
            System.out.print(numberToWord(next/divisor) + " ");
            next = next %divisor;
            divisor = divisor/10;
        }
        System.out.println(numberToWord(next/divisor) + " ");

    }

}
