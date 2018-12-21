<div id="0" class="cTeaser ui-state-persist ui-content ui-br ui-overlay-shadow ui-corner-all">
	<div id="cId_0" class="grid-95 mobile-grid-50" data-url="./MobileApp?Page=PAGE">
		
		Page<br/><br/>
	</div>	
	<div class="grid-5 mobile-grid-50" align="right">
		<a class="disableCampaign" data-teaserid="0" href="#" data-role="button" 
			 data-icon="delete" data-iconpos="notext" class="ui-btn-right"></a>
	
	</div>
	
</div>
<div id="1" class="cTeaser ui-state-persist ui-content ui-br ui-overlay-shadow ui-corner-all">
	<div id="cId_1" class="grid-95 mobile-grid-50"  data-url="./MobileApp?Page=SERVICEOPTIONS&CpId=TeleclubSportHD">
		
		sOptions<br/><br/>
	</div>	
	<div class="grid-5 mobile-grid-50" align="right">
		<a class="disableCampaign" data-teaserid="1" href="#" data-role="button" 
			data-icon="delete" data-iconpos="notext" class="ui-btn-right"></a>
			
	</div>
		
</div>

<script type="text/javascript">
 	
	function getTeaserEvents(){
		var allCampaigns = $('div[id*="cId_"]');
	
		$.each(allCampaigns, function(){
			var cUrl = $(this).data('url');
		
			var	cContainer = '<div><a class="aTeaser" href="'+ cUrl +'" data-transition="flip"></a></div>';
	     		$(this).wrap(cContainer);
		});
	}
 	
 	$(':jqmData(role=page)').on('pageinit',function (event){
     	var cTeaser = $('.cTeaser');
     	cTeaser.hide();
			     	
     	getTeaserEvents();
 	});

	$(':jqmData(role=page)').on('pageshow',function (event){
	 
		$('.cTeaser').each(function(index){
		 
	     	var cTeaserDiv = $('div#'+ $(this).attr('id'));
	     	var cTeaserId = $(this).attr("id");
	     
	     	if(cHandler.hasCampaign("DALIE",cTeaserId)){
	    		cTeaserDiv.hide();
		 	} else {
			 	cTeaserDiv.delay(index * 1000).fadeIn().delay(1000);
			}
	 	});
	 	bindTeaserEvents();
 	});
	

	function bindTeaserEvents(){
		var cTeaser = $('a.disableCampaign');
		$.each(cTeaser, function(){
			$(this).on('click', function(e){
				var cTContainer = $('div#' + $(this).data('teaserid'));
				var cTId = $(this).data('teaserid');
				cHandler.addCampaign("DALIE",cTId);
				cTContainer.delay(500).fadeOut("slow");
			});
		});
			
	}
	
 </script>