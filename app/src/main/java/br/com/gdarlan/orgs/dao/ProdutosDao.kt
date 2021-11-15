package br.com.gdarlan.orgs.dao

import br.com.gdarlan.orgs.model.Produto

class ProdutosDao {

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }
}