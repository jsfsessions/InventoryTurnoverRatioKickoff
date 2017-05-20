package com.itr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
@Table(name = "items")
public class Item implements Serializable {

    private static final long serialVersionUID = 42L;

    @Id
    @Column(name = "ID", updatable = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "upc")
    private String upc;

    @Column(name = "item_name_from_proforma")
    private String itemNameFromProforma;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "retail_price")
    private Float retailPrice;

    @Column(name = "sale_price")
    private Float salePrice;

    @Column(name = "model_number")
    private String modelNumber;

    @Column(name = "color")
    private String color;

    @Column(name = "category_full")
    private String categoryFull;

    @Column(name = "standard_ship_rate")
    private Float standardShipRate;

    @Column(name = "pallet_size")
    private Enum palletSize;  //

    @Column(name = "weight")
    private Float weight;

    @Column(name = "pallet_id")
    private Integer palletId;

    @Column(name = "pallet_name")
    private String palletName;

    @Column(name = "seller_info")
    private String sellerInfo;

    @Column(name = "customer_rating")
    private Float customerRating;

    @Column(name = "customer_reviews")
    private Float customerReviews;

//    this property shows total quantity in all stores
    @Column(name = "total_qty")
    private Integer totalQty;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "department")
    private String department;

    @Column(name = "subcategory")
    private String subCategory;

    @Column(name = "dims_x")
    private Float dimsX;

    @Column(name = "dims_y")
    private Float dimsY;

    @Column(name = "dims_z")
    private Float dimsZ;

    @Column(name = "return_reason")
    private String returnReason;

//    <===========================================================================>    
//    need to create a cdi bean validation to make sure the product is not placed in a bin that is full; this bin could be in any locale
    @Column(name = "bin_location")
    private String binLocation;

//    <===========================================================================>    
//    item to be sent to a store location cdi built as follows TXDAL75247 or OKOKC73107 ...  state + city + zipcode
    @Column(name = "store_location")
    private String storeLocation;

    @Column(name = "store_address")

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "streetAddress", column = @Column(name = "street_address"))
        ,
        @AttributeOverride(name = "city", column = @Column(name = "city"))
        ,
        @AttributeOverride(name = "state", column = @Column(name = "state"))
        ,
        @AttributeOverride(name = "zipCode", column = @Column(name = "zipcode"))
    })
    private Address storeAddress;

//    <===========================================================================>    
//    create cdi to calculate total qty in store of specific locale
    @Column(name = "store_qty")
    private Integer storeQty;

    @Column(name = "date_shipment_received")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateShipmentReceived;

    @Column(name = "slot_in_bin_location")
    private String slotInBinLocation;

    @Column(name = "sales_channel")
    private Enum salesChannel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getItemNameFromProforma() {
        return itemNameFromProforma;
    }

    public void setItemNameFromProforma(String itemNameFromProforma) {
        this.itemNameFromProforma = itemNameFromProforma;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategoryFull() {
        return categoryFull;
    }

    public void setCategoryFull(String categoryFull) {
        this.categoryFull = categoryFull;
    }

    public Float getStandardShipRate() {
        return standardShipRate;
    }

    public void setStandardShipRate(Float standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    public Enum getPalletSize() {
        return palletSize;
    }

    public void setPalletSize(Enum palletSize) {
        this.palletSize = palletSize;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getPalletId() {
        return palletId;
    }

    public void setPalletId(Integer palletId) {
        this.palletId = palletId;
    }

    public String getPalletName() {
        return palletName;
    }

    public void setPalletName(String palletName) {
        this.palletName = palletName;
    }

    public String getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    public Float getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(Float customerRating) {
        this.customerRating = customerRating;
    }

    public Float getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(Float customerReviews) {
        this.customerReviews = customerReviews;
    }

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Float getDimsX() {
        return dimsX;
    }

    public void setDimsX(Float dimsX) {
        this.dimsX = dimsX;
    }

    public Float getDimsY() {
        return dimsY;
    }

    public void setDimsY(Float dimsY) {
        this.dimsY = dimsY;
    }

    public Float getDimsZ() {
        return dimsZ;
    }

    public void setDimsZ(Float dimsZ) {
        this.dimsZ = dimsZ;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getBinLocation() {
        return binLocation;
    }

    public void setBinLocation(String binLocation) {
        this.binLocation = binLocation;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public Address getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(Address storeAddress) {
        this.storeAddress = storeAddress;
    }

    public Integer getStoreQty() {
        return storeQty;
    }

    public void setStoreQty(Integer storeQty) {
        this.storeQty = storeQty;
    }

    public Date getDateShipmentReceived() {
        return dateShipmentReceived;
    }

    public void setDateShipmentReceived(Date dateShipmentReceived) {
        this.dateShipmentReceived = dateShipmentReceived;
    }

    public String getSlotInBinLocation() {
        return slotInBinLocation;
    }

    public void setSlotInBinLocation(String slotInBinLocation) {
        this.slotInBinLocation = slotInBinLocation;
    }

    public Enum getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(Enum salesChannel) {
        this.salesChannel = salesChannel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.productId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.productId, other.productId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", productId=" + productId + ", upc=" + upc + ", itemNameFromProforma=" + itemNameFromProforma + ", itemDescription=" + itemDescription + ", brandName=" + brandName + ", retailPrice=" + retailPrice + ", salePrice=" + salePrice + ", modelNumber=" + modelNumber + ", color=" + color + ", categoryFull=" + categoryFull + ", standardShipRate=" + standardShipRate + ", palletSize=" + palletSize + ", weight=" + weight + ", palletId=" + palletId + ", palletName=" + palletName + ", sellerInfo=" + sellerInfo + ", customerRating=" + customerRating + ", customerReviews=" + customerReviews + ", totalQty=" + totalQty + ", vendor=" + vendor + ", department=" + department + ", subCategory=" + subCategory + ", dimsX=" + dimsX + ", dimsY=" + dimsY + ", dimsZ=" + dimsZ + ", returnReason=" + returnReason + ", binLocation=" + binLocation + ", storeLocation=" + storeLocation + ", storeAddress=" + storeAddress + ", storeQty=" + storeQty + ", dateShipmentReceived=" + dateShipmentReceived + ", slotInBinLocation=" + slotInBinLocation + ", salesChannel=" + salesChannel + '}';
    }
        
}
