package love.programming;

public class MethodChaining {

    public static void main(String[] args) {

        /* Hello will be accessed from the String Pool if
         already exists otherwise it will create a new object called Hello*/

        int x;
        String myString = "  Hello";

       myString = myString.toUpperCase().concat("WORLD  ");
       System.out.println(myString);

        x = myString.length();
        System.out.println(x);

        myString = myString.trim();
        System.out.println(myString);

        System.out.println(myString.length());












    }
}
