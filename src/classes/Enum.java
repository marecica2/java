package classes;

public class Enum
{
    public enum Day
    {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public Day day;

    public static void main(String... args)
    {
        Enum e = new Enum();
        e.day = Day.MONDAY;

        System.err.println(e.day);

        if (e.day == Day.MONDAY)
            System.err.println("mon");
    }
}
