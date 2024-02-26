package serviceImpl;

import service.ProductService;

public class ProductServiceImpl implements ProductService {
    private static ProductService instance = new ProductServiceImpl();

    private ProductServiceImpl(){}

    public static ProductService getInstance(){
        return instance;
    }

}
