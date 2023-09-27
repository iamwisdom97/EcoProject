package com.example.eco.externalAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Service
@RequiredArgsConstructor
public class BuildingInfoService {

    String serviceKey = "2Stxhk2HR66yDCmRIqwi%2FqAVQIdRindin2p1UxoRvNMMKpZ9uxDxccAaPA2BHExS3rIdnTYyJ98UWecRCRwTZQ%3D%3D";

    public String getBuildingInformation(String sigunguCd, String bjdongCd) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1613000/BldRgstService_v2/getBrTitleInfo"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("sigunguCd", "UTF-8") + "=" + URLEncoder.encode(sigunguCd, "UTF-8")); /*행정표준코드*/
        urlBuilder.append("&" + URLEncoder.encode("bjdongCd", "UTF-8") + "=" + URLEncoder.encode(bjdongCd, "UTF-8")); /*행정표준코드*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");

        BufferedReader rd;

        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }

        rd.close();
        conn.disconnect();

        return xmlToJson(sb);
    }

    public String xmlToJson(StringBuilder str) {
        String output = "";
        try {
            JSONObject jObject = XML.toJSONObject(String.valueOf(str));
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            Object json = mapper.readValue(jObject.toString(), Object.class);
            output = mapper.writeValueAsString(json);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }
}
