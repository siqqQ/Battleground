package com.battleground.battleground.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.battleground.battleground.R;
import com.battleground.battleground.activities.BattleActivity;
import com.battleground.battleground.models.Navigator;
import com.battleground.battleground.models.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BattleFragment extends Fragment {

    private Navigator navigator;
    private FirebaseDatabase mFirebaseDatabase;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myRef;
    private String userID;
    private static Bundle mExtras;
    private DrawerLayout mDrawerLayout;
    private User mUser;

    public BattleFragment() {
        // Required empty public constructor
    }

    public static BattleFragment instance(){
        BattleFragment battleFragment = new BattleFragment();

        return battleFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_battle, container, false);

        return view;
    }

    public void setNavigator(BattleActivity navigator) {
        this.navigator = navigator;
    }
}
