package com.jb.demo2.controller;

import com.jb.demo2.beans.Cat;
import com.jb.demo2.exceptions.CatSystemException;
import com.jb.demo2.services.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kobis on 14 Mar, 2023
 */
@RestController
@RequestMapping("api/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;
    @GetMapping
    public List<Cat> getAllCats(){
        return catService.getAllCat();
    }

    @GetMapping("/{catId}")
    public Cat getAllCats(@PathVariable int catId) throws CatSystemException {
        return catService.getSingleCat(catId);
    }


}
