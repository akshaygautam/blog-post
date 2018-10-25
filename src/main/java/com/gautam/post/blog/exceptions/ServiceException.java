package com.gautam.post.blog.exceptions;

import java.util.Map;
import java.util.logging.Level;

public class ServiceException extends Exception{
	 protected final int statusCode;
	  protected final String reason;
	  protected final String domain;
	  protected Level logLevel;

	  public ServiceException(int statusCode, String statusMessage) {
	    super(statusMessage);

	    this.statusCode = statusCode;
	    this.reason = null;
	    this.domain = null;
	  }

	  public ServiceException(int statusCode, Throwable cause) {
	    super(cause);

	    this.statusCode = statusCode;
	    this.reason = null;
	    this.domain = null;
	  }

	  public ServiceException(int statusCode, String statusMessage, Throwable cause) {
	    super(statusMessage, cause);

	    this.statusCode = statusCode;
	    this.reason = null;
	    this.domain = null;
	  }

	  public ServiceException(int statusCode, String statusMessage, String reason) {
	    super(statusMessage);

	    this.statusCode = statusCode;
	    this.reason = reason;
	    this.domain = null;
	  }
	  
	  public ServiceException(int statusCode, String statusMessage, String reason, Throwable cause) {
	    super(statusMessage, cause);
	    
	    this.statusCode = statusCode;
	    this.reason = reason;
	    this.domain = null;
	  }

	  public ServiceException(int statusCode, String statusMessage, String reason, String domain) {
	    super(statusMessage);

	    this.statusCode = statusCode;
	    this.reason = reason;
	    this.domain = domain;
	  }
	  
	  public ServiceException(int statusCode, String statusMessage, String reason, String domain, 
	      Throwable cause) {
	    super(statusMessage, cause);
	    
	    this.statusCode = statusCode;
	    this.reason = reason;
	    this.domain = domain;
	  }

	  public int getStatusCode() {
	    return statusCode;
	  }

	  public String getReason() {
	    return reason;
	  }

	  public String getDomain() {
	    return domain;
	  }

	  public Map<String, String> getHeaders() {
	    return null;
	  }

	  public Level getLogLevel() {
	    return logLevel == null ? getDefaultLoggingLevel(statusCode) : logLevel;
	  }

	  private static Level getDefaultLoggingLevel(int statusCode) {
	    return statusCode >= 500 ? Level.SEVERE : Level.INFO;
	  }

	  public static <T extends ServiceException> T withLogLevel(T exception, Level level) {
	    exception.logLevel = level;
	    return exception;
	  }
}
