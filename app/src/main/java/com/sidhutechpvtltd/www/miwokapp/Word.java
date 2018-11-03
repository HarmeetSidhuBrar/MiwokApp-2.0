package com.sidhutechpvtltd.www.miwokapp;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;
    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /**
     *
     */
    private int mAudioResourceId;
    /** Images for each Word. */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1 ;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the audio resource id for each word.
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language.
     * @param imageResourceId is resource id for images.
     * @param audioResourceId is the audio resource id for each word.
     */
    public Word(String defaultTranslation,String miwokTranslation , int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get audio resource file id.
     *
     */
    public int getmAudioResourceId(){return mAudioResourceId;}

    /**
     * get the images for the word.
     */
    public int getmImageResourceId (){ return mImageResourceId;}

    /**
     * Checks is Image provided or not.
     *
     */
    public boolean hasImage (){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
