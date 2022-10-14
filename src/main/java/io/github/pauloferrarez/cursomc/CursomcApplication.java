package io.github.pauloferrarez.cursomc;

import io.github.pauloferrarez.cursomc.domain.model.*;
import io.github.pauloferrarez.cursomc.domain.model.enums.TipoClienteEnum;
import io.github.pauloferrarez.cursomc.persistance.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Método pra fazer testes rapido e fácil

        if (categoriaRepository.findById(1).orElse(null) == null) {

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


            Estado estado1 = new Estado(null, "São Paulo", "SP");
            Estado estado2 = new Estado(null, "Minas Gerais", "MG");

            Cidade cidade1 = new Cidade(null, "Barra Bonita", estado1);
            Cidade cidade2 = new Cidade(null, "Jaú", estado1);
            Cidade cidade3 = new Cidade(null, "Belo Horizonte", estado2);

            estadoRepository.saveAll(Arrays.asList(estado1, estado2));
            cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));

            Cliente cliente1 = new Cliente(null, "Paulinho", "paul@da.com",
                    "40028922", TipoClienteEnum.PESSOA_FISICA);
            Cliente cliente2 = new Cliente(null, "Jaozin", "cudagua@gmail.com",
                    "40028922", TipoClienteEnum.PESSOA_JURIDICA);

            cliente1.getTelefones().addAll(Arrays.asList("14 99707-5368", "14 3641-4257"));

            Endereco endereco1 = new Endereco(null, "Rua Augusto da Silva", "576", null,
                    "Jd Nova Barra", "17347-456", cidade1, cliente1);
            Endereco endereco2 = new Endereco(null, "Rua dos Caduca", "475", "Apartamento",
                    "Condomínio do Ararau", "17349-587", cidade2, cliente1);

            clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
            enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2));
        }
    }
}
