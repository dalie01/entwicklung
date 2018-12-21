YAHOO.namespace("example.calendar");

YAHOO.example.calendar.init = function() {
			YAHOO.example.calendar.cal1 = new YAHOO.widget.Calendar("cal1","cal1Container");
			YAHOO.example.calendar.cal1.render();
}
YAHOO.util.Event.onDOMReady(YAHOO.example.calendar.init);
