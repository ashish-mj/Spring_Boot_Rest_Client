package com.rakuten.Rest_Client;



import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
private int productId;
private String productName;
private float price;
public Product() {
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
}