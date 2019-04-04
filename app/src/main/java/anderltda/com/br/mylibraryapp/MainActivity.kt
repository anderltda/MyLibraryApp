package anderltda.com.br.mylibraryapp

import anderltda.com.br.mylibrary.Calculadora
import anderltda.com.br.toastlibrarycuston.CustomToast
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calculadora = Calculadora()
        val resultado = calculadora.subtrair(1, 2)
        //Toast.makeText(this, resultado.toString(), Toast.LENGTH_LONG).show()

        button.setOnClickListener {
            var toast = CustomToast()
            toast.showToast(this, "O resultado é: ${resultado}")
        }

    }
}
