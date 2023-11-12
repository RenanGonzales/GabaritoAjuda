package br.senai.dswe.gabarito_simulado.repository;

import br.senai.dswe.gabarito_simulado.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    //List<Pedido> findByNomeContainingOrderByNomeDesc(String nome);
} //Fim da interface Pedido
