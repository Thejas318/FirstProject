package Practice;

public class TotalMarksMultiDimensionalArray {


    public static void main(String[] args) {
        int[][] marks = new int[3][5];
        PopulateTheArray(marks);                   //call the below methods
        // TotalMarksOfOneStudent(marks);
       // TotalMarksOneSubject(marks);
    }

    public static void PopulateTheArray(int[][] args) {

        for (int i = 0; i < args.length; i++) {                // looping technique to print array elements.
            for (int j = 0; j < args[i].length; j++) {
                args[i][j] = j;
                System.out.print(args[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void TotalMarksOfOneStudent(int[][] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {                  //iterates 3 times.

            sum = 0;
            for (int j = 0; j < args[i].length; j++) {          // iterates 5 times.

                sum = sum + args[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void TotalMarksOneSubject(int[][] args) {
        int sum =0;
        for (int i = 0; i < args[0].length; i++) {       //outer for loop iterates 5 times. cant use args[i].length bcoz we will get
                                                         // out of bound error.
            sum = 0;
            for (int j = 0; j < args.length; j++) {       // iterates 3 times.

                sum = sum + args[j][i];

            }
            System.out.println("The total marks in each subject: " + sum);

        }
    }
}