package Practice.January2023.Java8Enhancements.Jan6th.UnitTesting;

public class ToCheck {

    int n;

    public boolean checkLength(String s)
    {
        n = s.length();

        return(n % 2 != 0 );

    }
}
