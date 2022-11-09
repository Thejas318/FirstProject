package Practice;

public class TotalMarksOfTheStudent {
    static int total = 0;
    public static void main(String[] args) {

        int[] marks = {96, 88, 85, 90, 92};
       // StudentTotalMarks(marks);                 //Call this method to calculate the total marks of the single student.

    }

    public static int StudentTotalMarks(int[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        total = sum;
        System.out.println("The total marks scored by the student is: " + total);
        return total;
    }

    public static void StudentTotalMultiDimensionalArray(int[] args) {
        

    }
}
