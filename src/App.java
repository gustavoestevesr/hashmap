import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    // create map
    Map<Integer, Integer> map = new HashMap<>();
    
    // add elements to the map
    map.put(1, 10);
    map.put(2, 20);
    map.put(7, 20);
    map.put(8, 20);
    map.put(3, 30);
    map.put(4, 40);
    map.put(9, 40);
    map.put(0, 40);
    map.put(5, 10);
    map.put(6, 20);

    // get all values that are repeated more than twice
    map.values().stream()
        .filter(value -> Collections.frequency(map.values(), value) > 2)
        .distinct()
        .sorted()
        .forEach(System.out::println);    
  }
}
