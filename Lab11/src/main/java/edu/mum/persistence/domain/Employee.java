package edu.mum.persistence.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private int number;

    @NotEmpty
    private String firstname;

    @NotEmpty
    @Size(min = 4, max = 50, message = "{Size.name.validation}")
    private String lastname;

    @NotNull
    @Past
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate birthdate;

    @NotNull
    int salary;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
}
