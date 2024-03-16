package com.dh.ClinicMVC.service;

import com.dh.ClinicMVC.entity.Turno;

import java.util.List;

public interface ITurnoService {
    Turno guardar(Turno turno);
    List<Turno> listarTodos();

    Turno buscarPorId(Integer id);

    void eliminar(Long id);

    void actualizar(Turno turno);
}
