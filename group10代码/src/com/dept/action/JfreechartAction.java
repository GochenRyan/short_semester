package com.dept.action;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.opensymphony.xwork2.ActionSupport;

public class JfreechartAction extends ActionSupport{
	private JFreeChart chart;
	public JFreeChart getChart() {
		return chart;
	}
@Override
public String execute() throws Exception {
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    dataset.addValue(15, "第一个比较项", "第一项");               
    dataset.addValue(25, "第一个比较项", "第二项");
   
    chart = ChartFactory.createBarChart3D("标题", "横轴", "纵轴", dataset,PlotOrientation.VERTICAL, true, true, true);
    return SUCCESS;
}
	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
}
