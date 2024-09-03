package com.ModelandoRelacionesComplejas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Speaker {
    @Id
    private String name;
    private int durationPresentation;
}
