package com.boblyn;

import java.net.*;
import java.util.Enumeration;

public class IPUtil {

    public static String getIpAddress(){
        String ipAddress = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()){
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()){
                    InetAddress inetAddress = inetAddresses.nextElement();
                    if(inetAddress instanceof Inet4Address){
                        ipAddress = inetAddress.getHostAddress();
                        System.out.println(networkInterface.getDisplayName()+"="+ipAddress);
                    }
                }
            }
        }catch (SocketException se){
            se.printStackTrace();
        }

        return ipAddress;
    }

    public static void main(String[] args) {
        System.out.println(getIpAddress());
    }
}
