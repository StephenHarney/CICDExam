package ie.atu.hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductID {

    private int productId;
    private String productName;
    private int quantity;
    private int warehouseId;
}
