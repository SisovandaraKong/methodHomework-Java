package BestPractices;

import BestPractices.model.Product;
import BestPractices.model.ProductCategory;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Product coca = new Product(1, UUID.randomUUID().toString(),"Coca","This is coca", LocalDate.now(),LocalDate.of(2040,3,12),new String[]{"https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Coca_Cola_Flasche_-_Original_Taste.jpg/960px-Coca_Cola_Flasche_-_Original_Taste.jpg"},new ProductCategory[]{ProductCategory.DRINK});
        System.out.println(coca);
    }
}
