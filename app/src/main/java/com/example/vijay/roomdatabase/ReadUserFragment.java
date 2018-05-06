package com.example.vijay.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragment extends Fragment {
    int id;
    String name, email;

    private android.widget.TextView readtext;

    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user, container, false);
        this.readtext = (TextView) view.findViewById(R.id.read_text);
        String info = "";
        List<User> users = MainActivity.myAppDatabase.myDataAccessObject().getUser();
        for (User usr : users) {
            id = usr.getId();
            name = usr.getName();
            email = usr.getEmail();
            info=info+"\n\n"+"id : "+id+"\n name : "+name+"\n email : "+email;
        }
        readtext.setText(info);


        return view;
    }

}
