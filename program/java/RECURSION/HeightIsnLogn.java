public class HeightIsnLogn {
   
        private static int calculatePower(int x ,int n) {
            if(x==0){
                return 0;//base 0 means 0(0^2=0)
            }
            if(n==0){
                return 1;//power 0 means 1(2^0=1)
            }
    
            if(n%2==0){
                return calculatePower(x, n/2) * calculatePower(x, n/2);//for even numbers
            }
            else{
                return calculatePower(x, n/2) * calculatePower(x, n/2)*x;//for odd numbers
            }
        }
        public static void main(String[] args) {
            int x=6;
            int n=2;
            int ans=calculatePower(x,n);
            System.out.println(ans);
    
            
        }
        
    }
    
    

