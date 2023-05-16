package com.amway.gi.os.pojo;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceDetail {
	public Date invoiceDate;
    public ArrayList<InvoiceAdjustment> invoiceAdjustments;
    public int invoiceLineValue;
    public String invoiceNumber;
    public int invoiceQuantity;
    public ArrayList<TaxDetail> taxDetails;
    public int totalTaxAmount;
    public int invoiceLineId;
    
    public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public ArrayList<InvoiceAdjustment> getInvoiceAdjustments() {
		return invoiceAdjustments;
	}
	public void setInvoiceAdjustments(ArrayList<InvoiceAdjustment> invoiceAdjustments) {
		this.invoiceAdjustments = invoiceAdjustments;
	}
	public int getInvoiceLineValue() {
		return invoiceLineValue;
	}
	public void setInvoiceLineValue(int invoiceLineValue) {
		this.invoiceLineValue = invoiceLineValue;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public int getInvoiceQuantity() {
		return invoiceQuantity;
	}
	public void setInvoiceQuantity(int invoiceQuantity) {
		this.invoiceQuantity = invoiceQuantity;
	}
	public ArrayList<TaxDetail> getTaxDetails() {
		return taxDetails;
	}
	public void setTaxDetails(ArrayList<TaxDetail> taxDetails) {
		this.taxDetails = taxDetails;
	}
	public int getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(int totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public int getInvoiceLineId() {
		return invoiceLineId;
	}
	public void setInvoiceLineId(int invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}
	
}
