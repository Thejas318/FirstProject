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
            System.out.println("add this sout line to learn about git");
            System.out.println("branch creation successfull");
            System.out.println("cretaing this sout to learn about git status commandq");

        }



    }
}
