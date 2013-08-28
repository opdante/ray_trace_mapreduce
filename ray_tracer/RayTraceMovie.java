
/**
 * RayTraceMovie.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

package ray_tracer;


/**
 *  RayTraceMovie bean class
 */

public  class RayTraceMovie
implements org.apache.axis2.databinding.ADBBean{

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://b534.cs.indiana.edu",
			"rayTraceMovie",
			"ns1");



	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if(namespace.equals("http://b534.cs.indiana.edu")){
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}



	/**
	 * field for SceneURL
	 */


	protected java.lang.String localSceneURL ;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localSceneURLTracker = false ;


	/**
	 * Auto generated getter method
	 * @return java.lang.String
	 */
	public  java.lang.String getSceneURL(){
		return localSceneURL;
	}



	/**
	 * Auto generated setter method
	 * @param param SceneURL
	 */
	public void setSceneURL(java.lang.String param){

		if (param != null){
			//update the setting tracker
			localSceneURLTracker = true;
		} else {
			localSceneURLTracker = true;

		}

		this.localSceneURL=param;


	}


	/**
	 * field for Camera
	 * This was an Array!
	 */


	protected ray_tracer.CameraSetup[] localCamera ;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localCameraTracker = false ;


	/**
	 * Auto generated getter method
	 * @return ray_tracer.CameraSetup[]
	 */
	public  ray_tracer.CameraSetup[] getCamera(){
		return localCamera;
	}






	/**
	 * validate the array for Camera
	 */
	protected void validateCamera(ray_tracer.CameraSetup[] param){

	}


	/**
	 * Auto generated setter method
	 * @param param Camera
	 */
	public void setCamera(ray_tracer.CameraSetup[] param){

		validateCamera(param);


		if (param != null){
			//update the setting tracker
			localCameraTracker = true;
		} else {
			localCameraTracker = true;

		}

		this.localCamera=param;
	}



	/**
	 * Auto generated add method for the array for convenience
	 * @param param ray_tracer.CameraSetup
	 */
	public void addCamera(ray_tracer.CameraSetup param){
		if (localCamera == null){
			localCamera = new ray_tracer.CameraSetup[]{};
		}


		//update the setting tracker
		localCameraTracker = true;


		java.util.List list =
				org.apache.axis2.databinding.utils.ConverterUtil.toList(localCamera);
		list.add(param);
		this.localCamera =
				(ray_tracer.CameraSetup[])list.toArray(
						new ray_tracer.CameraSetup[list.size()]);

	}


	/**
	 * field for ImageWidth
	 */


	protected int localImageWidth ;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localImageWidthTracker = false ;


	/**
	 * Auto generated getter method
	 * @return int
	 */
	public  int getImageWidth(){
		return localImageWidth;
	}



	/**
	 * Auto generated setter method
	 * @param param ImageWidth
	 */
	public void setImageWidth(int param){

		// setting primitive attribute tracker to true

		if (param==java.lang.Integer.MIN_VALUE) {
			localImageWidthTracker = false;

		} else {
			localImageWidthTracker = true;
		}

		this.localImageWidth=param;


	}


	/**
	 * field for ImageHeight
	 */


	protected int localImageHeight ;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localImageHeightTracker = false ;


	/**
	 * Auto generated getter method
	 * @return int
	 */
	public  int getImageHeight(){
		return localImageHeight;
	}



	/**
	 * Auto generated setter method
	 * @param param ImageHeight
	 */
	public void setImageHeight(int param){

		// setting primitive attribute tracker to true

		if (param==java.lang.Integer.MIN_VALUE) {
			localImageHeightTracker = false;

		} else {
			localImageHeightTracker = true;
		}

		this.localImageHeight=param;


	}


	/**
	 * isReaderMTOMAware
	 * @return true if the reader supports MTOM
	 */
	public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
		boolean isReaderMTOMAware = false;

		try{
			isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
		}catch(java.lang.IllegalArgumentException e){
			isReaderMTOMAware = false;
		}
		return isReaderMTOMAware;
	}


	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement (
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



		org.apache.axiom.om.OMDataSource dataSource =
				new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

			public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				RayTraceMovie.this.serialize(MY_QNAME,factory,xmlWriter);
			}
		};
		return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
				MY_QNAME,factory,dataSource);

	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
		serialize(parentQName,factory,xmlWriter,false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
			boolean serializeType)
					throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




		java.lang.String prefix = null;
		java.lang.String namespace = null;


		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();

		if ((namespace != null) && (namespace.trim().length() > 0)) {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
			} else {
				if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		} else {
			xmlWriter.writeStartElement(parentQName.getLocalPart());
		}

		if (serializeType){


			java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://b534.cs.indiana.edu");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						namespacePrefix+":rayTraceMovie",
						xmlWriter);
			} else {
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
						"rayTraceMovie",
						xmlWriter);
			}


		}
		if (localSceneURLTracker){
			namespace = "http://b534.cs.indiana.edu";
			if (! namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix,"sceneURL", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace,"sceneURL");
				}

			} else {
				xmlWriter.writeStartElement("sceneURL");
			}


			if (localSceneURL==null){
				// write the nil attribute

				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

			}else{


				xmlWriter.writeCharacters(localSceneURL);

			}

			xmlWriter.writeEndElement();
		} if (localCameraTracker){
			if (localCamera!=null){
				for (int i = 0;i < localCamera.length;i++){
					if (localCamera[i] != null){
						localCamera[i].serialize(new javax.xml.namespace.QName("http://b534.cs.indiana.edu","camera"),
								factory,xmlWriter);
					} else {

						// write null attribute
						java.lang.String namespace2 = "http://b534.cs.indiana.edu";
						if (! namespace2.equals("")) {
							java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

							if (prefix2 == null) {
								prefix2 = generatePrefix(namespace2);

								xmlWriter.writeStartElement(prefix2,"camera", namespace2);
								xmlWriter.writeNamespace(prefix2, namespace2);
								xmlWriter.setPrefix(prefix2, namespace2);

							} else {
								xmlWriter.writeStartElement(namespace2,"camera");
							}

						} else {
							xmlWriter.writeStartElement("camera");
						}

						// write the nil attribute
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
						xmlWriter.writeEndElement();

					}

				}
			} else {

				// write null attribute
				java.lang.String namespace2 = "http://b534.cs.indiana.edu";
				if (! namespace2.equals("")) {
					java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

					if (prefix2 == null) {
						prefix2 = generatePrefix(namespace2);

						xmlWriter.writeStartElement(prefix2,"camera", namespace2);
						xmlWriter.writeNamespace(prefix2, namespace2);
						xmlWriter.setPrefix(prefix2, namespace2);

					} else {
						xmlWriter.writeStartElement(namespace2,"camera");
					}

				} else {
					xmlWriter.writeStartElement("camera");
				}

				// write the nil attribute
				writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
				xmlWriter.writeEndElement();

			}
		} if (localImageWidthTracker){
			namespace = "http://b534.cs.indiana.edu";
			if (! namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix,"imageWidth", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace,"imageWidth");
				}

			} else {
				xmlWriter.writeStartElement("imageWidth");
			}

			if (localImageWidth==java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException("imageWidth cannot be null!!");

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImageWidth));
			}

			xmlWriter.writeEndElement();
		} if (localImageHeightTracker){
			namespace = "http://b534.cs.indiana.edu";
			if (! namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix,"imageHeight", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace,"imageHeight");
				}

			} else {
				xmlWriter.writeStartElement("imageHeight");
			}

			if (localImageHeight==java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException("imageHeight cannot be null!!");

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImageHeight));
			}

			xmlWriter.writeEndElement();
		}
		xmlWriter.writeEndElement();


	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
			java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);

		}

		xmlWriter.writeAttribute(namespace,attName,attValue);

	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,java.lang.String attName,
			java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
		if (namespace.equals(""))
		{
			xmlWriter.writeAttribute(attName,attValue);
		}
		else
		{
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}
	}


	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
			javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}
	/**
	 *  method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix,namespaceURI);
			}

			if (prefix.trim().length() > 0){
				xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}

		} else {
			xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}


	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null) {
			prefix = generatePrefix(namespace);

			while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
				prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}

			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}

		return prefix;
	}



	/**
	 * databinding method to get an XML representation of this object
	 *
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException{



		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		if (localSceneURLTracker){
			elementList.add(new javax.xml.namespace.QName("http://b534.cs.indiana.edu",
					"sceneURL"));

			elementList.add(localSceneURL==null?null:
				org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSceneURL));
		} if (localCameraTracker){
			if (localCamera!=null) {
				for (int i = 0;i < localCamera.length;i++){

					if (localCamera[i] != null){
						elementList.add(new javax.xml.namespace.QName("http://b534.cs.indiana.edu",
								"camera"));
						elementList.add(localCamera[i]);
					} else {

						elementList.add(new javax.xml.namespace.QName("http://b534.cs.indiana.edu",
								"camera"));
						elementList.add(null);

					}

				}
			} else {

				elementList.add(new javax.xml.namespace.QName("http://b534.cs.indiana.edu",
						"camera"));
				elementList.add(localCamera);

			}

		} if (localImageWidthTracker){
			elementList.add(new javax.xml.namespace.QName("http://b534.cs.indiana.edu",
					"imageWidth"));

			elementList.add(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImageWidth));
		} if (localImageHeightTracker){
			elementList.add(new javax.xml.namespace.QName("http://b534.cs.indiana.edu",
					"imageHeight"));

			elementList.add(
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImageHeight));
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



	}



	/**
	 *  Factory class that keeps the parse method
	 */
	public static class Factory{




		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 *                If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static RayTraceMovie parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
			RayTraceMovie object =
					new RayTraceMovie();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix ="";
			java.lang.String namespaceuri ="";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();


				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
					java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");
					if (fullTypeName!=null){
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1){
							nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix==null?"":nsPrefix;

						java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

						if (!"rayTraceMovie".equals(type)){
							//find namespace for the prefix
							java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
							return (RayTraceMovie)ray_tracer.ExtensionMapper.getTypeObject(
									nsUri,type,reader);
						}


					}


				}




				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();




				reader.next();

				java.util.ArrayList list2 = new java.util.ArrayList();


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://b534.cs.indiana.edu","sceneURL").equals(reader.getName())){

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){

						java.lang.String content = reader.getElementText();

						object.setSceneURL(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

					} else {


						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();

				}  // End of if for expected property start element

				else {

				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://b534.cs.indiana.edu","camera").equals(reader.getName())){



					// Process the array and step past its final element's end.

					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
					if ("true".equals(nillableValue) || "1".equals(nillableValue)){
						list2.add(null);
						reader.next();
					} else {
						list2.add(ray_tracer.CameraSetup.Factory.parse(reader));
					}
					//loop until we find a start element that is not part of this array
					boolean loopDone2 = false;
					while(!loopDone2){
						// We should be at the end element, but make sure
						while (!reader.isEndElement())
							reader.next();
						// Step out of this element
						reader.next();
						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();
						if (reader.isEndElement()){
							//two continuous end elements means we are exiting the xml structure
							loopDone2 = true;
						} else {
							if (new javax.xml.namespace.QName("http://b534.cs.indiana.edu","camera").equals(reader.getName())){

								nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
								if ("true".equals(nillableValue) || "1".equals(nillableValue)){
									list2.add(null);
									reader.next();
								} else {
									list2.add(ray_tracer.CameraSetup.Factory.parse(reader));
								}
							}else{
								loopDone2 = true;
							}
						}
					}
					// call the converter utility  to convert and set the array

					object.setCamera((ray_tracer.CameraSetup[])
							org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
									ray_tracer.CameraSetup.class,
									list2));

				}  // End of if for expected property start element

				else {

				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://b534.cs.indiana.edu","imageWidth").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setImageWidth(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				}  // End of if for expected property start element

				else {

					object.setImageWidth(java.lang.Integer.MIN_VALUE);

				}


				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new javax.xml.namespace.QName("http://b534.cs.indiana.edu","imageHeight").equals(reader.getName())){

					java.lang.String content = reader.getElementText();

					object.setImageHeight(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

					reader.next();

				}  // End of if for expected property start element

				else {

					object.setImageHeight(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing invalid property
					throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}//end of factory class



}

