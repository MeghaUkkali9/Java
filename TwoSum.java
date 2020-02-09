import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("0", -2);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 5);
        map.put("5", 0);
        System.out.println(map);

        int  target = 3;

        System.out.println(getIndices(map, target));
    }
    static String getIndices(Map map, int target){
        Set<String> keys = map.keySet();

        Iterator<String> iterator = keys.iterator();

        while(iterator.hasNext()){
            String key = (iterator.next());
            Object x;

             int x1 = (int) map.get(key);
             int x2 = target - x1;

            if(map.containsValue(x2)){
                System.out.println("The indices are:");
                System.out.println(key);
                return (String) getKeyFromValue(map,x2);
            }

            System.out.println();
        }
        return null;
    }
    public static Object getKeyFromValue(Map map, Object value) {
        for (Object o : map.keySet()) {
            if (map.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

}
