package com.roilin.trials.finalproject;

public class Template
{
    private long mISO_s32;
    private float mShutterSpeed_fl;
    private long mWhiteBalance_fl;
    private char mExposureValue_s8;

    /***********************************************
     * GETTERS AND SETTERS
     ***********************************************/
    public long getmISO_s32() {
        return mISO_s32;
    }

    public void setmISO_s32(long mISO_s32) {
        this.mISO_s32 = mISO_s32;
    }

    public float getmShutterSpeed_fl() {
        return mShutterSpeed_fl;
    }

    public void setmShutterSpeed_fl(float mShutterSpeed_fl) {
        this.mShutterSpeed_fl = mShutterSpeed_fl;
    }

    public long getmWhiteBalance_fl() {
        return mWhiteBalance_fl;
    }

    public void setmWhiteBalance_fl(long mWhiteBalance_fl) {
        this.mWhiteBalance_fl = mWhiteBalance_fl;
    }

    public char getmExposureValue_s8() {
        return mExposureValue_s8;
    }

    public void setmExposureValue_s8(char mExposureValue_s8) {
        this.mExposureValue_s8 = mExposureValue_s8;
    }


}
