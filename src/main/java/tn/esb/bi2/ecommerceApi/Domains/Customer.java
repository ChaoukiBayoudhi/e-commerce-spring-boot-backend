package tn.esb.bi2.ecommerceApi.Domains;

import lombok.*;
import tn.esb.bi2.ecommerceApi.Enumerations.CustomerType;

import javax.persistence.*;
import java.util.Objects;

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
    @Enumerated(EnumType.STRING)
    //cette annotation sert à informer l'ORM du type de l'enumeration lors de la transformation du code en SQL
    private CustomerType type;

    @OneToOne (mappedBy = "customer",cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_address",referencedColumnName="id")
    private Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, phoneNumber, type, address);
    }
}
