package ie.atu.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Product-Service" , url ="http://localhost:8081")
public interface Product {

    @PostMapping("warehouse")
    String productDetails(@RequestBody ProductService productService);
}
