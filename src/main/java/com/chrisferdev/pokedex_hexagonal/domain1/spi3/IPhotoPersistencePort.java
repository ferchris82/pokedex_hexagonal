package com.chrisferdev.pokedex_hexagonal.domain1.spi3;

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Photo;

import java.util.List;

public interface IPhotoPersistencePort {
    Photo savePhoto(Photo photo);
    List<Photo> getAllPhotos();
    Photo getPhoto(String photoId);
    void updatePhoto(Photo photo);
    void deletePhoto(String photoId);
}
