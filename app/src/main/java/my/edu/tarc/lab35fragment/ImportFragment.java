package my.edu.tarc.lab35fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {
    private TextView textViewMsg;

    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_import, container, false);
        textViewMsg = view.findViewById(R.id.textViewMessage);
        Button buttonShow = view.findViewById(R.id.showButton);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMsg.setText("Hello World!");
            }
        });
        return view;
    }

}
