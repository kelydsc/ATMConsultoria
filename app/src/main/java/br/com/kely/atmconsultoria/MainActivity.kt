package br.com.kely.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ciclo de vida execução do metodo: onCreate
        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_LONG).show()

        imageViewMenuClientes.setOnClickListener {
            Log.i("BOTAO", "Botao pressionado")

            //applicationContext ou this
            Toast.makeText(applicationContext, "Cliente foi clicado", Toast.LENGTH_LONG).show()

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

    //ciclo de vida execução do metodo: onStart
    override fun onStart() {
        super.onStart()

        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_LONG).show()
    }

    //ciclo de vida execução do metodo: onResume
    override fun onResume() {
        super.onResume()

        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show()
    }

    //ciclo de vida execução do metodo: onPause
    override fun onPause() {
        super.onPause()

        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_LONG).show()
    }

    //ciclo de vida execução do metodo: onStop
    override fun onStop() {
        super.onStop()

        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_LONG).show()
    }

    //ciclo de vida execução do metodo: onRestart
    override fun onRestart() {
        super.onRestart()

        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_LONG).show()
    }

    //ciclo de vida execução do metodo: onDestroy
    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_LONG).show()
    }
}
