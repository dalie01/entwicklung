<!-- siteContents\backOffice\properties\webForm\PropertyForm.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>
	
	<div class="grid-50" align="left">
		<!-- WebProperty:ReleaseId -->
	 	<label id="${WebForm.PROPERTY_PROJECT_ID}" 
     		for="${WebForm.PROPERTY_PROJECT_ID}" 
	 		class="styleItalic"
     		style="margin-left: 2%">
     		<dalie:LocalizedString key="dalie.mobile.backoffice.propertyForm.projectLabel"/>
     	</label>
     	<input type="text" 
     		name="${WebForm.PROPERTY_PROJECT_ID}" 
     		id="${WebForm.PROPERTY_PROJECT_ID}" 
     		value="${WebForm.property.projectId}"  
     		data-clear-btn="true"
     		tabindex="4" 
     		placeholder="${WebForm.PROPERTY_PROJECT_ID}" 
     		data-mini="false"
     	/>  
	</div><!-- /Div:grid-50 -->
	
	<div class="grid-50" align="left" style="padding-left:2%">
		<!-- WebProperty:ReleaseId -->
		<label id="${WebFormy.PROPERTY_RELEASE_ID}" 
     		for="${WebForm.PROPERTY_RELEASE_ID}" 
			class="styleItalic "
     		style="margin-left: 4%">
     		<dalie:LocalizedString key="dalie.mobile.backoffice.propertyForm.releaseId"/>
     	</label>
     	<input type="text" 
     		name="${WebForm.PROPERTY_RELEASE_ID}" 
     		id="${WebForm.PROPERTY_RELEASE_ID}" 
     		value="${WebForm.property.releaseId}"  
     		data-clear-btn="true"
     		tabindex="5" 
     		placeholder="${WebForm.PROPERTY_RELEASE_ID}" 
     		data-mini="false"
     	/>   
	</div><!-- /Div:grid-50 -->

<div class="grid-container">
</div><!-- /DIV:grid-container -->
<div class="grid-100" align="left">

	<!-- INPUT:PropertyId -->
   <label id="${WebForm.PROPERTY_PROPERTY_ID}" 
    	for="${WebForm.PROPERTY_PROPERTY_ID}" 
    	class="styleItalic"
    	style="margin-left: 1%">
    	<dalie:LocalizedString key="dalie.mobile.backoffice.propertyForm.id"/>
    </label>
  	<input type="text"
     	name="${WebForm.PROPERTY_PROPERTY_ID}" 
     	id="${WebForm.PROPERTY_PROPERTY_ID}" 
     	value="${WebForm.property.propertId}" 
     	data-clear-btn="true"
     	tabindex="2" 
     	placeholder="${WebForm.PROPERTY_PROPERTY_ID}" data-mini="false"/> 
    	
</div><!-- /DIV:grid-100 -->
	
<div class="grid-15 mobile-grid-20" align="left">
  
  	<!-- SELECT:CountryId -->
	<label for="PropertyCountryId" 
 		class="styleItalic" 
 		style="margin-left: 8%">
  		<dalie:LocalizedString key="dalie.mobile.backoffice.propertyForm.state"/>
  	</label>  
 
 	<select data-native-menu="true" 
 		id="PropertyCountryId" 
 		name="${WebForm.PROPERTY_COUNTRY_ID}" tabindex="1">  
    <option value="DE" 
	    <c:if test="${WebForm.property.countryId == 'DE'}">
   			selected="selected"
		</c:if>  
    ><dalie:LocalizedString key="common.language.DE"/></option>  
    <option value="EN"
    	<c:if test="${WebForm.property.countryId == 'EN'}">
   			selected="selected"
		</c:if>
    ><dalie:LocalizedString key="common.language.EN"/></option>  
    <option value="FR"
    	<c:if test="${WebForm.property.countryId == 'FR'}">
   			selected="selected"
		</c:if>
    ><dalie:LocalizedString key="common.language.FR"/></option>  
       <option value="IT"
    	<c:if test="${WebForm.property.countryId == 'IT'}">
   			selected="selected"
		</c:if>
    ><dalie:LocalizedString key="common.language.IT"/></option> 
  </select>
 
 </div><!-- /DIV:grid-15 -->
 <div class="grid-85 mobile-grid-80" align="left">
	
	<!-- INPUT:Description -->	
 	<label id="${WebForm.PROPERTY_DESCRIPTION}"
     	for="${WebForm.PROPERTY_DESCRIPTION}"
 		 class="styleItalic"
 		 style="margin-left: 2%; padding-top: 3px">
     		<dalie:LocalizedString key="dalie.mobile.backoffice.propertyForm.storeLabel"/>
     </label>
     
     <input type="text" name="${WebForm.PROPERTY_DESCRIPTION}" 
     	id="${WebForm.PROPERTY_DESCRIPTION}" 
     	value="${WebForm.property.description}"  
     	data-clear-btn="true"
     	tabindex="3" 
     	placeholder="${WebForm.PROPERTY_DESCRIPTION}" data-mini="false"
     />
      
  </div><!-- /DIV:grid-85 -->

<div class="grid-container">
	<div class="grid-50" style="float: right;">
	
		<!-- BUTTEN:APPLY -->
		<input type="submit" 
			name="${WebForm.PROPERTY_SUBMITTED}" 
			data-role="button" 
			data-theme="b" 
			value="<dalie:LocalizedString key="common.capture"/>"
		/>			
	</div><!-- /DIV:grid-50 -->
</div><!-- /DIV:grid-container -->