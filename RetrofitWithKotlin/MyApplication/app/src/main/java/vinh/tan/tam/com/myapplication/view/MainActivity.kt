package vinh.tan.tam.com.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import vinh.tan.tam.com.myapplication.R
import vinh.tan.tam.com.myapplication.databinding.ActivityMainBinding
import vinh.tan.tam.com.myapplication.util.Util
import vinh.tan.tam.com.myapplication.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    var viewmodel: LoginViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewmodel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(LoginViewModel::class.java)

        binding?.viewmodel = viewmodel
        imageView.setImageDrawable(resources.getDrawable(R.drawable.ic_launcher_background))
        initObserver()
    }

    private fun initObserver() {
        viewmodel?.loginSuccess?.observe(this, Observer {
            if (it!!) {

//                val intent = Intent(this, RecyclerViewActivity::class.java)
//                startActivity(intent)
                Util.getIMEI(this)
            }
        })

    }
}
