
<%@ page import="java.io.*,java.util.*"%> 
<%@ page import="org.apache.commons.fileupload.*"%> 
<%@ page import="org.apache.commons.fileupload.disk.*"%> 
<%@ page import="org.apache.commons.fileupload.servlet.*"%> 
<%@ page import="org.apache.commons.io.output.*"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Insert title here</title> 
</head> 
<body> 
<% 
File file; 
// maximum file size allowed 
// representing 5 Mega Bytes. 
int maxFileSize = 5000 * 1024; 
// maximum memory allocated to store the file 
// from request for further processing 
int maxMemSize = 5000 * 1024; 
// file path to store the uploaded files 
String filePath = application.getInitParameter("UPLOADLOCATION"); 

// checking whethe multipart formdata is used 
// as request encoding type 
String contentType = request.getContentType(); 

if (contentType.indexOf("multipart/form-data") >=0) { 

	try { 
		// creating factory object from commons fileupload 
		// to store the object 
		DiskFileItemFactory factory = new DiskFileItemFactory(); 
		// maximum size that will be stored in memory 
		factory.setSizeThreshold(maxMemSize); 
		// if the file is larger than memory size store it in tmp directory 
		
		factory.setRepository(new File("C:\\Users\\kurmi\\Desktop\\kapil\\Advance_java\\CollectionFrameWork\\temp")); 

		// Create a new file upload handler 
		ServletFileUpload upload = new ServletFileUpload(factory); 

		// maximum file size to be uploaded. 
		upload.setSizeMax(maxFileSize); 
		
		try{
		// Parse the request to get file items. 
		List fileItems = upload.parseRequest(request); 

		// Process the uploaded file items 
		Iterator i = fileItems.iterator(); 


		while (i.hasNext()) { 
			FileItem fi = i.next(); 
			if (!fi.isFormField()) { 
				// Get the uploaded file parameters 
				String fieldName = fi.getFieldName(); 
				String fileName = fi.getName(); 
				
				if(fileName.lastIndexOf("\\")>=0){
					file=new File(filePath+fileName.substring(fileName.lastIndexOf("\\")));
				}else{
					file=new File(filePath+fileName.substring(fileName.lastIndexOf("\\")+1));
				}
				fi.write(file);
				out.println("uploaded FileName: " +filePath+fileName+"<br>");
			} 
		} 
	} catch (Exception ex) { 
		System.out.println(ex); 
	} 
%> 

	