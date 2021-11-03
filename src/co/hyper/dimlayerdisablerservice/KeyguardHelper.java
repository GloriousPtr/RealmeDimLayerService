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

import android.app.KeyguardManager;
import android.util.Log;

public class KeyguardHelper extends KeyguardManager.KeyguardDismissCallback {
    private static final String TAG = "RealmeDimLayerDisablerKeyguardHelper";
    @Override
    public void onDismissSucceeded() {
        Log.d(TAG, "onDismissSucceeded");
        super.onDismissSucceeded();
    }

    @Override
    public void onDismissError() {
        Log.d(TAG, "onDismissError");
        super.onDismissError();
    }

    @Override
    public void onDismissCancelled() {
        Log.d(TAG, "onDismissCancelled");
        super.onDismissCancelled();
    }
}
