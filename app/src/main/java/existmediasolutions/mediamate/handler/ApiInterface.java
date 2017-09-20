package existmediasolutions.mediamate.handler;

import existmediasolutions.mediamate.models.DeviceInformation;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by tye on 9/21/2017.
 */

public interface ApiInterface {

    @GET("/api/devices/3")
    Call<DeviceInformation> getDeviceInformation();
//
//    @GET("/api/users?")
//    Call<UserList> doGetUserList(@Query("page") String page);
//
//    @FormUrlEncoded
//    @POST("/api/users?")
//    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}

