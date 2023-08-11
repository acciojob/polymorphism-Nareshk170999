package com.driver;

public class Main {
  public static void main(String [] args){
    Product p = new Product();
    int result1 = p.Product(2,3);
      System.out.println(result1);
    int result2 = p.Product(2,5,7);
      System.out.println(result2);
    double result3 = p.Product(2.5,3.5);
      System.out.println(result3);
  }
}
class Product{
        public int Product(int x,int y){
                return x*y;
        }
        public int Product(int x,int y,int z){
                return x*y*z;
        }
        public double Product(double x,double y){
                return x*y;
        }
}
