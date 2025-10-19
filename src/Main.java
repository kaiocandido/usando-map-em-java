import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "11111111");

        cookies.remove("email");
        cookies.put("phone", "não tem");

        System.out.println("contains key 'phone': " + cookies.containsKey("phone"));
        System.out.println("valor da chave: " + cookies.get("phone"));
        System.out.println("pegando valor inexistente: " + cookies.get("email"));
        System.out.println("tamanho: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
        */

        Map<Product, Double> cookies = new HashMap<>();

        Product p1 = new Product("Tv", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        cookies.put(p1, 100000.0);
        cookies.put(p2, 200000.0);
        cookies.put(p3, 150000.0);

        Product ps = new Product("Tv", 900.00);

        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));


    }
}