package tn.esb.bi2.ecommerceApi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esb.bi2.ecommerceApi.Repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepos;
}
