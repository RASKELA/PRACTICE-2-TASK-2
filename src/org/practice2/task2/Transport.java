package org.practice2.task2;

public class Transport {
    private final String type;
    private final String route;
    private final String driverName;
    private final int capacity;
    private final boolean gpsEnabled;

    public Transport(String type, String route, String driverName, int capacity, boolean gpsEnabled) {
        this.type = type;
        this.route = route;
        this.driverName = driverName;
        this.capacity = capacity;
        this.gpsEnabled = gpsEnabled;
    }

    public String getType() {
        return type;
    }

    public String getRoute() {
        return route;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isGpsEnabled() {
        return gpsEnabled;
    }

    @Override
    public String toString() {
        return "org.practice2.task2.Transport{" +
                "type='" + type + '\'' +
                ", route='" + route + '\'' +
                ", driverName='" + driverName + '\'' +
                ", capacity=" + capacity +
                ", gpsEnabled=" + gpsEnabled +
                '}';
    }
}