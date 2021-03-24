/*
Utsav Sharma N01392141 Section C
 */
package utsav.sharma.n01392141;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class UtsavFragment extends Fragment {


    CanvasView canvasView;
    Spinner colorSpinner, widthSpinner;


    Button btn, resetBtn;
    int strokeColor = Color.BLACK;
    float strokeWidth = 10f;

    ArrayList<String> colorList, widthList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_utsav, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        canvasView = view.findViewById(R.id.utsav_canvas);
        widthSpinner = view.findViewById(R.id.utsav_widthSpin);

        btn = view.findViewById(R.id.utsav_setBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCanvasValue();
            }
        });

        resetBtn = view.findViewById(R.id.utsav_resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCanvas();
            }
        });

        colorList = new ArrayList<>();
        colorList.addAll(Arrays.asList(getResources().getStringArray(R.array.colorsArr)));

        widthList = new ArrayList<>();
        widthList.addAll(Arrays.asList(getResources().getStringArray(R.array.widthArr)));

        colorSpinner = view.findViewById(R.id.utsav_colorSpin);
        colorSpinner.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.select_dialog_item,colorList));
        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String color = colorList.get(position);
                switch (color){
                    case "Yellow":
                        strokeColor = Color.YELLOW;
                        break;

                    case "Red":
                        strokeColor = Color.RED;
                        break;
                    case "Blue":
                        strokeColor = Color.BLUE;
                        break;

                    default:
                        strokeColor = Color.BLACK;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        widthSpinner.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.select_dialog_item,widthList));
        widthSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String width = widthList.get(position);
                switch (width){
                    case "15":
                        strokeWidth = 15f;
                        break;

                    case "30":
                        strokeWidth = 30f;
                        break;
                    case "40":
                        strokeWidth = 40f;
                        break;

                    default:
                        strokeWidth = 10f;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void changeCanvasValue(){
        canvasView.changeValue(strokeColor,strokeWidth);

    }

    private void resetCanvas(){
        canvasView.resetView();
    }
}