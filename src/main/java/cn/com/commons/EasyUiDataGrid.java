package cn.com.commons;

import java.io.Serializable;
import java.util.List;


public class EasyUiDataGrid implements Serializable{
	/**
	 * 首页展示的数据123  456
	 */
	private List<?> rows;
	/**
	 * 总条数
	 */
	private Long totals;
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	public Long getTotals() {
		return totals;
	}
	public void setTotals(Long totals) {
		this.totals = totals;
	}
	@Override
	public String toString() {
		return "EasyUiDataGrid [rows=" + rows + ", totals=" + totals + "]";
	}
	
	
	
	
}
