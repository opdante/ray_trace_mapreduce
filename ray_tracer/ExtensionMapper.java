
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

            package ray_tracer;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://b534.cs.indiana.edu".equals(namespaceURI) &&
                  "RGBColor".equals(typeName)){
                   
                            return  ray_tracer.RGBColor.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://b534.cs.indiana.edu".equals(namespaceURI) &&
                  "CameraSetup".equals(typeName)){
                   
                            return  ray_tracer.CameraSetup.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://b534.cs.indiana.edu".equals(namespaceURI) &&
                  "ArrayOfRGBColor".equals(typeName)){
                   
                            return  ray_tracer.ArrayOfRGBColor.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://b534.cs.indiana.edu".equals(namespaceURI) &&
                  "Point3D".equals(typeName)){
                   
                            return  ray_tracer.Point3D.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://b534.cs.indiana.edu".equals(namespaceURI) &&
                  "Rectangle".equals(typeName)){
                   
                            return  ray_tracer.Rectangle.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    