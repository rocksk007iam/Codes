public class MoverAllXtoLast {
    //time complexity O(n)
    public static void movedAllX(String str,int index,int count,String newString) {

        if(index==str.length()){//end of string
            
            for(int i=0;i<count;i++){//we put x count times
                newString+='x';

            }
            
            System.out.println(newString);
            return;
        }

        char currentchar=str.charAt(index);
        if(currentchar=='x'){ // we increse count when it finds x then with for loop we are going to print it count times
            count++;
            movedAllX(str, index+1, count, newString);
        }
        else{ //other than x we directly mov the elemnts to new string
            newString=newString+currentchar; //newString+=currentchar
            movedAllX(str, index+1, count, newString);
        }
        
    }
    public static void main(String[] args) {
        String str="xxxaaxx";
        movedAllX(str, 0, 0, "");
        
    }
    
}
