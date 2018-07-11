import java.util.*;import java.util.*;
class Set

{
public static void main(String... args)

{

	Set<> list = new HashSet<>();     //ArrayList without generics
 
        list.add("ZERO");    //adding string type object
 
        list.add(1);        //adding primitive int type
 
        list.add(20.24);    //adding primitive double type

	ArrayList<Object> list2 = new ArrayList(); 
 	
        list2.add(new Float(23.56));   //Adding Float wrapper type object
 
        list2.add(20.24);      //Adding Long wrapper type object
 	
        System.out.println(list);     //Output : [ZERO, 1, 20.24, 23.56, 25]
	 System.out.println(list2);  

	 System.out.println(list.addAll(1,list2));  
	 System.out.println(list2); 

	System.out.println(list.contains(1));
	System.out.println(list.isEmpty());   
	
}


}

