package com.itr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
@Table(name = "ITEMS")
public class Item implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_ID")
    private Integer productId;

    @Column(name = "UPC")
    private String upc;

    @Column(name = "ITEM_NAME_FROM_PROFORMA")
    private String itemNameFromProforma;

    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;

    @Column(name = "BRAND_NAME")
    private String brandName;

    @Column(name = "RETAIL_PRICE")
    private Float retailPrice;

    @Column(name = "SALE_PRICE")
    private Float salePrice;

    @Column(name = "MODEL_NUMBER")
    private String modelNumber;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "CATEGORY_FULL")
    private String categoryFull;

    @Column(name = "STANDARD_SHIP_RATE")
    private Float standardShipRate;

    @Column(name = "PALLET_SIZE")
    private Enum palletSize;  //

    @Column(name = "WEIGHT")
    private Float weight;

    @Column(name = "PALLET_ID")
    private Integer palletId;

    @Column(name = "PALLET_NAME")
    private String palletName;

    @Column(name = "SELLER_INFO")
    private String sellerInfo;

    @Column(name = "CUSTOMER_RATING")
    private Float customerRating;

    @Column(name = "CUSTOMER_REVIEWS")
    private Float customerReviews;

//    this property shows total quantity in all stores
    @Column(name = "TOTAL_QTY")
    private Integer totalQty;

    @Column(name = "VENDOR")
    private String vendor;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "SUBCATEGORY")
    private String subCategory;

    @Column(name = "DIMS_X")
    private Float dimsX;

    @Column(name = "DIMS_Y")
    private Float dimsY;

    @Column(name = "DIMS_Z")
    private Float dimsZ;

    @Column(name = "RETURN_REASON")
    private String returnReason;

//    <===========================================================================>    
//    need to create a cdi bean validation to make sure the product is not placed in a bin that is full; this bin could be in any locale
    @Column(name = "BIN_LOCATION")
    private String binLocation;

//    <===========================================================================>    
//    item to be sent to a store location cdi built as follows TXDAL75247 or OKOKC73107 ...  state + city + zipcode
    @Column(name = "STORE_LOCATION")
    private String storeLocation;
    
    @Column(name = "STORE_ADDRESS")
    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "streetAddress", column = @Column(name = "STREET_ADDRESS"))
        ,
        @AttributeOverride(name = "city", column = @Column(name = "CITY"))
        ,
        @AttributeOverride(name = "state", column = @Column(name = "STATE"))
        ,
        @AttributeOverride(name = "zipCode", column = @Column(name = "ZIPCODE"))
    })  
    private Address storeAddress;

//    <===========================================================================>    
//    create cdi to calculate total qty in store of specific locale
    @Column(name = "STORE_QTY")
    private Integer storeQty;

    @Column(name = "DATE_SHIPMENT_RECEIVED")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateShipmentReceived;

    @Column(name = "SLOT_IN_BIN_LOCATION")
    private String slotInBinLocation;

    @Column(name = "SALES_CHANNEL")
    private Enum salesChannel;

    
}
