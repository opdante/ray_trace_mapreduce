
/**
 * RayTracerCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package RayTracerCS;

import java.io.File;
import java.io.IOException;

import threeD.io.FileEncoder;
import threeD.raytracer.graphics.RGB;
import RayTracerCS.RayTracerStub.ArrayOfRGBColor;

/**
 *  RayTracerCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class RayTracerCallbackHandler{

	
	
    	protected Object clientData;
    	
    	/**
    	 * User can pass in any object that needs to be accessed once the NonBlocking
    	 * Web service call is finished and appropriate method of this CallBack is called.
    	 * @param clientData Object mechanism by which the user can pass in user data
    	 * that will be avilable at the time this callback is called.
    	 */
    	public RayTracerCallbackHandler(Object clientData){
    		this.clientData = clientData;
    	}

    	/**
    	 * Please use this constructor if you don't want to set any clientData
    	 */
    	public RayTracerCallbackHandler(){
    		this.clientData = null;
    	}

    	/**
    	 * Get the client data
    	 */

    	public Object getClientData() {
    		return clientData;
    	}
    	/**
    	 * auto generated Axis2 call back method for rayTraceSubView method
    	 * override this method for handling normal response from rayTraceSubView operation
    	 */
   		public void receiveResultrayTraceSubView(RayTracerCS.RayTracerStub.RayTraceSubViewResponse result) 
   		{
   			System.out.println("The Image URL: " + result.getImageURL());
   			System.out.print("Time: "+(System.currentTimeMillis()-RayTracerClient.start)/1000+" Secs\n");
     		System.exit(0);
   		}
   		
   		/**
   		 * auto generated Axis2 Error handler
   		 * override this method for handling error response from rayTraceSubView operation
   		 */
     	public void receiveErrorrayTraceSubView(java.lang.Exception e) 
     	{
     	}
                
     	/**
     	 * auto generated Axis2 call back method for rayTrace method
     	 * override this method for handling normal response from rayTrace operation
     	 * @throws IOException 
     	 */
     	public void receiveResultrayTrace(RayTracerCS.RayTracerStub.RayTraceResponse result) throws IOException 
     	{
     		ArrayOfRGBColor[] rgb_col = result.get_return();
    		RGB[][] rgb = new RGB[rgb_col.length][rgb_col[0].getArray().length];
    		
    		double rgbRed,rgbGreen,rgbBlue;
            for(int j= 0; j < rgb_col.length; j++ ) {
           	 for(int i = 0; i < rgb_col[0].getArray().length; i++) {
           		rgb[j][i] = new RGB();
           		
           		rgbRed = rgb_col[j].getArray()[i].getRed();
           		rgbGreen = rgb_col[j].getArray()[i].getGreen();
           		rgbBlue = rgb_col[j].getArray()[i].getBlue();
           		
           		rgb[j][i].setRed(rgbRed);
           		rgb[j][i].setGreen(rgbGreen);
           		rgb[j][i].setBlue(rgbBlue);
           	 }
            }
            FileEncoder.encodeImageFile(rgb, new File("raytraceOutput.jpg"), 6);
            RayTracerClient.displayIMG("raytraceOutput.jpg");
            System.out.print("Time: "+(System.currentTimeMillis()-RayTracerClient.start)/1000+" Secs\n");
     	}
     	
     	/**
     	 * auto generated Axis2 Error handler
     	 * override this method for handling error response from rayTrace operation
     	 */
     	public void receiveErrorrayTrace(java.lang.Exception e)
     	{
     	}
                
     	/**
     	 * auto generated Axis2 call back method for rayTraceMovie method
     	 * override this method for handling normal response from rayTraceMovie operation
     	 */
     	public void receiveResultrayTraceMovie(RayTracerCS.RayTracerStub.RayTraceMovieResponse result) {
     		String url[] = result.getImageURL();
    		for (int i = 0; i < url.length; i++) {
    			System.out.println("The Image URL (Frame"+i+") " +url[i]);
    		}
    		System.out.print("Time: "+(System.currentTimeMillis()-RayTracerClient.start)/1000+" Secs\n");
     		System.exit(0);
     	}
     	
     	/**
     	 * auto generated Axis2 Error handler
     	 * override this method for handling error response from rayTraceMovie operation
     	 */
     	public void receiveErrorrayTraceMovie(java.lang.Exception e) {
     	}
     	
     	/**
     	 * auto generated Axis2 call back method for rayTraceURL method
     	 * override this method for handling normal response from rayTraceURL operation
     	 */
     	public void receiveResultrayTraceURL(RayTracerCS.RayTracerStub.RayTraceURLResponse result) {
     		System.out.println("The Image URL: "+ result.getImageURL());
     		System.out.print("Time: "+(System.currentTimeMillis()-RayTracerClient.start)/1000+" Secs\n");
     		System.exit(0);
     	}
     	
     	/**
     	 * auto generated Axis2 Error handler
     	 * override this method for handling error response from rayTraceURL operation
     	 */
     	public void receiveErrorrayTraceURL(java.lang.Exception e) {
     	}
     	
     		
     	
    }	
    