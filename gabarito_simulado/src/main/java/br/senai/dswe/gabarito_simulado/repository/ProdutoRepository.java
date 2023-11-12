package br.senai.dswe.gabarito_simulado.repository;

import br.senai.dswe.gabarito_simulado.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContainingOrderByNomeDesc(String nome);


} //Fim do repositorio Produto
