package com.example.ladstestapp.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("thirdPartyUid")
    @Expose
    private String thirdPartyUid;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("stockThreshold")
    @Expose
    private Integer stockThreshold;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("vat")
    @Expose
    private Double vat;
    @SerializedName("brandName")
    @Expose
    private String brandName;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("itemViewType")
    @Expose
    private String itemViewType;
    @SerializedName("neverRecommend")
    @Expose
    private Boolean neverRecommend;
    @SerializedName("recommendationLevel")
    @Expose
    private Integer recommendationLevel;
    @SerializedName("searchKeywords")
    @Expose
    private String searchKeywords;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("itemType")
    @Expose
    private String itemType;
    @SerializedName("weight")
    @Expose
    private Double weight;
    @SerializedName("outOfStock")
    @Expose
    private Boolean outOfStock;
    @SerializedName("qtyPerUnit")
    @Expose
    private Integer qtyPerUnit;
    @SerializedName("sortOrder")
    @Expose
    private Integer sortOrder;
    @SerializedName("minQty")
    @Expose
    private Integer minQty;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("vatFree")
    @Expose
    private Boolean vatFree;
    @SerializedName("requiresLegalAge")
    @Expose
    private Boolean requiresLegalAge;
    @SerializedName("ratingEnabled")
    @Expose
    private Boolean ratingEnabled;
    @SerializedName("isPublished")
    @Expose
    private Boolean isPublished;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("commission")
    @Expose
    private Integer commission;
    @SerializedName("collection")
    @Expose
    private String collection;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThirdPartyUid() {
        return thirdPartyUid;
    }

    public void setThirdPartyUid(String thirdPartyUid) {
        this.thirdPartyUid = thirdPartyUid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockThreshold() {
        return stockThreshold;
    }

    public void setStockThreshold(Integer stockThreshold) {
        this.stockThreshold = stockThreshold;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getItemViewType() {
        return itemViewType;
    }

    public void setItemViewType(String itemViewType) {
        this.itemViewType = itemViewType;
    }

    public Boolean getNeverRecommend() {
        return neverRecommend;
    }

    public void setNeverRecommend(Boolean neverRecommend) {
        this.neverRecommend = neverRecommend;
    }

    public Integer getRecommendationLevel() {
        return recommendationLevel;
    }

    public void setRecommendationLevel(Integer recommendationLevel) {
        this.recommendationLevel = recommendationLevel;
    }

    public String getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Integer getQtyPerUnit() {
        return qtyPerUnit;
    }

    public void setQtyPerUnit(Integer qtyPerUnit) {
        this.qtyPerUnit = qtyPerUnit;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getMinQty() {
        return minQty;
    }

    public void setMinQty(Integer minQty) {
        this.minQty = minQty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getVatFree() {
        return vatFree;
    }

    public void setVatFree(Boolean vatFree) {
        this.vatFree = vatFree;
    }

    public Boolean getRequiresLegalAge() {
        return requiresLegalAge;
    }

    public void setRequiresLegalAge(Boolean requiresLegalAge) {
        this.requiresLegalAge = requiresLegalAge;
    }

    public Boolean getRatingEnabled() {
        return ratingEnabled;
    }

    public void setRatingEnabled(Boolean ratingEnabled) {
        this.ratingEnabled = ratingEnabled;
    }

    public Boolean getPublished() {
        return isPublished;
    }

    public void setPublished(Boolean published) {
        isPublished = published;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
}
