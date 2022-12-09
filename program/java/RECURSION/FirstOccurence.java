public class FirstOccurence {

    public static int findOccurence(int arr[],int key,int i) {
        
        if(key==arr[i]){
            return i;
        }
        return findOccurence(arr, key,i+1);
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(findOccurence(arr, 5,0));
    }
    
}
