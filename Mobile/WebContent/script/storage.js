 var storage = {
		 
	getFavorites : function(userId) {
		var favorites = null;
		var favoritesString = localStorage.getItem("WebApp." + userId + ".Favorites");
			 
		if (favoritesString != null) {
			favorites = JSON.parse(favoritesString);
		} 
		else {
			favorites = new Array();
		}
	
		function compare(a, b) {
			if (a.position < b.position) {
				return -1;
			} 
			else if (a.position > b.position) {
				return 1;
			};
			
			return 0;
		};
		
		favorites.sort(compare);
		
		return favorites;
		
	},
	
	getFavoriteForURL : function(userId, url) {
		var favorites = storage.getFavorites(userId);
		var count = favorites.length;
		
		if (count > 0) {
			for (var i=0; i<count; i++) {
				if (favorites[i].url == url) {
					return favorites[i];
				}
			}
		}		
		
		return null;
	},
	
	addFavorite : function(userId, title, subtitle, url) {
		// Do not add favorite if it exists already
		if (storage.getFavoriteForURL(userId, url) != null) return false;
		
		var favorite = {
			position : 0,
			title : title,
			subtitle : subtitle,
			url : url
		};
		
		var favorites = storage.getFavorites(userId);
		var count = favorites.length;
		count++;
		favorite.position = count-1;
		favorites.push(favorite);
		storage.storeObject("WebApp." + userId + ".Favorites", favorites);
		
		return true;
	},
	
	removeFavorite : function(userId, url){
		var favorites = storage.getFavorites(userId);
		
		for ( var int = 0; int < favorites.length; int++) {
			if (favorites[int].url == url) {
				favorites.splice(int, 1);
				storage.storeObject("WebApp." + userId + ".Favorites", favorites);
				return true;
			}
		}
	},
	
	changeFavoritesPosition : function(userId, startPosition, endPosition){
		var favorites = storage.getFavorites(userId);
		var count = favorites.length;

		if (count > startPosition && count > endPosition) {
			var fav = favorites.splice(startPosition, 1)[0];
			favorites.splice(endPosition, 0, fav);
			
			/* Update favorites positions */
			for ( var int = 0; int < count; int++) {
				favorites[int].position = int;
			}
			
			storage.storeObject("WebApp." + userId + ".Favorites", favorites);
		}
	},
	
	storeObject : function(key, object){
		localStorage.setItem(key, JSON.stringify(object));
	}
 };