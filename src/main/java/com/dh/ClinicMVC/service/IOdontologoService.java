package com.dh.ClinicMVC.service;

import com.dh.ClinicMVC.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {
    Odontologo guardar (Odontologo odontologo);

    List<Odontologo> listarTodos();

    Odontologo buscarPorId(Long id);

    void actualizar(Odontologo odontologo);
}
