package maratonajava.javacore.Ycolecoes.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    static void main(String[] args) {
        //Assim como no HashSet existe o LinkedHashSet, no HashMap
        //existe o LinkedHashMap, que mantém a ordem de inserção dos dados.
        Map<String, String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        System.out.println(map);
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("-----------------");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
