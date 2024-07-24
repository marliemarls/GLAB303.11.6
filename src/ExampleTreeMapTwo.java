import java.util.TreeMap;
public class ExampleTreeMapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);

        //using firstKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First key: " + firstKey);

        //using lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last key: " + lastKey);

        //using firstEntry() method
        System.out.println("First Entry: " + numbers.firstEntry());

        //using lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());

    }
}
