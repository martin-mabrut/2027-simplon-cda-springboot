package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.ImageDTO;
import fr.simplon.domedespuys.Model.Image;
import fr.simplon.domedespuys.Service.Interfaces.IImageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageServiceImpl implements IImageService {

    public Image createImage(ImageDTO dto) {
        Image image = new Image();
        image.setPath(dto.getPath());
        image.setExtension(".png");
        image.setDefault(dto.isDefault());
        image.setProduct(null);
        return image;
    }

    @Override
    public boolean delete(String id) {
        return true;
    }
}
