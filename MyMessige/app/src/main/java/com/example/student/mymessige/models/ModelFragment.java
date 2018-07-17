package com.example.student.mymessige.models;

public class ModelFragment {
    private int ImageId;
    private String TextName;
    private  String TextSurName;

    public ModelFragment(int imageId, String textName, String textSurName) {
        ImageId = imageId;
        TextName = textName;
        TextSurName = textSurName;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTextName() {
        return TextName;
    }

    public void setTextName(String textName) {
        TextName = textName;
    }

    public String getTextSurName() {
        return TextSurName;
    }

    public void setTextSurName(String textSurName) {
        TextSurName = textSurName;
    }
}
