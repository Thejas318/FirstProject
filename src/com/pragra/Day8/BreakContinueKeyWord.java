package com.pragra.Day8;

public class BreakContinueKeyWord {
    public static void main(String[] args) {

        //BreakKeywordMethod();
                                                 // Use any method available here
        //ContinueKeywordMethod();
    }

    public static void BreakKeywordMethod() {


        for (int i = 0; i <= 10; i++) {

            System.out.println("start: " + i);
            if (i == 5) {
                break;
            }

            System.out.println("End: " + i);

        }
    }


    public static void ContinueKeywordMethod() {
        for (int i = 0; i <= 10; i++) {

            System.out.println("start: " + i);
            if(i == 5){
                continue;
            }

            System.out.println("End: " + i);

            System.out.println("I'm in master branch now");
            System.out.println("I'm trying to merge the testing branch with master branch");

        }



    }
}
