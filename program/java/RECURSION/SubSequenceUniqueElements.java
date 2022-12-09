import java.util.HashSet;

public class SubSequenceUniqueElements {
    
    private static void printUniqueSubSequence(int index,String s1, String newstring, HashSet<String> set) {
        if(index==s1.length()){
            if(set.contains(newstring)){
                return;

            }
            else{
                System.out.print(newstring+" ");
                set.add(newstring);
                return;
            }
        }
        char currentChar = s1.charAt(index);

        //elemts will be added
        printUniqueSubSequence(index+1, s1, newstring+currentChar, set);

        //element will be not added
       printUniqueSubSequence(index+1, s1, newstring, set);
        
    }
    public static void main(String[] args) {
        String s1 ="aaa";
        HashSet<String>set=new HashSet<>();
        printUniqueSubSequence(0, s1, "", set);
        
    }
    
}
