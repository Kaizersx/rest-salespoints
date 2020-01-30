package springboottest.controller;

import springboottest.CRUD.AddressRepos;
import springboottest.model.SalesPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class RestControllerTest {

    @Autowired

    AddressRepos addressRepos;
    @ResponseBody
    @GetMapping(value = "/salesPoints")

    public  String getLatLng() throws  IOException {

//        Coordinate  coordinate= new Coordinate(lat,lng);
//        String inline="";
//        URL newURL= new URL(coordinate.getURL());
//        HttpURLConnection conn=(HttpURLConnection) newURL.openConnection();
//        conn.setRequestMethod("GET");
//        conn.connect();
//        int responseCode=conn.getResponseCode();
//        if (responseCode!=200){
//            throw  new RuntimeException("HttpResponseCode: "+responseCode);
//        }
//        else {
//            Scanner sc=new Scanner(newURL.openStream());
//            while (sc.hasNext()){
//                inline+=sc.nextLine();
//            }
//            sc.close();
//        }
//
//        JSONObject jsonObject= new JSONObject(inline);
//        JSONObject object= jsonObject.getJSONObject("plus_code");


        Iterable<SalesPoint> salesPoints = this.addressRepos.findAll();

        String html = "";
        for (SalesPoint sales : salesPoints ) {
            html += sales + "<br>";
        }

        return html;

    }



}
