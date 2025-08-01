package Lib;
/**
 * Abstract Data types that immutable for get Item information
 * This class is Final for protect Inherited and guaranteed Immutability 
 */

public final class Product {
    private final String productId;
    private final String productName;
    private final double price;
// Rep Invariant (RI):
//-productId and productName are not null or blank.
//price ต้อง >= 0
//
//Abstract function(Af):
//-Af(productId, ProductName, price) = A product with the ProductId, ProductNa and ProductPrice
//the giving Id, name and price.

/**
 * Check Rep Invariant is True   
 */
private void checkRep(){
    if (productId == null || productId.isBlank()){
        throw new RuntimeException("RI Violated: Id is not avalable");
    }
    if (productName == null || productName.isBlank()){
        throw new RuntimeException("RI Violated: this name is not avalable");
    }
    if (price < 0){
        throw new RuntimeException("RI Violated: This price is not allows");
    }
}
/**
 * Create Object Product
 * @param productId is not null or blank
 * @param productName is not null or blank
 * @param price is not negative
 */
public Product(String productId, String productName, double price){
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    checkRep(); // alway check right when create.
}
public String getProductId() {return productId;}

public String getProductName() {return productName;}

public double getPrice() {return price;}
/**
 * Compare Product 2 Item by use ProductId
 * @param obj that want to compare
 * @return true if productId is the same
 */
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Product product = (Product) obj;
    return productId.equals(product.productId);
}
}
