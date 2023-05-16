package com.amway.gi.os.pojo;

import java.util.ArrayList;
import java.util.Date;

public class OrderLine {

	public Date actualDeliveryDate;
    public Date actualShipDate;
    public int allocatedQuantity;
    public int backorderedQuantity;
    public String baseItemId;
    public String bundleItemId;
    public int cancelledQuantity;
    public String demandLocation;
    public Date estimatedDeliveryDate;
    public Date estimatedShipDate;
    public ArrayList<Fee> fees;
    public String fulfillmentType;
    public ArrayList<Fulfillment> fulfillments;
    public ArrayList<InvoiceDetail> invoiceDetails;
    public int itemAboPrice;
    public int itemBV;
    public String itemDescription;
    public int itemListPrice;
    public int itemPV;
    public int itemSuggestedRetailPrice;
    public String itemType;
    public Date lastUpdateDate;
    public int lineABOProfitTotalAmount;
    public ArrayList<LineAdjustment> lineAdjustments;
    public int lineBVAmount;
    public int linePVAmount;
    public int linePrice;
    public String lineStatus;
    public ArrayList<LineTaxDetail> lineTaxDetails;
    public int lineTaxTotalAmount;
    public String lineUnitOfMeasure;
    public int orderLineId;
    public int orderLineTotal;
    public int orderedQuantity;
    public String originalOrderId;
    public int pendingQuantity;
    public String pickupAddressReference;
    public Date requestedDeliveryDate;
    public int returnedQuantity;
    public String shipAddressReference;
    public int shippedQuantity;
    public String taxExemptId;
    public boolean taxNotRequired;
    public int unallocatedQuantity;
    public String orderLineStatusReason;
    public String bundleQuantity;
    
    
	public Date getActualDeliveryDate() {
		return actualDeliveryDate;
	}
	public void setActualDeliveryDate(Date actualDeliveryDate) {
		this.actualDeliveryDate = actualDeliveryDate;
	}
	public Date getActualShipDate() {
		return actualShipDate;
	}
	public void setActualShipDate(Date actualShipDate) {
		this.actualShipDate = actualShipDate;
	}
	public int getAllocatedQuantity() {
		return allocatedQuantity;
	}
	public void setAllocatedQuantity(int allocatedQuantity) {
		this.allocatedQuantity = allocatedQuantity;
	}
	public int getBackorderedQuantity() {
		return backorderedQuantity;
	}
	public void setBackorderedQuantity(int backorderedQuantity) {
		this.backorderedQuantity = backorderedQuantity;
	}
	public String getBaseItemId() {
		return baseItemId;
	}
	public void setBaseItemId(String baseItemId) {
		this.baseItemId = baseItemId;
	}
	public String getBundleItemId() {
		return bundleItemId;
	}
	public void setBundleItemId(String bundleItemId) {
		this.bundleItemId = bundleItemId;
	}
	public int getCancelledQuantity() {
		return cancelledQuantity;
	}
	public void setCancelledQuantity(int cancelledQuantity) {
		this.cancelledQuantity = cancelledQuantity;
	}
	public String getDemandLocation() {
		return demandLocation;
	}
	public void setDemandLocation(String demandLocation) {
		this.demandLocation = demandLocation;
	}
	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}
	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}
	public Date getEstimatedShipDate() {
		return estimatedShipDate;
	}
	public void setEstimatedShipDate(Date estimatedShipDate) {
		this.estimatedShipDate = estimatedShipDate;
	}
	public ArrayList<Fee> getFees() {
		return fees;
	}
	public void setFees(ArrayList<Fee> fees) {
		this.fees = fees;
	}
	public String getFulfillmentType() {
		return fulfillmentType;
	}
	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}
	public ArrayList<Fulfillment> getFulfillments() {
		return fulfillments;
	}
	public void setFulfillments(ArrayList<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
	}
	public ArrayList<InvoiceDetail> getInvoiceDetails() {
		return invoiceDetails;
	}
	public void setInvoiceDetails(ArrayList<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
	public int getItemAboPrice() {
		return itemAboPrice;
	}
	public void setItemAboPrice(int itemAboPrice) {
		this.itemAboPrice = itemAboPrice;
	}
	public int getItemBV() {
		return itemBV;
	}
	public void setItemBV(int itemBV) {
		this.itemBV = itemBV;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getItemListPrice() {
		return itemListPrice;
	}
	public void setItemListPrice(int itemListPrice) {
		this.itemListPrice = itemListPrice;
	}
	public int getItemPV() {
		return itemPV;
	}
	public void setItemPV(int itemPV) {
		this.itemPV = itemPV;
	}
	public int getItemSuggestedRetailPrice() {
		return itemSuggestedRetailPrice;
	}
	public void setItemSuggestedRetailPrice(int itemSuggestedRetailPrice) {
		this.itemSuggestedRetailPrice = itemSuggestedRetailPrice;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public int getLineABOProfitTotalAmount() {
		return lineABOProfitTotalAmount;
	}
	public void setLineABOProfitTotalAmount(int lineABOProfitTotalAmount) {
		this.lineABOProfitTotalAmount = lineABOProfitTotalAmount;
	}
	public ArrayList<LineAdjustment> getLineAdjustments() {
		return lineAdjustments;
	}
	public void setLineAdjustments(ArrayList<LineAdjustment> lineAdjustments) {
		this.lineAdjustments = lineAdjustments;
	}
	public int getLineBVAmount() {
		return lineBVAmount;
	}
	public void setLineBVAmount(int lineBVAmount) {
		this.lineBVAmount = lineBVAmount;
	}
	public int getLinePVAmount() {
		return linePVAmount;
	}
	public void setLinePVAmount(int linePVAmount) {
		this.linePVAmount = linePVAmount;
	}
	public int getLinePrice() {
		return linePrice;
	}
	public void setLinePrice(int linePrice) {
		this.linePrice = linePrice;
	}
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}
	public ArrayList<LineTaxDetail> getLineTaxDetails() {
		return lineTaxDetails;
	}
	public void setLineTaxDetails(ArrayList<LineTaxDetail> lineTaxDetails) {
		this.lineTaxDetails = lineTaxDetails;
	}
	public int getLineTaxTotalAmount() {
		return lineTaxTotalAmount;
	}
	public void setLineTaxTotalAmount(int lineTaxTotalAmount) {
		this.lineTaxTotalAmount = lineTaxTotalAmount;
	}
	public String getLineUnitOfMeasure() {
		return lineUnitOfMeasure;
	}
	public void setLineUnitOfMeasure(String lineUnitOfMeasure) {
		this.lineUnitOfMeasure = lineUnitOfMeasure;
	}
	public int getOrderLineId() {
		return orderLineId;
	}
	public void setOrderLineId(int orderLineId) {
		this.orderLineId = orderLineId;
	}
	public int getOrderLineTotal() {
		return orderLineTotal;
	}
	public void setOrderLineTotal(int orderLineTotal) {
		this.orderLineTotal = orderLineTotal;
	}
	public int getOrderedQuantity() {
		return orderedQuantity;
	}
	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}
	public String getOriginalOrderId() {
		return originalOrderId;
	}
	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}
	public int getPendingQuantity() {
		return pendingQuantity;
	}
	public void setPendingQuantity(int pendingQuantity) {
		this.pendingQuantity = pendingQuantity;
	}
	public String getPickupAddressReference() {
		return pickupAddressReference;
	}
	public void setPickupAddressReference(String pickupAddressReference) {
		this.pickupAddressReference = pickupAddressReference;
	}
	public Date getRequestedDeliveryDate() {
		return requestedDeliveryDate;
	}
	public void setRequestedDeliveryDate(Date requestedDeliveryDate) {
		this.requestedDeliveryDate = requestedDeliveryDate;
	}
	public int getReturnedQuantity() {
		return returnedQuantity;
	}
	public void setReturnedQuantity(int returnedQuantity) {
		this.returnedQuantity = returnedQuantity;
	}
	public String getShipAddressReference() {
		return shipAddressReference;
	}
	public void setShipAddressReference(String shipAddressReference) {
		this.shipAddressReference = shipAddressReference;
	}
	public int getShippedQuantity() {
		return shippedQuantity;
	}
	public void setShippedQuantity(int shippedQuantity) {
		this.shippedQuantity = shippedQuantity;
	}
	public String getTaxExemptId() {
		return taxExemptId;
	}
	public void setTaxExemptId(String taxExemptId) {
		this.taxExemptId = taxExemptId;
	}
	public boolean isTaxNotRequired() {
		return taxNotRequired;
	}
	public void setTaxNotRequired(boolean taxNotRequired) {
		this.taxNotRequired = taxNotRequired;
	}
	public int getUnallocatedQuantity() {
		return unallocatedQuantity;
	}
	public void setUnallocatedQuantity(int unallocatedQuantity) {
		this.unallocatedQuantity = unallocatedQuantity;
	}
	public String getOrderLineStatusReason() {
		return orderLineStatusReason;
	}
	public void setOrderLineStatusReason(String orderLineStatusReason) {
		this.orderLineStatusReason = orderLineStatusReason;
	}
	public String getBundleQuantity() {
		return bundleQuantity;
	}
	public void setBundleQuantity(String bundleQuantity) {
		this.bundleQuantity = bundleQuantity;
	}
    
    
}
