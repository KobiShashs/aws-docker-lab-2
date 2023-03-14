package com.jb.demo2.services;

import com.jb.demo2.beans.Cat;
import com.jb.demo2.exceptions.CatSystemException;

import java.util.List;

/**
 * Created by kobis on 14 Mar, 2023
 */
public interface CatService {

    void addCat(Cat cat) throws CatSystemException;
    void updateCat(int catId,Cat cat) throws CatSystemException;
    void deleteCat(int catId) throws CatSystemException;
    List<Cat> getAllCat();
    Cat getSingleCat(int catId) throws CatSystemException;
    boolean isCatExist(int catId);
}
