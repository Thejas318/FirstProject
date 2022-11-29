package com.pragra.Day11;

public class thisKeywordPractice {
    long id;
    String name;
    int grade;

  //  thisKeywordPractice(long id, string name){    //constructor
    //    id = id;    //so how will intellij decide to use between the 2 available 'id'.
     //   name= name;
    //    System.out.println(id);    //this will print the 'id' present in the scope. if it not present in the scope of constructor then it will check the class for 'id'
    //       this.id = id                       //we can solve this by using 'this' keyword


    public thisKeywordPractice(long id) {
        this.id = id;               //"this" will be replaced by object reference variable.
    }

    public thisKeywordPractice(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public thisKeywordPractice(long id, String name, int grade) {
      //  this.id = id;         //instead of doing this, since we already have a constructor which is initializing id and name. we can call that constructor here using'this' keyword
       // this.name = name;
        this(id, name);   //this will call the constructor which is taking id and name as parameters. this will reduce the work of original constructor.
                           //"this" keyword will be replaced by the constructor name.
        this.grade = grade;

    }
}

