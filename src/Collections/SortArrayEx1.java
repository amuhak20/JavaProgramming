package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayEx1 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(110);
	list.add(537);
	list.add(314);
	list.add(988);
	list.add(672);
	
	
	Comparator<Integer> comp = new compimp();
	//list.forEach(s->System.out.println(s));
	//System.out.println(list);
	Collections.sort(list, comp);
	list.forEach(s->System.out.println(s));



	
}
}

class compimp implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1%100>o2%100)
		{
		return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
