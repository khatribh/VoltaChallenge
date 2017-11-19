package com.volta.challenge.controller;

import com.google.gson.Gson;
import com.volta.challenge.pojo.Station;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class StationController {
    @RequestMapping(value="/stations", method = RequestMethod.GET)
    public String getCars(Model model) throws IOException {
        URL obj = new URL("https://api.voltaapi.com/v1/stations");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {

            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());

        Gson gson=new Gson();
        Station stations[]=gson.fromJson(response.toString(),Station[].class);
        ArrayList<Station> stationList=new ArrayList<Station>(Arrays.asList(stations));
        model.addAttribute("result",stationList);
        return "station";

    }
}
