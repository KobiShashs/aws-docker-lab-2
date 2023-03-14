package com.jb.demo2.clr;

import com.jb.demo2.beans.Cat;
import com.jb.demo2.repos.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by kobis on 14 Mar, 2023
 */
@Component
@RequiredArgsConstructor
public class Init implements CommandLineRunner {

    private final CatRepository catRepository;

    @Override
    public void run(String... args) throws Exception {

        Cat c1 = Cat.builder().name("Mitzi").weight(5.5f).birthday(Date.valueOf(LocalDate.now().minusYears(3))).build();
        Cat c2 = Cat.builder().name("Pitzi").weight(2.5f).birthday(Date.valueOf(LocalDate.now().minusYears(1))).build();
        Cat c3 = Cat.builder().name("Litzi").weight(7.5f).birthday(Date.valueOf(LocalDate.now().minusYears(2))).build();
        Cat c4 = Cat.builder().name("Kitzi").weight(8.1f).birthday(Date.valueOf(LocalDate.now().minusYears(1))).build();
        Cat c5 = Cat.builder().name("Ditzi").weight(2.3f).birthday(Date.valueOf(LocalDate.now().minusYears(8))).build();

        catRepository.saveAll(List.of(c1,c2,c3,c4,c5));
        catRepository.findAll().forEach(System.out::println);
    }
}
