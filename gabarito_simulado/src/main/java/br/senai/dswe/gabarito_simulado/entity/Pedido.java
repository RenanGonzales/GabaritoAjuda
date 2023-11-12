package br.senai.dswe.gabarito_simulado.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @ManyToMany
    private List<Produto> produtos;
    @Column
    private float quantidade;
    @Column
    private float total;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(List<Produto> produtos){
        this.produtos.addAll(produtos);
    }

    public void removeProduto(List<Produto> produtos){
        this.produtos.remove(produtos);
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}//Fim da Entidade Pedido
