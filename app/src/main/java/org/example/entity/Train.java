package org.example.entity;

import java.util.List;
import java.util.Map;
import java.util.Timer;

public class Train {

    private String trainId;

    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String, Timer> stationTimes;

    private List<String> stations;
}
