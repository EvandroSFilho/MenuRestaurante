package com.example.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoPao = 0.75
    private val precoChocolate = 2.0
    private val precoCafe = 3.5
    private val precoSanduiche = 5.0
    private val precoSuco = 2.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("quant_cafe", binding.editQuantidadeCafe.text.toString())
            i.putExtra("quant_chocolate", binding.editQuantidadeChocolate.text.toString())
            i.putExtra("quant_pao", binding.editQuantidadePao.text.toString())
            i.putExtra("quant_sanduiche", binding.editQuantidadeSanduiche.text.toString())
            i.putExtra("quant_suco", binding.editQuantidadeSuco.text.toString())

            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_chocolate", precoChocolate)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_sanduiche", precoSanduiche)
            i.putExtra("preco_suco", precoSuco)
            startActivity(i)
        }
        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                binding.editQuantidadeCafe.setText("1")
                binding.textPrecoCafe.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeCafe.setText("0")
                binding.textPrecoCafe.visibility = View.GONE
            }
        }
        binding.checkChocolate.setOnClickListener {
            if (binding.checkChocolate.isChecked()) {
                binding.editQuantidadeChocolate.setText("1")
                binding.textPrecoChocolate.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeChocolate.setText("0")
                binding.textPrecoChocolate.visibility = View.GONE
            }
        }
        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                binding.editQuantidadePao.setText("1")
                binding.textPrecoPao.visibility = View.VISIBLE
            } else {
                binding.editQuantidadePao.setText("0")
                binding.textPrecoPao.visibility = View.GONE
            }
        }
        binding.checkSanduiche.setOnClickListener {
            if (binding.checkSanduiche.isChecked()) {
                binding.editQuantidadeSanduiche.setText("1")
                binding.textPrecoSanduiche.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeSanduiche.setText("0")
                binding.textPrecoSanduiche.visibility = View.GONE
            }
        }
        binding.checkSuco.setOnClickListener {
            if (binding.checkSuco.isChecked()) {
                binding.editQuantidadeSuco.setText("1")
                binding.textPrecoSuco.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeSuco.setText("0")
                binding.textPrecoSuco.visibility = View.GONE
            }
        }

    }
}