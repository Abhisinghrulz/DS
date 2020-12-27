package generics;

import java.util.LinkedHashMap;
import java.util.Map;

public class GenericsType1<K,V> {
    Map<K,V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Ab","Cd");
        map.put("De","Cg");
        GenericsType1<String,String> genericsType1 = new GenericsType1<>();
        genericsType1.setMap(map);
        System.out.println(genericsType1.getMap());

    }
}