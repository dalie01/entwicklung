package mobile.internal.mapping;

import java.util.Collection;
import java.util.Date;

import mobile.capi.mapping.ServiceOption;
import mobile.capi.mapping.ServiceOptionConflict;

public class ServiceOptionImpl implements ServiceOption {
	
	private Collection<String> actionCodes;
	private Collection<ServiceOptionConflict> serviceOptionConflicts;    
	private String status;
	private String deactivationDate;
	private String activationDate;
	private Date activationDateDate;
	private String regActivationDate;
	private String regTerminationDate;
	private String productId;
	private Long minDuration;
	private boolean isInstalled;
	private boolean isModifiable;
	private String scheduledDeactivationDate;
	private Date scheduledDeactivationDateDate;
	private String earliestDeactivationDate;
	private Date earliestDeactivationDateDate;
	private String dependsOn;
	private boolean isActivation;
	private String productName;
	private String product;
	    
	/**
	 * Returns a list of action codes.
	 * 
	 * @return List of action codes as String
	 */
	@Override
	public Collection<String> getActionCodes() {
		return actionCodes;
	}
	    
	/**
	 * Sets a list of action codes.
	 * 
	 * @param actionCodes
	 *            List of action codes as String
	 */
	@Override
	public void setActionCodes(final Collection<String> actionCodes) {
		this.actionCodes = actionCodes;
	}

	/**
	 * Returns a list of service option conflicts.
	 * 
	 * @return List of ServiceOptionConflict objects
	 */
	@Override
	public Collection<ServiceOptionConflict> getServiceOptionConflicts() {
		return serviceOptionConflicts;
	}

	/**
	 * Sets a list of service option conflicts.
	 * 
	 * @param serviceOptionConflicts
	 *            List of ServiceOptionConflict objects
	 */
	@Override
	public void setServiceOptionConflicts(
			final Collection<ServiceOptionConflict> serviceOptionConflicts) {
		this.serviceOptionConflicts = serviceOptionConflicts;
	}
	    	   
	/**
	 * Returns the status.
	 * @return Status
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 * @param status The status to set
	 */
	@Override
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * Returns the deactivation date.
	 * @return The deactivation date
	 */
	@Override
	public String getDeactivationDate() {
		return deactivationDate;
	}

	/**
	 * Sets the deactivation date.
	 * @param deactivationDate The deactivation date to set
	 */
	@Override
	public void setDeactivationDate(final String deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	/**
	 * Returns the activation date.
	 * @return Activation date
	 */
	@Override
	public String getActivationDate() {
		return activationDate;
	}

	/**
	 * Sets the activation date.
	 * @param activationDate The activation date to set
	 */
	@Override
	public void setActivationDate(final String activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * Returns the activation date as DateObject.
	 * @return Activation date as DateObject
	 */
	@Override
	public Date getActivationDateDate() {
		return activationDateDate;
	}

	/**
	 * Sets the activation date.
	 * @param activationDate The activation date to date
	 */
	@Override
	public void setActivationDateDate(final Date activationDate) {
		this.activationDateDate = activationDate;
	}


	/**
	 * Returns the minimum duration.
	 * @return The minimum duration
	 */
	@Override
	public Long getMinDuration() {
		return minDuration;
	}

	/**
	 * Sets the minimum duration.
	 * @param minDuration The minimum duration to set
	 */
	@Override
	public void setMinDuration(final Long minDuration) {
		this.minDuration = minDuration;
	}

	/**
	 * Returns the product id.
	 * @return Product id
	 */
	@Override
	public String getProductId() {
		return productId;
	}

    /**
     * Returns the clean product id 
     * ready to use by JavaScript.
     * @return Product id clean.
     * */
    public String getProductIdForScript(){
    	return productId.replaceAll("[^A-Za-z0-9]","");
    }
    
	/**
	 * Sets the product id.
	 * @param productId The product id to set
	 */
	@Override
	public void setProductId(final String productId) {
		this.productId = productId;
	}

	/**
	 * Returns the regular activation date.
	 * @return Regular activation date
	 */
	@Override
	public String getRegularActivationDate() {
		return regActivationDate;
	}

	/**
	 * Sets the regular activation date.
	 * @param regActivationDate Regular activation date to set
	 */
	@Override
	public void setRegularActivationDate(final String regActivationDate) {
		this.regActivationDate = regActivationDate;
	}

	/**
	 * Returns the regular termination date.
	 * @return Regular termination date
	 */
	@Override
	public String getRegularTerminationDate() {
		return regTerminationDate;
	}

	/**
	 * Sets the regular termination date.
	 * @param regTerminationDate Regular termination date to set
	 */
	@Override
	public void setRegularTerminationDate(final String regTerminationDate) {
		this.regTerminationDate = regTerminationDate;
	}

	/**
	 * Indicates whether the option is currently active (=installed).
	 * @return the installation status
	 */
	@Override
	public boolean isInstalled() {
		return isInstalled;
	}

	/**
	 * Sets the value of the installed property.
	 * @param isInstalled the installation status.
	 */
	@Override
	public void setInstalled(final boolean isInstalled) {
		this.isInstalled = isInstalled;
	}

	/**
	 * Indicates whether the option can be currently modified (= activated / deactivated). 
	 * When false, the service option should not be used with setServiceOptions.
	 * @return the modifiable status
	 */
	@Override
	public boolean isModifiable() {
		return isModifiable;
	}

	/**
	 * Sets the value of the modifiable property.
	 * @param isModifiable the modifiable status.
	 */
	@Override
	public void setModifiable(final boolean isModifiable) {
		this.isModifiable = isModifiable;
	}

	/**
	 * Returns the earlier deactivation date.
	 * For uninstalled service options, the earliest date the service option could be uninstalled
	 * if installed immediately. For installed service options with no deactivation planned, 
	 * the date it will be uninstalled if ceased immediately.
	 * 
	 * @return The earlier deactivation date
	 */
	@Override
	public String getEarliestDeactivationDate() {
		return earliestDeactivationDate;
	}

	/**
	 * Sets the earlier deactivation date.
	 * @param deactivationDate The earlier deactivation date to set
	 */
	@Override
	public void setEarliestDeactivationDate(final String deactivationDate) {
		this.earliestDeactivationDate = deactivationDate;
	}

	/**
	 * Returns the earlier deactivation date as Date.
	 * For uninstalled service options, the earliest date the service option could be uninstalled
	 * if installed immediately. For installed service options with no deactivation planned, 
	 * the date it will be uninstalled if ceased immediately.
	 * 
	 * @return The earlier deactivation date as Date
	 */
	@Override
	public Date getEarliestDeactivationDateDate() {
		return earliestDeactivationDateDate;
	}

	/**
	 * Sets the deactivation date.
	 * @param deactivationDate The deactivation date to date
	 */
	@Override
	public void setEarliestDeactivationDateDate(final Date deactivationDate) {
		this.earliestDeactivationDateDate = deactivationDate;
	}

	/**
	 * Returns the scheduled deactivation date.
	 * The date the service option will get uninstalled (for installed options with planned 
	 * deactivation only). It indicates either the scheduled deactivation date 
	 * (when a service option cannot be uninstalled immediately due to a minimal duration) 
	 * or the day a service option ceases (for service options having a fixed lifetime 
	 * such as "protect").
	 * 
	 * @return The scheduled deactivation date
	 */
	@Override
	public String getScheduledDeactivationDate() {
		return scheduledDeactivationDate;
	}

	/**
	 * Sets the scheduled deactivation date.
	 * @param deactivationDate The scheduled deactivation date to set
	 */
	@Override
	public void setScheduledDeactivationDate(final String deactivationDate) {
		this.scheduledDeactivationDate = deactivationDate;
	}

	/**
	 * Returns the scheduled deactivation date as Date.
	 * The date the service option will get uninstalled (for installed options with planned 
	 * deactivation only). It indicates either the scheduled deactivation date 
	 * (when a service option cannot be uninstalled immediately due to a minimal duration) 
	 * or the day a service option ceases (for service options having a fixed lifetime 
	 * such as "protect").
	 * 
	 * @return The scheduled deactivation date
	 */
	@Override
	public Date getScheduledDeactivationDateDate() {
		return scheduledDeactivationDateDate;
	}

	/**
	 * Sets the scheduled deactivation date as Date.
	 * @param deactivationDate The scheduled deactivation date to set
	 */
	@Override
	public void setScheduledDeactivationDateDate(final Date deactivationDate) {
		this.scheduledDeactivationDateDate = deactivationDate;
	}

	/**
	 * Returns the dependsOn ServiceOption Id.
	 * This service option can only be installed when the depending service option is active. 
	 * The depending service option cannot be uninstalled when this service option is active.
	 * 
	 * @return dependsOn Id
	 */
	@Override
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * Sets the dependOn id.
	 * @param dependsOn serviceOption Id 
	 */
	@Override
	public void setDependsOn(final String dependsOn) {
		this.dependsOn = dependsOn;
	}

	/**
	 * True when the service option must be installed, false otherwise.
	 * @return the activation commands
	 */
	@Override
	public boolean isActivation() {
		return isActivation;
	}

	/**
	 * Sets the value of the activation property.
	 * @param isActivation the activation command.
	 */
	@Override
	public void setActivation(final boolean isActivation) {
		this.isActivation = isActivation;
	}

	/**
	 * Returns the product name.
	 * @return Product name
	 */
	@Override
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name.
	 * @param productName The product name to set
	 */
	@Override
	public void setProductName(final String productName) {
		this.productName = productName;
	}

	/**
	 * Returns the product.
	 * @return Product 
	 */
	@Override
	public String getProduct() {
		return product;
	}

	/**
	 * Sets the product.
	 * @param product The product to set
	 */
	@Override
	public void setProduct(final String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ServiceOptionImpl [actionCodes=" + actionCodes
				+ ", serviceOptionConflicts=" + serviceOptionConflicts
				+ ", status=" + status + ", deactivationDate="
				+ deactivationDate + ", activationDate=" + activationDate
				+ ", activationDateDate=" + activationDateDate
				+ ", regActivationDate=" + regActivationDate
				+ ", regTerminationDate=" + regTerminationDate + ", productId="
				+ productId + ", minDuration=" + minDuration + ", isInstalled="
				+ isInstalled + ", isModifiable=" + isModifiable
				+ ", scheduledDeactivationDate=" + scheduledDeactivationDate
				+ ", scheduledDeactivationDateDate="
				+ scheduledDeactivationDateDate + ", earliestDeactivationDate="
				+ earliestDeactivationDate + ", earliestDeactivationDateDate="
				+ earliestDeactivationDateDate + ", dependsOn=" + dependsOn
				+ ", isActivation=" + isActivation + ", productName="
				+ productName + ", product=" + product + "]";
	}
	    

}
