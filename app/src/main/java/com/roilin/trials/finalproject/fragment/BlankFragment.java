package com.roilin.trials.finalproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.roilin.trials.finalproject.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private static final String LOG_SOURCE = "BlankFragment";
    // TODO: Rename and change types of parameters
    private TextView textFlavor;

    private TextView textISO;
    private TextView textShutter;
    private TextView textWB;
    private TextView textEV;

    private TextView valueISO;
    private TextView valueShutter;
    private TextView valueWB;
    private TextView valueEV;

    public BlankFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        textFlavor = v.findViewById(R.id.fragmentTitle);
        textISO = v.findViewById(R.id.textIso);
        textShutter= v.findViewById(R.id.textShutterSpeed);
        textWB= v.findViewById(R.id.textWB);
        textEV= v.findViewById(R.id.textEv);

        valueISO= v.findViewById(R.id.valueISO);
        valueShutter= v.findViewById(R.id.valueShutter);
        valueWB= v.findViewById(R.id.valueWB);
        valueEV= v.findViewById(R.id.valueEV);

        Log.i(LOG_SOURCE,"Item Populated");

        return v;
    }
}