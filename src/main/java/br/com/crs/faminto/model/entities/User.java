package br.com.crs.faminto.model.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

//@Entity
@Component
@Data
public class User {

    private long id;

    private String name;

    private String cpf;

    private int age;
}
