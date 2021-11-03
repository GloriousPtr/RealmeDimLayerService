/*
 * Copyright (c) 2021 Mohit Sethi <mohitsethi.32@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Purpose: BootCompleteReciever bootstrap class, allows DimLayerDisablerService
 * class to hook in and start the required listeners.
 * 
 */

package co.hyper.dimlayerdisablerservice;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class DimLayerDisablerService extends Service {
    private KeyguardHelper keyguardHelper;

    private static final String TAG = "RealmeDimLayerDisablerHelperService";
    private static final boolean DEBUG = true;

    @Override
    public void onCreate() {
       if (DEBUG) Log.d(TAG, "Creating callback for KeyguardHelper");
        keyguardHelper = new KeyguardHelper();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
       if (DEBUG) Log.d(TAG, "Destroying DimLayerDisablerService service");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
