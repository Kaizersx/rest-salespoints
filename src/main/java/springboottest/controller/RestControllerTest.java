package springboottest.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import springboottest.CRUD.AddressRepos;
import springboottest.model.Coordinate;
import org.springframework.web.bind.annotation.*;
import springboottest.model.Salespointdo;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


@RestController
public class RestControllerTest {

    @Autowired
    AddressRepos addressRepos;


//    @RequestMapping("/salespoints")
//    public String mainpage(){
//
//        return "Hello, this is main page, please enter lat and lng";
//    }



    @GetMapping("/")
    public ModelAndView main (){

        List<Salespointdo>salespointdoList=addressRepos.findAll();

        ModelAndView modelAndView= new ModelAndView("index");

        modelAndView.addObject("salespoints",salespointdoList);

        return modelAndView;
    }

    @GetMapping("/salespoints")

    public  String getLatLng(@RequestParam String lat, @RequestParam String lng) throws IOException, JSONException {

        String codeResult;
        Coordinate coordinate= new Coordinate(Double.parseDouble(lat),Double.parseDouble(lng));
        String inline="";
        URL newURL= new URL(coordinate.getURL());
        HttpURLConnection conn=(HttpURLConnection) newURL.openConnection();

        conn.setRequestMethod("GET");
        conn.setDoOutput(true);

        int responseCode=conn.getResponseCode();
        if (responseCode!=200){
            throw  new RuntimeException("HttpResponseCode: "+responseCode);
        }
        else {
            Scanner sc=new Scanner(newURL.openStream());
            while (sc.hasNext()){
                inline+=sc.nextLine();
            }
            sc.close();
        }

        JSONObject jsonObject= new JSONObject(inline);

        JSONArray jsonArray= (JSONArray) jsonObject.get("suggestions");

        JSONObject object= (JSONObject)jsonArray.get(0);

        JSONObject data= (JSONObject) object.get("data");

        return data.get("region_iso_code").toString();




    }



}
