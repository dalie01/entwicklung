<!-- siteContents\backOffice\BackOffice.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<!-- NAVIGATION -->
<dalie:NavigationBar href="./MobileApp?Page=MAIN" 
	headerTitle="dalie.mobile.backoffice.navigation.headerTitle" 
	title="dalie.mobile.backoffice.navigation.title" 
	transition="fade" 
	favSite="false" 
/>

<div data-role="content">	

<div data-folder="folder-set" data-theme="c" data-role="button" data-inset="true">

	<!-- PROPERTIES:ADMIN -->
	<a href="./MobileApp?Page=PROPERTIES-OVERVIEW-Site" 
		data-role="button" 
		data-icon="arrow-r" 
		data-iconpos="right" 
		data-transition="slide">
		<div class="grid-100 mobile-grid-50" align="left">
			<h3 title="Properties">Properties</h3>
				<p class="ui-li-desc">Handle your Mobile Languages</p>
		</div>
	</a>
		
	<!-- Property:Insert -->
	<div data-folder="content" data-folded="true" data-role="button" data-theme="c">
		<div align="right">
			<a class="ui-li-desc" href="./MobileApp?Page=PROPERTY" 
				title="<dalie:LocalizedString key="dalie.mobile.backoffice.property.siteLink"/>">
				<!-- Zoom --><dalie:LocalizedString key="dalie.mobile.backoffice.property.siteLink"/>
			</a>
		</div><!-- /divRight -->	
		<!-- Servlet:WebPropertyFormCreate 
			 include webForm/PropertyForm -->
		<dalie:Include url="PROPERTY-CONTENT"/>
	</div><!-- /folder -->
	<div data-folder="button" data-role="button" data-icon="arrow-r" data-iconpos="right" data-inset="false" data-theme="c">
		<div align="left">
		<h3>
			<!-- Settings -->
			<dalie:LocalizedString key="dalie.mobile.backoffice.property.h3.settings"/>
		</h3>
		<p class="ui-li-desc">
			<!-- Personalize your Mobile -->
			<dalie:LocalizedString key="dalie.mobile.backoffice.property.hint.settings"/>
		</p>
		</div>
	</div><!-- /button -->	


	<div data-folder="content" data-folded="true" data-role="button" data-theme="c">
	
		<h5>Select by:</h5>
		<!-- Tab:Properties -->
		<jsp:include page="/TabProperties" flush="true"/>
		
	</div><!-- /folder -->
	<div data-folder="button" data-role="button" data-icon="arrow-r" data-iconpos="right" data-inset="false" data-theme="c">
		<div align="left">
		<h3>Export your Properties</h3>
			<p class="ui-li-desc">Sorry coming soon...</p>
		</div>
	</div><!-- /button -->
</div><!-- /folderSet -->	

<div data-folder="folder-set" data-theme="c" data-role="button" data-inset="true">

<!-- Language:Setting -->
	<div data-folder="content" data-folded="true" data-role="button" data-theme="c">
		<div align="right">
			<a class="ui-li-desc" href="./MobileApp?Page=LANGUAGE-SITE" 
				title="<dalie:LocalizedString key="dalie.mobile.backoffice.language.siteLink"/>">
				<!-- Zoom --><dalie:LocalizedString key="dalie.mobile.backoffice.language.siteLink"/>
			</a>
		</div><!-- /divRight -->	
		<h5>Select by:</h5>
		<!-- Servlet:LanguageTab 
			 include Language.jsp by Language -->
		<dalie:Include url="LANGUAGE-CONTENT"/>
	</div><!-- /folder -->
	<div data-folder="button" data-role="button" data-icon="arrow-r" data-iconpos="right" data-inset="false" data-theme="c">
		<div align="left">
		<h3>
			<!-- Settings -->
			<dalie:LocalizedString key="dalie.mobile.backoffice.language.h3.settings"/>
		</h3>
		<p class="ui-li-desc">
			<!-- Personalize your Mobile -->
			<dalie:LocalizedString key="dalie.mobile.backoffice.language.hint.settings"/>
		</p>
		</div>
	</div><!-- /button -->
</div><!-- /folderSet -->	

<dalie:Dialog id="dalie" hContent="Hello" content="<strong>HelloWorld</strong>" style="margin: 50px">
	<jsp:include page="/DialogByRelease" flush="true"/>
</dalie:Dialog>

</div><!-- PAGE:CONTENT -->