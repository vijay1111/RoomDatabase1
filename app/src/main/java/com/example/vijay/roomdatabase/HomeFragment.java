package com.example.vijay.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    private Button add;
    private Button viewuser;
    private Button delete;
    private Button update;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        this.update = (Button) view.findViewById(R.id.update);
        this.delete = (Button) view.findViewById(R.id.delete);
        this.viewuser = (Button) view.findViewById(R.id.view_user);
        this.add = (Button) view.findViewById(R.id.add);

        add.setOnClickListener(this);
        update.setOnClickListener(this);
        delete.setOnClickListener(this);
        viewuser.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,
                        new AddUserFragment()).addToBackStack(null).commit();
                break;
            case R.id.update:
                break;
            case R.id.delete:
                break;
            case R.id.view_user:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,
                        new ReadUserFragment()).addToBackStack(null).commit();
                break;

        }

    }
}
