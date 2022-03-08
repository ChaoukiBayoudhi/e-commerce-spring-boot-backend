package tn.esb.bi2.ecommerceApi.Domains;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Command {
    @EmbeddedId //clé primaire composite
    private CommandId id;
    @Column(columnDefinition = "int default 1")
    private Integer quantity;
    @Column(name = "command_date")
    private LocalDate date;

    @ManyToOne
    @MapsId("idProduct")//cette instance de product est lié à une partie
    // de la clé primaire composite (idProduct)
    private Product product;

    @ManyToOne
    @MapsId("idCustomer")
    private Customer customer;

    @OneToMany(mappedBy = "command",cascade = CascadeType.ALL)
    private Set<Delivery> commandDeliveries=new HashSet<>();

}
