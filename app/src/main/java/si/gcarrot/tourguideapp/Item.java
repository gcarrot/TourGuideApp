package si.gcarrot.tourguideapp;

/**
 * Created by Urban on 6/29/17.
 */

public class Item {

    /** String resource ID for the default translation of the word */
    private int mTitleID;

    /** String resource ID for the Miwok translation of the word */
    private int mLocationID;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Item(int titleID, int locationID) {
        mTitleID = titleID;
        mLocationID = locationID;
    }


    public Item(int titleID, int locationID, int imageResourceId) {
        mTitleID = titleID;
        mLocationID = locationID;
        mImageResourceId = imageResourceId;
    }

    public int getTitleID() {
        return mTitleID;
    }

    public int getLocationID() {
        return mLocationID;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }





}
