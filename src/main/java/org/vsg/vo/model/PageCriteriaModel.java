/**
 * 
 */
package org.vsg.vo.model;

import java.util.HashMap;

/**
 * @author ruanweibiao
 *
 */
public class PageCriteriaModel extends HashMap implements Criteria, IPageCriteria{


	public int getOffset() {
		int offset = 0;
		if (this.get("offset") != null) {
			offset = Integer.parseInt( this.get("offset").toString() );
		}
		return offset;
	}

	public void setOffset(int offset) {
		this.put("offset", offset);
	}

	public int getEnd() {
		int end = 0;
		if (this.get("end") != null) {
			end = Integer.parseInt( this.get("end").toString() );
		}
		return end;
	}

	public void setEnd(int end) {
		this.put("end", end);
	}
	
	
	
}
