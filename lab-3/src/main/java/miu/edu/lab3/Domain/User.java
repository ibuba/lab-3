package miu.edu.lab3.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
   //bidirectional
@JsonBackReference
    @OneToOne
    private Address address;
@JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Product> products;



}
