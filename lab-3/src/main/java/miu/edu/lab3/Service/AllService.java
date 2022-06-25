package miu.edu.lab3.Service;
import miu.edu.lab3.DTO.ProductDto;
import miu.edu.lab3.DTO.ReviewDto;
import miu.edu.lab3.Domain.Category;
import miu.edu.lab3.Domain.Product;

import java.util.List;

public interface AllService {
    List<ProductDto> getByPriceIsGreaterThan(double minprice);
    List<ProductDto> getByCategoryAndPriceIsLessThan(Category cat, double maxprice);
    List<ProductDto> getByName(String name);
    List<ProductDto> getAll();

    List<ReviewDto> findAllReviewsById(int productid);
     void add(Product product);
    public Product update( int id, Product product);

    public void deleteById(int id);
    public ProductDto findById(int productid);


}
