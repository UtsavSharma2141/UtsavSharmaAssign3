/*
Utsav Sharma N01392141 Section C
 */
package utsav.sharma.n01392141;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class SharmaFragment extends Fragment {
    Button btn, btnstart,btnstop;
    ImageView image;
    RadioGroup rg;
    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(utsav.sharma.n01392141.R.layout.fragment_sharma, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // initializing our button and adding on click listener to it.
        btn = view.findViewById(R.id.utsav_permission_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestPermissions();
            }
        });
        btnstart = view.findViewById(R.id.utsav_startBtn);
        btnstop = view.findViewById(R.id.utsav_stopBtn);
        image = view.findViewById(R.id.utsav_img1);
        rg = view.findViewById(R.id.utsav_radiobtn);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int id = rg.getCheckedRadioButtonId();
                BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger1);
                BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger2);
                BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger3);
                BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger4);
                BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger5);
                BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger6);
                BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger7);
                BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger8);
                BitmapDrawable frame9 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger9);
                BitmapDrawable frame10 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger10);
                final AnimationDrawable ad = new AnimationDrawable();
                switch (id) {
                    case R.id.utsav_speed1:
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 500);
                        ad.addFrame(frame2, 500);
                        ad.addFrame(frame3, 500);
                        ad.addFrame(frame4, 500);
                        ad.addFrame(frame5, 500);
                        ad.addFrame(frame6, 500);
                        ad.addFrame(frame7, 500);
                        ad.addFrame(frame8, 500);
                        ad.addFrame(frame9, 500);
                        ad.addFrame(frame10, 500);

                        image.setImageDrawable(ad);
                        btnstart.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();

                            }
                        });
                        break;

                    case R.id.utsav_speed2:
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 210);
                        ad.addFrame(frame2, 210);
                        ad.addFrame(frame3, 210);
                        ad.addFrame(frame4, 210);
                        ad.addFrame(frame5, 210);
                        ad.addFrame(frame6, 210);
                        ad.addFrame(frame7, 210);
                        ad.addFrame(frame8, 210);
                        ad.addFrame(frame9, 210);
                        ad.addFrame(frame10, 210);

                        image.setImageDrawable(ad);
                        btnstart.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();
                            }
                        });
                        break;

                    case R.id.utsav_speed3:
                        ;
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 100);
                        ad.addFrame(frame2, 100);
                        ad.addFrame(frame3, 100);
                        ad.addFrame(frame4, 100);
                        ad.addFrame(frame5, 100);
                        ad.addFrame(frame6, 100);
                        ad.addFrame(frame7, 100);
                        ad.addFrame(frame8, 100);
                        ad.addFrame(frame9, 100);
                        ad.addFrame(frame10, 100);

                        image.setImageDrawable(ad);
                        btnstart.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();
                            }
                        });
                        break;

                    case R.id.utsav_speed4:
                        ad.setOneShot(false);
                        ad.addFrame(frame1, 50);
                        ad.addFrame(frame2, 50);
                        ad.addFrame(frame3, 50);
                        ad.addFrame(frame4, 50);
                        ad.addFrame(frame5, 50);
                        ad.addFrame(frame6, 50);
                        ad.addFrame(frame7, 50);
                        ad.addFrame(frame8, 50);
                        ad.addFrame(frame9, 50);
                        ad.addFrame(frame10, 50);

                        image.setImageDrawable(ad);
                        btnstart.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ad.setVisible(true,true);
                                ad.start();

                            }
                        });
                        break;
                    default:
                        break;
                }

                btnstop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ad.stop();
                    }
                });

            }
        });
        }


    private void requestPermissions() {
        Dexter.withActivity(getActivity())
                .withPermissions(Manifest.permission.CAMERA,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.READ_CONTACTS)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        if (multiplePermissionsReport.areAllPermissionsGranted()) {
                            Toast.makeText(getActivity(), "All the permissions are granted..", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            showSettingsDialog();
                            Toast.makeText(getActivity(), "You need to give Permissions..", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {

                    }
                }).withErrorListener(error -> {
                    Toast.makeText(getActivity(), "Error occurred! Please go to settings to grant permissions ", Toast.LENGTH_SHORT).show();
                })
                .onSameThread().check();
    }

    private void showSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Need Permissions");
        builder.setMessage("This app needs permission to use this feature.");
        builder.setPositiveButton("GOTO SETTINGS", new DialogInterface.OnClickListener() {
           @Override
            public void onClick(DialogInterface dialog, int which) {

           }

            private String getPackageName() {
                return null;
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        builder.show();
    }



}
