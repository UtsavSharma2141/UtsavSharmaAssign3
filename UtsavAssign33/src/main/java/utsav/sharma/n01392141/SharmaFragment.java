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

//        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger1);
//        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger2);
//        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger3);
//        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger4);
//        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger5);
//        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger6);
//        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger7);
//        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger8);
//        BitmapDrawable frame9 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger9);
//        BitmapDrawable frame10 = (BitmapDrawable)getResources().getDrawable(R.drawable.tiger10);

//        final AnimationDrawable ad = new AnimationDrawable();

//        ad.addFrame(frame1,500);
//        ad.addFrame(frame2,500);
//        ad.addFrame(frame3,500);
//        ad.addFrame(frame4,500);
//        ad.addFrame(frame5,500);
//        ad.addFrame(frame6,500);
//        ad.addFrame(frame7,500);
//        ad.addFrame(frame8,500);
//        ad.addFrame(frame9,500);
//        ad.addFrame(frame10,500);
//
//        image.setImageDrawable(ad);
//
//        btnstart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ad.start();
//                ad.setOneShot(false);
//            }
//        });
//
//        btnstop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ad.stop();
//            }
//        });
//
//
//    }

    private void requestPermissions() {
        // below line is use to request
        // permission in the current activity.
        // this method is use to handle error
// in runtime permissions
        Dexter.withActivity(getActivity())
                // below line is use to request the number of
                // permissions which are required in our app.
                .withPermissions(Manifest.permission.CAMERA,
                        // below is the list of permissions
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.READ_CONTACTS)
                // after adding permissions we are
                // calling an with listener method.
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        // this method is called when all permissions are granted
                        if (multiplePermissionsReport.areAllPermissionsGranted()) {
                            // do you work now
                            Toast.makeText(getActivity(), "All the permissions are granted..", Toast.LENGTH_SHORT).show();
                        }
                        // check for permanent denial of any permission
                        else{
//                        else if (multiplePermissionsReport.isAnyPermissionPermanentlyDenied()) {
                            // permission is denied permanently,
                            // we will show user a dialog message.
                            showSettingsDialog();
                            Toast.makeText(getActivity(), "You need to give Permissions..", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {

                    }
                }).withErrorListener(error -> {
                    // we are displaying a toast message for error message.
                    Toast.makeText(getActivity(), "Error occurred! Please go to settings to grant permissions ", Toast.LENGTH_SHORT).show();
                })
                // below line is use to run the permissions
                // on same thread and to check the permissions
                .onSameThread().check();
    }

    // below is the shoe setting dialog
    // method which is use to display a
    // dialogue message.
    private void showSettingsDialog() {
        // we are displaying an alert dialog for permissions
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // below line is the title
        // for our alert dialog.
        builder.setTitle("Need Permissions");

        // below line is our message for our dialog
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
                // this method is called when
                // user click on negative button.
                dialog.cancel();
            }
        });
        // below line is used
        // to display our dialog
        builder.show();
    }



}
