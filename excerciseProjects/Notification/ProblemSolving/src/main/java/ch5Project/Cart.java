package ch5Project;

import java.util.Scanner;

class Buying{
    private String myCart;
    private int addCart;
    private int subtractCart;

    public void addItemToMyCart(String itemName){
        this.myCart=itemName;
    }
    public int addToCart(){
        return addCart++;
    }

    /**
     * if this method return 0 ,that mean addCart is less than 0 and that is invalid
     * @return
     */
    public int subtractFromCart(){
        if(addCart>0){
         this.addCart=this.addCart-1;
         return this.addCart;
        }else{
            return 0;
        }
    }

    public String getMyCart() {
        return myCart;
    }

    public int getAddCart() {
        return addCart;
    }

    public int getSubtractCart() {
        return subtractCart;
    }
}
public class Cart {
    public static void main(String[] args) {
        Buying cart=new Buying();
        cart.addItemToMyCart("Apple");
        cart.addToCart();
        cart.addToCart();
        cart.subtractFromCart();
        System.out.println("In your cart :");
        System.out.println(cart.getMyCart() +"*"+cart.getAddCart());
        cart.addToCart();
        System.out.println(cart.getMyCart() +"*"+cart.getAddCart());

    }
}
