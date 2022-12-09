import java.util.Scanner;
//tower of honoi problem
//time complexity O(2^n)

public class TowerOfHonoi {
    private static void solution(int n,String src,String helper,String dest) {
        if(n==1){//if n is one there is no use of helper tower , we will directly transfer the disk
            System.out.println("DISK TRANSFER = "+n+" "+" from = "+src+" "+" to = "+dest+" "+" using = "+helper);
            return;
        }
        solution(n-1, src, dest, helper);
        System.out.println("DISK TRANSFER = "+n+" "+" from = "+src+" "+" to = "+dest+" "+" using = "+helper);
        solution(n-1, helper, src, dest);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n, "S", "H", "D");

        
    }
    
}
