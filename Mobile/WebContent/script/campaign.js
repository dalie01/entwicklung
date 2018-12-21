/**
 * 
 */

var cHandler = {
	
	addCampaign : function(userId,campaignId) {
		
		var campaigns = cHandler.getCampaigns(userId);
			
		if (campaigns != null) {
			campaigns = JSON.parse(campaigns);
		} 
		else {
			campaigns = new Array();
		}
		
		var campaign = {
			id : campaignId
		};
		
		campaigns.push(campaign);
		
		cHandler.setCampaigns("WebApp." + userId + ".Campaigns", campaigns);	
	}, 
	
	hasCampaign : function(userId,campaignId) {
		
		cHandler.validParams(userId, campaignId);
			
		var campaigns = cHandler.getCampaigns(userId);
		
		if (campaigns != null) {
			campaigns = JSON.parse(campaigns);
		} else {
			return false;
		}
		
		for ( var int = 0; int < campaigns.length; int++) {
			if(campaigns[int].id == campaignId){
				
				return true;
			}
		}
				
		return false;	
		
	},
	
	removeCampaign : function(userId,campaignId){
		
		cHandler.Parmas(userId, campaignId);
			
		var campaigns = cHandler.getCampaigns(userId);
		
		if (campaigns != null) {
			campaigns = JSON.parse(campaigns);
		} else {
			return false;
		}
		
		for ( var int = 0; int < campaigns.length; int++) {
			if(campaigns[int].id == campaignId){
				campaigns.splice(int, 1);
				cHandler.setCampaigns("WebApp." + userId + ".Campaigns", campaigns);
				return true;
			}
		}
				
		return false;	
		
	},	
	
	getCampaigns : function(userId){
		return localStorage.getItem("WebApp." + userId + ".Campaigns");
	},
		
	setCampaigns : function(key, object){
		localStorage.setItem(key, JSON.stringify(object));
	},
	
	removeCampaigns : function(userId){
		return localStorage.removeItem("WebApp." + userId + ".Campaigns");
	},
	
	validParams : function(userId, campaignId){
		if (utils.isNotEmpty(userId) 
				&& utils.isNotEmpty(campaignId)) {
			return true;
		}
		return false;
	},
	
};