package CommonPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "abc");
        map.put(2, "xyz");
        
       Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            String val = map.get(next);
            System.out.println(val);
        }
        
        Iterator<Entry<Integer, String>> iterator2 = map.entrySet().iterator();
        
while(iterator2.hasNext())
{
    Entry<Integer, String> next = iterator2.next();
    System.out.println(next.getKey() + " : " + next.getValue());
    
}

for (Map.Entry<Integer, String> entry: map.entrySet()) {
	System.out.println(entry.getKey() +" : "+ entry.getValue());
	
}
    }

}
