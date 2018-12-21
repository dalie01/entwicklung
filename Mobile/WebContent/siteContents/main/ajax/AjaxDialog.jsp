<!-- siteContents\main\ajax\AjaxDialog.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<div data-role="header" data-theme="a" class=ui-corner-top>
	<h3>AjaxDialogHeader</h3>
</div><!-- div:header -->
<div data-role="content" data-theme="c" class="ui-corner-bottom ui-content">
	<p class="ui-li-desc">DialogContent</p>
<br/>
	<div data-role="content">

		<div data-role=controlgroup> 
    		<input id="loadAjax" type=button value=OK data-icon=check data-iconpos=right />
		</div>

  </div><!-- div:content -->
  
  <div data-role="content">
  	<!-- content is load by Ajax -->
  </div><!-- div:content -->
  
</div>
<script type="text/javascript">

	$("#loadAjax").bind("click", function(event) {

		$.ajax({
				url : "./AjaxDialogs",
				complete : function(xhr, result) {
					if (result != "success")
							return;

				var response = xhr.responseText;

				$("div:jqmData(role=content):last").hide().html(response).trigger("create").fadeIn(2000);
			}

		});

	});
</script>