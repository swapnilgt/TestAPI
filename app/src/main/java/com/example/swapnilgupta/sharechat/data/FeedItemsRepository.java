package com.example.swapnilgupta.sharechat.data;

import com.example.swapnilgupta.sharechat.models.FeedItem;

import java.util.List;

/**
 * Created by swapnilgupta on 02/09/2017.
 */

public interface FeedItemsRepository {

    interface LoadFeedsCallback {
        void onLoaded(List<FeedItem> itemList);
    }

    void loadMoreFeedsFromRemote(LoadFeedsCallback callback);

    void refreshFeedsFromRemote(LoadFeedsCallback callback);

    void loadFeedsFromLocal(LoadFeedsCallback callback);


    interface UpdateFeedsCallback {
        void onUpdateFeed(boolean success, FeedItem item);
    }

    void updateFeed(FeedItem item, UpdateFeedsCallback callback);
}