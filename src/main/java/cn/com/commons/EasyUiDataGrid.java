package cn.com.commons;

import java.io.Serializable;
import java.util.List;


public class EasyUiDataGrid implements Serializable{
	/**
	 * ��ҳչʾ������123  456
	 */
	private List<?> rows;
	/**
	 * ������
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
