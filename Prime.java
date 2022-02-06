Package com.navin

Public class Prime
{
  Public static void main (string[] args)
    {
      int num=25;
      boolean isprime= true;

      for (int i=2;i<=num;i++)
       {
         if (num%i==0)
        {
         is prime= false;
         break;
}
}
if (is prime)
{
  System.out.println(num+"is a prime number");
}
else
{
  System.out.println("Not a Prime Number");
}
}
}
