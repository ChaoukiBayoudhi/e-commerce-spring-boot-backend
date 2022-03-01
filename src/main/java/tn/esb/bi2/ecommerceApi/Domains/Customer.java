package tn.esb.bi2.ecommerceApi.Domains;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @OneToOne (mappedBy = "customer",cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_address",referencedColumnName="id")
    private Address address;
}
