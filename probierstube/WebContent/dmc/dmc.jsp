<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<script src="http://code.jquery.com/jquery-1.7.js" type="text/javascript"></script>
<title>Template of DMC</title>
<style type="text/css">
body {
	margin:0;
	padding:0;
}
td{
	text-align: center;
}
</style>
</head>
<body>
	<table align="center" border="1" width="80%" style="margin:10px;">
		 <tr>
    		<th width="40%" rowspan="2" valign="top">
    			<table align="center" width="100%">
    					<tr>
    						<th bgcolor="#255255">Original</th>
    					</tr>
    					<tr>
    						<td>Space for Picture</td>
    					</tr>
    			</table>
    		</th>
    			<td>
    				<table border="1" width="100%" cellpadding="0" cellspacing="0">
    					<tr>
    						<th>pixel scale1</th>
    						<th>pixel scale2</th>
    						<th>pixel scale3</th>
    					</tr>
    					<tr>
    						<td><img id="DSC_2338" src="<%= request.getContextPath()%>/dmc/DSC_2722.JPG" alt=""/></td>
    						<td>Picture 2</td>
    						<td>Picture 3</td>
    					</tr>
    				</table>
    			</td>
  		</tr>
  		<tr>
    		<td>
    			<table border="1" width="100%" cellpadding="0" cellspacing="0">
    					<tr>
    						<th>pixel scale4</th>
    						<th>pixel scale5</th>
    						<th>pixel scale6</th>
    					</tr>
    					<tr>
    						<td>Picture 4</td>
    						<td>Picture 5</td>
    						<td>Picture 6</td>
    					</tr>
    				</table>
    		</td>
  		</tr>
	</table>
<script type="text/javascript">

	jQuery(document).ready(function() {
		
		$( '#DSC_2338').each(function() {
            var maxWidth = 300; // Max width for the image
            var maxHeight = 300;    // Max height for the image
            var ratio = 0;  // Used for aspect ratio
            var width = $(this).width();    // Current image width
            var height = $(this).height();  // Current image height
           
            // Check if the current width is larger than the max
            if(width > maxWidth){
                 ratio = maxWidth / width;   // get ratio for scaling image
                 $( this).css("width" , maxWidth); // Set new width
                 $( this).css("height" , height * ratio);  // Scale height based on ratio
                 height = height * ratio;    // Reset height to match scaled image
           }
           
            var width = $(this).width();    // Current image width
            var height = $(this).height();  // Current image height
           
            // Check if current height is larger than max
            if(height > maxHeight){
                 ratio = maxHeight / height; // get ratio for scaling image
                 $( this).css("height" , maxHeight);   // Set new height
                 $( this).css("width" , width * ratio);    // Scale width based on ratio
                 width = width * ratio;    // Reset width to match scaled image
           }
     });

		
	
	});
	</script>
</body>
</html>