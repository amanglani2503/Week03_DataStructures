package searching.binarysearch.twodmatrix;

public class SearchIn2dMatrix {
    public static boolean binarySearch(int[][] matrix, int target){
        int mid, totalRows = matrix.length;
        int totalColumns = matrix[0].length;
        int low = 0, high = totalColumns * totalRows - 1;

        while(low < high){
            mid = (low + high) / 2;
            int row = (mid / totalColumns);
            int column = mid % totalColumns;

            if(matrix[row][column] == target){
                return true;        // returning true if element found
            }
            if(matrix[row][column] < target){
                low = mid + 1;      // updating low if target is greater than middle value
            }
            else{
                high = mid - 1;     // updating high if target value is smaller than middle value
            }
        }
        return false;
    }

    // main method
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}
                    , {4, 5, 7}
                    , {10, 13, 17}};

        int targetValue = 11;

        // storing if target value is present in the array or not
        boolean targetFound = binarySearch(matrix, targetValue);

        if(targetFound){
            System.out.println("Value " + targetValue + " found");
        }
        else{
            System.out.println("Value " + targetValue + " not found");
        }
    }
}
