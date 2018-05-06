package com.example.vijay.roomdatabase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment implements View.OnClickListener {
    int useridd;
    String emails;
    String names;
    private android.widget.TextView adduser;
    private android.widget.EditText userid;
    private android.widget.EditText name;
    private android.widget.EditText email;
    private android.widget.Button save;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);
        this.save = (Button) view.findViewById(R.id.save);
        this.email = (EditText) view.findViewById(R.id.email);
        this.name = (EditText) view.findViewById(R.id.name);
        this.userid = (EditText) view.findViewById(R.id.userid);
        this.adduser = (TextView) view.findViewById(R.id.adduser);
        save.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                useridd = Integer.parseInt(userid.getText().toString().trim());
                emails = email.getText().toString().trim();
                names = name.getText().toString().trim();


                User user = new User();
                user.setId(useridd);
                user.setEmail(emails);
                user.setName(names);
                MainActivity.myAppDatabase.myDataAccessObject().addUser(user);
                Toast.makeText(getActivity(), "data added successfully", Toast.LENGTH_SHORT).show();
                userid.setText("");
                email.setText("");
                userid.setText("");
                break;

        }

    }
}
