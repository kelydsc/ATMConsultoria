package br.com.kely.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewMenuClientes.setOnClickListener {
            Log.i("BOTAO", "Botao pressionado")

            val intentCliente = Intent(this, DetalheClienteActivity::class.java)//context = this

            //chama a tela de Detalhes
            startActivity(intentCliente)
        }

        imageViewMenuEmpresa.setOnClickListener {

            val intentEmpresa = Intent(this, DetalheEmpresaActivity::class.java)//context = this

            //chama a tela de Detalhes
            startActivity(intentEmpresa)
        }

        imageViewMenuServicos.setOnClickListener {

            val intentServicos = Intent(this, DetalheServicosActivity::class.java)//context = this

            //chama a tela de Detalhes
            startActivity(intentServicos)
        }

        imageViewMenuContatos.setOnClickListener {

            val intentContatos = Intent(this, DetalheContatosActivity::class.java)//context = this

            //chama a tela de Detalhes
            startActivity(intentContatos)
        }
    }

}
