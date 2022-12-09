public class StringReverse {
    //time complexity O(n)
    public static void printReverse(String s1,int i) {
        if(i==0){
            System.out.print(s1.charAt(i));  // fist elemnt will print(h)
            return;
            
        }
        System.out.print(s1.charAt(i));  //middle elemnts will print(lleh)
        printReverse(s1,i-1);
        
        
    }
    public static void main(String[] args) {
        String s1 = "hello";
        printReverse(s1,s1.length()-1);  // starts from last element(o)
        
    }
    
}
