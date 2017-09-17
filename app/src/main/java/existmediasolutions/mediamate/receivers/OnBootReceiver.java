package existmediasolutions.mediamate.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import existmediasolutions.mediamate.LauncherActivity;

/**
 * Created by tye on 9/16/2017.
 */

//TODO use this to call both API call, Background service, and tutorial

    public class OnBootReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
                Intent serviceIntent = new Intent(context, LauncherActivity.class);
                context.startService(serviceIntent);
            }
        }
}
