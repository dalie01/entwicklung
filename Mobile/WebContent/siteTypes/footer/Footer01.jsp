<!-- siteTypes/footer/Footer01.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<div data-role="navbar" data-iconpos="top">
	<ul>
		<li>
			<a href="./MobileApp?Page=DALIE" data-icon="grid" data-theme="b" rel="external" data-ajax="false" title="<dalie:LocalizedString key="dalie.mobile.footer.a.main.title"/>">
				<dalie:LocalizedString key="dalie.mobile.footer.a.main"/>
			</a>
		</li>
		<li><a href="'#'">&nbsp;</a></li>
		<li>
			<a href="./MobileApp?Page=FAVORITES" data-icon="star" title="<dalie:LocalizedString key="dalie.mobile.footer.a.favorites.title"/>">
				<dalie:LocalizedString key="dalie.mobile.footer.a.favorites"/>
			</a>
		</li>
		<li>
			<a href="./MobileApp?Page=TRYOUT" data-icon="info" rel="external" data-ajax="false" title="<dalie:LocalizedString key="dalie.mobile.footer.a.tryout.title"/>">
				<dalie:LocalizedString key="dalie.mobile.footer.a.tryout"/>
			</a>
		</li>
		<li><a href="./MobileApp?Page=BACKOFFICE" data-icon="gear" title="<dalie:LocalizedString key="dalie.mobile.footer.a.title.administration"/>">
			<dalie:LocalizedString key="dalie.mobile.footer.a.administration"/>
			</a>
		</li>
	</ul>
</div>
<script type="text/javascript">
	/* This enables the favorites functionality */
	$(":jqmData(role='page')").on("pageshow", function(event) {
		var bookmark_link = $("a#navigationbar-bookmark-link");
		if (bookmark_link.length) {
			var id = "DALIE";
			var url = document.URL;
			if (storage.getFavoriteForURL(id, url) != null) {
				bookmark_link.buttonMarkup({ icon: "check" });
				bookmark_link.attr('title', 'Remove Favorite');
			}
			
			bookmark_link.off("click").on("click", function(event) {
			
				var title = document.title;
				if (typeof bookmark_link.attr("data-favtitle") !== "undefined") {
					title = bookmark_link.attr("data-favtitle");
				}
				
				var subtitle = "";
				if (typeof bookmark_link.attr("data-favsubtitle") !== "undefined") {
					subtitle = bookmark_link.data("favsubtitle");
				}
				
				if (storage.getFavoriteForURL(id, url) != null) {
					bookmark_link.buttonMarkup({ icon: "star" });
					storage.removeFavorite(id, url);
					bookmark_link.attr('title', 'Add Favorite');
				}
				else {
					storage.addFavorite(id, title, subtitle, url);
					bookmark_link.buttonMarkup({ icon: "check" });
					bookmark_link.attr('title', 'Remove Favorite');
				}
				
				event.preventDefault();
			});
		}
	});
</script>	