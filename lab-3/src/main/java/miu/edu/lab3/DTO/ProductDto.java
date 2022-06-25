package miu.edu.lab3.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.lab3.Domain.Category;
import miu.edu.lab3.Domain.Product;

import javax.persistence.ManyToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private int id;
    private String name;
    private double price;
    private double rating;
    private Category category;


//  public ProductDto toDto(Product product){
//      ProductDto dto= new ProductDto();
//       dto.setId(product.getId());
//       dto.setName(product.getName());
//     dto.setRating(product.getRating());
//      dto.setCategory(product.getCategory());
//       return dto;
////        }
//        public Product toEntity(ProductDto pdto){
//        Product pro= new Product();
//        pro.setId(pdto.getId());
//        pro.setPrice(pdto.getPrice());
//        pro.setRating(pdto.getRating());
//        pro.setCategory(pdto.getCategory());
//        return pro;
//
//    }

}
