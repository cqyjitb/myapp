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

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xuexiang.templateproject.R;
import com.xuexiang.templateproject.core.BaseActivity;
import com.xuexiang.xaop.annotation.SingleClick;
import com.xuexiang.xui.utils.StatusBarUtils;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import com.xuexiang.xutil.app.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.et_login_username)
    MaterialEditText et_login_username;

    @BindView(R.id.et_login_password)
    MaterialEditText et_login_password;

    @BindView(R.id.btn_login)
    Button btn_login;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViews();

    }

    private void initViews() {
        StatusBarUtils.translucent(this);
        StatusBarUtils.setStatusBarDarkMode(this);
    }

    @SingleClick
    @OnClick({R.id.btn_login})
    public void onViewClicked(View view){
            switch (view.getId()){
                case R.id.btn_login:
                    processlogin();
                    break;
            }

    }

    private void processlogin(){

        //ActivityUtils.startActivity(MainActivity.class);
        ActivityUtils.startActivity(HomeActivity.class);
    }
}
