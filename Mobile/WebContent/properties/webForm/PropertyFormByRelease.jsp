<!-- properties\webForm\PropertyFormByRelease.jsp -->
<%@ page language="java" pageEncoding="ISO-8859-1" autoFlush="true" %>

<%@ include file="/inc/Module.jsp"%>

<form action="./PropertiesWriterCheck" target="_self">
   	
   	<input type="hidden" name="procedure" value="byRelease">
   	<a target="_self" href="PropertiesWriter"></a>
   				
   	<label id="releaseId" class="styleItalic" for="releaseId">Release-Label*</label>
    <input type="text" 
     	name="releaseId" id="releaseId" 
     	value=""  
     	data-clear-btn="true" data-mini="false"
     	tabindex="1" 
     	placeholder="Property.releaseId"/> 
 	
 	<!-- Button -->
	<input data-role="button" type="button" name="byRelease" value="Apply">
</form>
	<a href="#dalie" data-rel="popup">Open Popup</a>

	