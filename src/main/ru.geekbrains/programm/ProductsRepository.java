import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductsRepository {
    private List<Products> products;

    public void init (){
        products = new ArrayList<>(Arrays.asList(
                new Products(1,"Платье", 5000),
                new Products(2,"Кофта", 1500),
                new Products(3,"Брюки", 2500),
                new Products(4,"Джинсы", 3000),
                new Products(5,"Юбка", 2000)

        ));
    }

    public Products getProductId(long id){
        Products list = null;
        for (Products product : products) {
            if (product.getId() == id){
                list = product;
            }
        }
        return list;
    }
}
