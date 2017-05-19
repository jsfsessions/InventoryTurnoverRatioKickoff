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

    private static final long serialVersionUID = 42L;

    @Id
    @Column(name = "ID", unique = true, nullable = false)
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

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
