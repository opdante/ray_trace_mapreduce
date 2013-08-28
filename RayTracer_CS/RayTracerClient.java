/**
* This is the Ray tracer client. This will split the image into 
* multiple smaller images and apply the ray trace algorithm to 
* each image similar to a map function on a set of images, and then the image will be
* reconstituted similar to reduce function. 
* @author Thabang Ngazimbi
*/
package RayTracerCS;
import java.lang.String;

import RayTracerCS.RayTracerStub;
import java.io.File;
import java.io.IOException;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.async.Callback;
import org.apache.axis2.description.Parameter;


@SuppressWarnings("deprecation")
public class RayTracerClient extends RayTracerCallbackHandler {
	
	static double start;
	
	// Configuration Settings //////////////////////////////////////////////////////////////////
	
	static String repository = "/usr/apache-tomcat-5.5.28/webapps/axis2/WEB-INF/";
	static String rayPath = "http://localhost:8080/axis2/services/RayTracer";
	static String localHost = "http://localhost:";
	static int port1 = 6060;
	static int port2 = 6061;
	static int port3 = 6062;
	static int port4 = 6063;
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) throws Exception {
		// parse input.xml
		Parser.injectXML();
		String method = Parser.getMethod();
		
		// tests 
		if (method.equals("raytraceurl")) rayTraceURL_WS();
		else if (method.equals("raytrace")) rayTrace_WS();
		else if (method.equals("raytracesubview")) rayTraceSubView_WS();
		else if (method.equals("raytracemovie")) rayTraceMovie_WS();
		else if (method.equals("parallel4")) rayTraceSubViewParallel4_WS();
		else if (method.equals("parallel2")) rayTraceSubViewParallel2_WS();
		else System.out.println("input.xml: Insert method attribute!\n" +
							    "options: raytraceurl,raytrace,raytracesubview,raytracemovie,parallel4,parallel2");
	} 
	
	public static void displayIMG(String string) throws IOException {
		String path = string;
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200,200);
        f.setVisible(true);
	}
	
	public static void rayTraceURL_WS() throws Exception{
		start = System.currentTimeMillis();
	  	RayTracerStub stub = new RayTracerStub(ConfigurationContextFactory.createConfigurationContextFromFileSystem(repository));
		stub._getServiceClient().getOptions().setTo(new EndpointReference(rayPath));
		stub._getServiceClient().engageModule("addressing");
		stub._getServiceClient().getOptions().setUseSeparateListener(true);
		
		RayTracerStub.RayTraceURL rtURL = new RayTracerStub.RayTraceURL();
		
		rtURL.setSceneURL(Parser.getScene());
		rtURL.setCamera(Parser.getCamera());
		rtURL.setImageWidth(Parser.getWidth());
		rtURL.setImageHeight(Parser.getHeight());
		
	    RayTracerClient rtc = new RayTracerClient();
	    stub.startrayTraceURL(rtURL, rtc);
	}
	
	public static void rayTrace_WS() throws Exception {
		start = System.currentTimeMillis();
		RayTracerStub stub = new RayTracerStub(ConfigurationContextFactory.createConfigurationContextFromFileSystem(repository));
		stub._getServiceClient().getOptions().setTo(new EndpointReference(rayPath));
		stub._getServiceClient().engageModule("addressing");
		stub._getServiceClient().getOptions().setUseSeparateListener(true);
		
		RayTracerStub.RayTrace raytrace = new RayTracerStub.RayTrace();
		
		raytrace.setSceneURL(Parser.getScene());
		raytrace.setCamera(Parser.getCamera());
		raytrace.setImageWidth(Parser.getWidth());
		raytrace.setImageHeight(Parser.getHeight());
		
		RayTracerClient rtc = new RayTracerClient();
		stub.startrayTrace(raytrace, rtc);
		
	}

	public static void rayTraceSubView_WS() throws Exception{
		start = System.currentTimeMillis();
		RayTracerStub stub = new RayTracerStub(ConfigurationContextFactory.createConfigurationContextFromFileSystem(repository));
		stub._getServiceClient().getOptions().setTo(new EndpointReference(rayPath));
		stub._getServiceClient().engageModule("addressing");
		stub._getServiceClient().getOptions().setUseSeparateListener(true);
		
		RayTracerStub.RayTraceSubView rtSubView = new RayTracerStub.RayTraceSubView();
		
		rtSubView.setSceneURL(Parser.getScene());
		rtSubView.setCamera(Parser.getCamera());
		rtSubView.setImageWidth(Parser.getWidth());
		rtSubView.setImageHeight(Parser.getHeight());
		rtSubView.setSubView(Parser.getRectangle());
		
		RayTracerClient rtc = new RayTracerClient();
		stub.startrayTraceSubView(rtSubView, rtc);
	}
	
	public static void rayTraceSubViewParallel4_WS() throws Exception{
		start = System.currentTimeMillis();
		RayTracerStub stub1 = new RayTracerStub(ConfigurationContextFactory.
				 createConfigurationContextFromFileSystem(repository),rayPath);
		
		
		RayTracerStub stub2 = new RayTracerStub(ConfigurationContextFactory.
				 createConfigurationContextFromFileSystem(repository),rayPath);
		
		RayTracerStub stub3 = new RayTracerStub(ConfigurationContextFactory.
				 createConfigurationContextFromFileSystem(repository),rayPath);
		
		RayTracerStub stub4 = new RayTracerStub(ConfigurationContextFactory.
				 createConfigurationContextFromFileSystem(repository),rayPath);
		
		RayTracerStub.RayTraceSubView rtSubView1 = new RayTracerStub.RayTraceSubView();
		RayTracerStub.RayTraceSubView rtSubView2 = new RayTracerStub.RayTraceSubView();
		RayTracerStub.RayTraceSubView rtSubView3 = new RayTracerStub.RayTraceSubView();
		RayTracerStub.RayTraceSubView rtSubView4 = new RayTracerStub.RayTraceSubView();
		
		rtSubView1.setSceneURL(Parser.getScene());
		rtSubView1.setCamera(Parser.getCamera());
		rtSubView1.setImageWidth(Parser.getWidth());
		rtSubView1.setImageHeight(Parser.getHeight());
		rtSubView1.setSubView(Parser.getRectangles()[0]);
		
		rtSubView2.setSceneURL(Parser.getScene());
		rtSubView2.setCamera(Parser.getCamera());
		rtSubView2.setImageWidth(Parser.getWidth());
		rtSubView2.setImageHeight(Parser.getHeight());
		rtSubView2.setSubView(Parser.getRectangles()[1]);
		
		rtSubView3.setSceneURL(Parser.getScene());
		rtSubView3.setCamera(Parser.getCamera());
		rtSubView3.setImageWidth(Parser.getWidth());
		rtSubView3.setImageHeight(Parser.getHeight());
		rtSubView3.setSubView(Parser.getRectangles()[2]);
		
		rtSubView4.setSceneURL(Parser.getScene());
		rtSubView4.setCamera(Parser.getCamera());
		rtSubView4.setImageWidth(Parser.getWidth());
		rtSubView4.setImageHeight(Parser.getHeight());
		rtSubView4.setSubView(Parser.getRectangles()[3]);
		
		ServiceClient svc1 = stub1._getServiceClient();
		svc1.getAxisConfiguration().getTransportIn("http").addParameter(new  
				                                   Parameter("hostname", localHost + port1));
		svc1.getAxisConfiguration().getTransportIn("http").addParameter(new Parameter("port", ""+ port1));
		
		ServiceClient svc2 = stub2._getServiceClient();
		svc2.getAxisConfiguration().getTransportIn("http").addParameter(new
												   Parameter("hostname", localHost + port2)); 
		svc2.getAxisConfiguration().getTransportIn("http").addParameter(new Parameter("port", ""+ port2));
		
		ServiceClient svc3 = stub3._getServiceClient();
		svc3.getAxisConfiguration().getTransportIn("http").addParameter(new
												   Parameter("hostname", localHost + port3)); 
		svc3.getAxisConfiguration().getTransportIn("http").addParameter(new Parameter("port", ""+ port3));
		
		ServiceClient svc4 = stub4._getServiceClient();
		svc4.getAxisConfiguration().getTransportIn("http").addParameter(new
												   Parameter("hostname", localHost + port4)); 
		svc4.getAxisConfiguration().getTransportIn("http").addParameter(new Parameter("port", ""+ port4));
		
		stub1._getServiceClient().engageModule("addressing");
		stub1._getServiceClient().getOptions().setUseSeparateListener(true);
		
		stub2._getServiceClient().engageModule("addressing");
		stub2._getServiceClient().getOptions().setUseSeparateListener(true);
		
		stub3._getServiceClient().engageModule("addressing");
		stub3._getServiceClient().getOptions().setUseSeparateListener(true);

		stub4._getServiceClient().engageModule("addressing");
		stub4._getServiceClient().getOptions().setUseSeparateListener(true);
		
		RayTracerClient rtc1 = new RayTracerClient();
		RayTracerClient rtc2 = new RayTracerClient();
		RayTracerClient rtc3 = new RayTracerClient();
		RayTracerClient rtc4 = new RayTracerClient();
		
		stub1.startrayTraceSubView(rtSubView1,rtc1);
		stub2.startrayTraceSubView(rtSubView2,rtc2);
		stub3.startrayTraceSubView(rtSubView3,rtc3);
		stub4.startrayTraceSubView(rtSubView4,rtc4);
		
	}
	
	public static void rayTraceSubViewParallel2_WS() throws Exception{
		start = System.currentTimeMillis();
		RayTracerStub stub1 = new RayTracerStub(ConfigurationContextFactory.
				 createConfigurationContextFromFileSystem(repository),rayPath);
		
		
		RayTracerStub stub2 = new RayTracerStub(ConfigurationContextFactory.
				 createConfigurationContextFromFileSystem(repository),rayPath);
		
		
		RayTracerStub.RayTraceSubView rtSubView1 = new RayTracerStub.RayTraceSubView();
		RayTracerStub.RayTraceSubView rtSubView2 = new RayTracerStub.RayTraceSubView();

		rtSubView1.setSceneURL(Parser.getScene());
		rtSubView1.setCamera(Parser.getCamera());
		rtSubView1.setImageWidth(Parser.getWidth());
		rtSubView1.setImageHeight(Parser.getHeight());
		rtSubView1.setSubView(Parser.getRectangles()[0]);
		
		rtSubView2.setSceneURL(Parser.getScene());
		rtSubView2.setCamera(Parser.getCamera());
		rtSubView2.setImageWidth(Parser.getWidth());
		rtSubView2.setImageHeight(Parser.getHeight());
		rtSubView2.setSubView(Parser.getRectangles()[1]);
		

		
		ServiceClient svc1 = stub1._getServiceClient();
		svc1.getAxisConfiguration().getTransportIn("http").addParameter(new  
				                                   Parameter("hostname", localHost + port1));
		svc1.getAxisConfiguration().getTransportIn("http").addParameter(new Parameter("port", ""+ port1));
		
		ServiceClient svc2 = stub2._getServiceClient();
		svc2.getAxisConfiguration().getTransportIn("http").addParameter(new
												   Parameter("hostname", localHost + port2)); 
		svc2.getAxisConfiguration().getTransportIn("http").addParameter(new Parameter("port", ""+ port2));
		
		
		stub1._getServiceClient().engageModule("addressing");
		stub1._getServiceClient().getOptions().setUseSeparateListener(true);
		
		stub2._getServiceClient().engageModule("addressing");
		stub2._getServiceClient().getOptions().setUseSeparateListener(true);
		
		
		
		RayTracerClient rtc1 = new RayTracerClient();
		RayTracerClient rtc2 = new RayTracerClient();
		
		
		stub1.startrayTraceSubView(rtSubView1,rtc1);
		stub2.startrayTraceSubView(rtSubView2,rtc2);
		
	}
	
	public static void rayTraceMovie_WS() throws Exception{
		start = System.currentTimeMillis();
		RayTracerStub stub = new RayTracerStub(ConfigurationContextFactory.createConfigurationContextFromFileSystem(repository));
		stub._getServiceClient().getOptions().setTo(new EndpointReference(rayPath));
		stub._getServiceClient().engageModule("addressing");
		stub._getServiceClient().getOptions().setUseSeparateListener(true);
		
		RayTracerStub.RayTraceMovie rtMovie = new RayTracerStub.RayTraceMovie();
		
		rtMovie.setSceneURL(Parser.getScene());
		rtMovie.setCamera(Parser.getCameras());
		rtMovie.setImageWidth(Parser.getWidth());
		rtMovie.setImageHeight(Parser.getHeight());
		
		RayTracerClient rtc = new RayTracerClient();
		stub.startrayTraceMovie(rtMovie, rtc);
	}
}
