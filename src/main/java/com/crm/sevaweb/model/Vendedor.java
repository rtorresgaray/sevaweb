package com.crm.sevaweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendedor")
public class Vendedor {
    
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="id_perssona")
    private Long idPersona;
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
