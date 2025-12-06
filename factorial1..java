import.java.untill.scanner;
class factorial
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter no");
 int a=sc.nextInt();
 int fact=1;
 int c=1;

 while(c<=a)
 {
 fact=fact*c;
 c=c+1;
 }
 System.out.println(fact);
 }
}

