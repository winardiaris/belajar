/*package com.urldata.tutorials;*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlData {
  public static void main(String[]args){
    try{
     URL url = new URL("http://localhost/uangku/?op=viewdata&uid=1&from=2015-01-01&to=2015-12-31&type=in&limit=100");
     BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

     String strTemp = "";
     while(null != (strTemp = br.readLine())){
       System.out.println(strTemp);
     }
    }
    catch (Exception ex){
      ex.printStackTrace();
    }
  }
}
