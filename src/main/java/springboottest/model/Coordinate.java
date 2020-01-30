package springboottest.model;


public class Coordinate {


     private double  lat;
     private double  lng;

     public Coordinate(double lat, double lng ){
         this.lat=lat;
         this.lng=lng;

     }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }


    private String URL="https://maps.googleapis.com/maps/api/geocode/json?latlng="+lat+","+lng+"&key=AIzaSyA2oY0hwe-NqI11vRi0b15n-rvWOLhp6t0";

    public String getURL() {
        return URL;
    }
}
