<!-- properties/TabProperties.jsp -->
<%@include file="/inc/Module.jsp"%>

<div class="ui-grid-c">
	<div class="ui-block-a">
		<div data-role="collapsible" 
			data-theme="c" 
			data-content-theme="c" 
			data-iconpos="left" 
			data-collapsed-icon="arrow-r" 
			data-expanded-icon="arrow-u">			
   			
   			<h3>All</h3>
   				<p>Click on the link to download:</p><br/> 
   				<a target="_self" href="PropertiesWriter">Download Link</a>
   		</div><!-- /data-role -->
	</div><!-- /ui-block-a -->
	<div class="ui-block-b">
		<div data-role="collapsible" 
			data-theme="c" 
			data-content-theme="c" 
			data-iconpos="left" 
			data-collapsed-icon="arrow-r" 
			data-expanded-icon="arrow-u">			
   			
   			<h3>Country</h3>
   			<form action="./PropertiesWriter" target="_self">
   				<input type="hidden" name="procedure" value="byCountry">
   				<label for="PropertyCountryId" class="styleItalic">State*</label>  
   			 	<select data-native-menu="false" id="PropertyCountryId" name="PropertyCountryId" tabindex="1">  
    				<option value="DE">German</option>  
  					<option value="EN">English</option>  
   					<option value="FR">France</option>  
    				<option value="IT">Italy</option> 
 				</select>
   				<!-- Button -->
				<input type="submit" name="byCountry" data-role="button" data-theme="c" value="Apply" >
			</form>	
   		</div><!-- /data-role -->
	</div><!-- /ui-block-b -->
	<div class="ui-block-c">
		<div data-role="collapsible" 
			data-theme="c" 
			data-content-theme="c" 
			data-iconpos="left" 
			data-collapsed-icon="arrow-r" 
			data-expanded-icon="arrow-u">
			
			<h3>Release</h3>
			<jsp:include page="/PropertyFormByRelease" flush="true"/>
			
			
		</div><!-- /data-role -->
	</div><!-- /ui-block-c -->
	<div class="ui-block-d">
		<div data-role="collapsible" 
			data-theme="c" 
			data-content-theme="c" 
			data-iconpos="left" 
			data-collapsed-icon="arrow-r" 
			data-expanded-icon="arrow-u">
			
			<h3>Project</h3>
			<form action="./PropertiesWriter" target="_self">
				<input type="text" name="procedure" value="byProject">
   				<!-- Button -->
				<input type="submit" name="byProject" data-role="button" data-theme="" value="Apply" >
   			</form>
		</div><!-- /data-role -->
	</div><!-- /ui-block-d -->
</div><!-- /grid-c -->