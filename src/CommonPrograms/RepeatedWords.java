package CommonPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWords {
public static void main(String[] args) {
    String str= "Java is java because it is best";
    String[] split = str.toLowerCase().split(" ");
   System.out.println(split.length);
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for(String st: split)
    {
        if(map.containsKey(st))
        {
            map.put(st, map.get(st)+1);
        }
        else
        {
            map.put(st, 1);
        }
    }
     for(Map.Entry<String, Integer> entrySet :  map.entrySet())
     {
         String key = entrySet.getKey();
         Integer value = entrySet.getValue();
         if(value>1)
         {
             System.out.println(key);

         }
     }
     
   
    }
}

