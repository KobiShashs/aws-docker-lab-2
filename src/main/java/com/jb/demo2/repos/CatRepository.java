package com.jb.demo2.repos;

import com.jb.demo2.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kobis on 14 Mar, 2023
 */
public interface CatRepository extends JpaRepository<Cat,Integer> {
}
