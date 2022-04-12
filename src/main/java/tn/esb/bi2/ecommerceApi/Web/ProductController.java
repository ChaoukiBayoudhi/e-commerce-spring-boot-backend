package tn.esb.bi2.ecommerceApi.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esb.bi2.ecommerceApi.Services.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productServ;
}
