package com.dh.ClinicMVC.service.implementation;

import com.dh.ClinicMVC.entity.Turno;
import com.dh.ClinicMVC.repository.ITurnoRepository;
import com.dh.ClinicMVC.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService implements ITurnoService {

    private ITurnoRepository turnoRepository;
    @Autowired
    public TurnoService(ITurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    @Override
    public Turno guardar(Turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public List<Turno> listarTodos() {
        return null;
    }

    @Override
    public Turno buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public void actualizar(Turno turno) {

    }
}
