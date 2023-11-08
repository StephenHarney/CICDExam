package ie.atu.hello;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
   private ArrayList<Product> warehouse =new ArrayList<>();


   public void addProduct(Product product){
       warehouse.add(product);
   }

   public ArrayList<Product> getProductID(){
      return warehouse;
   }






}
