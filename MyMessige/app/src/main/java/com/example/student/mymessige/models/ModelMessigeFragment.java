package com.example.student.mymessige.models;

public class ModelMessigeFragment {

    private int ImageId;
    private  String textName;
    private String textStatus;

    public ModelMessigeFragment(int imageId, String textName, String textStatus) {
        ImageId = imageId;
        this.textName = textName;
        this.textStatus = textStatus;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextStatus() {
        return textStatus;
    }

    public void setTextStatus(String textStatus) {
        this.textStatus = textStatus;
    }
}
