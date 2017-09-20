package existmediasolutions.mediamate.handler;

import android.content.Context;
import android.util.Log;

import existmediasolutions.mediamate.LauncherActivity;
import existmediasolutions.mediamate.models.DeviceInformation;
import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tye on 9/21/2017.
 */

public class ApiHandler {
    ApiInterface apiInterface;
    DeviceInformation deviceInformation;


    public void GetDeviceInfo(final onApiCallbackResponse listener) {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call call = apiInterface.getDeviceInformation();
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                Log.d("TAG", response.code() + "");
                String displayResponse = "";
                DeviceInformation deviceInformation = (DeviceInformation) response.body();
                listener.onApiCallbackListener(deviceInformation);

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }

        });
//        return deviceInformation;
    }


    public interface onApiCallbackResponse {
        void onApiCallbackListener(DeviceInformation deviceInformation);

    }
}