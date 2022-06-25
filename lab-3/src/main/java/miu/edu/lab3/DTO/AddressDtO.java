package miu.edu.lab3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.lab3.Domain.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDtO {

    private int id;
    private String street;
    private String zip;
    private String city;
    private User user;



}
