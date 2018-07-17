package com.example.student.mymessige.models;

public class ModelEmailFragment {
    private int ImageId;
    private String TextEmail;

    public ModelEmailFragment(int imageId, String textEmail) {
        ImageId = imageId;
        TextEmail = textEmail;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTextEmail() {
        return TextEmail;
    }

    public void setTextEmail(String textEmail) {
        TextEmail = textEmail;
    }
}
