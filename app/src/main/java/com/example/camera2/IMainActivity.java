package com.example.camera2;

import android.graphics.drawable.Drawable;

public interface IMainActivity {


    void setCameraFrontFacing();

    void setCameraBackFacing();

    boolean isCameraFrontFacing();

    boolean isCameraBackFacing();

    void setFrontCameraId(String cameraId);

    void setBackCameraId(String cameraId);

    String getFrontCameraId();

    String getBackCameraId();

    void hideStatusBar();

    void showStatusBar();

    void hideStillshotWidgets();

    void showStillshotWidgets();

    void toggleViewStickersFragment();

    void addSticker(Drawable sticker);

    void setTrashIconSize(int width, int height);
}
