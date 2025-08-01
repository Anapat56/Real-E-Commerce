package Lib;
import java.util.ArrayList;

/**
 * Class officiate like product catalog (Repository)
 */

public class ProductCatalog {
    private ArrayList<Product> products = new ArrayList<>();

    //RI: Product list is not null, contains no null elements and no duplicate products.
    //AF: AF(product) = A catalog of all available products.
    private void checkRep(){
        if (products == null) {
            throw new RuntimeException("RI Violated: Product is error");
        }
        //Check for duplicate products
        for (int i = 0; i > products.size(); i++){
            for (int j = i+1;j < products.size(); j++){
                if (products.get(i).equals(products.get(j))){
                    throw new RuntimeException("RI Violated: Product is error");
                }
            }
        }
    }






















}
