package type;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenericTypeTest {
    public static <T> T getT(T... t) {
        return t[0];
    }

    public static <T> void test(List<T> listA, List<T>  listB) {
        System.out.println(listA);
        System.out.println(listB);
        System.out.println(listA.hashCode());
        System.out.println(listB.hashCode());
    }

    @Test
    public void CityTest() throws IOException, ClassNotFoundException {
        ArrayList<City> list = new ArrayList<>();
        list.add(new City("北京"));
        list.add(new City("上海"));
        List<City> copy = new forCopy().copy(list);
        list.set(0, new City("广州"));
        System.out.println(copy);
        System.out.println(copy.hashCode());
        System.out.println(list);
        System.out.println(list.hashCode());
    }

    @Test
    public void StringTest() throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        List<String> copy = new forCopy().copy(list);
        list.set(0, "广州");
        System.out.println(copy);
        System.out.println(copy.hashCode());
        System.out.println(list);
        System.out.println(list.hashCode());
    }


    static class Deserialize {

        private List<City> copy(List<City> list) throws IOException, ClassNotFoundException {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(list);

            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            Object o = in.readObject();
            return (List<City>) o;
        }
    }

    static class forCopy {
        private <T> List<T> copy(List<T> list) throws IOException, ClassNotFoundException {
            ArrayList<T> o = new ArrayList<>();
            o.addAll(list);
            return o;
        }
    }

    static class City {
        private String name;

        public City(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


}
