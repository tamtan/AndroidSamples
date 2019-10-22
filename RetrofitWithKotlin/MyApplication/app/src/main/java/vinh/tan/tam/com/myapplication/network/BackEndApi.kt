package vinh.tan.tam.com.myapplication.network

import retrofit2.Call
import retrofit2.http.*
import vinh.tan.tam.com.myapplication.model.User

interface BackEndApi {
    @FormUrlEncoded
    @POST("auth/login")
    fun Login(@Field("email") email: String, @Field("password") password: String): Call<User>

    @GET("search/users")
    fun search(@Query("q") query: String,
               @Query("page") page: Int = 1,
               @Query("per_page") perPage: Int = 20): Call<User>

}