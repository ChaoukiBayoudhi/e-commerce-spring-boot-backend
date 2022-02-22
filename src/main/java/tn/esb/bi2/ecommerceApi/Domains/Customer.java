package tn.esb.bi2.ecommerceApi.Domains;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne (mappedBy = "customer",cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_address",referencedColumnName="id")
    private Address address;
}
