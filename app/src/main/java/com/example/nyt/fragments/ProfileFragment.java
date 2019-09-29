package com.example.nyt.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.nyt.R;


/**
 *  This is what you get when you click File > New > Fragment > blank fragment, and don't untick
 *  some of the checkboxes. There's a whole bunch of stuff included that would help you communicate
 *  with the parent Activity.
 *
 *  For the purposes of this app, we don't really need it but I keep it in here just to show you
 *  what it looks like.
 *
 */
public class ProfileFragment extends Fragment {
    // These are the keys of the data in the bundle (remember bundles store data as (key, value).
    // So my bundle would look sort of like "param1": "data for param1", "param2": "data for param2"
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // These are variables that we store the data from the bundle in
    private String mParam1;
    private String mParam2;

    // If the parent Activity implements OnFragmentInteractionListener, we can assign the parent
    // Activity to this variable. Then when an event happens we can call
    // mListener.onFragmentInteraction (thus the listener reacts to the event)
    private OnFragmentInteractionListener mListener;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * You can choose to use this instead of the constructor to create an instance.
     * It just makes it easier for you to pass arguments in (the bundle stuff is taken care of in
     * here).
     *
     * You can ignore it if you don't care about the bundle.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    // Here they give you an onCreate, which just assigns the arguments from the bundle to a
    // class variable.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // Here the View object representing the Fragment is "inflated" from the layout file. You can
    // think of inflating as just transforming the XML to an actual View object that can be
    // displayed on screen. XML is just text. We need to inflate it to become an actual thing.
    //
    // If you want to do your own thing to the View (e.g. setText on specific TextViews, set up
    // RecyclerView, you can do it here.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    // If I had a button in this Fragment, I would set its onClickListener onClick method to be
    // this. Then whenever the user presses the button, it would also make the listener call
    // onFragmentInteraction(string)...
    //
    // You should try it yourself by implementing a button and linking it to this method.
    public void onButtonPressed(String string) {
        if (mListener != null) {
            mListener.onFragmentInteraction(string);
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
    }

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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String string);
    }
}
