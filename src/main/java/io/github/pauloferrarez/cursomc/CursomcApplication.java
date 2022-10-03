package io.github.pauloferrarez.cursomc;

import io.github.pauloferrarez.cursomc.domain.model.Categoria;
import io.github.pauloferrarez.cursomc.domain.model.Produto;
import io.github.pauloferrarez.cursomc.persistance.repository.CategoriaRepository;
import io.github.pauloferrarez.cursomc.persistance.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria categoria1 = new Categoria(null, "Informática");
        Categoria categoria2 = new Categoria(null, "Escritório");

        Produto prod1 = new Produto(null, "Computador", 2000.00);
        Produto prod2 = new Produto(null, "Impressora", 800.00);
        Produto prod3 = new Produto(null, "Mouse", 80.00);

        categoria1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
        categoria2.getProdutos().add(prod2);

        prod1.getCategorias().addAll(List.of(categoria1));
        prod2.getCategorias().addAll(Arrays.asList(categoria1, categoria2));
        prod3.getCategorias().addAll(List.of(categoria1));

        categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2));
        produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));

    }
}
