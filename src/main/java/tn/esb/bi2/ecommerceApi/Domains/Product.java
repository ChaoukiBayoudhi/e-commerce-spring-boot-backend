package tn.esb.bi2.ecommerceApi.Domains;


import javax.persistence.Lob;
import java.time.LocalDate;

public class Product {
    private Long id;
    private String label;
    private double price;
    private LocalDate expirationDate;
    private LocalDate fabricationDate;
    private int stock;
    private String description;
    @Lob
    private byte[] image;
}
