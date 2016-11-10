package org.vsg.vo.model.json;

import java.util.List;
import java.util.Vector;

public class ListResult<T extends java.io.Serializable> implements ResultContent {
	
	private int total;
	
	private int pageNo;
	
	private int pageSize;
	
	private List<T> root = new Vector<T>();

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getRoot() {
		return root;
	}

	public void setRoot(List<T> root) {
		this.root = root;
	}

	
	
}
