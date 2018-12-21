<!-- siteContents/main/Main.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<dalie:NavigationBar headerTitle="dalie.mobile.header.application.name"/>

<jsp:include page="/MainTeaser" flush="true" />	

<div data-role="content">	

	<div class="grid-100 mobile-grid-100" data-role="controlgroup">
		<a href="./MobileApp?Page=PAGE" 
			data-role="button" 
			data-icon="arrow-r" 
			data-iconpos="right" 
			data-transition="slide" >
			<div align="left">
				<h3>
					<!-- Pages --> 
					<dalie:LocalizedString key="dalie.mobile.start.h3.pages"/>
				</h3>
				<p class="ui-li-desc">
					<!-- Demo of Possibilities --> 
					<dalie:LocalizedString key="dalie.mobile.start.hint.pages"/>
				</p>
			</div>
		</a>
			
		<a href="./MobileApp?Page=SERVICEOPTIONS" 
			data-role="button" 
			data-icon="arrow-r" 
			data-iconpos="right" 
			data-transition="slide">
			<div align="left">
			 <h3>
			 	<!-- ServiceOptions -->
			 	<dalie:LocalizedString key="dalie.mobile.start.h3.serviceoptions"/>
			 </h3>
			 	<p class="ui-li-desc">
			 		<!-- demo of service options -->
			 		<dalie:LocalizedString key="dalie.mobile.start.hint.serviceoptions"/>
			 	</p>
			</div>
		</a>
			
	</div><!-- DIV:CONTROLGROUP -->
		
</div><!-- PAGE:CONTENT -->