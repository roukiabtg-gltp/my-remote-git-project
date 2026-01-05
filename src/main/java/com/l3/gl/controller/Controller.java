package com.l3.gl.controller;
import com.l3.gl.model.Product;
import com.l3.gl.model.User;
import com.l3.gl.view.Ui;
public class Controller {
private Ui view;
private Product product;
private User user;
public Controller(Product product, User user) {
this.product = product;
this.user = user;
}
public String sayHello() {
return "hello from controller";
}
private void showDetails() {
   
    System.out.println("--- Details from Controller ---");
    System.out.println("User Name: " + user.getName());
    System.out.println("User Email: " + user.getEmail());
    System.out.println("Product Name: " + product.getName());
    System.out.println("Product Price: " + product.getPrice());
}
}