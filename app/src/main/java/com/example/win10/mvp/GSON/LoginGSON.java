
package com.example.win10.mvp.GSON;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginGSON implements Serializable, Parcelable
{

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    public final static Parcelable.Creator<LoginGSON> CREATOR = new Creator<LoginGSON>() {


        @SuppressWarnings({
            "unchecked"
        })
        public LoginGSON createFromParcel(Parcel in) {
            return new LoginGSON(in);
        }

        public LoginGSON[] newArray(int size) {
            return (new LoginGSON[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6620725570505699997L;

    protected LoginGSON(Parcel in) {
        this.status = ((int) in.readValue((int.class.getClassLoader())));
        this.code = ((int) in.readValue((int.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (com.example.win10.mvp.GSON.Datum.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoginGSON() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param data
     * @param code
     */
    public LoginGSON(int status, int code, String message, List<Datum> data) {
        super();
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(code);
        dest.writeValue(message);
        dest.writeList(data);
    }

    public int describeContents() {
        return  0;
    }

}
