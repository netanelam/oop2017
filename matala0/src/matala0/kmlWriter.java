package matala0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class kmlWriter {


	//
	public static void kmlWriter(String fileName, Wifi[] er){


		try {
			FileWriter fw = new FileWriter(fileName);
			PrintWriter outs = new PrintWriter(fw);



			outs.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			outs.println("<kml xmlns=\"http://www.opengis.net/kml/2.2\">");
			outs.println("<Document>");

			for (int i = 0; i <10 ; i++) {

				outs.println("<Placemark>");
				outs.println("<name>"+er[i].SSID+"</name>");
				outs.println("<description>SSID</description>");
				outs.println("<Point>");
				outs.println("<coordinates>"+er[i].CurrentLongitude+","+er[i].CurrentLatitude+","+0+"</coordinates>");
				outs.println("</Point>");
				outs.println("</Placemark>");
			}

			outs.println("</Doucment>");
			outs.println("</kml>");


			outs.close();
			fw.close();
		}
		catch(IOException ex) {
			System.out.print("Error writing file\n" + ex);
			System.exit(2);

		}
	}

}
