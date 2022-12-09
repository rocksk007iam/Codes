import java.util.*;
public class FirstAndLastOccurence {
    //time complexity O(n)

    public static int first=-1;//no problem with zero
    public static int last=-1;//no problem with zero
    
    
    public static void occurence(String s1,int index, char element) {
        
        if(index==s1.length()){//end of string
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current=s1.charAt(index);

        if(current==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index; 
            }
            
        }
        occurence(s1, index+1, element);
      
    }
    public static void main(String[] args) {
        String s1 ="aababbsbjjbba";
        occurence(s1, 0, 'a');
    }
}
