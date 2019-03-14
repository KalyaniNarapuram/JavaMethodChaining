package love.programming;

public class MyStringBuilder {

    public static void main(String[] args) {

        StringBuilder myStringBuilder = new StringBuilder("Kalyani Narapuram");
        System.out.println(myStringBuilder.length());
        System.out.println(myStringBuilder.capacity());
        System.out.println("is my name".length());

        myStringBuilder.append(" is my name amd amd am amd ");

        System.out.println(myStringBuilder);

        myStringBuilder.delete(3,5); // It will delete the 3rd value and 4th value and stop at 5th value
        System.out.println(myStringBuilder);
        System.out.println(myStringBuilder.length());

        int x = myStringBuilder.capacity();
        System.out.println(x);

    }
}
