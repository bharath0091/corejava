package com.bharath0091.loadresources;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		String url = "file:///D:/dev/Workspace/PACI/paci-configuration/src/main/staticcontent/old-ici-tridion/2008_04_11_es-adv_tcm836-422820.jpg";
        URL imgUrl = null;
		try {
//			imgUrl = Test.class.getClassLoader().getResource(url);
			System.out.println("imgUrl " + imgUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			URL url2 = new URL(url);
			System.out.println("url2 " + url2);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

}
