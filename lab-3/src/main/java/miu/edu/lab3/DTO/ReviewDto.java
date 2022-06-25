package miu.edu.lab3.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.lab3.Domain.Review;
import miu.edu.lab3.Domain.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private int id;
    private String comment;
    private User user;
}
