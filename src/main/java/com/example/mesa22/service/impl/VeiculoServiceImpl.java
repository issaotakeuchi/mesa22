package com.example.mesa22.service.impl;

import com.example.mesa22.model.Veiculo;
import com.example.mesa22.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(new Veiculo("toyota","preto"), new Veiculo("honda", "prata"));
    }
}
