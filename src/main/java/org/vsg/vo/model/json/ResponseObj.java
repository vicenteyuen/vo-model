/**
 * 
 */
package org.vsg.vo.model.json;

/**
 * @author ruanweibiao
 *
 */
public class ResponseObj implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ResultContent data;
	
	private boolean success;
	
	/**
	 * message somethings.
	 */
	private String message;
	
	/**
	 * code for output response data 
	 */
	private String code;
	
	/**
	 * lang for message
	 */
	private String lang;

	public ResultContent getData() {
		return data;
	}

	public void setData(ResultContent data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
