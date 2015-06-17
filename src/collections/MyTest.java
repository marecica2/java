package collections;

import java.util.List;

public class MyTest
{

    public static void main(String[] args)
    {
        List<Person> list = Person.createRoster();
        list.stream()
                .filter((Person p) -> p.gender == Person.Sex.MALE)
                .map((Person p) -> {
                    return p.getName();
                })
                .forEach((String p) -> System.err.println(p));
    }
}
