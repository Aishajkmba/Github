public class Main {

    public static void main(String[] args) {
	 int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30,
             99, 91, 73, 65, 36, 35, 74, 82, 12, 43, 6};

             for (int i =0;i<numbers.length-2; i++);
             int minPos=0;
             for ( int j = j + 1; j < numbers.length; j++ ) {
             if ( numbers[minPos] < numbers[i] ) {minPos=j;
                if(minPos !=i) {
                int temp = numbers[j];
                 numbers[j] = numbers[minPos];
                   numbers[minPos] = temp;
                }
               System.out.println(numbers[i]);
              }
            }
    }
}
