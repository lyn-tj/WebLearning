package com.lyn0801.jersey.client.ssl;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class InsecureHostnameVerifier implements HostnameVerifier {
    @Override
    public boolean verify(String hostName, SSLSession sslSession) {
        System.out.println("hostName = "+hostName);
        if("localhost".equals(hostName)){
            return true;
        }else{
            HostnameVerifier hv = HttpsURLConnection.getDefaultHostnameVerifier();
            return hv.verify(hostName,sslSession);
        }
    }
}
