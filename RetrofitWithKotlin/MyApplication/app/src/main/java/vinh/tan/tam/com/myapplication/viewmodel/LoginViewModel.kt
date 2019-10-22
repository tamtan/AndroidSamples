package vinh.tan.tam.com.myapplication.viewmodel

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import vinh.tan.tam.com.myapplication.model.User
import vinh.tan.tam.com.myapplication.network.BackEndApi
import vinh.tan.tam.com.myapplication.network.WebServiceClient

class LoginViewModel : ViewModel(), Callback<User> {

    var email: ObservableField<String>? = null;
    var password: ObservableField<String>? = null;
    var loginSuccess: MutableLiveData<Boolean>? = null

    init {
        email = ObservableField("vinhtam92@gmail.com")
        password = ObservableField("1234567")
        loginSuccess = MutableLiveData()
    }

    fun login() {
//        WebServiceClient.client.create(BackEndApi::class.java).search("l", 1).enqueue(this)
        loginSuccess?.value = true;

    }

    fun onPasswordChanged(s: CharSequence, start: Int, befor: Int, count: Int) {
        Log.i("loginViewModel", "onPasswordChanged  " + email?.get())
    }

    override fun onFailure(call: Call<User>?, t: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResponse(call: Call<User>?, response: Response<User>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}