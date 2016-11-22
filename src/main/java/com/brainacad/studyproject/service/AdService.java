package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.domain.Ad;

import java.util.Collection;

/**
 * Created by Alexander on 11/20/2016.
 */
public interface AdService {

    Collection<Ad> getAllAds();
    Ad getAdById(int id);
    int addAd(Ad ad);
    boolean update(Ad ad);
    boolean delete(int id);
}
