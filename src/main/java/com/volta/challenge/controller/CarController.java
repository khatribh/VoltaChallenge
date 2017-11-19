package com.volta.challenge.controller;

import com.google.gson.Gson;
import com.volta.challenge.pojo.Car;
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
import java.util.HashMap;
import java.util.Map;

@Controller
public class CarController {

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCars(Model model) throws IOException {
        URL obj = new URL("https://api.voltaapi.com/v1/cars");
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

        Gson gson = new Gson();
        Car c[] = gson.fromJson(response.toString(), Car[].class);
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(c));


        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (int i = 0; i < c.length; i++) {
            if (countMap.containsKey(c[i].getMake())) {
                countMap.put(c[i].getMake(), countMap.get(c[i].getMake()) + 1);
            } else {
                countMap.put(c[i].getMake(), 1);
            }
        }
        Object[][] result = new Object[countMap.size() + 1][2];

        int i = 1;
        result[0][0] = "Make";
        result[0][1] = "Model";
        for (Map.Entry<String, Integer> m : countMap.entrySet()) {

            result[i][0] = m.getKey();
            result[i][1] = m.getValue();
            i++;
        }
        model.addAttribute("result", result);

        return "cars";

    }
}
