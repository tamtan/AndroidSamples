package mvvm.f4wzy.com.samplelogin.network

import mvvm.f4wzy.com.samplelogin.model.User
import retrofit2.Call
import retrofit2.http.*

interface BackEndApi {
    @FormUrlEncoded
    @POST("auth/login")
    fun LOGIN(@Field("email") email: String, @Field("password") password: String): Call<User>

    @GET("search/users")
    fun search(@Query("q") query: String,
               @Query("page") page: Int = 1,
               @Query("per_page") perPage: Int = 20): Call<User>


}

