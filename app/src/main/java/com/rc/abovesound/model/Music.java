package com.rc.abovesound.model;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import com.rc.abovesound.R;
import com.rc.abovesound.application.AboveSoundApplication;
import com.reversecoder.library.random.RandomManager;

/**
 * Md. Rashadul Alam
 */
public class Music extends ResponseBase implements Parcelable {

    private long primaryKey = -1;
    private int progress = 0;
    private String spentTimeText = "00:00/00:00";
    private int bgEqualizer = 0;
    private Drawable bgPlayPauseButton = ContextCompat.getDrawable(AboveSoundApplication.getGlobalContext(), R.drawable.ic_play);
    private transient CircularProgressBar progressBar = null;
    private transient ImageView equalizer;
    private transient TextView spentTime = null;
    private transient ImageView playPauseButton = null;

    private String music_title = "";
    private String description = "";
    private String state_name = "";
    private String music_category = "";
    private String file_path = "";
    private String is_paid = "";
    private String price = "";
    private String user_id = "";
    private String first_name = "";
    private String last_name = "";
    private String id = "";
    private String full_paid_price = "";
    private String profile_image = "";
    private int totalTime = -1;
    private int lastPlayed = -1;
    private int isPlaying = 0;

    public Music() {
        this.primaryKey = RandomManager.getRandom(10000000);
    }

    public Music(String music_title, String description, String state_name, String music_category, String file_path, String is_paid, String price, String user_id, String first_name, String last_name, String id, String full_paid_price, String profile_image) {
        this.primaryKey = RandomManager.getRandom(10000000);

        this.music_title = music_title;
        this.description = description;
        this.state_name = state_name;
        this.music_category = music_category;
        this.file_path = file_path;
        this.is_paid = is_paid;
        this.price = price;
        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.id = id;
        this.full_paid_price = full_paid_price;
        this.profile_image = profile_image;
    }

    public long getPrimaryKey() {
        return primaryKey;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getSpentTimeText() {
        return spentTimeText;
    }

    public void setSpentTimeText(String spentTimeText) {
        this.spentTimeText = spentTimeText;
    }

    public int getBgEqualizer() {
        return bgEqualizer;
    }

    public void setBgEqualizer(int bgEqualizer) {
        this.bgEqualizer = bgEqualizer;
    }

    public Drawable getBgPlayPauseButton() {
        return bgPlayPauseButton;
    }

    public void setBgPlayPauseButton(Drawable bgPlayPauseButton) {
        this.bgPlayPauseButton = bgPlayPauseButton;
    }

    public CircularProgressBar getProgressBar() {
        return progressBar;
    }

    public ImageView getEqualizer() {
        return equalizer;
    }

    public void setEqualizer(ImageView equalizer) {
        this.equalizer = equalizer;
    }

    public void setProgressBar(CircularProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public TextView getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(TextView spentTime) {
        this.spentTime = spentTime;
    }

    public ImageView getPlayPauseButton() {
        return playPauseButton;
    }

    public void setPlayPauseButton(ImageView playPauseButton) {
        this.playPauseButton = playPauseButton;
    }

    public String getMusic_title() {
        return music_title;
    }

    public void setMusic_title(String music_title) {
        this.music_title = music_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getMusic_category() {
        return music_category;
    }

    public void setMusic_category(String music_category) {
        this.music_category = music_category;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(String is_paid) {
        this.is_paid = is_paid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(int lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    public int getIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(int isPlaying) {
        this.isPlaying = isPlaying;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_paid_price() {
        return full_paid_price;
    }

    public void setFull_paid_price(String full_paid_price) {
        this.full_paid_price = full_paid_price;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    @Override
    public String toString() {
        return "{" +
                "primaryKey='" + getPrimaryKey() + '\'' +
                ", progress='" + progress + '\'' +
                ", spentTimeText='" + spentTimeText + '\'' +
                ", bgEqualizer='" + bgEqualizer + '\'' +
                ", music_title='" + music_title + '\'' +
                ", description='" + description + '\'' +
                ", state_name='" + state_name + '\'' +
                ", music_category='" + music_category + '\'' +
                ", file_path='" + file_path + '\'' +
                ", is_paid='" + is_paid + '\'' +
                ", price='" + price + '\'' +
                ", user_id='" + user_id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", id='" + id + '\'' +
                ", full_paid_price='" + full_paid_price + '\'' +
                ", profile_image='" + profile_image + '\'' +
                ", totalTime=" + totalTime +
                ", lastPlayed=" + lastPlayed +
                ", isPlaying=" + isPlaying +
                '}';
    }

    //parcelable methods
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(getPrimaryKey());
        dest.writeInt(progress);
        dest.writeString(spentTimeText);
        dest.writeInt(bgEqualizer);
        dest.writeValue(((BitmapDrawable) bgPlayPauseButton).getBitmap());
        dest.writeString(music_title);
        dest.writeString(description);
        dest.writeString(state_name);
        dest.writeString(music_category);
        dest.writeString(file_path);
        dest.writeString(is_paid);
        dest.writeString(price);
        dest.writeString(user_id);
        dest.writeString(first_name);
        dest.writeString(last_name);
        dest.writeString(id);
        dest.writeString(full_paid_price);
        dest.writeString(profile_image);
        dest.writeInt(totalTime);
        dest.writeInt(lastPlayed);
        dest.writeInt(isPlaying);
    }

    // Creator
    public static final Parcelable.Creator CREATOR
            = new Parcelable.Creator() {
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    // "De-parcel object
    public Music(Parcel in) {
        primaryKey = in.readLong();
        progress = in.readInt();
        spentTimeText = in.readString();
        bgEqualizer = in.readInt();
        bgPlayPauseButton = new BitmapDrawable(((Bitmap) in.readValue(Bitmap.class.getClassLoader())));
        music_title = in.readString();
        description = in.readString();
        state_name = in.readString();
        music_category = in.readString();
        file_path = in.readString();
        is_paid = in.readString();
        price = in.readString();
        user_id = in.readString();
        first_name = in.readString();
        last_name = in.readString();
        id = in.readString();
        full_paid_price = in.readString();
        profile_image = in.readString();
        totalTime = in.readInt();
        lastPlayed = in.readInt();
        isPlaying = in.readInt();
    }
}