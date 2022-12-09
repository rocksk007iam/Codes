public class StrictlyIncreasingArray {

    //time complexity O(n)
    public static boolean sortedArray(int index ,int arr[]) {
        if(index==arr.length-1){//take index
            return true;
        }
        
        if(arr[index]>=arr[index+1]){
            return false;//for unsorted
        }


       return sortedArray(index+1, arr);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,4};
        
        System.out.println(sortedArray(0, arr));
    }
    
}
