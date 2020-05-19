package com.rssreader1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GetXml {

    URL url;
    HttpURLConnection connection;
    InputStream stream;
    ArrayList < Item > items;





    public ArrayList<Item> getItems() {
		return items;
	}





	public GetXml(String urlString) {
		
		if(urlString.isEmpty())
			return ;
	
    	items = new ArrayList<Item>();
        try {
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/xml");
            connection.setRequestProperty("Content-Type", "application/xml");
            connection.connect();
            stream = connection.getInputStream();
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        // GET RSS STRING
        InputStreamReader isReader = new InputStreamReader(stream);
        BufferedReader in = new BufferedReader(isReader);
        StringBuilder sb = new StringBuilder();
        String line;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(stream);
            NodeList newsList = document.getElementsByTagName("item");


            for (int i = 0; i < newsList.getLength(); i++) {

                NodeList node = newsList.item(i).getChildNodes();

                Element enclosure = (Element) node.item(4);
                
               	String image =enclosure.getAttribute("url");
                
                Date date = new Date(node.item(2).getTextContent());

                Item item = new Item(node.item(0).getTextContent(),node.item(1).getTextContent(), date,image);
                
                items.add(item);
            }

        } catch (ParserConfigurationException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	
	
	public ArrayList<Item> sort_items_ascending(ArrayList<Item> items) {
		
		Collections.sort(items, new Comparator<Item>() {

		
			public int compare(Item o1, Item o2) {
				// TODO Auto-generated method stub
				return o1.getDate().compareTo(o2.getDate());
			}
		});;
		
		return items;
		
		
	}
	
	public ArrayList<Item> sort_items_descending(ArrayList<Item> items) {
		
		Collections.sort(items, new Comparator<Item>() {

		
			public int compare(Item o1, Item o2) {
				// TODO Auto-generated method stub
				return o2.getDate().compareTo(o1.getDate());
			}
		});;
		
		return items;
		
		
	}



}