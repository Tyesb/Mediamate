package existmediasolutions.mediamate.handler;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import existmediasolutions.mediamate.LauncherActivity;
import existmediasolutions.mediamate.models.DeviceInformation;
import existmediasolutions.mediamate.models.Request;
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

    public void sendRequest(){
//        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Request request = new Request("1","222","sent From app", "","1","2017-09-21T18:10:31");
        Call call1 = apiInterface.doCreateRequest("1","222","sent From app", "","1","2017-09-21T18:10:31");
        call1.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                String success = response.body().toString();

//                Toast.makeText(getApplicationContext(), success, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }
        });

    }


    public interface onApiCallbackResponse {
        void onApiCallbackListener(DeviceInformation deviceInformation);

    }
}