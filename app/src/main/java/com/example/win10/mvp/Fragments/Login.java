package com.example.win10.mvp.Fragments;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.win10.mvp.DataTransfer.Login.LoginContract;
import com.example.win10.mvp.DataTransfer.Login.LoginPresenter;
import com.example.win10.mvp.DialogBoxes.DialogBoxes;
import com.example.win10.mvp.GSON.LoginGSON;
import com.example.win10.mvp.R;
import com.example.win10.mvp.Utils.FragmentHandler;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Login extends Fragment implements Validator.ValidationListener, LoginContract.BasicView {

    @NotEmpty
    @Email
    @BindView(R.id.log_EmailAddress)
    TextInputEditText logEmailAddress;

    @NotEmpty
    @BindView(R.id.log_password)
    TextInputEditText logPassword;

    @BindView(R.id.showPassword)
    ImageView showPassword;

    @BindView(R.id.SignIn)
    Button SignIn;

    @BindView(R.id.new_user)
    TextView newUser;

    @BindView(R.id.SignUp)
    TextView SignUp;

    @BindView(R.id.forget_password)
    TextView forgetPassword;

    Unbinder unbinder;
    private Validator validator;
    View view;
    private String TAG = "Login";
    public Context context;
    Dialog dialog;


    LoginPresenter loginPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.login, container, false);
        unbinder = ButterKnife.bind(this, view);
        loginPresenter =new LoginPresenter(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        validator = new Validator(this);
        validator.setValidationListener(this);
        dialog = DialogBoxes.waitingDialog(context);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.SignIn, R.id.SignUp, R.id.forget_password})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.SignIn:
                validator.validate();
                break;

            case R.id.SignUp:
                break;

            case R.id.forget_password:
                break;
        }
    }

    @Override
    public void onValidationSucceeded() {



        loginPresenter.CallApi(
                logEmailAddress.getText().toString(),
                logPassword.getText().toString()
        );
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {

        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(getActivity());

            // Display error messages ;)
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
            }
        }
    }


    @Override
    public void showLoader() {
        dialog.show();
    }

    @Override
    public void hideLoader() {
        dialog.dismiss();


    }

    @Override
    public void showConnectionError() {
        Toast.makeText(context, "Please Check Connection", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccessful(LoginGSON loginGSON) {
        Toast.makeText(context, "successful Login", Toast.LENGTH_SHORT).show();
        Bundle bundle=new Bundle();
        Log.d(TAG, "showSuccessful: "+loginGSON.getMessage());
        bundle.putString("data",loginGSON.getMessage());
        FragmentHandler.replaceFragment(new DisplayData(),getFragmentManager(),bundle);
    }

    @Override
    public void showError(String error) {
        Log.d(TAG, "showError: " + error);
        Toast.makeText(context, "error Found" + error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
