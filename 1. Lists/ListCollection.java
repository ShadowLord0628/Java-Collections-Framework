import java.util.ArrayList;
// import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        // ? list

        // List list = new ArrayList(); // list without wrapper class

        ArrayList<Integer> list = new ArrayList<>();

        // ? add elements in arraylist
        list.add(10);
        list.add(20);
        list.add(30);

        // ? add element at specific index
        list.add(2, 25);

        // ! we can add element which is not of same type but only when wrapper class is
        // ! not used

        // list.add("Shiva");
        // it will give error
        System.out.println(list);

    }
}