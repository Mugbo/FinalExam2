package ie.atu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    private WarehouseService warehouseService;

    @Autowired
    public void setWarehouseService(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }
    @PostMapping("/warehouse"){
        public String addProduct(@RequestBody WarehouseDetails warehouseDetails){
            return warehouseService.addProduct(warehouseDetails);
        }
    }

}
