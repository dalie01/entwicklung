<%@include file="/inc/Modul.jsp"%>
<script src="<%=request.getContextPath()%>/script/product/ProductDetailPage.js" type="text/javascript"></script>

<div id="doc" class="yui3-g">
	<div class="yui3-u-3-8">	
		<div id="docLeft" class="productsEmbededTop">
    		<div id="docLeftTop" class="productDescription">
    		 	<strong><c:out value="${Product.name}"></c:out></strong>
    		 	<br/><br/>
   		 		<c:out value="${Product.description}" escapeXml="false"/>	
    		   <p><span style="display:none;">X</span></p> 	
    		</div>
    		<div id="docLeftBottom" class="productsEmbededBottom">
    		 	<!-- ProductDetailPage:Content -->
    			<jsp:include page="/product/productDetailPage/LeftBottom.jsp"></jsp:include>
    		</div><!-- docBottom -->
    	</div><!-- docLeft -->    		 	
    </div><!-- /.yui3-u-3-8 -->
    <div class="yui3-u-5-8">
    	<div id="docMain" class="productEmbeded">		
			<div class='product-medium'>
		     	<a class="fancybox-effects-c" href="<%=Navigation.DIR_IMMEWEB_PICTURE%>${Product.mediumPicture}" 
							data-fancybox-group="ConceptGallery" title="">
		     		<img src="<%=Navigation.DIR_IMMEWEB_PICTURE%>${Product.mediumPicture}" alt="" title=""/>
				</a> 
		    </div>
        </div>
    </div>	
</div><!-- /.yui3-g -->

<script type="text/javascript" >
jQuery(document).ready(function() {
       var docHeight = parseInt(jQuery(window).height(),10) - Math.round(0.18 * jQuery(window).height());
       var docWidth = parseInt(jQuery(window).width(),10) - Math.round(0.18 * jQuery(window).width());
       // Grab variable from JSTL. 
       var iCount = '<c:out value="${fn:length(ProductImageLinks)}"/>';
       test(iCount,docHeight,docWidth);
});  
</script>
