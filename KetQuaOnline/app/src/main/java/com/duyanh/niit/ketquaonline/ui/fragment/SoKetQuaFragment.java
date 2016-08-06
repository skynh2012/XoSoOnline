package com.duyanh.niit.ketquaonline.ui.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.duyanh.niit.ketquaonline.R;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Administrator on 05/08/2016.
 */
public class SoKetQuaFragment extends Fragment {


    private EditText edtNgayXem;

    private Spinner spnTinhThanh;

    private ArrayList<String> arrTinhThanh;

    private RadioGroup rdgKieuXem;

    private ArrayAdapter adapter;

    private int KieuXem = R.id.rdXemAll;

    private int nYear, nMonth, nDay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View soketquaView = inflater.inflate(R.layout.fragment_soketqua, container, false);

        edtNgayXem = (EditText) soketquaView.findViewById(R.id.edtNgayXem);

        String date = getArguments().getBundle("date").toString();

        edtNgayXem.setText(date);

        edtNgayXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();

                nYear = calendar.get(Calendar.YEAR);

                nMonth = calendar.get(Calendar.MONTH);

                nDay = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        edtNgayXem.setText(year + "/" + monthOfYear + "/" + dayOfMonth);
                    }
                }, nYear, nMonth, nDay);
            }
        });

        spnTinhThanh = (Spinner) soketquaView.findViewById(R.id.spnTinhThanh);

        arrTinhThanh = new ArrayList<>();

        adapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, arrTinhThanh);

        spnTinhThanh.setAdapter(adapter);

        dataTinhThanh();

        rdgKieuXem = (RadioGroup) soketquaView.findViewById(R.id.rdgKieuXem);

        rdgKieuXem.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                KieuXem = checkedId;
            }
        });

        return soketquaView;
    }

    private void dataTinhThanh() {
        arrTinhThanh.add("Truyền thống");

        arrTinhThanh.add("Miền nam");

        arrTinhThanh.add("Miền trung");

        adapter.notifyDataSetChanged();
    }


}
