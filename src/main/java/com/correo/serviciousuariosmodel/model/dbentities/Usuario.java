package com.correo.serviciousuariosmodel.model.dbentities;

import com.correo.serviciousuariosmodel.model.utils.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@EqualsAndHashCode(callSuper = true, exclude = "direcciones")
public class Usuario extends BaseEntity {

    private String nombre;
    private String apellido;
    private String numeroDeTelefono;

    @Column(unique = true, nullable = false)
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String passwordHash;



    @OneToMany(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        mappedBy = "usuario")
    private Set<Direccion> direcciones;
}
