public class RemoveDuplicates {
    public static boolean[] map =new boolean[26] ; //cuz there are 26 aphabets ie,0 to 25 index(a at 0 index whereas z at 25 index)
        
    
    public static void remove(int index,String newstring ,String str) {
        if(index ==str.length()){
            System.out.println(newstring);
            return;
        }

        char curentchar=str.charAt(index);//first find out current char at index
        if(map[curentchar-'a']==true){ //if minus char from char(c[2]-a[0](2-0)=2)we get integer value
            //if the character came again then we just go to next index
            remove(index+1, newstring, str);
        }
        else{
            //if the character comes first time
            newstring+=curentchar; // elemnt that comes first time we will ad it to the newstring
            map[curentchar-'a']=true; //we make that index true
            remove(index+1, newstring, str);
        }
        
    }
    public static void main(String[] args) {
        String str="abbcba";
        remove(0, "", str);
        
    }
    
}
