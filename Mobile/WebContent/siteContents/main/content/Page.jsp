<%@include file="/inc/Module.jsp"%>

<dalie:NavigationBar href="./MobileApp?Page=MAIN" headerTitle="Demo" title="Home" transition="fade" 
	favSite="true" favSubTitle="Demo of Pages" />

<div data-role="content">	
	<p>&nbsp;</p>
<div data-role="controlgroup">
	<a href="./MobileApp?Page=AJAX" 
		data-role="button" 
		data-icon="arrow-r" 
		data-iconpos="right" 
		data-transition="slide"><span class="ui-li-desc">Start Ajax Demo</span></a>
</div>
</div><!-- PAGE:CONTENT -->