package miu.edu.lab3.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Review {
     @Id
    @GeneratedValue
    private int id;
     private String comment;
     @JsonBackReference
     @JoinColumn
     @ManyToOne
     private Product product;
}
