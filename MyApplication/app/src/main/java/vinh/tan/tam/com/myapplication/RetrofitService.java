package vinh.tan.tam.com.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("api/v1/properties?limit=5&city=Napa&state_code=CA&sort=relevance&client_id=rdc_mobile_native")
    Call<List<Repo>> listRepos();
}
