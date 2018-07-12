import java.util.*;
public class Even {
    public static void main(String... args)
    {
    
    Vector<Integer> vec= new Vector<>();
    vec.add(2);
    vec.add(4);
    vec.add(3);
    vec.add(6);
    vec.add(7);
    vec.add(8);
    
    System.out.println("Vector:"+vec);
    System.out.println("Even Elements are:");
    
    Enumeration<Integer> en=vec.elements();
    while (en.hasMoreElements())
    {   int i=en.nextElement();
        if (i%2==0)
        {System.out.print(i+" ");
        }
    
    }
    
    
    
    
    
    }
}

