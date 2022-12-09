public class TilingProblem {

    public static int solution(int n) {
        if(n==0||n==1){ //in both condition there is only 1 way to placed tiles
            return 1;
        }
        //vertical
        int vertical=solution(n-1);
        //hroizotal
        int hroizotal=solution(n-2);

        int totalWays=vertical+hroizotal;

        return totalWays;
        
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
        
    }
    
}
