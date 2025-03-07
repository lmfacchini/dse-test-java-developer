package corp.dse.developer.test1;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {

    public List<String> generateAnagrams(String value) {
        if (StringUtils.isBlank(value) || !value.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Invalid value.");
        }
        List<String> anagrams = new ArrayList<>();
        exchange(anagrams, value.toCharArray(), 0);
        return anagrams;
    }


    private void exchange(List<String> result, char[] chars, int index) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
        }else{
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                exchange(result, chars, index + 1);
                swap(chars, index, i);
            }
        }

    }


    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
