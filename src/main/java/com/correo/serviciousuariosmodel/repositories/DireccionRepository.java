package com.correo.serviciousuariosmodel.repositories;

import com.correo.serviciousuariosmodel.model.dbentities.Direccion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    Page<Direccion> findAllByUsuarioId(Long usuarioId, Pageable pageable);
}
