package lesson_12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 1 - добавление элементов
        hashMap.put("Zenit", 20);
        hashMap.put("Spartak", 18);
        hashMap.put("Rubin", 15);
        hashMap.put("Rubin", 333);
        hashMap.put("Lokomotiv", 10);
        hashMap.put(null, 111);

        // 2 - проверка наличия ключа (наименование объекта)
        System.out.println(hashMap.containsKey("Zenit"));
        System.out.println(hashMap.containsKey("CSKA"));

        // 3 - проход по коллекции
        for (Map.Entry <String, Integer> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        // 4 - печать ключей

        // 5 - вернуть значение по ключу

        // 6 - удаление


        }
    }

