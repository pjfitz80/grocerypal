package group4.tcss450.uw.edu.grocerypal450.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import group4.tcss450.uw.edu.grocerypal450.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlannerFragment extends Fragment {


    public PlannerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_planner, container, false);
    }

}
