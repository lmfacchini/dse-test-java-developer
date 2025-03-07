package corp.dse.developer;

import corp.dse.developer.test1.AnagramGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    void generateAnagramsTest(){

        AnagramGenerator ag = new AnagramGenerator();
        List<String> list1 = ag.generateAnagrams("ABC");
        List<String> list2 = ag.generateAnagrams("ABR");
        List<String> list3 = ag.generateAnagrams("vf");

        assertEquals(6, list1.size());
        assertEquals(6, list2.size());
        assertEquals(2, list3.size());



    }
}
