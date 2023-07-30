import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //List
        List<String> foods = new ArrayList<>();
        foods.add("pizza");
        foods.add("hamburger");
        foods.add("fried chicken");

        System.out.println(foods.size());
        System.out.println(foods.get(0));
        System.out.println(foods.get(1));
        System.out.println(foods.get(2));


        //Map
        Map<String, String> foodsMap = new HashMap<>();
        foodsMap.put("pizza","パン生地の上にチーズをのせて焼いた食べ物");
        foodsMap.put("hamburger","パンの間に肉や野菜やチーズをはさんだ食べ物");
        foodsMap.put("fried chicken","鶏肉に小麦粉をまぶして油であげた食べ物");

        System.out.println(foodsMap.get("pizza"));
        System.out.println(foodsMap.get("hamburger"));
        System.out.println(foodsMap.get("fried chicken"));


        //例外処理
        List<String> greeting = new ArrayList<>();
        greeting.add("Hello world");
        greeting.add("Nice to meet you");
        greeting.add(null);
        greeting.add("Long time no see");

        for(int i = 0; i<=3; i++){
            if(greeting.get(i) != null){
                System.out.println(greeting.get(i));
                System.out.println(greeting.get(i).length());
            }else{
                System.out.println("greeting.get(" + i + ") is null");
            }

        }
    }

}
