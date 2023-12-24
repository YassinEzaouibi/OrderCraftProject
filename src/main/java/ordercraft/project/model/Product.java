package ordercraft.project.model;

public class Product {
    private int productId;
    private String productName;
    private int productQuantity;
    private String productType;

    public Product(int productId, String productName, int productQuantity, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productname='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productType='" + productType + '\'' +
                '}';
    }
}
