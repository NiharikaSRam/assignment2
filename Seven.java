public class Seven  
{  
public static void main(String[] args)   
{  

int x = 25, y =6, gcd = 1;  
int n1 = 85, n2 = 145, lcm;

for(int i = 1; i <= x && i <= y; i++)  
{  
  
if(x%i==0 && y%i==0)  

gcd = i;  
}

  System.out.printf("GCD of %d and %d is: %d\n", x, y, gcd);  

lcm = (n1 > n2) ? n1 : n2;

    
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d\n", n1, n2, lcm);
        break;
      }
      ++lcm;
 

}  
}
}