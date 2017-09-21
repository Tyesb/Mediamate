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

    @GET("/api/devices/1")
    Call<DeviceInformation> getDeviceInformation();
//
//   @GET("/api/users?")
//    Call<UserList> doGetUserList(@Query("page") String page);
//
   @FormUrlEncoded
   @POST("/api/requests/new")
   Call<String> doCreateRequest(@Field("MotelModelId") String MotelModelId, @Field("roomNo") String roomNo, @Field("requestInfo") String requestinfo,
                                @Field("CategoryModel") String CategoryModel,@Field("CategoryModelId") String RequestTime,@Field("RequestTime") String requestTime);

}

