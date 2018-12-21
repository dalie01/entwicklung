<!-- siteContents\favorites\FavoritesContent.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="/siteIncludes/Module.jsp"%>

<div data-role="content">	
	<p>Favorites</p>
		
	<div id="list-container">
		</div>
		
</div>
<script type="text/javascript">

	/* This enables the edit favorites functionality */
	$(":jqmData(role='page')").on("pagecreate", function(event) {
		createFavoritesList();
		bindSortable();
	});
	
function bindSortable(){
	var listSortable = $("#favorites-list");
	
	listSortable.sortable();
	listSortable.sortable("enable");
	listSortable.disableSelection();
	
	listSortable.bind("sortstart", function(event, ui) {
		ui.item.startPos = ui.item.index();
	});
	listSortable.bind("sortstop", function(event, ui) {
		listSortable.listview("refresh");
		
		var startPos = ui.item.startPos;
		var endPos = ui.item.index();
		storage.changeFavoritesPosition("DALIE", startPos, endPos);
	});
}	
function createFavoritesList(){
	var listContainer = $("#list-container");
	listContainer.empty();
			
	var favorites = storage.getFavorites("DALIE");
			
	var count = favorites.length;
	if (count > 0) {
		         
		var buffer = '<ul data-role=listview data-inset=true id=favorites-list>';
				
		for ( var int = 0; int < favorites.length; int++) {
			buffer += '<li><a href=' + favorites[int].url + ' data-transition=flow><h3>' + favorites[int].title + '</h3><p class=ui-li-desc>' + favorites[int].subtitle + '</p></a></li>';
		}
				
		buffer += '</ul>';
		listContainer.append(buffer);
	}
	else {
		listContainer.append('<p>no Bookmarks stored</p>');
	}
}
</script>