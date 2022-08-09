package type;

import java.util.List;

public class TExtendsTest {

    class Food {

    }

    class Fruit extends Food {

    }

    class Apple extends Fruit {

    }

    public static void main(String[] args) {
        List<? extends Food> foods;
        List<? extends Fruit> fruits;
        List<? extends Apple> apples;
    }
}
