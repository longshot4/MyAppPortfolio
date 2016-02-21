package runski.mark.myappportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainAppSelectorActivityFragment extends Fragment {


    public MainAppSelectorActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_app_selector, container, false);


        // Spotify Section
        Button spotifyButton = (Button)view.findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = getText(R.string.spotify_streamer_toast);
                int duration = Toast.LENGTH_SHORT;
                Toast spotToast = Toast.makeText(context, text, duration);
                spotToast.show();
            }
        });

        // Scores Section
        Button scoresButton = (Button)view.findViewById(R.id.scores_button);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = getText(R.string.scores_toast);
                int duration = Toast.LENGTH_SHORT;
                Toast scoreToast = Toast.makeText(context, text, duration);
                scoreToast.show();
            }
        });

        // Library Section
        Button libraryButton = (Button)view.findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = getText(R.string.library_app_toast);
                int duration = Toast.LENGTH_SHORT;
                Toast libraryToast = Toast.makeText(context, text, duration);
                libraryToast.show();
            }
        });

        // Build it Bigger Section
        Button buildBigButton = (Button)view.findViewById(R.id.build_bigger_button);
        buildBigButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = getText(R.string.build_it_bigger_toast);
                int duration = Toast.LENGTH_SHORT;
                Toast buildToast = Toast.makeText(context, text, duration);
                buildToast.show();
            }
        });

        // XYZ Section
        Button xyzButton = (Button)view.findViewById(R.id.xyz_button);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = getText(R.string.xyz_reader_toast);
                int duration = Toast.LENGTH_SHORT;
                Toast xyzToast = Toast.makeText(context, text, duration);
                xyzToast.show();
            }
        });

        // Capstone Section
        Button capstoneButton = (Button)view.findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = getText(R.string.capstone_toast);
                int duration = Toast.LENGTH_SHORT;
                Toast capToast = Toast.makeText(context, text, duration);
                capToast.show();
            }
        });
        return view;
    }
}
