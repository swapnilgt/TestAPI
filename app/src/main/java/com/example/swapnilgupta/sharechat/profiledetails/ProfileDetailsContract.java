package com.example.swapnilgupta.sharechat.profiledetails;

import com.example.swapnilgupta.sharechat.basecontract.BaseContract;
import com.example.swapnilgupta.sharechat.models.FeedItem;
import com.example.swapnilgupta.sharechat.retrofit.models.FeedItemUpdateReq;

/**
 * Created by swapnilgupta on 03/09/2017.
 */

public interface ProfileDetailsContract {

    interface View {
        void showUserDetails(FeedItem item);

        void showUserPrompt(String s);
    }

    interface UserActionListener extends BaseContract.UserActionListener {

        void updateUserDetails(FeedItemUpdateReq item);

        void loadUserDetails(int id);
    }
}
