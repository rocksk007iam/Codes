public class FirstnaturalNumber {

   public static void printsum(int i , int n ,int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
        
        
    }

    public static void main(String args[]) {
        printsum(1, 3, 0);
        
        
        //simple Code without recursion
        /* int n=3;
        int sum = n*(n+1)/2;
        System.out.println(sum);
         */
    }
    
}
