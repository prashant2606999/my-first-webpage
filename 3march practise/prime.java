    import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       int t = scn.nextInt();
       int n = scn.nextInt();

       for(int i=1;i<=t;i++){
         
        for (int div=2;div*div<=n;div++){
          
          int count=0;
          while(n/div==0){
            System.out.println("not prime");
            count++;
            break;
          }
          
        }if( count==1){
          System.out.println("not prime");
      }else{
        System.out.println("prime");
      }



       }

       
  
   }
  }
  