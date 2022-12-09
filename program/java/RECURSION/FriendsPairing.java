public class FriendsPairing {

    public static int totalpairs(int n) {
        //base case
        if(n==1||n==2){
            return n;
        }
        //choices 
        //single = (n-1)
        //double =(n-1)*(n-2)
        return totalpairs(n-1)+totalpairs(n-1)*totalpairs(n-2);

        
    }
    public static void main(String[] args) {
        System.out.println(totalpairs(3));
    }
    
}
