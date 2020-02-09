import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String args[]){
        Map<String,String> map = new HashMap<>();
        Map<String,String> mapWithCapacity = new HashMap<>(10);
        Map<String,String> mapWithCapacityAndLoader = new HashMap<String, String>(10,0.75f);
        Map<String,String> map1 = new HashMap<String, String>(map);

        map.put("1", "Megha");
        map.put("2", "Tommy");
        map.put("3", "Tweety");

        String valueOfKey = map.get("2");

        System.out.println(map);
        System.out.println("the value of 2 is " + valueOfKey);

        System.out.println("___________");
        Set<String> keys = map.keySet(); // using set class, and generic type as string, now it contains collections of keys
        System.out.println(keys);

        System.out.println("___________");
        Iterator<String> itr = keys.iterator();

        while(itr.hasNext()){
            String key = itr.next();
            System.out.println("the key: "  + key + " is for " + map.get(key));
        }
        System.out.println("=================");
        System.out.println("Using for each");
        System.out.println("=================");
        for(String key: keys){
            System.out.println("the key: "  + key + " is for " + map.get(key));
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);
        for (Map.Entry<String, String> entery: entrySet) {
            System.out.println("the key: "  + entery.getKey() + " is for " + entery.getValue());
        }

        System.out.println(map.values());

    }
}
