public class Subsequence {
    
    private static void printSubSequence(String s1,int index,String newstring) {
        if(index==s1.length()){
            System.out.print(newstring+" ");
            return;
        }

        char currentchar=s1.charAt(index);

        //elemts will be added
        printSubSequence(s1, index+1, newstring+currentchar);

        //element will be not added
        printSubSequence(s1, index+1, newstring);
        
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        printSubSequence(s1, 0, "");
        
    }
    
}
