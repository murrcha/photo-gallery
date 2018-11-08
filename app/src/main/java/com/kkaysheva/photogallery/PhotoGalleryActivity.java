package com.kkaysheva.photogallery;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * PhotoGalleryActivity
 *
 * @author Ksenya Kaysheva (murrcha@me.com)
 * @since 08.11.2018
 */
public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
