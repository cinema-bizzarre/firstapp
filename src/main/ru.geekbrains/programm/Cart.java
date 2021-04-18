import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private final List<Products> cart;
    private final ProductsRepository productRepository;

    public Cart(List<Products> cart, ProductsRepository productRepository) {
        this.cart = cart;
        this.productRepository = productRepository;
    }

    public void addCart(long id) {
        cart.add(productRepository.getProductId(id));
    }
    public void deleteCart(long id) {
        cart.remove(productRepository.getProductId(id));
    }

    public void searchCart(){
        for (Products product : cart) {
            System.out.println(product);
        }
    }
}
