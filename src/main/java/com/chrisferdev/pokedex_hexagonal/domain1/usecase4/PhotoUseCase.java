package com.chrisferdev.pokedex_hexagonal.domain1.usecase4;

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Photo;
import com.chrisferdev.pokedex_hexagonal.domain1.spi3.IPhotoPersistencePort;

import java.util.List;

public class PhotoUseCase implements IPhotoPersistencePort {
    private final IPhotoPersistencePort photoPersistencePort;

    public PhotoUseCase(IPhotoPersistencePort photoPersistencePort) {
        this.photoPersistencePort = photoPersistencePort;
    }

    @Override
    public Photo savePhoto(Photo photo) {
        return photoPersistencePort.savePhoto(photo);
    }

    @Override
    public List<Photo> getAllPhotos() {
        return photoPersistencePort.getAllPhotos();
    }

    @Override
    public Photo getPhoto(String photoId) {
        return photoPersistencePort.getPhoto(photoId);
    }

    @Override
    public void updatePhoto(Photo photo) {
        photoPersistencePort.updatePhoto(photo);
    }

    @Override
    public void deletePhoto(String photoId) {
        photoPersistencePort.deletePhoto(photoId);
    }
}
