package br.com.edward.restfull.service;

import java.util.List;

import br.com.edward.restfull.domain.Cavalo;
import br.com.edward.restfull.model.CavaloModel;

public interface CavaloService {

    Cavalo consultar(Long id);
    Cavalo cadastrar(CavaloModel model);
    List<Cavalo> mostrarTudo();
    Cavalo remover(Long id);
    Cavalo alterar(CavaloModel model);
}
