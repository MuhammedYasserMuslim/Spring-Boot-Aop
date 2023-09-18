package com.spring.model;


import com.spring.model.enums.Framework;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "devolpers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Devolper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dev_id")
    private Byte id;

    @NotBlank
    @Column(name = "dev_name" ,nullable = false,length = 21)
    private String name;

    @Column(name="framework")
    @Enumerated(EnumType.STRING)
    private Framework framework;


    @Column(name = "dev_salary")
    private double salary;
}
