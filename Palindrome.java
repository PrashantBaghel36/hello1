import java.util.Scanner;
public class Palindrome
{


public static void CheckPalindrome(int num)
{
int orgnum = num;
int rev = 0;
while(num!=0)
{
int rem = num%10;
rev = rev*10 + rem;
num = num/10;
}
if(orgnum==rev)
{
System.out.println("Number is Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
Palindrome.CheckPalindrome(num);
}
}

