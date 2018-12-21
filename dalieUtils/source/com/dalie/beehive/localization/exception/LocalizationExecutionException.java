package com.dalie.beehive.localization.exception;

public class LocalizationExecutionException extends Exception {

	public LocalizationExecutionException(){
		
	} /* LocalizationExecutionException */
	
	public LocalizationExecutionException(
			final String message){
		super(message);
	} /* LocalizationExecutionException */
	
	public LocalizationExecutionException(
			Exception ex){
		super(ex);
	} /* LocalizationExecutionException */
	
	public LocalizationExecutionException(
			final String message, Exception ex){
		super(message,ex);
	} /* LocalizationExecutionException */
	
} /* LocalizationExecutionException */
