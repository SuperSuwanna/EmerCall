package suwannarod.snru.ac.th.emercall.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Instant;

import suwannarod.snru.ac.th.emercall.R;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{



//    Explicit
    private String tag = "MyTagV1";


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//     For Station1
        ImageView station1ImageView = getView().findViewById(R.id.imageViewStation1);
        station1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag,"You click Image Station1");
                callStation("1111");

            }
        });

        TextView station1TextView = getView().findViewById(R.id.textViewStation1);
        station1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click Text" + getString(R.string.station1));
                callStation("1111");
            }
        });

//     For Station2

        ImageView station2ImageView = getView().findViewById(R.id.imageViewStation2);
        station2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click Text" + getString(R.string.station2));
                callStation("2222");
            }
        });

        TextView station2TextView = getView().findViewById(R.id.textViewStation2);
        station2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click"+ getString(R.string.station2));
                callStation("2222");
            }
        });

//     For Station3
        ImageView station3ImageView = getView().findViewById(R.id.imageViewStation3);
        station3ImageView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click Text" + getString(R.id.imageViewStation3));
                callStation("3333");
            }

        });
        TextView station3TextView = getView().findViewById(R.id.textViewStation3);
        station3TextView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click"+ getString(R.id.textViewStation3));
                callStation("3333");
            }
        });

//     For Station4
        ImageView station4ImageView = getView().findViewById(R.id.imageViewStation4);
        station4ImageView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click Text" + getString(R.id.imageViewStation3));
                callStation("4444");
            }

        });
        TextView station4TextView = getView().findViewById(R.id.textViewStation4);
        station4TextView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Log.d(tag,"Click"+ getString(R.id.textViewStation3));
                callStation("4444");
            }
        });




   }  // Main Method

    public void callStation(String numberCall) {

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:=" + numberCall));
        startActivity(intent);




    } // callStation


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police, container, false);
        return view;
    }
}  // Main Class
