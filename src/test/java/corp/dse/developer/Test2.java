package corp.dse.developer;

import corp.dse.developer.test2.Person;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test2 {


    @Test
    void compareTest(){
        Person person1 = new Person("John Doe", 30, "123456789");
        Person person2 = new Person("John Doe", 31, "123456789");
        Person person3 = new Person("Jane Smith", 28, "987654321");

        assertNotEquals(person1, person3);
        assertEquals(person1, person2);



        Set<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        assertEquals(2, people.size());


    }
}
