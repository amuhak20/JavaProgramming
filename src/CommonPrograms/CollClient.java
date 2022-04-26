package CommonPrograms;

import java.util.HashSet;
import java.util.Set;

class Country
{
    private String name;
    Country(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return name;
    }
}

public class CollClient {

    public static void main(String[] args) {
        String s1 = new String("India");
        String s2 = new String("India");
        Country s3 = new Country("France");
        Country s4 = new Country("France");
        Set  set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

    }
    
    
}
