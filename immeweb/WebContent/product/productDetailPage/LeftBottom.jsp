<%@include file="/inc/Modul.jsp"%>

<div id="tabs">
	<!-- Navigation:Header -->
	<ul class="tab">
		<li id="tag_1" class="tab fragment_1"><span>Bilder</span></li>
		<li id="tag_2" class="tab fragment_2"><span>Maﬂe</span></li>
		<li id="tag_3" class="tab fragment_3"><span>Hinweise</span></li>
	</ul>
	<!-- Navigation:Images -->
	<div id="fragment_tag_1">

		<table class="productsImages">
			<thead>
				<tr>
					<td></td>
				</tr>
			</thead>
			<tbody>
				<c:set var="index" scope="page" value="0" />
				<c:forEach var="ProductImage" items="${ProductImageLinks}" varStatus="rowCount">
					<c:choose>
						<c:when test="${rowCount.count % 2 == 0}">
							<c:set var="rowStyle" scope="page" value="odd" />
						</c:when>
						<c:otherwise>
							<c:set var="rowStyle" scope="page" value="even" />
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${index == '0'}">
							<tr class="${rowStyle}">
								<td>
									<div class='product-image'>
										<a class="fancybox-effects-c" href="<%=Navigation.DIR_IMMEWEB_PICTURE%>${ProductImage}" data-fancybox-group="ConceptGallery" title=""> 
											<img src="<%=Navigation.DIR_IMMEWEB_PICTURE%>${ProductImage}" alt="" title="" />
										</a>
									</div>
								</td>
								<c:set var="index" scope="page" value="${index + 1}" />
						</c:when>
						<c:when test="${index == '1'}">
							<td>
								<div class='product-image'>
									<a class="fancybox-effects-c" href="<%=Navigation.DIR_IMMEWEB_PICTURE%>${ProductImage}" data-fancybox-group="ConceptGallery" title=""> 
										<img src="<%=Navigation.DIR_IMMEWEB_PICTURE%>${ProductImage}" alt="" title="" />
									</a>
								</div>

							</td>
							<c:set var="index" scope="page" value="${index + 1}" />
						</c:when>
						<c:when test="${index == '2'}">
							<td>
								<div class='product-image'>
									<a class="fancybox-effects-c" href="<%=Navigation.DIR_IMMEWEB_PICTURE%>${ProductImage}" data-fancybox-group="ConceptGallery" title=""> 
										<img src="<%=Navigation.DIR_IMMEWEB_PICTURE%>${ProductImage}" alt="" title="" />
									</a>
								</div>
							</td>
							<c:set var="index" scope="page" value="0" />
							</tr>
						</c:when>
					</c:choose>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5">&nbsp;</td>
				</tr>
			</tfoot>
		</table>

	</div>
	<!-- Navigation:Mob -->
	<div id="fragment_tag_2">
		<p><c:out value="${ProductAttributes['length']}" escapeXml="false" /></p>
		<p><c:out value="${ProductAttributes['hight']}" escapeXml="false" /></p>
		<p><c:out value="${ProductAttributes['deep']}" escapeXml="false" /></p>
		<p><c:out value="${ProductAttributes['range']}" escapeXml="false" /></p>
	</div>
	<!-- Navigation:Hints -->
	<div id="fragment_tag_3">
		<p><c:out value="${ProductAttributes['dispatch']}" escapeXml="false" /></p>
	</div>
</div>