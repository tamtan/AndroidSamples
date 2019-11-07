package vinh.tan.tam.com.calculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var first: Int? = null
    var oper: Char? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener({
            if (edtInput.text.length != 0) {
                first = first?.plus(edtInput.text.toString().toInt())
                    ?: edtInput.text.toString().toInt()
                edtInput.setText("")
                oper = '+'
            }
        })

        btnSub.setOnClickListener({
            if (edtInput.text.length != 0) {
                first = first?.minus(edtInput.text.toString().toInt())
                    ?: edtInput.text.toString().toInt()
                edtInput.setText("")
                oper = '-'
            }
        })
        btnMul.setOnClickListener({
            if (edtInput.text.length != 0) {
                first = first?.times(edtInput.text.toString().toInt())
                    ?: edtInput.text.toString().toInt()
                edtInput.setText("")
                oper = '*'
            }
        })


        btnDiv.setOnClickListener({
            if (edtInput.text.length != 0) {
                first =
                    first?.div(edtInput.text.toString().toInt()) ?: edtInput.text.toString().toInt()
                edtInput.setText("")
                oper = '/'
            }
        })

        btnClear.setOnClickListener({
            if (edtInput.text.length != 0) {
                edtInput.setText("")
            }
            first = null
        })

        btnEqual.setOnClickListener({
            if (first != null) {
                Log.e("calculatorlog", first.toString())
                when (oper) {
                    '+' -> {
                        if (edtInput.text.length != 0) {
                            first = first?.plus(edtInput.text.toString().toInt())
                                ?: edtInput.text.toString().toInt()
                        }
                    }
                    '-' -> {
                        if (edtInput.text.length != 0) {
                            first = first?.minus(edtInput.text.toString().toInt())
                                ?: edtInput.text.toString().toInt()
                        }
                    }
                    '*' -> {
                        if (edtInput.text.length != 0) {
                            first = first?.times(edtInput.text.toString().toInt())
                                ?: edtInput.text.toString().toInt()
                        }
                    }
                    '/' -> {
                        if (edtInput.text.length != 0) {
                            first = first?.div(edtInput.text.toString().toInt())
                                ?: edtInput.text.toString().toInt()
                        }
                    }
                    else -> {

                    }
                }
                edtInput.setText("$first")
                first = null
            }
        })
    }

}
