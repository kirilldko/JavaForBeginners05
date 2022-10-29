package lessons;

public class Person {
    public static void main(String[] args) {
        final int _year = 2022;
        final int _two =2;
        int _yob=1990;
        System.out.println("Если человек родился в "+ _yob +
                " году, "+ "то его возраст -  "
                + (_year-_yob));
        _yob=1991;
        System.out.println("Если человек родился в "+ _yob +
                " году, "+ "то его возраст -  "+ _two +" года назад - "
                + (_year-_yob-_two));


    }

}
