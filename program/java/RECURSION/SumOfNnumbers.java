public class SumOfNnumbers {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int SumOf=n+sum(n-1);
        return SumOf;
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    
}
