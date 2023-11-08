package ie.atu.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
     private ProductService productService;


     @Autowired
    public void addProduct(ProductService productService){
         this.productService = productService;

     }

     @PostMapping("/products")
     public Product Product(@RequestBody Product product){
                   productService.addProduct(product);
                   System.out.println("get product ID" + productService.getProductID());
                   return product;
     }
}
