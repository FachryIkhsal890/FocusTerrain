package com.fachryikhsal.navdrawfromscratch;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class StatisticsFragment extends Fragment {
    private LineChart mChartHistory;
    private ArrayList<DummyObject> list = new ArrayList<>();
    private List<Entry> entries;
    private LineDataSet lineDataSet;
    private LineData lineData;

    private int userFinishedSession;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment
        View view = inflater.inflate(R.layout.fragment_statistics, container, false);

        // Make chart
        mChartHistory = (LineChart) view.findViewById(R.id.chartOne);

        // Make data
        // list.addAll(DummyData.getListData());
        entries = new ArrayList<Entry>();
        entries.add(new Entry(1, 0));
        entries.add(new Entry(2, 0));
        entries.add(new Entry(3, 0));
        entries.add(new Entry(4, 0));

        lineDataSet = new LineDataSet(entries, "Data penggunaan");
        lineData = new LineData(lineDataSet);
        mChartHistory.setData(lineData);
        lineDataSet.setColor(Color.BLACK);
        lineDataSet.setValueTextColor(Color.WHITE);
        lineDataSet.setValueTextSize(20f);
        lineDataSet.setDrawFilled(true);

        final String[] quarters = new String[]{"31 May", "1 June", "2 June", "3 June"};
        ValueFormatter formatter = new ValueFormatter() {
            @Override
            public String getAxisLabel(float value, AxisBase axis) {
                return quarters[(int) value - 1];
            }
        };
        XAxis xAxis = mChartHistory.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(formatter);
        return view;
    }
}