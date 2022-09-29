package com.example.smiledetection;

public class DataAmplitudePhase {
    private double eventTime;
    private double amplitude;
    private double phase;

    DataAmplitudePhase(double eventTime, double amplitude, double phase) {
        this.eventTime = eventTime;
        this.amplitude = amplitude;
        this.phase = phase;
    }

    public double getEventTime() {
        return eventTime;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public double getPhase() {
        return phase;
    }

    public void setEventTime(double eventTime) {
        this.eventTime = eventTime;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public void setPhase(double phase) {
        this.phase = phase;
    }
}
