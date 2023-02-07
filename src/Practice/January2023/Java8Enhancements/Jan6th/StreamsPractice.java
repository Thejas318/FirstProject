package Practice.January2023.Java8Enhancements.Jan6th;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsPractice {
   // String[] names = {"Madhu", "Yashu", "Bharathi", "Shivaramaiah", "Bhaskar", "Mohith", "Bheeshma", "Yograj", "Thejas", "Ninad", "Achari"};



    public static void main(String[] args) {

        //Take list of string array. filter those which starts from 'B'. change them to upper case
        System.out.println("Take list of string array. filter those which starts from 'B'. change them to upper case");
        List<Name> names = new ArrayList<Name>();


        names.add(new Name("Madhu"));
        names.add(new Name("Yashu"));
        names.add(new Name("Bharathi"));
        names.add(new Name("shivaramaiah"));
        names.add(new Name("Bhaskar"));
        names.add(new Name("Mohith"));
        names.add(new Name("Bheeshma"));
        names.add(new Name("Yograj"));
        names.add(new Name("Thejas"));
        names.add(new Name("Ninad"));
        names.add(new Name("Achari"));
        names.add(new Name("Balu"));

        System.out.println("List of Names: " + names);

        names.stream().filter((n) -> (n.getName().startsWith("B")))
                .forEach(StreamsPractice::accept);



    }
    private static void accept(Name n){
        System.out.println(n.getName().toUpperCase());
    }

}
