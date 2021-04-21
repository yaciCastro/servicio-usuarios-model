package com.correo.serviciousuariosmodel.model.dbentities;

import com.correo.serviciousuariosmodel.model.utils.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "direcciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true, exclude = "usuario")
public class Direccion extends BaseEntity {

    private String direccionLinea1;
    private String direccionLinea2;
    private String ciudad;
    private String provincia;
    private String pais;
    private String codigoPostal;

    private boolean direccionPrincipal;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST,
            optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
