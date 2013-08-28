
/**
 * RayTracerSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package ray_tracer;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import threeD.io.FileEncoder;
import threeD.raytracer.graphics.RGB;
import threeD.raytracer.util.Vector;
import edu.indiana.extreme.DistributedRayTracer;
import edu.indiana.extreme.SceneVectorGraphics;

/**
 *  RayTracerSkeleton java skeleton for the axisService
 */
public class RayTracerSkeleton{

	// Configuration Settings //////////////////////////////////////////////////////////////////

	protected String rt_file_o = "./../../usr/apache-tomcat-5.5.28/webapps/ROOT/rayTraceImage/";
	protected String rt_uri = "http://localhost:8080/rayTraceImage/";

	////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Auto generated method signature
	 * 
	 * @param rayTraceSubView
	 * @throws IOException 
	 */
	public ray_tracer.RayTraceSubViewResponse rayTraceSubView
	(ray_tracer.RayTraceSubView rayTraceSubView) throws IOException
	{
		ray_tracer.RayTraceSubViewResponse response = new ray_tracer.RayTraceSubViewResponse(); 
		DistributedRayTracer tracer = new DistributedRayTracer();

		int imageHeight = rayTraceSubView.getImageHeight();
		int imageWidth = rayTraceSubView.getImageWidth();

		ray_tracer.CameraSetup camerastp= rayTraceSubView.getCamera();
		Vector location= new Vector(camerastp.getLocation().getX(),camerastp.getLocation().getY(),camerastp.getLocation().getZ());
		Vector direction= new Vector(camerastp.getDirection().getX(),camerastp.getDirection().getY(),camerastp.getDirection().getZ());
		edu.indiana.extreme.CameraSetup camera = new edu.indiana.extreme.CameraSetup(direction, location);

		URL xmlurl=null;
		try{
			xmlurl=new URL(rayTraceSubView.getSceneURL());
		}catch(Exception e){
			e.printStackTrace();
		}
		SceneVectorGraphics sceneHolder = new SceneVectorGraphics(xmlurl);

		ray_tracer.Rectangle subView = rayTraceSubView.getSubView();
		double minX = subView.getMinX();
		double minY = subView.getMinY();
		double maxX = subView.getMaxX();
		double maxY = subView.getMaxY(); 

		Rectangle rect = new Rectangle(); 
		rect.setRect(minX,minY,maxX-minX,maxY-minY);
		System.out.println(counter.getCounter());
		RGB[][] rgb = tracer.rayTrace(camera, sceneHolder, imageWidth, imageHeight, rect);

		FileEncoder.encodeImageFile(rgb, new File(rt_file_o + "suboutput"+counter.getCounter()+".jpg"), 6); 
		response.setImageURL(rt_uri + "suboutput"+counter.getCounter()+".jpg");
		counter.addCounter();

		return response;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param rayTrace
	 * @throws IOException 
	 */

	public ray_tracer.RayTraceResponse rayTrace
	(
			ray_tracer.RayTrace rayTrace
			) throws IOException
			{
		ray_tracer.RayTraceResponse response = new ray_tracer.RayTraceResponse();
		DistributedRayTracer tracer = new DistributedRayTracer();

		int imageHeight = rayTrace.getImageHeight();
		int imageWidth = rayTrace.getImageWidth();

		ray_tracer.CameraSetup camerastp= rayTrace.getCamera();
		Vector location= new Vector(camerastp.getLocation().getX(),camerastp.getLocation().getY(),camerastp.getLocation().getZ());
		Vector direction= new Vector(camerastp.getDirection().getX(),camerastp.getDirection().getY(),camerastp.getDirection().getZ());
		edu.indiana.extreme.CameraSetup camera = new edu.indiana.extreme.CameraSetup(direction, location);

		URL xmlurl=null;
		try{
			xmlurl=new URL(rayTrace.getSceneURL());
		}catch(Exception e){
			e.printStackTrace();
		}
		SceneVectorGraphics sceneHolder = new SceneVectorGraphics(xmlurl);

		RGB[][] rgb = tracer.rayTrace(camera, sceneHolder, imageWidth, imageHeight);
		ArrayOfRGBColor[] rgb_col_array = new ArrayOfRGBColor[imageHeight];

		double rgbRed,rgbGreen,rgbBlue;
		for(int j= 0; j < imageHeight; j++ ) {
			RGBColor[] rgbtemp_array = new RGBColor[imageWidth];  
			rgb_col_array[j] = new ArrayOfRGBColor();
			for(int i = 0; i < imageWidth; i++) {
				rgbtemp_array[i] = new RGBColor();

				rgbRed = rgb[j][i].getRed();
				rgbGreen = rgb[j][i].getGreen();
				rgbBlue = rgb[j][i].getBlue();

				rgbtemp_array[i].setRed(rgbRed);
				rgbtemp_array[i].setGreen(rgbGreen);
				rgbtemp_array[i].setBlue(rgbBlue);
			}
			rgb_col_array[j].setArray(rgbtemp_array);
		}
		response.set_return(rgb_col_array);
		return response;
			}


	/**
	 * Auto generated method signature
	 * 
	 * @param rayTraceMovie
	 * @throws IOException 
	 */

	public ray_tracer.RayTraceMovieResponse rayTraceMovie
	(
			ray_tracer.RayTraceMovie rayTraceMovie
			) throws IOException
			{
		ray_tracer.RayTraceMovieResponse response = new ray_tracer.RayTraceMovieResponse();
		DistributedRayTracer tracer = new DistributedRayTracer();

		int imageHeight = rayTraceMovie.getImageHeight();
		int imageWidth =  rayTraceMovie.getImageWidth();

		ray_tracer.CameraSetup[] camerastp= rayTraceMovie.getCamera();
		String url[] = new String[camerastp.length]; 

		for (int i=0;i<camerastp.length;i++) {
			Vector location= new Vector(camerastp[i].getLocation().getX(),camerastp[i].getLocation().getY(),camerastp[i].getLocation().getZ());
			Vector direction= new Vector(camerastp[i].getDirection().getX(),camerastp[i].getDirection().getY(),camerastp[i].getDirection().getZ());
			edu.indiana.extreme.CameraSetup camera = new edu.indiana.extreme.CameraSetup(direction, location);

			URL xmlurl=null;
			try{
				xmlurl=new URL(rayTraceMovie.getSceneURL());
			}catch(Exception e){
				e.printStackTrace();
			}
			SceneVectorGraphics sceneHolder = new SceneVectorGraphics(xmlurl);

			RGB[][] rgb = tracer.rayTrace(camera, sceneHolder, imageWidth, imageHeight);

			//  path is specific to ROOT/rayTraceImage folder in tomcat src
			FileEncoder.encodeImageFile(rgb, new File(rt_file_o+ "output"+i+".jpg"), 6); 
			url[i]=rt_uri+"output"+i+".jpg";
		}
		response.setImageURL(url);
		return response;   
			}


	/**
	 * Auto generated method signature
	 * 
	 * @param rayTraceURL
	 * @throws IOException 
	 */
	public ray_tracer.RayTraceURLResponse rayTraceURL
	(
			ray_tracer.RayTraceURL rayTraceURL
			) throws IOException
			{
		ray_tracer.RayTraceURLResponse response = new ray_tracer.RayTraceURLResponse();
		DistributedRayTracer tracer = new DistributedRayTracer();

		int imageHeight = rayTraceURL.getImageHeight();
		int imageWidth =  rayTraceURL.getImageWidth();

		ray_tracer.CameraSetup camerastp= rayTraceURL.getCamera();
		Vector location= new Vector(camerastp.getLocation().getX(),camerastp.getLocation().getY(),camerastp.getLocation().getZ());
		Vector direction= new Vector(camerastp.getDirection().getX(),camerastp.getDirection().getY(),camerastp.getDirection().getZ());
		edu.indiana.extreme.CameraSetup camera = new edu.indiana.extreme.CameraSetup(direction, location);

		URL xmlurl=null;
		try{
			xmlurl=new URL(rayTraceURL.getSceneURL());
		}catch(Exception e){
			e.printStackTrace();
		}
		SceneVectorGraphics sceneHolder = new SceneVectorGraphics(xmlurl);

		RGB[][] rgb = tracer.rayTrace(camera, sceneHolder, imageWidth, imageHeight);

		//  path is specific to ROOT/rayTraceImage folder in tomcat src
		FileEncoder.encodeImageFile(rgb, new File(rt_file_o + "output.jpg"), 6); 

		response.setImageURL(rt_uri + "output.jpg");
		return response;

			}

}
