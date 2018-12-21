package dmc.capi.servicemanagement;

import java.util.Collection;
import java.util.Date;

public interface ServiceOption {

    /**
     * Returns a list of action codes.
     * @return List of action codes as String
     */
    public Collection<String> getActionCodes();
    
    /**
     * Sets a list of action codes.
     * @param actionCodes List of action codes as String
     */
    public void setActionCodes(final Collection<String> actionCodes);
 
    /**
     * Returns a list of service option conflicts.
     * @return List of ServiceOptionConflict objects
     */
    public Collection<ServiceOptionConflict> getServiceOptionConflicts();
    
    /**
     * Sets a list of service option conflicts.
     * @param serviceOptionConflicts List of ServiceOptionConflict objects
     */
    public void setServiceOptionConflicts(final Collection<ServiceOptionConflict> 
        serviceOptionConflicts);
    
   

    /**
     * Returns the status.
     * @return Status
     */
    public String getStatus();
    
    /**
     * Sets the status.
     * @param status The status to set
     */
    public void setStatus(final String status);
    
    /**
     * Returns the deactivation date.
     * @return The deactivation date
     */
    public String getDeactivationDate();
    
    /**
     * Sets the deactivation date.
     * @param deactivationDate The deactivation date to set
     */
    public void setDeactivationDate(final String deactivationDate);
    
    /**
     * Returns the activation date.
     * @return Activation date
     */
    public String getActivationDate();
    
    /**
     * Sets the activation date.
     * @param activationDate The activation date to set
     */
    public void setActivationDate(final String activationDate);

    /**
     * Returns the activation date as DateObject.
     * @return Activation date as DateObject
     */
    public Date getActivationDateDate();
    
    /**
     * Sets the activation date.
     * @param activationDate The activation date to date
     */
    public void setActivationDateDate(final Date activationDate);
    
    
    /**
     * Returns the minimum duration.
     * @return The minimum duration
     */
    public Long getMinDuration();
    
    /**
     * Sets the minimum duration.
     * @param minDuration The minimum duration to set
     */
    public void setMinDuration(final Long minDuration);
    
    /**
     * Returns the product id.
     * @return Product id
     */
    public String getProductId();
    
    /**
     * Sets the product id.
     * @param productId The product id to set
     */
    public void setProductId(final String productId);
    
    /**
     * Returns the regular activation date.
     * @return Regular activation date
     */
    public String getRegularActivationDate();
    
    /**
     * Sets the regular activation date.
     * @param regActivationDate Regular activation date to set
     */
    public void setRegularActivationDate(final String regActivationDate);
    
    /**
     * Returns the regular termination date.
     * @return Regular termination date
     */
    public String getRegularTerminationDate();
    
    /**
     * Sets the regular termination date.
     * @param regTerminationDate Regular termination date to set
     */
    public void setRegularTerminationDate(final String regTerminationDate);
    
    /**
     * Indicates whether the option is currently active (=installed).
     * @return the installation status
     */
    public boolean isInstalled();
    
    /**
     * Sets the value of the installed property.
     * @param isInstalled the installation status.
     */
    public void setInstalled(final boolean isInstalled);

    /**
     * Indicates whether the option can be currently modified (= activated / deactivated). 
     * When false, the service option should not be used with setServiceOptions.
     * @return the modifiable status
     */
    public boolean isModifiable();

    /**
     * Sets the value of the modifiable property.
     * @param isModifiable the modifiable status.
     */
    public void setModifiable(final boolean isModifiable);

    /**
     * Returns the earlier deactivation date.
     * For uninstalled service options, the earliest date the service option could be uninstalled
     * if installed immediately. For installed service options with no deactivation planned, 
     * the date it will be uninstalled if ceased immediately.
     * 
     * @return The earlier deactivation date
     */
    public String getEarliestDeactivationDate();
    
    /**
     * Sets the earlier deactivation date.
     * @param deactivationDate The earlier deactivation date to set
     */
    public void setEarliestDeactivationDate(final String deactivationDate);
    /**
     * Returns the earlier deactivation date as Date.
     * For uninstalled service options, the earliest date the service option could be uninstalled
     * if installed immediately. For installed service options with no deactivation planned, 
     * the date it will be uninstalled if ceased immediately.
     * 
     * @return The earlier deactivation date as Date
     */
    public Date getEarliestDeactivationDateDate();
    
    /**
     * Sets the deactivation date.
     * @param deactivationDate The deactivation date to date
     */
    public void setEarliestDeactivationDateDate(final Date deactivationDate);
    
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
    public String getScheduledDeactivationDate();    
    /**
     * Sets the scheduled deactivation date.
     * @param deactivationDate The scheduled deactivation date to set
     */
    public void setScheduledDeactivationDate(final String deactivationDate);
    
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
    public Date getScheduledDeactivationDateDate();
    
    /**
     * Sets the scheduled deactivation date as Date.
     * @param deactivationDate The scheduled deactivation date to set
     */
    public void setScheduledDeactivationDateDate(final Date deactivationDate);
    
    /**
     * Returns the dependsOn ServiceOption Id.
     * This service option can only be installed when the depending service option is active. 
     * The depending service option cannot be uninstalled when this service option is active.
     * 
     * @return dependsOn Id
     */
    public String getDependsOn();
    
    /**
     * Sets the dependOn id.
     * @param dependsOn serviceOption Id 
     */
    public void setDependsOn(final String dependsOn);

    /**
     * True when the service option must be installed, false otherwise.
     * @return the activation commands
     */
    public boolean isActivation();

    /**
     * Sets the value of the activation property.
     * @param isActivation the activation command.
     */
    public void setActivation(final boolean isActivation);

    /**
     * Returns the product name.
     * @return Product name
     */
    public String getProductName();

        
    /**
     * Sets the product name.
     * @param productName The product name to set
     */
    public void setProductName(final String productName);

    /**
     * Returns the product.
     * @return Product 
     */
    public String getProduct();

    /**
     * Sets the product.
     * @param product The product to set
     */
    public void setProduct(final String product);
    
    @Override
	public String toString();
}
