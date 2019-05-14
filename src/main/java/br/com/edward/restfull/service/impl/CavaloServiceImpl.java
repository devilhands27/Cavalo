package br.com.edward.restfull.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.edward.restfull.domain.Cavalo;
import br.com.edward.restfull.model.CavaloModel;
import br.com.edward.restfull.repository.CavaloRepository;
import br.com.edward.restfull.service.CavaloService;

@Transactional
@Service
public class CavaloServiceImpl implements CavaloService {

    @Autowired
    private CavaloRepository produtoRepository;
    
    @Override
    public Cavalo consultar(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @Override
    public Cavalo cadastrar(CavaloModel model) {
        
        return produtoRepository.save(new Cavalo(model));
    }

    @Override
    public List<Cavalo> mostrarTudo() {
        return produtoRepository.findAll();
    }

    @Override
    public Cavalo remover(Long id) {
        Cavalo produto = this.consultar(id);
        if (Objects.nonNull(produto)) {
            produtoRepository.delete(produto);
        }
        return produto;
    }

    @Override
    public Cavalo alterar(CavaloModel model) {
        Cavalo produto = this.consultar(model.getId());
        if (Objects.nonNull(produto)) {
            produto.alterar(model);
            return produtoRepository.save(produto);
        }
        return produto;
    }
}
