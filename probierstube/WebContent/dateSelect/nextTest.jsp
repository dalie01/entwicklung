<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
   <title>Calendar Text Input</title>
   <style type="text/css">
/*margin and padding on body element
  can introduce errors in determining
  element position and are not recommended;
  we turn them off as a foundation for YUI
  CSS treatments. */
body {
	margin:0;
	padding:0;
}
</style>

<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.0r4/build/fonts/fonts-min.css" />
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.0r4/build/button/assets/skins/sam/button.css" />
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.0r4/build/container/assets/skins/sam/container.css" />
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.8.0r4/build/calendar/assets/skins/sam/calendar.css" />
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/yahoo-dom-event/yahoo-dom-event.js"></script>
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/dragdrop/dragdrop-min.js"></script>
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/element/element-min.js"></script>
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/button/button-min.js"></script>
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/container/container-min.js"></script>
<script type="text/javascript" src="http://yui.yahooapis.com/2.8.0r4/build/calendar/calendar-min.js"></script>


<!--begin custom header content for this example-->
<style type="text/css">
    /* Clear calendar's float, using dialog inbuilt form element */
    #container .bd form {
        clear:left;
    }

    /* Have calendar squeeze upto bd bounding box */
    #container .bd {
        padding:0;
    }

    #container .hd {
        text-align:left;
    }

    /* Center buttons in the footer */
    #container .ft .button-group {
        text-align:center;
    }

    /* Prevent border-collapse:collapse from bleeding through in IE6, IE7 */
    #container_c.yui-overlay-hidden table {
        *display:none;
    }

    /* Remove calendar's border and set padding in ems instead of px, so we can specify an width in ems for the container */
    #cal {
        border:none;
        padding:1em;
    }

    /* Datefield look/feel */
    .datefield {
        position:relative;
        top:10px;
        left:10px;
        white-space:nowrap;
        border:1px solid black;
        background-color:#eee;
        width:25em;
        padding:5px;
    }

    .datefield input,
    .datefield button,
    .datefield label  {
        vertical-align:middle;
    }

    .datefield label  {
        font-weight:bold;
    }

    .datefield input  {
        width:15em;
    }

    .datefield button  {
        padding:0 5px 0 5px;
        margin-left:2px;
    }

    .datefield button img {
        padding:0;
        margin:0;
        vertical-align:middle;
    }

    /* Example box */
    .box {
        position:relative;
        height:30em;
    }
</style>
</head>
<body class="yui-skin-sam">
	<script type="text/javascript">
    YAHOO.util.Event.onDOMReady(function(){

        var Event = YAHOO.util.Event,
            Dom = YAHOO.util.Dom,
            dialog,
            calendar;

        var showBtn = Dom.get("show");

        Event.on(showBtn, "click", function() {

            // Lazy Dialog Creation - Wait to create the Dialog, and setup document click listeners, until the first time the button is clicked.
            if (!dialog) {

                // Hide Calendar if we click anywhere in the document other than the calendar
                Event.on(document, "click", function(e) {
                    var el = Event.getTarget(e);
                    var dialogEl = dialog.element;
                    if (el != dialogEl && !Dom.isAncestor(dialogEl, el) && el != showBtn && !Dom.isAncestor(showBtn, el)) {
                        dialog.hide();
                    }
                });

                function resetHandler() {
                    // Reset the current calendar page to the select date, or 
                    // to today if nothing is selected.
                    var selDates = calendar.getSelectedDates();
                    var resetDate;
        
                    if (selDates.length > 0) {
                        resetDate = selDates[0];
                    } else {
                        resetDate = calendar.today;
                    }
                    calendar.cfg.setProperty("pagedate", resetDate);
                    calendar.render();
                }
        
                function closeHandler() {
                    dialog.hide();
                }

                dialog = new YAHOO.widget.Dialog("container", {
                    visible:false,
                    context:["show", "tl", "bl"],
                    buttons:[ {text:"Reset", handler: resetHandler, isDefault:true}, {text:"Close", handler: closeHandler}],
                    draggable:false,
                    close:true
                });
                dialog.setHeader('Pick A Date');
                dialog.setBody('<div id="cal"></div>');
                dialog.render(document.body);

                dialog.showEvent.subscribe(function() {
                    if (YAHOO.env.ua.ie) {
                        // Since we're hiding the table using yui-overlay-hidden, we 
                        // want to let the dialog know that the content size has changed, when
                        // shown
                        dialog.fireEvent("changeContent");
                    }
                });
            }

            // Lazy Calendar Creation - Wait to create the Calendar until the first time the button is clicked.
            if (!calendar) {

                calendar = new YAHOO.widget.Calendar("cal", {
                    iframe:false,          // Turn iframe off, since container has iframe support.
                    hide_blank_weeks:true  // Enable, to demonstrate how we handle changing height, using changeContent
                });
                calendar.cfg.setProperty("WEEKDAYS_LONG",["Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"]);
                calendar.cfg.setProperty("MONTHS_LONG",["Januar", "Februar", "M\u00E4rz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"]);
                calendar.render();

                calendar.selectEvent.subscribe(function() {
                    if (calendar.getSelectedDates().length > 0) {

                        var selDate = calendar.getSelectedDates()[0];

                        // Pretty Date Output, using Calendar's Locale values: Friday, 8 February 2008
                        var wStr = calendar.cfg.getProperty("WEEKDAYS_LONG")[selDate.getDay()];
                        var dStr = selDate.getDate();
                        var mStr = calendar.cfg.getProperty("MONTHS_LONG")[selDate.getMonth()];
                        //var mStr = calendar.cfg.getProperty("MONTHS_SHORT")[selDate.getMonth()];
                        var yStr = selDate.getFullYear();
        
                        //Dom.get("date").value = wStr + ", " + dStr + "." + mStr + "." + yStr;
                        Dom.get("date").value = dStr + "." + mStr + "." + yStr;
                    } else {
                        Dom.get("date").value = "";
                    }
                    dialog.hide();
                });

                calendar.renderEvent.subscribe(function() {
                    // Tell Dialog it's contents have changed, which allows 
                    // container to redraw the underlay (for IE6/Safari2)
                    dialog.fireEvent("changeContent");
                });
            }

            var seldate = calendar.getSelectedDates();

            if (seldate.length > 0) {
                // Set the pagedate to show the selected date if it exists
                calendar.cfg.setProperty("pagedate", seldate[0]);
                calendar.render();
            }

            dialog.show();
        });
    });
</script>
<div class="box">
   <div class="datefield">
      <label for="date">Date: </label><input type="text" id="date" name="date" value="" /><button type="button" id="show" title="Show Calendar"><img src="assets/calbtn.gif" width="18" height="18" alt="Calendar" ></button>
   </div>
</div>
</body>
</html>