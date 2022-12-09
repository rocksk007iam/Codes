public class OpmizedDiagonalSum {

    public static void diagonalSum(int matrix[][]) {

        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            //FOR PRIMARY SUM
            sum+=matrix[i][i];
            
            //FOR SECONDARY SUM
            if(i!=matrix.length-i-1){
            sum+=matrix[i][matrix.length-i-1];
            }
            
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum(matrix);
    }
    }

