package br.com.edward.restfull.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.CavaloModel;
import br.com.edward.restfull.service.CavaloService;

@RestController
@RequestMapping("/cavalo")
public class ProdutoController {

    @Autowired
    private CavaloService produtoService;
    
    @PostMapping("/cadastrar")
    public CavaloModel cadastrar(@RequestBody CavaloModel model) {
        return new CavaloModel(produtoService.cadastrar(model));
    }
    
    @PutMapping("/alterar")
    public CavaloModel alterar(@RequestBody CavaloModel model) {
        return new CavaloModel(produtoService.alterar(model));
    }
    
    @GetMapping("/mostrar-tudo")
    public List<CavaloModel> mostrarTudo() {
        return produtoService.mostrarTudo().stream().map(CavaloModel::new).collect(Collectors.toList());
    }
    
    @DeleteMapping("/remover")
    public CavaloModel remover(@RequestParam Long id) {
        return new CavaloModel(produtoService.remover(id));
    }
    
    @GetMapping("/consultar")
    public CavaloModel consultar(@RequestParam Long id) { 	
        return new CavaloModel(produtoService.consultar(id));
    }
}
