<!-- WebContent\siteContents\resume\Resume.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@include file="/siteIncludes/Module.jsp"%>

<div data-role="main" class="ui-body grid-container" style="margin-top: 0.1%;">
	
	<div data-role="box" data-head="<dalie:LocalizedString key="dalie.mobile.resume.career.head"/>" data-folded="true">
		<%@include file="/siteContents/resume/career/Career.jsp"%>
	</div><!-- DIV:box -->

	<div data-role="box" data-head="<dalie:LocalizedString key="dalie.mobile.resume.education.head"/>" data-folded="true">
		<%@include file="/siteContents/resume/education/Education.jsp"%>
	</div><!-- DIV:box -->
	
	<div data-role="box" data-head="<dalie:LocalizedString key="dalie.mobile.resume.project.head"/>" data-folded="false">
		<%@include file="/siteContents/resume/projects/Projects.jsp"%>
	</div><!-- DIV:box -->
	
</div>