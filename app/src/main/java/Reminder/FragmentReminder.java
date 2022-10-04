package Reminder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.vnpt.mydailyfitness.HustCare.pill_reminder.Pill_MainActivity;
import com.vnpt.mydailyfitness.R;

public class FragmentReminder extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = layoutInflater.inflate(R.layout.fragment_reminder, container, false);

        ImageView button1  = (ImageView) inflate.findViewById(R.id.set_medicion);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =  new Intent(getActivity(), Pill_MainActivity.class);
                startActivity(intent1);

            }
        });


        return inflate;
    }

}
