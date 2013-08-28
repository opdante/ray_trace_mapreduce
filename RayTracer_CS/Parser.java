package edu.indiana.cs.b534;

import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import edu.indiana.cs.b534.RayTracerStub;

public class Parser{
	 static String scene_name,method_string;
	 static int imageWidth,imageHeight,location_x,location_y,location_z;
	 static int direction_x,direction_y,direction_z;
	 static int rectangle_minx,rectangle_miny,rectangle_maxx,rectangle_maxy,num_cameras;
	 static RayTracerStub.CameraSetup[] cameras_o;
	 static RayTracerStub.Rectangle[] rectangles_o;
	 
	
	 public static void injectXML() throws Exception {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(new FileInputStream("./input/input.xml"));
		Node animation = document.getFirstChild();
		if (animation instanceof Element) {
			
			// Scene
			NodeList sceneList = ((Element) animation).getElementsByTagName("scene");
			if (sceneList.getLength() > 0) {
				Node scene = sceneList.item(0);
			    scene_name = scene.getTextContent();
			}
			// Method
			NodeList methods = ((Element) animation).getElementsByTagName("method");
			Node method = methods.item(0);
			method_string = method.getTextContent();
			
			// Image
			NodeList image = ((Element) animation).getElementsByTagName("image");
			Node dimensions = image.item(0);
			// width
			NodeList dimensions_width = ((Element) dimensions).getElementsByTagName("width");
			Node dimensionswidth = dimensions_width.item(0);
			imageWidth = Integer.parseInt(dimensionswidth.getTextContent());
			// height
			NodeList dimensions_height= ((Element) dimensions).getElementsByTagName("height");
			Node dimensionsheight = dimensions_height.item(0);
			imageHeight = Integer.parseInt(dimensionsheight.getTextContent());
			
			// Cameras
			NodeList cameras = ((Element) animation).getElementsByTagName("camera");
			num_cameras = cameras.getLength();
			cameras_o = new RayTracerStub.CameraSetup[num_cameras];
			rectangles_o = new RayTracerStub.Rectangle[num_cameras];
			for (int i = 0; i < num_cameras; i++) {
				Node camera = cameras.item(i);
				
				// Location
				NodeList location = ((Element) camera).getElementsByTagName("location");
				
				Node location_nums = location.item(0);
				// x
				NodeList locationxnum = ((Element) location_nums).getElementsByTagName("x");
				Node locationxItem = locationxnum.item(0);
				location_x = Integer.parseInt(locationxItem.getTextContent());
				// y
				NodeList locationynum = ((Element) location_nums).getElementsByTagName("y");
				Node locationyItem = locationynum.item(0);
				location_y = Integer.parseInt(locationyItem.getTextContent());
				// z
				NodeList locationznum = ((Element) location_nums).getElementsByTagName("z");
				Node locationzItem = locationznum.item(0);
				location_z = Integer.parseInt(locationzItem.getTextContent());

				// Direction
				NodeList direction = ((Element) camera).getElementsByTagName("direction");
				
				Node direction_nums = direction.item(0);
				// x
				NodeList directionxnum = ((Element) direction_nums).getElementsByTagName("x");
				Node directionxItem = directionxnum.item(0);
				direction_x = Integer.parseInt(directionxItem.getTextContent());
				// y
				NodeList directionynum = ((Element) direction_nums).getElementsByTagName("y");
				Node directionyItem = directionynum.item(0);
				direction_y = Integer.parseInt(directionyItem.getTextContent());
				// z
				NodeList directionznum = ((Element) direction_nums).getElementsByTagName("z");
				Node directionzItem = directionznum.item(0);
				direction_z = Integer.parseInt(directionzItem.getTextContent());

				// Rectangle
				NodeList rectangle = ((Element) camera).getElementsByTagName("rectangle");
				
				Node rectangle_nums = rectangle.item(0);
				// min x
				NodeList rectangleminxnum = ((Element) rectangle_nums).getElementsByTagName("minx");
				Node rectangleminxItem = rectangleminxnum.item(0);
				rectangle_minx = Integer.parseInt(rectangleminxItem.getTextContent());
				// min y
				NodeList rectangleminynum = ((Element) rectangle_nums).getElementsByTagName("miny");
				Node rectangleminyItem = rectangleminynum.item(0);
				rectangle_miny = Integer.parseInt(rectangleminyItem.getTextContent());
				// max x
				NodeList rectanglemaxxnum = ((Element) rectangle_nums).getElementsByTagName("maxx");
				Node rectanglemaxxItem = rectanglemaxxnum.item(0);
				rectangle_maxx = Integer.parseInt(rectanglemaxxItem.getTextContent());
				// max y
				NodeList rectanglemaxynum = ((Element) rectangle_nums).getElementsByTagName("maxy");
				Node rectanglemaxyItem = rectanglemaxynum.item(0);
				rectangle_maxy = Integer.parseInt(rectanglemaxyItem.getTextContent());
				
				RayTracerStub.Point3D direction_o = new RayTracerStub.Point3D();
				direction_o.setX(direction_x);
				direction_o.setY(direction_y);
				direction_o.setZ(direction_z);
				
				RayTracerStub.Point3D location_o = new RayTracerStub.Point3D();
				location_o.setX(location_x);
				location_o.setY(location_y);
				location_o.setZ(location_z);
				
				cameras_o[i] = new  RayTracerStub.CameraSetup();
			    cameras_o[i].setDirection(direction_o);
			    cameras_o[i].setLocation(location_o);
			    
			    rectangles_o[i] = new RayTracerStub.Rectangle();
			    rectangles_o[i].setMinX(rectangle_minx);
				rectangles_o[i].setMaxX(rectangle_maxx);
				rectangles_o[i].setMinY(rectangle_miny);
				rectangles_o[i].setMaxY(rectangle_maxy);
				
			}
		}
	}

	// Parser gets
	public static RayTracerStub.CameraSetup[] getCameras() throws Exception {return cameras_o;}
	public static RayTracerStub.CameraSetup getCamera() throws Exception {return cameras_o[0];}
	public static RayTracerStub.Rectangle[] getRectangles() throws Exception {return rectangles_o;}
	public static RayTracerStub.Rectangle getRectangle() throws Exception {return rectangles_o[0];}
	public static int getHeight() throws Exception {return imageHeight;}
	public static int getWidth() throws Exception {return imageWidth;}
	public static String getScene() throws Exception {return scene_name;}
	public static String getMethod() throws Exception {return method_string;}
	
	
}
