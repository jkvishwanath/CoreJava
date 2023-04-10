package Collections_6_Internal_Working_Of_Collection_Framework.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Sample1 {
    public static void main(String[] args) {
        HashMap<Integer,String>  hashMap= new HashMap<>();
        hashMap.put(101,"Viswa");
        hashMap.put(101,"Vissu");
        System.out.println(hashMap.get(101));

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(101);
        hashSet.add(102);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(101,"sa");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(11);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("as");
        javax.xml.transform.TransformerFactory transformerFactory;

    }
}
