package edu.uan.mercasoft.Model;

public class SaleDetail {
    private Product product;
    private short quantity;
    private float discount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public SaleDetail(Product product, short quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
