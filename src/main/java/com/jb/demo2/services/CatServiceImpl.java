package com.jb.demo2.services;

import com.jb.demo2.beans.Cat;
import com.jb.demo2.exceptions.CatSystemException;
import com.jb.demo2.exceptions.Error;
import com.jb.demo2.repos.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kobis on 14 Mar, 2023
 */
@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService{

    private final CatRepository catRepository;

    @Override
    public void addCat(Cat cat) throws CatSystemException {
        int id = cat.getId();
        if(catRepository.existsById(id)){
            throw new CatSystemException(Error.ID_ALREADY_FOUND);
        }
        catRepository.save(cat);
    }

    @Override
    public void updateCat(int catId, Cat cat) throws CatSystemException {
        if(!catRepository.existsById(catId)){
            throw new CatSystemException(Error.ID_NOT_FOUND);
        }
        cat.setId(catId);
        catRepository.saveAndFlush(cat);
    }

    @Override
    public void deleteCat(int catId) throws CatSystemException {
        if(!catRepository.existsById(catId)){
            throw new CatSystemException(Error.ID_NOT_FOUND);
        }
        catRepository.deleteById(catId);
    }

    @Override
    public List<Cat> getAllCat() {
        return catRepository.findAll();
    }

    @Override
    public Cat getSingleCat(int catId) throws CatSystemException {
        return catRepository.findById(catId).orElseThrow(()->new CatSystemException(Error.ID_NOT_FOUND));
    }

    @Override
    public boolean isCatExist(int catId) {
        return catRepository.existsById(catId);
    }
}
