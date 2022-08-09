package type;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

    @Test
    public void test1() {
        Collection<String> set = new HashSet<>();
        System.out.println(set.add("1"));
        System.out.println(set.add("1"));
    }
}
