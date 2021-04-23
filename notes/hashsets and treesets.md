### HashSets and TreeSets
```java
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //Initialize a set as a new HashSet (no guaranteed order):
        Set<String> set = new HashSet<>();

        //Only unique elements can be added to the set (no duplicates):
        set.add("hello");
        set.add("world");
        set.add("one");
        set.add("two");

        //Iterating: this could result in any order:
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("------------------------------");

        //Do the same thing, but with a TreeSet (guaranteed order because the TreeSet sorts elements in their natural order):
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");

        //Iterating: this will always result in: 1, 2, 3, Hello, World
        Iterator<String> it2 = treeSet.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            System.out.println(next);
        }
    }
}
```
