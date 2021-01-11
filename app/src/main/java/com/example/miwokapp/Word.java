package com.example.miwokapp;

public class Word {
  private String mDefaultTranslation;
  private String mMiwoktranslation;
  private int mAudioResourceId;
  private int mImageResourceId;
  public Word( String DefaultTranslation, String Miwoktranslation, int AudioResourceId)
  {
      mDefaultTranslation = DefaultTranslation;
      mMiwoktranslation = Miwoktranslation;
      mAudioResourceId= AudioResourceId;
  }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getmImageResourceId(){return mImageResourceId;}
    public String getmMiwoktranslation() {
        return mMiwoktranslation;
    }
    public int getmAudioResourceId(){return mAudioResourceId;}
    public Word( String DefaultTranslation, String Miwoktranslation , int imageResourceId, int AudioResourceId)
    {
        mDefaultTranslation = DefaultTranslation;
        mMiwoktranslation = Miwoktranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId= AudioResourceId;
    }

}
