package group4.tcss450.uw.edu.grocerypal450.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import group4.tcss450.uw.edu.grocerypal450.R;


public class ProfileFragment extends Fragment {
    public static final String TAG = "ProfileFragment";
    public static final String KEY = "userInfo";

    private ArrayList<String> mNameEmail;

    private TextView mShowName;
    private TextView mShowEmail;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mNameEmail = getArguments().getStringArrayList(KEY);
            System.out.println(mNameEmail);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        mShowName = (TextView) v.findViewById(R.id.showName);
        mShowEmail = (TextView) v.findViewById(R.id.showPassword);
        updateContent(mNameEmail.get(0), mNameEmail.get(1));
        return v;
    }

    public void updateContent(String name, String email) {
        mShowName.setText(name);
        mShowEmail.setText(email);
    }
/*
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }*/

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
/*    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }*/
}
