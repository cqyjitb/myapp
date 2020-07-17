/*
 * Copyright (C) 2020 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.templateproject.activity;

import com.xuexiang.templateproject.R;
import com.xuexiang.xui.widget.activity.BaseSplashActivity;
import com.xuexiang.xutil.app.ActivityUtils;

import me.jessyan.autosize.internal.CancelAdapt;

public class SplashActivity2 extends BaseSplashActivity implements CancelAdapt {
    @Override
    protected void onCreateActivity() {
        initSplashView(R.drawable.splash_logo);
        startSplash(false);
    }

    @Override
    protected void onSplashFinished() {
        ActivityUtils.startActivity(MainActivity.class);
    }

    @Override
    protected long getSplashDurationMillis() {
        return 1000;
    }
}
