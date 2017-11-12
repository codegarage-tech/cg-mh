package com.reversecoder.mh.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Md. Rashadul Alam
 */
public class UserData extends ResponseBase implements Parcelable {

    private String id = "";
    private String first_name = "";
    private String last_name = "";
    private String email = "";
    private String city = "";
    private String password = "";
    private String state = "";
    private String zipcode = "";
    private String website = "";
    private String youtube = "";
    private String facebook = "";
    private String twitter = "";
    private String instragram = "";
    private String bio = "";

    public UserData(String id, String first_name, String last_name, String email, String city, String password, String state, String zipcode, String website, String youtube, String facebook, String twitter, String instragram, String bio) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.password = password;
        this.state = state;
        this.zipcode = zipcode;
        this.website = website;
        this.youtube = youtube;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instragram = instragram;
        this.bio = bio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstragram() {
        return instragram;
    }

    public void setInstragram(String instragram) {
        this.instragram = instragram;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", website='" + website + '\'' +
                ", youtube='" + youtube + '\'' +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", instragram='" + instragram + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

    //parcelable methods
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeString(email);
        dest.writeString(city);
        dest.writeString(password);
        dest.writeString(state);
        dest.writeString(zipcode);
        dest.writeString(website);
        dest.writeString(youtube);
        dest.writeString(facebook);
        dest.writeString(twitter);
        dest.writeString(instragram);
        dest.writeString(bio);
    }

    // Creator
    public static final Parcelable.Creator CREATOR
            = new Parcelable.Creator() {
        public UserData createFromParcel(Parcel in) {
            return new UserData(in);
        }

        public UserData[] newArray(int size) {
            return new UserData[size];
        }
    };

    // "De-parcel object
    public UserData(Parcel in) {
        id = in.readString();
        first_name = in.readString();
        last_name = in.readString();
        email = in.readString();
        city = in.readString();
        password = in.readString();
        state = in.readString();
        zipcode = in.readString();
        website = in.readString();
        youtube = in.readString();
        facebook = in.readString();
        twitter = in.readString();
        instragram = in.readString();
        bio = in.readString();
    }
}
