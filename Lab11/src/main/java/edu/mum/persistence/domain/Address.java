package edu.mum.persistence.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String street;
    @NotEmpty
    private String city;
    @NotEmpty
    @Size(min = 2, max = 2, message = "{address.state.size}")
    private String state;
    @NotEmpty
    private String zipcode;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Employee employee;


}
