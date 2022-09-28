package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "EVENT")
@NoArgsConstructor
@Data
public class Event {

    @Id
    private Long id;

    @ManyToOne
    private Person person;

    private Date startDate;

    private Date endDate;
}
