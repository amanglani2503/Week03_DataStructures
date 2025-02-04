package searching.linearsearch.firstNegative;

public class FirstNegative {
    public static int firstNegative(int[] numbers){
        // traversing to find negative number
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] < 0){
                return i;       // returning index of negative element
            }
        }

        return -1;  // returning -1 when number is not found
    }

    // main method
    public static void main(String[] args) {
        // array of integers
        int[] numbers = {2, 5, 4, 1, 0, 5, 4, 3, 7, 11};

        // storinf index of first negative element
        int firstNegativeIndex = firstNegative(numbers);

        if (firstNegativeIndex != -1) {
            System.out.println("Index of first negative element : " + firstNegativeIndex);
        }
        else{
            System.out.println("No negative element found !!");
        }
    }
}
