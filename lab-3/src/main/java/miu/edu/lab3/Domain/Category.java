package miu.edu.lab3.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @JsonManagedReference
    @OneToMany
    private List<Product> products;


}
