package miu.edu.lab3.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jmx.export.annotation.ManagedResource;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private double rating;
    @JsonBackReference
    @ManyToOne
    private Category category;
    @JsonBackReference
    @ManyToOne
    private User user;
    @JsonManagedReference
    @OneToMany(mappedBy = "product")
    List<Review> reviews;

}
