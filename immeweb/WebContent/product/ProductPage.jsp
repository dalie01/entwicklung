<!-- TagLib-Directive -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/TagLibraryDescriptor.tld" prefix="dalie"%>
<script src="<%=request.getContextPath()%>/script/product/ProductPage.js" type="text/javascript"></script>

	
	<div class="yui3-g">
	<div class="yui3-u-1">
	<!-- Space:Header:Line -->
		<!-- 
			<dalie:CatalogTag products="${Products}" cssDefinition="tree"></dalie:CatalogTag>
		 -->
				<br/>
				<img src="./theme/images/bg/Background_ScheunenDesign_SiteType_02_line.png" alt="" title="" width="99%"/>
			</div><!-- /.yui3-u-1 -->
	</div><!-- /.yui3-u-1 -->		
	<div class="yui3-g">
	<!-- Space:Main -->	
		<div class="yui3-g">
			<div class="yui3-u-1">	
				<br/><br/>
				<dalie:ProductTag products="${Products}" cssDefinition="products"></dalie:ProductTag>
    		</div><!-- /.yui3-u-1 -->	
		</div>
	</div><!-- /.yui3-g -->
	<div class="yui3-u-1">
	<!-- Space:Footer -->
	</div><!-- /.yui3-u-1 -->
</div><!-- /.yui3-g -->
	

