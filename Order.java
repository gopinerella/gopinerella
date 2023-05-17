package com.amway.gi.os.pojo;

import java.util.ArrayList;
import java.util.Date;

public class Root {
    public String aboOrderId;
    public ArrayList<Address> addresses;
    public ArrayList<Adjustment> adjustments;
    public String amwaySalesEntity;
    public String bonusPeriod;
    public boolean bonusTransactionRequired;
    public String combinedOrderId;
    public String deliveryInstructions;
    public ArrayList<Fee> fees;
    public ArrayList<Refunds> refunds;
    public String fulfillmentStatus;
    public String groupOrderId;
    public boolean inventoryTransactionRequired;
    public InvoiceSalesAccount invoiceSalesAccount;
    public boolean invoiceWithConsignmentRequired;
    public String isoCurrencyCode;
    public Date orderDateTime;
    public ArrayList<OrderLine> orderLines;
    public String orderPeriod;
    public String orderPriceList;
    public String orderStatus;
    public String orderingPartyId;
    public OrderingSalesAccount orderingSalesAccount;
    public boolean paymentRequired;
    public PaymentSalesAccount paymentSalesAccount;
    public String paymentStatus;
    public ArrayList<Payment> payments;
    public String requestedCarrierCode;
    public String requestedDeliveryServiceLevel;
    public String saleCountryCode;
    public String salesChannelCode;
    public String salesOrderId;
    public ShipToSalesAccount shipToSalesAccount;
    public String storefront;
    public ArrayList<TaxDetail> taxDetails;
    public int totalABORetailProfit;
    public int totalBVAmount;
    public int totalOrderValue;
    public int totalPVAmount;
    public int totalTaxAmount;
    public String userAgent;
    public VolumeSalesAccount volumeSalesAccount;
    public String subscriptionID;
    public String cashierBatchId;
    public String orderStatusReason;
    public String shippingInstructions;
    public OrderForSalesAccount orderForSalesAccount;
    public String originalOrderId;
    public String paymentPlanCode;
    
    public String getAboOrderId() {
		return aboOrderId;
	}
	public void setAboOrderId(String aboOrderId) {
		this.aboOrderId = aboOrderId;
	}
	public ArrayList<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}
	public ArrayList<Adjustment> getAdjustments() {
		return adjustments;
	}
	public void setAdjustments(ArrayList<Adjustment> adjustments) {
		this.adjustments = adjustments;
	}
	public String getAmwaySalesEntity() {
		return amwaySalesEntity;
	}
	public void setAmwaySalesEntity(String amwaySalesEntity) {
		this.amwaySalesEntity = amwaySalesEntity;
	}
	public String getBonusPeriod() {
		return bonusPeriod;
	}
	public void setBonusPeriod(String bonusPeriod) {
		this.bonusPeriod = bonusPeriod;
	}
	public boolean isBonusTransactionRequired() {
		return bonusTransactionRequired;
	}
	public void setBonusTransactionRequired(boolean bonusTransactionRequired) {
		this.bonusTransactionRequired = bonusTransactionRequired;
	}
	public String getCombinedOrderId() {
		return combinedOrderId;
	}
	public void setCombinedOrderId(String combinedOrderId) {
		this.combinedOrderId = combinedOrderId;
	}
	public String getDeliveryInstructions() {
		return deliveryInstructions;
	}
	public void setDeliveryInstructions(String deliveryInstructions) {
		this.deliveryInstructions = deliveryInstructions;
	}
	public ArrayList<Fee> getFees() {
		return fees;
	}
	public void setFees(ArrayList<Fee> fees) {
		this.fees = fees;
	}
	public ArrayList<Refunds> getRefunds() {
		return refunds;
	}
	public void setRefunds(ArrayList<Refunds> refunds) {
		this.refunds = refunds;
	}
	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}
	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}
	public String getGroupOrderId() {
		return groupOrderId;
	}
	public void setGroupOrderId(String groupOrderId) {
		this.groupOrderId = groupOrderId;
	}
	public boolean isInventoryTransactionRequired() {
		return inventoryTransactionRequired;
	}
	public void setInventoryTransactionRequired(boolean inventoryTransactionRequired) {
		this.inventoryTransactionRequired = inventoryTransactionRequired;
	}
	public InvoiceSalesAccount getInvoiceSalesAccount() {
		return invoiceSalesAccount;
	}
	public void setInvoiceSalesAccount(InvoiceSalesAccount invoiceSalesAccount) {
		this.invoiceSalesAccount = invoiceSalesAccount;
	}
	public boolean isInvoiceWithConsignmentRequired() {
		return invoiceWithConsignmentRequired;
	}
	public void setInvoiceWithConsignmentRequired(boolean invoiceWithConsignmentRequired) {
		this.invoiceWithConsignmentRequired = invoiceWithConsignmentRequired;
	}
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
	public Date getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public ArrayList<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(ArrayList<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	public String getOrderPeriod() {
		return orderPeriod;
	}
	public void setOrderPeriod(String orderPeriod) {
		this.orderPeriod = orderPeriod;
	}
	public String getOrderPriceList() {
		return orderPriceList;
	}
	public void setOrderPriceList(String orderPriceList) {
		this.orderPriceList = orderPriceList;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderingPartyId() {
		return orderingPartyId;
	}
	public void setOrderingPartyId(String orderingPartyId) {
		this.orderingPartyId = orderingPartyId;
	}
	public OrderingSalesAccount getOrderingSalesAccount() {
		return orderingSalesAccount;
	}
	public void setOrderingSalesAccount(OrderingSalesAccount orderingSalesAccount) {
		this.orderingSalesAccount = orderingSalesAccount;
	}
	public boolean isPaymentRequired() {
		return paymentRequired;
	}
	public void setPaymentRequired(boolean paymentRequired) {
		this.paymentRequired = paymentRequired;
	}
	public PaymentSalesAccount getPaymentSalesAccount() {
		return paymentSalesAccount;
	}
	public void setPaymentSalesAccount(PaymentSalesAccount paymentSalesAccount) {
		this.paymentSalesAccount = paymentSalesAccount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public ArrayList<Payment> getPayments() {
		return payments;
	}
	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}
	public String getRequestedCarrierCode() {
		return requestedCarrierCode;
	}
	public void setRequestedCarrierCode(String requestedCarrierCode) {
		this.requestedCarrierCode = requestedCarrierCode;
	}
	public String getRequestedDeliveryServiceLevel() {
		return requestedDeliveryServiceLevel;
	}
	public void setRequestedDeliveryServiceLevel(String requestedDeliveryServiceLevel) {
		this.requestedDeliveryServiceLevel = requestedDeliveryServiceLevel;
	}
	public String getSaleCountryCode() {
		return saleCountryCode;
	}
	public void setSaleCountryCode(String saleCountryCode) {
		this.saleCountryCode = saleCountryCode;
	}
	public String getSalesChannelCode() {
		return salesChannelCode;
	}
	public void setSalesChannelCode(String salesChannelCode) {
		this.salesChannelCode = salesChannelCode;
	}
	public String getSalesOrderId() {
		return salesOrderId;
	}
	public void setSalesOrderId(String salesOrderId) {
		this.salesOrderId = salesOrderId;
	}
	public ShipToSalesAccount getShipToSalesAccount() {
		return shipToSalesAccount;
	}
	public void setShipToSalesAccount(ShipToSalesAccount shipToSalesAccount) {
		this.shipToSalesAccount = shipToSalesAccount;
	}
	public String getStorefront() {
		return storefront;
	}
	public void setStorefront(String storefront) {
		this.storefront = storefront;
	}
	public ArrayList<TaxDetail> getTaxDetails() {
		return taxDetails;
	}
	public void setTaxDetails(ArrayList<TaxDetail> taxDetails) {
		this.taxDetails = taxDetails;
	}
	public int getTotalABORetailProfit() {
		return totalABORetailProfit;
	}
	public void setTotalABORetailProfit(int totalABORetailProfit) {
		this.totalABORetailProfit = totalABORetailProfit;
	}
	public int getTotalBVAmount() {
		return totalBVAmount;
	}
	public void setTotalBVAmount(int totalBVAmount) {
		this.totalBVAmount = totalBVAmount;
	}
	public int getTotalOrderValue() {
		return totalOrderValue;
	}
	public void setTotalOrderValue(int totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}
	public int getTotalPVAmount() {
		return totalPVAmount;
	}
	public void setTotalPVAmount(int totalPVAmount) {
		this.totalPVAmount = totalPVAmount;
	}
	public int getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(int totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public VolumeSalesAccount getVolumeSalesAccount() {
		return volumeSalesAccount;
	}
	public void setVolumeSalesAccount(VolumeSalesAccount volumeSalesAccount) {
		this.volumeSalesAccount = volumeSalesAccount;
	}
	public String getSubscriptionID() {
		return subscriptionID;
	}
	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}
	public String getCashierBatchId() {
		return cashierBatchId;
	}
	public void setCashierBatchId(String cashierBatchId) {
		this.cashierBatchId = cashierBatchId;
	}
	public String getOrderStatusReason() {
		return orderStatusReason;
	}
	public void setOrderStatusReason(String orderStatusReason) {
		this.orderStatusReason = orderStatusReason;
	}
	public String getShippingInstructions() {
		return shippingInstructions;
	}
	public void setShippingInstructions(String shippingInstructions) {
		this.shippingInstructions = shippingInstructions;
	}
	public OrderForSalesAccount getOrderForSalesAccount() {
		return orderForSalesAccount;
	}
	public void setOrderForSalesAccount(OrderForSalesAccount orderForSalesAccount) {
		this.orderForSalesAccount = orderForSalesAccount;
	}
	public String getOriginalOrderId() {
		return originalOrderId;
	}
	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}
	public String getPaymentPlanCode() {
		return paymentPlanCode;
	}
	public void setPaymentPlanCode(String paymentPlanCode) {
		this.paymentPlanCode = paymentPlanCode;
	}

    
}
