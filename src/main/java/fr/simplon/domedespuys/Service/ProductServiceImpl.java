package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.ImageDTO;
import fr.simplon.domedespuys.Dto.ProductDTO;
import fr.simplon.domedespuys.Model.Image;
import fr.simplon.domedespuys.Model.Product;
import fr.simplon.domedespuys.Repository.BrandRepository;
import fr.simplon.domedespuys.Repository.ImageRepository;
import fr.simplon.domedespuys.Repository.ProductRepository;
import fr.simplon.domedespuys.Service.Interfaces.IProductService;
import fr.simplon.domedespuys.utils.Slugger;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService {

    private ProductRepository productRepository;
    private ImageServiceImpl imageService;
    private BrandRepository brandRepository;
    private BrandServiceImpl brandService;
    private ImageRepository imageRepository;
    private Slugger slugger;

    @Override
    public Product create(ProductDTO dto) {
        Product product = new Product();
        return this.dtoToProductAndPersist(product, dto);
    }

    @Override
    public Product update(String id, ProductDTO dto) {
        long finalId = Long.parseLong(id);
        Product product = productRepository.findById(finalId).orElse(null);

        if(product != null){
            return this.dtoToProductAndPersist(product, dto);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    @Override
    public Product getById(String id) {
        long finalId = Long.parseLong(id);
        Product product = productRepository.findById(finalId).orElse(null);
        return product;
    }

    @Override
    public boolean delete(String id) {
        long finalId = Long.parseLong(id);
        if (productRepository.existsById(finalId)){
            productRepository.deleteById(finalId);
            return true;
        } else {
            return false;
        }
    }


    public Product dtoToProductAndPersist(Product product, ProductDTO dto) {

        product.setLabel(dto.getLabel());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setSlug(slugger.slugify(dto.getLabel()));
        product.setCreatedAt(LocalDateTime.now());
        product.setBrand(brandService.getById(dto.getBrandId()));

        productRepository.saveAndFlush(product);

        for (ImageDTO iDto : dto.getImages()) {
            Image img  = this.imageService.createImage(iDto);
            img.setProduct(product);
            imageRepository.save(img);
        }

        imageRepository.flush();


        return product;
    }


}
