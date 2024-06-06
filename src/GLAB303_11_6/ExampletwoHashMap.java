package bootcamp11.Assignments.GLAB303_11_6;

import java.util.HashMap;

public class ExampletwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();

        // Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);  // {Key2=Motorola, null=Sony, Key1=Lenovo, Key4=null, Key3=Nokia}

        // getting size of Hashmap
        System.out.println("Size of original Map is:" + newHashMap.size()); // 5

        // copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mapping=" + copyHashMap);   // {Key2=Motorola, null=Sony, Key1=Lenovo, Key4=null, Key3=Nokia}

        // Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);         // Sony
        System.out.println("copyHashMap after removing null key = " + copyHashMap); // {Key2=Motorola, Key1=Lenovo, Key4=null, Key3=Nokia}
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());         // 4
    }
}
