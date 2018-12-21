// Object to activate focus and blur style changes for INPUT text boxes in 
// Internet Explorer
var InputFocus = {
	classNameFocus : "focus",
	classNameBlur : "",

	initialize : function() {
		// Test for Internet Explorer, and version that supports standard DOM calls
		if (document.selection && document.all && document.getElementById && document.getElementsByTagName) {
			var inputs = document.getElementsByTagName("input");
			var i = 0;
			var end = inputs.length;

			for (i; i < end; i++) {
				inputs[i].onfocus = function() {
					InputFocus.doFocus(this);
					InputFocus.myrules(this);
				};
			}
			
		}

	},

	doBlur : function(el) {
		el.className = el.className.replace(this.classNameFocus,this.classNameBlur);
		el = null;
	},

	doFocus : function(el) {
		el.className += this.classNameFocus;
	},

	myrules : function(element){
		element.onfocus = function(){
			clearInput(element);
		},
		element.onblur = function(){
		  replaceInput(element);
		};
	}
};//InputFocus

var clearInputValue = Array();
function clearInput(thisObj){
   if(!clearInputValue[thisObj]){
      clearInputValue[thisObj] = thisObj.value;
      thisObj.value = "";
     thisObj.style.color = "black";
   }
}
function replaceInput(thisObj){
   if(thisObj.value == ""){
      thisObj.value = clearInputValue[thisObj];
      thisObj.style.color = "#999999";
      clearInputValue[thisObj]= false;
   }
}
	
window.onload = function() {
	InputFocus.initialize();
};
    

