package filterMap;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SomeMetod {


    public boolean isUnique(Map<String, String> map) {

       /* for (String str:map.values()) {

            int i =0;

            for (String str1:map.values()) {
                if (str.equals(str1) && ++i>1){
                    return false;
                }
            }
        }
        return true;*/

        return map.values().stream().distinct().count()==map.size();

        //map.values().stream().filter(s -> s.length() > 9).count();



        /*boolean isUnique = true;

        if (map.isEmpty()) {//Проверка на пустая/не пустая коллекция
        } else {

            Collection<String> values = map.values(); //Сформируем массив значений исходной мап-коллекции

            HashMap<String, Integer> hm = new HashMap<>();//Введем новую для подсчета совпадающих значений

            /////////////////////////////////////////////////////////
            //Проведем подсчет, если больше двух повторений по одному из элементов то выдаем false
            ////////////////////////////////////////////////////////
            for (String str : values) {
                if (hm.containsKey(str)) {
                    hm.put(str, hm.get(str) + 1);
                } else {
                    hm.put(str, 1);
                }
            }
            //////////////////////////////////////////////////////// Сформируем коллекцию и проведем подсчет, если
            // больше двух повторений по одному из элементов то выдаем false
            Collection<Integer> valuesHm = hm.values();

            for (Integer i : valuesHm) {
                if (i >= 2) {
                    isUnique = false;
                }
            }
        }
        if (!isUnique){
            System.out.println("В значениях не уникальные элементы");
        }else {
            System.out.println("Значения уникальны, либо неуказано ничего");
        }*/

        //return isUnique;
    }
}
