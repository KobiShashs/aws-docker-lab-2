package com.jb.demo2.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * Created by kobis on 14 Mar, 2023
 */
@Entity
@NoArgsConstructor
@Builder
@Data
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float weight;
    private Date birthday;

    public Cat(int id, String name, float weight, Date birthday) {
        this(name, weight, birthday);
        this.id = id;

    }

    public Cat(String name, float weight, Date birthday) {
        this.name = name;
        this.weight = weight;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }
}
