package ie.atu;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class WarehouseService {
    private final WarehouseService warehouseService;

    public String addProduct( int productId,  String productName,  int quantity,  int warehouseId, String location, int capacity ){
     String Message = null;

        if(capacity > 0){
            Message = "Product added";
        } else if (capacity <= 0 ) {
            Message = "No space available to add product";
        }

        return Message;

    }
}
