
package com.example.win10.mvp.GSON;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("address_lat")
    @Expose
    private String addressLat;
    @SerializedName("address_lng")
    @Expose
    private String addressLng;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("profile_pic")
    @Expose
    private String profilePic;
    @SerializedName("study_info_name")
    @Expose
    private String studyInfoName;
    @SerializedName("study_info_add")
    @Expose
    private String studyInfoAdd;
    @SerializedName("study_info_city")
    @Expose
    private String studyInfoCity;
    @SerializedName("study_info_state")
    @Expose
    private String studyInfoState;
    @SerializedName("study_info_zipcode")
    @Expose
    private String studyInfoZipcode;
    @SerializedName("contact_pre")
    @Expose
    private String contactPre;
    @SerializedName("sec_question_id")
    @Expose
    private String secQuestionId;
    @SerializedName("sec_answer")
    @Expose
    private String secAnswer;
    @SerializedName("device_token")
    @Expose
    private String deviceToken;
    @SerializedName("device_type")
    @Expose
    private String deviceType;
    @SerializedName("screenname")
    @Expose
    private String screenname;
    @SerializedName("hidephoto")
    @Expose
    private String hidephoto;
    @SerializedName("hidename")
    @Expose
    private String hidename;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("modified")
    @Expose
    private String modified;
    public final static Parcelable.Creator<Datum> CREATOR = new Creator<Datum>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    }
    ;
    private final static long serialVersionUID = 5468180284096601042L;

    protected Datum(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.password = ((String) in.readValue((String.class.getClassLoader())));
        this.firstname = ((String) in.readValue((String.class.getClassLoader())));
        this.lastname = ((String) in.readValue((String.class.getClassLoader())));
        this.address = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.addressLat = ((String) in.readValue((String.class.getClassLoader())));
        this.addressLng = ((String) in.readValue((String.class.getClassLoader())));
        this.phone = ((String) in.readValue((String.class.getClassLoader())));
        this.zipcode = ((String) in.readValue((String.class.getClassLoader())));
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.profilePic = ((String) in.readValue((String.class.getClassLoader())));
        this.studyInfoName = ((String) in.readValue((String.class.getClassLoader())));
        this.studyInfoAdd = ((String) in.readValue((String.class.getClassLoader())));
        this.studyInfoCity = ((String) in.readValue((String.class.getClassLoader())));
        this.studyInfoState = ((String) in.readValue((String.class.getClassLoader())));
        this.studyInfoZipcode = ((String) in.readValue((String.class.getClassLoader())));
        this.contactPre = ((String) in.readValue((String.class.getClassLoader())));
        this.secQuestionId = ((String) in.readValue((String.class.getClassLoader())));
        this.secAnswer = ((String) in.readValue((String.class.getClassLoader())));
        this.deviceToken = ((String) in.readValue((String.class.getClassLoader())));
        this.deviceType = ((String) in.readValue((String.class.getClassLoader())));
        this.screenname = ((String) in.readValue((String.class.getClassLoader())));
        this.hidephoto = ((String) in.readValue((String.class.getClassLoader())));
        this.hidename = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.created = ((String) in.readValue((String.class.getClassLoader())));
        this.modified = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param phone
     * @param screenname
     * @param state
     * @param lastname
     * @param studyInfoCity
     * @param studyInfoState
     * @param password
     * @param addressLng
     * @param city
     * @param id
     * @param studyInfoAdd
     * @param secAnswer
     * @param created
     * @param deviceType
     * @param gender
     * @param hidephoto
     * @param studyInfoZipcode
     * @param status
     * @param zipcode
     * @param secQuestionId
     * @param addressLat
     * @param firstname
     * @param modified
     * @param country
     * @param contactPre
     * @param hidename
     * @param address
     * @param email
     * @param deviceToken
     * @param profilePic
     * @param studyInfoName
     */
    public Datum(String id, String email, String password, String firstname, String lastname, String address, String city, String state, String country, String addressLat, String addressLng, String phone, String zipcode, String gender, String profilePic, String studyInfoName, String studyInfoAdd, String studyInfoCity, String studyInfoState, String studyInfoZipcode, String contactPre, String secQuestionId, String secAnswer, String deviceToken, String deviceType, String screenname, String hidephoto, String hidename, String status, String created, String modified) {
        super();
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.addressLat = addressLat;
        this.addressLng = addressLng;
        this.phone = phone;
        this.zipcode = zipcode;
        this.gender = gender;
        this.profilePic = profilePic;
        this.studyInfoName = studyInfoName;
        this.studyInfoAdd = studyInfoAdd;
        this.studyInfoCity = studyInfoCity;
        this.studyInfoState = studyInfoState;
        this.studyInfoZipcode = studyInfoZipcode;
        this.contactPre = contactPre;
        this.secQuestionId = secQuestionId;
        this.secAnswer = secAnswer;
        this.deviceToken = deviceToken;
        this.deviceType = deviceType;
        this.screenname = screenname;
        this.hidephoto = hidephoto;
        this.hidename = hidename;
        this.status = status;
        this.created = created;
        this.modified = modified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLat() {
        return addressLat;
    }

    public void setAddressLat(String addressLat) {
        this.addressLat = addressLat;
    }

    public String getAddressLng() {
        return addressLng;
    }

    public void setAddressLng(String addressLng) {
        this.addressLng = addressLng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getStudyInfoName() {
        return studyInfoName;
    }

    public void setStudyInfoName(String studyInfoName) {
        this.studyInfoName = studyInfoName;
    }

    public String getStudyInfoAdd() {
        return studyInfoAdd;
    }

    public void setStudyInfoAdd(String studyInfoAdd) {
        this.studyInfoAdd = studyInfoAdd;
    }

    public String getStudyInfoCity() {
        return studyInfoCity;
    }

    public void setStudyInfoCity(String studyInfoCity) {
        this.studyInfoCity = studyInfoCity;
    }

    public String getStudyInfoState() {
        return studyInfoState;
    }

    public void setStudyInfoState(String studyInfoState) {
        this.studyInfoState = studyInfoState;
    }

    public String getStudyInfoZipcode() {
        return studyInfoZipcode;
    }

    public void setStudyInfoZipcode(String studyInfoZipcode) {
        this.studyInfoZipcode = studyInfoZipcode;
    }

    public String getContactPre() {
        return contactPre;
    }

    public void setContactPre(String contactPre) {
        this.contactPre = contactPre;
    }

    public String getSecQuestionId() {
        return secQuestionId;
    }

    public void setSecQuestionId(String secQuestionId) {
        this.secQuestionId = secQuestionId;
    }

    public String getSecAnswer() {
        return secAnswer;
    }

    public void setSecAnswer(String secAnswer) {
        this.secAnswer = secAnswer;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getScreenname() {
        return screenname;
    }

    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    public String getHidephoto() {
        return hidephoto;
    }

    public void setHidephoto(String hidephoto) {
        this.hidephoto = hidephoto;
    }

    public String getHidename() {
        return hidename;
    }

    public void setHidename(String hidename) {
        this.hidename = hidename;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(email);
        dest.writeValue(password);
        dest.writeValue(firstname);
        dest.writeValue(lastname);
        dest.writeValue(address);
        dest.writeValue(city);
        dest.writeValue(state);
        dest.writeValue(country);
        dest.writeValue(addressLat);
        dest.writeValue(addressLng);
        dest.writeValue(phone);
        dest.writeValue(zipcode);
        dest.writeValue(gender);
        dest.writeValue(profilePic);
        dest.writeValue(studyInfoName);
        dest.writeValue(studyInfoAdd);
        dest.writeValue(studyInfoCity);
        dest.writeValue(studyInfoState);
        dest.writeValue(studyInfoZipcode);
        dest.writeValue(contactPre);
        dest.writeValue(secQuestionId);
        dest.writeValue(secAnswer);
        dest.writeValue(deviceToken);
        dest.writeValue(deviceType);
        dest.writeValue(screenname);
        dest.writeValue(hidephoto);
        dest.writeValue(hidename);
        dest.writeValue(status);
        dest.writeValue(created);
        dest.writeValue(modified);
    }

    public int describeContents() {
        return  0;
    }

}
