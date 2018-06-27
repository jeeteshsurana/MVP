package com.example.win10.mvp.DataTransfer.Login;

import com.example.win10.mvp.GSON.LoginGSON;

public interface LoginContract {

    interface BasicView{

        void showLoader();

        void hideLoader();

        void showConnectionError();

        void showSuccessful(LoginGSON loginGSON);

        void showError(String error);
    }

    interface Presenter {

        void CallApi(String email, String password);

    }
}
