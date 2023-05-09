package com.example.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menurestaurante.databinding.ActivityDadospedidoBinding

class DadospedidoActivity : AppCompatActivity() {

    companion object {
        const val QUANT_CAFE = "quantCafe"
        const val QUANT_CHOCOLATE = "quantChocolate"
        const val QUANT_PAO = "quantPao"
        const val QUANT_SANDUICHE = "quantSanduiche"
        const val QUANT_SUCO = "quantSuco"
    }
    private lateinit var binding: ActivityDadospedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadospedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val quantCafe = i.getStringExtra(QUANT_CAFE).toString().toInt()
        val quantChocolate = i.getStringExtra(QUANT_CHOCOLATE).toString().toInt()
        val quantPao = i.getStringExtra(QUANT_PAO).toString().toInt()
        val quantSanduiche = i.getStringExtra(QUANT_SANDUICHE).toString().toInt()
        val quantSuco = i.getStringExtra(QUANT_SUCO).toString().toInt()


        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_sanduiche = i.getDoubleExtra("preco_sanduiche", 0.0)
        val preco_suco = i.getDoubleExtra("preco_suco", 0.0)

        var totCafe = quantCafe * preco_cafe
        var totChocolate = quantChocolate * preco_chocolate
        var totPao = quantPao * preco_pao
        var totSanduiche = quantSanduiche * preco_sanduiche
        var totSuco = quantSuco * preco_suco

        val texto = "Resumo do pedido: \n\n"+
                "Café: $quantCafe\n" +
                "Preço R$ ${totCafe}\n\n"+
                "Chocolate: $quantChocolate\n" +
                "Preço R$ ${totChocolate}\n\n"+
                "Pão: $quantPao\n" +
                "Preço R$ ${totPao}\n\n"+
                "Sanduiche: $quantSanduiche\n" +
                "Preço R$ ${totSanduiche}\n\n"+
                "Suco: $quantSuco\n" +
                "Preço R$ ${totSuco}\n\n"+
                "Total R$ ${totCafe+totPao+totChocolate+totSanduiche+totSuco}";

        binding.textResumo.text = texto
    }
}