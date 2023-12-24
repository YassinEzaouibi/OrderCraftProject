package ordercraft.project.service;

public class OrderProduct {
    int idOrderProduct;
    int idOrder;
    int idProduct;
    int quantityProductOrdered;

    public OrderProduct(int idOrderProduct, int idOrder, int idProduct, int quantityProductOrdered) {
        this.idOrderProduct = idOrderProduct;
        this.idOrder = idOrder;
        this.idProduct = idProduct;
        this.quantityProductOrdered = quantityProductOrdered;
    }

    public int getIdOrderProduct() {
        return idOrderProduct;
    }

    public void setIdOrderProduct(int idOrderProduct) {
        this.idOrderProduct = idOrderProduct;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getQuantityProductOrdered() {
        return quantityProductOrdered;
    }

    public void setQuantityProductOrdered(int quantityProductOrdered) {
        this.quantityProductOrdered = quantityProductOrdered;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "idOrderProduct=" + idOrderProduct +
                ", idOrder=" + idOrder +
                ", idProduct=" + idProduct +
                ", quantityProductOrdered=" + quantityProductOrdered +
                '}';
    }
}
