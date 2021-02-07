import java.util.*;
class Prog1Basic{
	public static void main(String [] arg){
		TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(2300,"neha");
		tm.put(2000,"shalu");
		tm.put(5000,"b2");
		tm.put(1000,"chiku");
		tm.put(2400,"santo");
		tm.put(3000,"kittu");
		tm.put(3500,"chiku");
		
		tm.forEach((k,v)->System.out.println("key= "+k+" and Value= "+v));
		System.out.println("-------------------------------");
		//lastKey
		System.out.println("lastkey= "+tm.lastKey()+" and Value= "+tm.get(tm.lastKey()));
		//firstKey
		System.out.println("firsttkey= "+tm.firstKey()+" and Value= "+tm.get(tm.firstKey()));
		//less than
		System.out.println("-------------------------------");
		System.out.println(tm.keySet());
		System.out.println("-------------------------------");
		Set<Integer> lowerKeys=tm.headMap(3000).keySet();
		System.out.println(lowerKeys);
		//greater than equal to
		Set<Integer> higherKeys=tm.tailMap(3000).keySet();
		System.out.println(higherKeys);
		
		TreeMap<Integer,String>tm1=new TreeMap<>(Comparator.reverseOrder());
		tm1.put(2300,"neha");
		tm1.put(2000,"shalu");
		tm1.put(5000,"b2");
		tm1.put(1000,"chiku");
		tm1.put(2400,"santo");
		tm1.put(3000,"kittu");
		tm1.put(3500,"chiku");
		tm1.forEach((k,v)->System.out.println("key= "+k+" and Value= "+v));
		System.out.println(tm1);
	}
}