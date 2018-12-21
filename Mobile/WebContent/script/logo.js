logoSmall = './media/logo/small/';
logoMiddle = './media/logo/middle/';
logoDefault = './media/logo/';
logoDefaultPage = 'LOGO-BANNER';

randoms = ['@.png','&.png','0.png','1.png','2.png','A.png','C.png','J.png','I.png','N.png','X.png','S.png','E.png','3.png','V.png'];
arrows = ['pR.png','pS.png','pL.png','pN.png'];
pics = ['media/pfeilmit01.gif', 'media/pfeilmit02.gif', 'media/pfeilmit03.gif', 'media/pfeilmit04.gif'];
time = [2000,1600,1400,1000,800,600,400,300,200,150,140,120,110,100];
shorttime = [300,200,150,140,120,110,100];

/**
 * Logo 
 * */
var logo = {
	
	/* get banner content: empty  */
	getDefaultBanner : function (element) {
		$.ajax({
			url : "./MobileApp?Page=" + logoDefaultPage,
			complete : function(xhr, result) {
			if (result != "success")
					return;
				var response = xhr.responseText;
				element.empty().append(response);
			
			}
		});
	},	
	
	/* get banner content: by url  */
	getBanner : function (element, pageId) {
		$.ajax({
			url : "./MobileApp?Page=" + pageId,
			complete : function(xhr, result) {
			if (result != "success")
					logo.getDefaultBanner(element);
				var response = xhr.responseText;
				element.empty().append(response);
			
			}
		});
	},	
	
	arrowRandom : function (element, height) {
		var count = 0;
		element.addClass('mouseIn');
     (function next() {
		
    	 if(count == arrows.length){
    		 count = 0;
    	 }
    	 
    	if(! element.hasClass('mouseIn')) {
			return;
		}
    	 
		setTimeout(function() {
			element.attr('src', logo.getSrc(height) + arrows[count]);
			count++;
			next();
		},1200);
			
     })();
	
	},
	
	arrowRandomEndWithFirst : function(element, height) {
		var count = time.length;
		element.removeClass('mouseIn');
		
		(function next() {
			
			if(count == 0){
				logo.setImageSize(element, height);
				return;
			}
			
			setTimeout(function(){
				element.attr('src', logo.getSrc(height) + arrows[Math.floor(Math.random() * 3) + 1]);
				count--;
				next();
			},time[Math.floor(Math.random() * 13)]);
			
		})();
		
	},
	
	setRandomImageSize : function(element, height) {
		var count = time.length;
		
		(function next(){
			
			if(element.hasClass('protected')) {
				logo.setImageLink(element, height);
				return;
			}
			
			if(count == 0 ) {
				logo.setImageSize(element, height);
				$(element).trigger('Dalieweb.Logo.Notification.Refresh');
				return;
			}
			
			setTimeout(function() {
				element.attr('src',  logo.getSrc(height) + randoms[Math.floor(Math.random() * 14)]);
				count--;
				next();
			},time[Math.floor(Math.random() * 13)]);
			
		})();
		
		
	},
	
	setShortRandomImageSize : function(element, height) {
		var count = time.length;
		
		(function next(){
			
			if(element.hasClass('protected')) {
				logo.setImageLink(element, height);
				return;
			}
			
			if(count == 0 ) {
				logo.setImageSize(element, height);
				$(element).trigger('Dalieweb.Logo.Notification.Refresh');
				return;
			}
			
			setTimeout(function() {
				element.attr('src',  logo.getSrc(height) + randoms[Math.floor(Math.random() * 14)]);
				count--;
				next();
			},shorttime[Math.floor(Math.random() * 6)]);
			
		})();
		
		
	},
	
	
	
	setMouseOverImageLink : function (element, height) {
		element.addClass('protected');
		logo.setImageLink(element, height);
		
	},
	
	removeMouseOverImageLink : function (element, height){
		element.removeClass('protected');
		logo.setShortRandomImageSize(element, height);
	},
	
	conclusion : function(element, height) {
		
		if(! element.hasClass('protected')){
			logo.setImageSize(element, height);
		}
	},
	
	setImageSize : function(element, height) {
		
		return element.attr('src', logo.getSrc(height) + element.data('image'));
	},

	setImageLink : function(element, height) {
		return element.attr('src', logo.getSrc(height) + element.data('link'));
	},
	
	getSrc : function (height) {
		
		if (height <= 310) {
			return logoSmall;
		} 
		else if (height < 620) {
			return logoMiddle;
		};
		
		return logoDefault;
	}
};