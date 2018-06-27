package com.example.win10.mvp.DataTransfer;

import com.example.win10.mvp.GSON.LoginGSON;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("index.php")
    Call<LoginGSON> Reg(@Field("api") String api, @Field("email") String email, @Field("password") String password);

}
