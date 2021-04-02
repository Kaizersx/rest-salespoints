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




    public String getURL() {
        return "https://suggestions.dadata.ru/suggestions/api/4_1/rs/geolocate/address?lat="+lat+"&lon="+lng+"&token=9010b79082c1d8e1fe0320c9f12f377d556f2238";
    }
}
