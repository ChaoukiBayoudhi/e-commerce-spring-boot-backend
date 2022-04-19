package tn.esb.bi2.ecommerceApi.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esb.bi2.ecommerceApi.Domains.Product;
import tn.esb.bi2.ecommerceApi.Services.ProductService;

@RestController
@RequestMapping("/products")
//The path will be http://localhost:9592/products
public class ProductController {
    @Autowired
    private ProductService productServ;
    @PostMapping("/add")
    public Product addNewProduct(Product p) throws Exception {
        return productServ.addProduct(p);
    }
}
