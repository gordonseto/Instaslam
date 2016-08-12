package com.gordonseto.instaslam.Model;

import android.net.Uri;

/**
 * Created by gordonseto on 16-08-12.
 */
public class InstaImage {
    private Uri imgResourceUrl;

    public InstaImage(Uri imgResourceUrl) {
        this.imgResourceUrl = imgResourceUrl;
    }

    public Uri getImgResourceUrl() {
        return imgResourceUrl;
    }
}
