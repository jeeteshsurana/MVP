package com.example.win10.mvp.DataTransfer.Login;

import android.util.Log;

import com.example.win10.mvp.DataTransfer.ApiClient;
import com.example.win10.mvp.DataTransfer.ApiInterface;
import com.example.win10.mvp.GSON.LoginGSON;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;

public class LoginPresenter implements LoginContract.Presenter {
    private static String TAG = "LoginPresenter";
    private LoginContract.BasicView mLoginView;

    public LoginPresenter(LoginContract.BasicView mLoginView) {
        this.mLoginView = mLoginView;
    }

    @Override
    public void CallApi(String email, String password) {
        mLoginView.showLoader();

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<LoginGSON> call = apiService.Reg("login", email, password);

        call.enqueue(new Callback<LoginGSON>() {
            @Override
            public void onResponse(Call<LoginGSON> call, retrofit2.Response<LoginGSON> response) {
                Log.d(TAG, "Register onResponse: " + new Gson().toJson(response.body()));

                if (response.isSuccessful()) {
                    if (response.body().getCode() == 200) {
                        mLoginView.hideLoader();
                        LoginGSON loginGSON=response.body();
                        Log.d(TAG, "onResponse: loginGSON"+loginGSON.getMessage());
                        mLoginView.showSuccessful(loginGSON);
                    } else {
                        mLoginView.hideLoader();
                        mLoginView.showError(response.body().getMessage());
                    }
                } else {
                    mLoginView.hideLoader();
                    mLoginView.showError(response.body().getMessage());
                }
            }

            @Override
            public void onFailure(Call<LoginGSON> call, Throwable t) {
                mLoginView.hideLoader();
                mLoginView.showError(t.toString());
            }
        });
    }
}

