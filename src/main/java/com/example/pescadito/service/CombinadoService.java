package com.example.pescadito.service;

import com.example.pescadito.model.Combinado;
import com.example.pescadito.repository.CombinadoRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CombinadoService {
    private final CombinadoRepository combinadoRepository;

    public CombinadoService(CombinadoRepository combinadoRepository){
        this.combinadoRepository = combinadoRepository;
    }

    //Listar
    public List<Combinado> listarTodas(){
        return combinadoRepository.findAll();
    }

    //obtener por id
    public Optional<Combinado> buscarPorId(Integer id){
        return combinadoRepository.findById(id);

    }

    //crear
    public Combinado crearCombinado(Combinado combinado){
        return combinadoRepository.save(combinado);
    }

    //Actualizar
    public Combinado actualizarCombinado(Integer id, Combinado combinado){
        combinado.setId(id);
        return combinadoRepository.save(combinado);
    }

    //Eliminar
    public void eliminarCombinado (Integer id){
        combinadoRepository.deleteById(id);
    }

    //Buscar por disponibilidad
    public List<Combinado> buscarPorDisponibilidad(Boolean disponible, Combinado combinado){
        combinado.setDisponible(disponible);
        return combinadoRepository.findAll();

    }

}









