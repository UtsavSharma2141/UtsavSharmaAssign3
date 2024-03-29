/*
Utsav Sharma N01392141 Section C
 */
package utsav.sharma.n01392141;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class N01392141Fragment extends Fragment {

    TextView text_animation,text_animation2;
    Button start_animation,stop_animation;
    Animation rotateanimation;
    ImageView imageView,image2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_n01392141, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        text_animation = view.findViewById(R.id.utsav_tab3fname);
        text_animation2 = view.findViewById(R.id.utsav_tab3lname);
        start_animation = view.findViewById(R.id.utsav_start_animationBtn);
        stop_animation = view.findViewById(R.id.utsav_stop_animationBtn);
        imageView = view.findViewById(R.id.utsav_earth);
        image2 = view.findViewById(R.id.utsav_moon);




        start_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateAnimation();
                startAnimation();

            }
        });

        stop_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAnimation();

            }
        });
    }
    public void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim);
        image2.startAnimation(animation);
    }


    public void stopAnimation(){
        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim);
        image2.clearAnimation();
        imageView.clearAnimation();
    }

    private void rotateAnimation(){
        rotateanimation = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);
        imageView.startAnimation(rotateanimation);
    }
}