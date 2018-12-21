// Loader
var initCode = (function() {
	var loader = new YAHOO.util.YUILoader({
		base: "http://yui.yahooapis.com/2.7.0/build/",
		require: ["element","connection", "tabview", "calendar", "animation","dom", "dragdrop","event", "button", "menu","yahoo", "yahoo-dom-event","yuiloader-dom-event"],
		loadOptional: true,
		filter: "MIN",
		onSuccess: function() {
			calPopUpInit ();
		},
		onFailure: function(msg, xhrobj) {
	        alert ("LOAD FAILED: " + msg);
    	}

	});

// Load the files using the insert() method.
loader.insert();
});

initCode ();
function calPopUpInit () {
    YAHOO.util.Dom.addClass(document.body, 'yui-skin-sam');
    new popUpCalendar ('enddate',3);
    new popUpCalendar ('startdate');
}

/* create a calendar popup */
var popUpCalendar = function (objid, pages) {
    // glue container
	var el = new YAHOO.util.Dom.get(objid);
	var nel = document.createElement("div");
	nel.style.position = 'absolute';
	nel.style.zIndex = '1';
	nel.id = objid + '_cal';
	// insert in document.body as first element
	YAHOO.util.Dom.insertBefore(nel, YAHOO.util.Dom.getFirstChild (document.body));

    this.objectid = objid;
    this.cointainerid = nel.id;

    this.over_cal = false;
    this.calobj = new YAHOO.widget.CalendarGroup("cal" + objid,this.cointainerid,
    {
        START_WEEKDAY: 1,
        PAGES:(pages ? pages : 1),
        navigator:true
    });

    this.showCal = function (e, obj) {
        if (this.cointainerid)
            obj = this;
        var xy = YAHOO.util.Dom.getXY(this.id);
        var datum = YAHOO.util.Dom.get(this.id).value.split('.');
        if (!datum || datum == "") {
            var Zeit = new Date();
            datum[1] = Zeit.getMonth()+1;
            datum[0] = Zeit.getDate();
            datum[2] = Zeit.getFullYear();
        }
        var date = datum[1] + '/' + datum[0] + '/' + datum[2];
        if (date != '//') {
            obj.calobj.cfg.setProperty('selected', date, false);
            obj.calobj.cfg.setProperty('pagedate', datum[1] + '/' + datum[2], false);
            obj.calobj.render();
        }
        YAHOO.util.Dom.setStyle(obj.cointainerid, 'display', 'block');
        xy[1] = xy[1] + 20;
        YAHOO.util.Dom.setXY(obj.cointainerid, xy);
    }
    this.hideCal = function (e, obj) {
        if (this.cointainerid)
            obj = this;
		if (!obj.over_cal)
        	YAHOO.util.Dom.setStyle(obj.cointainerid, 'display', 'none');
    }
    this.getDate = function (e, obj) {
        if (this.cointainerid)
            obj = this;
        var calDate = obj.calobj.getSelectedDates()[0];
        calDate = calDate.getDate() + '.' +  (calDate.getMonth() + 1) + '.' + calDate.getFullYear();
        YAHOO.util.Dom.get(obj.objectid).value = calDate;
        obj.over_cal = false;
        obj.hideCal();
	}
	this.setupListeners = function(e, obj) {
		if (this.cointainerid)
            obj = this;
    	YAHOO.util.Event.addListener(obj.cointainerid, 'mouseover', obj.overCal, obj);
    	YAHOO.util.Event.addListener(obj.cointainerid, 'mouseout', obj.outCal, obj);
	}
	this.overCal = function (e, obj) {
		if (this.cointainerid)
            obj = this;
    	obj.over_cal = true;
	}

	this.outCal = function (e, obj) {
    	if (this.cointainerid)
            obj = this;
    	obj.over_cal = false;
	}
    this.calobj.selectEvent.subscribe(this.getDate, this.calobj, this);
    this.calobj.renderEvent.subscribe(this.setupListeners, this.calobj, this);
    YAHOO.util.Event.addListener(this.objectid, 'focus', this.showCal, this);
    YAHOO.util.Event.addListener(this.objectid, 'blur', this.hideCal, this);
    this.calobj.render(this.objectid);
    this.hideCal();
}

