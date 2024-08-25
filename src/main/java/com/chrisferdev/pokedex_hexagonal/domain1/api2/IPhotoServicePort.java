package com.chrisferdev.pokedex_hexagonal.domain1.api2;

import com.chrisferdev.pokedex_hexagonal.domain1.model1.Photo;

import java.util.List;

public interface IPhotoServicePort {
    Photo savePhoto(Photo photo);
    List<Photo>getAllPhotos();
    void updatePhoto(Photo photo);
    void deletePhoto(String photoId);
}
