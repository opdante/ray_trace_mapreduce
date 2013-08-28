
/**
 * RayTracerMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package ray_tracer;

/**
 *  RayTracerMessageReceiverInOut message receiver
 */

@SuppressWarnings("deprecation")
public class RayTracerMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutAsyncMessageReceiver{


	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
			throws org.apache.axis2.AxisFault{

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			RayTracerSkeleton skel = (RayTracerSkeleton)obj;
			//Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			//Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){



				if("rayTraceSubView".equals(methodName)){

					ray_tracer.RayTraceSubViewResponse rayTraceSubViewResponse9 = null;
					ray_tracer.RayTraceSubView wrappedParam =
							(ray_tracer.RayTraceSubView)fromOM(
									msgContext.getEnvelope().getBody().getFirstElement(),
									ray_tracer.RayTraceSubView.class,
									getEnvelopeNamespaces(msgContext.getEnvelope()));

					rayTraceSubViewResponse9 =


							skel.rayTraceSubView(wrappedParam)
							;

					envelope = toEnvelope(getSOAPFactory(msgContext), rayTraceSubViewResponse9, false);
				} else 

					if("rayTrace".equals(methodName)){

						ray_tracer.RayTraceResponse rayTraceResponse11 = null;
						ray_tracer.RayTrace wrappedParam =
								(ray_tracer.RayTrace)fromOM(
										msgContext.getEnvelope().getBody().getFirstElement(),
										ray_tracer.RayTrace.class,
										getEnvelopeNamespaces(msgContext.getEnvelope()));

						rayTraceResponse11 =


								skel.rayTrace(wrappedParam)
								;

						envelope = toEnvelope(getSOAPFactory(msgContext), rayTraceResponse11, false);
					} else 

						if("rayTraceMovie".equals(methodName)){

							ray_tracer.RayTraceMovieResponse rayTraceMovieResponse13 = null;
							ray_tracer.RayTraceMovie wrappedParam =
									(ray_tracer.RayTraceMovie)fromOM(
											msgContext.getEnvelope().getBody().getFirstElement(),
											ray_tracer.RayTraceMovie.class,
											getEnvelopeNamespaces(msgContext.getEnvelope()));

							rayTraceMovieResponse13 =


									skel.rayTraceMovie(wrappedParam)
									;

							envelope = toEnvelope(getSOAPFactory(msgContext), rayTraceMovieResponse13, false);
						} else 

							if("rayTraceURL".equals(methodName)){

								ray_tracer.RayTraceURLResponse rayTraceURLResponse15 = null;
								ray_tracer.RayTraceURL wrappedParam =
										(ray_tracer.RayTraceURL)fromOM(
												msgContext.getEnvelope().getBody().getFirstElement(),
												ray_tracer.RayTraceURL.class,
												getEnvelopeNamespaces(msgContext.getEnvelope()));

								rayTraceURLResponse15 =


										skel.rayTraceURL(wrappedParam)
										;

								envelope = toEnvelope(getSOAPFactory(msgContext), rayTraceURLResponse15, false);

							} else {
								throw new java.lang.RuntimeException("method not found");
							}


				newMsgContext.setEnvelope(envelope);
			}
		}
		catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceSubView param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceSubView.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceSubViewResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceSubViewResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTrace param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTrace.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceMovie param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceMovie.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceMovieResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceMovieResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceURL param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceURL.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(ray_tracer.RayTraceURLResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(ray_tracer.RayTraceURLResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ray_tracer.RayTraceSubViewResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{
		try{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(ray_tracer.RayTraceSubViewResponse.MY_QNAME,factory));


			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private ray_tracer.RayTraceSubViewResponse wraprayTraceSubView(){
		ray_tracer.RayTraceSubViewResponse wrappedElement = new ray_tracer.RayTraceSubViewResponse();
		return wrappedElement;
	}

	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ray_tracer.RayTraceResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{
		try{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(ray_tracer.RayTraceResponse.MY_QNAME,factory));


			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private ray_tracer.RayTraceResponse wraprayTrace(){
		ray_tracer.RayTraceResponse wrappedElement = new ray_tracer.RayTraceResponse();
		return wrappedElement;
	}

	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ray_tracer.RayTraceMovieResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{
		try{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(ray_tracer.RayTraceMovieResponse.MY_QNAME,factory));


			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private ray_tracer.RayTraceMovieResponse wraprayTraceMovie(){
		ray_tracer.RayTraceMovieResponse wrappedElement = new ray_tracer.RayTraceMovieResponse();
		return wrappedElement;
	}

	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ray_tracer.RayTraceURLResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault{
		try{
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(param.getOMElement(ray_tracer.RayTraceURLResponse.MY_QNAME,factory));


			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private ray_tracer.RayTraceURLResponse wraprayTraceURL(){
		ray_tracer.RayTraceURLResponse wrappedElement = new ray_tracer.RayTraceURLResponse();
		return wrappedElement;
	}



	/**
	 *  get the default envelope
	 */
	 private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
		return factory.getDefaultEnvelope();
	}


	private  java.lang.Object fromOM(
			org.apache.axiom.om.OMElement param,
			java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

		try {

			if (ray_tracer.RayTraceSubView.class.equals(type)){

				return ray_tracer.RayTraceSubView.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTraceSubViewResponse.class.equals(type)){

				return ray_tracer.RayTraceSubViewResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTrace.class.equals(type)){

				return ray_tracer.RayTrace.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTraceResponse.class.equals(type)){

				return ray_tracer.RayTraceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTraceMovie.class.equals(type)){

				return ray_tracer.RayTraceMovie.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTraceMovieResponse.class.equals(type)){

				return ray_tracer.RayTraceMovieResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTraceURL.class.equals(type)){

				return ray_tracer.RayTraceURL.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (ray_tracer.RayTraceURLResponse.class.equals(type)){

				return ray_tracer.RayTraceURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}





	/**
	 *  A utility method that copies the namepaces from the SOAPEnvelope
	 */
	 private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
		}
		return returnMap;
	}

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

}//end of class
