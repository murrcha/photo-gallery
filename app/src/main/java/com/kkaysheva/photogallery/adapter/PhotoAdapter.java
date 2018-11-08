package com.kkaysheva.photogallery.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kkaysheva.photogallery.pojo.GalleryItem;

import java.util.List;

/**
 * PhotoAdapter
 *
 * @author Ksenya Kaysheva (murrcha@me.com)
 * @since 08.11.2018
 */
public class PhotoAdapter extends Adapter<PhotoAdapter.PhotoHolder> {

    private List<GalleryItem> galleryItems;

    public PhotoAdapter(List<GalleryItem> galleryItems) {
        this.galleryItems = galleryItems;
    }

    @NonNull
    @Override
    public PhotoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView textView = new TextView(viewGroup.getContext());
        return new PhotoHolder(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoHolder photoHolder, int position) {
        GalleryItem galleryItem = galleryItems.get(position);
        photoHolder.bindGalleryItem(galleryItem);
    }

    @Override
    public int getItemCount() {
        return galleryItems.size();
    }

    class PhotoHolder extends RecyclerView.ViewHolder {

        private TextView titleTextView;

        public PhotoHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView;
        }

        public void bindGalleryItem(GalleryItem item) {
            titleTextView.setText(item.toString());
        }
    }
}
