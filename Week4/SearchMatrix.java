package week4;

/*74. 搜索二维矩阵*/

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length<=0 || matrix[0].length<=0){
            return false;
        }
        int rows=matrix.length, columns=matrix[0].length;
        int row=0, column=columns-1;
        while(row<rows && column>=0){
            if(matrix[row][column]==target){
                return true;
            }else if(matrix[row][column]<target){
                row++;
            }else{
                column--;
            }
        }
        return false;
    }
}
