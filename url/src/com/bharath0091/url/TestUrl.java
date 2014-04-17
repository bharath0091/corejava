package com.bharath0091.url;

import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.sql.Connection;

public class TestUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		try {
//			InputStream inputStream = new URL("http://www.klm.com/ams/ici/checkin/Main/../../cm/ici/images/A4_SXB_rail_EN_tcm488-476313.pdf").openStream();
//			System.out.println(inputStream);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
        URL imgUrl = null;
		try {
//			imgUrl = new URL("http://d10iajh91yp7e0.cloudfront.net/klm/KL_EC.JPG");
			imgUrl = new URL("http://www.ute1.klm.com");
            SocketAddress address = new InetSocketAddress("kl1243m1", 8080);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, address);
            HttpURLConnection conn = (HttpURLConnection) imgUrl.openConnection(proxy);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            System.out.println("response code" + conn.getResponseCode());
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//        InetSocketAddress address = new InetSocketAddress("127.0.0.1", Integer.parseInt(portNumber));
//            Proxy proxy = new Proxy(Proxy.Type.HTTP, address);



		

	}

}
