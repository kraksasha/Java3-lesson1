import java.util.ArrayList;

public class RunGenerick {
    public static void main(String[] args) {
        GenerickTest<Integer> generickTest = new GenerickTest<>(new Integer[]{12,21,34,53,2});
        GenerickTest<String> generickTest1 = new GenerickTest<>(new String[]{"hii","goodbay","man","cat"});
        ArrayList<Object> list = generickTest1.arrayToList();

        //generickTest.printGenerick();
        generickTest.swapPlaces(0,4);
        generickTest.printGenerick();

        System.out.println();

        //generickTest1.printGenerick();
        generickTest1.swapPlaces(1,3);
        generickTest1.printGenerick();

        System.out.println();

        for (Object ob: list){
            System.out.println(ob);
        }


        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();

        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);

        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(orange3);
        box4.addFruit(apple4);
        box4.addFruit(apple5);


        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());

        System.out.println(box1.compareTo(box2));

        box1.sprinkleFruit(box3);
        System.out.println(box3.getList());
        System.out.println(box1.getList());

        box3.sprinkleFruit(box4);
        System.out.println(box4.getList());
    }

}

