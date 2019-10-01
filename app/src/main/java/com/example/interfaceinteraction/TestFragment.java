package com.example.interfaceinteraction;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {


    public TestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_test, container, false);


        //set the interface
        interaction.getNumber("5");//badge count for survey page

        return view;
    }



    TestFragment.TestInteraction interaction;
    public interface TestInteraction {
        void getNumber (String number);
    }


    @Override
    public void onAttach(Context context) {
        interaction = (TestFragment.TestInteraction) context;
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        if (interaction != null)
            interaction = null;
        super.onDetach();
    }
}
