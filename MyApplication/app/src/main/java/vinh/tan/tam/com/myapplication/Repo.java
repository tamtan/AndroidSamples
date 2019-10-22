package vinh.tan.tam.com.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Repo {

    @SerializedName("property_id")
    @Expose
    private String propertyId;
    @SerializedName("prop_status")
    @Expose
    private String propStatus;
    @SerializedName("listing_id")
    @Expose
    private String listingId;
    @SerializedName("prop_type")
    @Expose
    private String propType;
    @SerializedName("list_date")
    @Expose
    private String listDate;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;

    @SerializedName("year_built")
    @Expose
    private Integer yearBuilt;
    @SerializedName("listing_status")
    @Expose
    private String listingStatus;
    @SerializedName("beds")
    @Expose
    private Integer beds;
    @SerializedName("baths_full")
    @Expose
    private Integer bathsFull;
    @SerializedName("garage")
    @Expose
    private String garage;
    @SerializedName("feature_tags")
    @Expose
    private List<String> featureTags = null;

    @SerializedName("tax_history")
    @Expose
    private List<Object> taxHistory = null;

    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("rdc_web_url")
    @Expose
    private String rdcWebUrl;
    @SerializedName("rdc_app_url")
    @Expose
    private String rdcAppUrl;
    @SerializedName("baths")
    @Expose
    private Integer baths;
    @SerializedName("photo_count")
    @Expose
    private Integer photoCount;

    @SerializedName("data_source_name")
    @Expose
    private String dataSourceName;
    @SerializedName("page_no")
    @Expose
    private Integer pageNo;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("list_tracking")
    @Expose
    private String listTracking;


    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropStatus() {
        return propStatus;
    }

    public void setPropStatus(String propStatus) {
        this.propStatus = propStatus;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getPropType() {
        return propType;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public String getListDate() {
        return listDate;
    }

    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBathsFull() {
        return bathsFull;
    }

    public void setBathsFull(Integer bathsFull) {
        this.bathsFull = bathsFull;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public List<String> getFeatureTags() {
        return featureTags;
    }

    public void setFeatureTags(List<String> featureTags) {
        this.featureTags = featureTags;
    }


    public List<Object> getTaxHistory() {
        return taxHistory;
    }

    public void setTaxHistory(List<Object> taxHistory) {
        this.taxHistory = taxHistory;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRdcWebUrl() {
        return rdcWebUrl;
    }

    public void setRdcWebUrl(String rdcWebUrl) {
        this.rdcWebUrl = rdcWebUrl;
    }

    public String getRdcAppUrl() {
        return rdcAppUrl;
    }

    public void setRdcAppUrl(String rdcAppUrl) {
        this.rdcAppUrl = rdcAppUrl;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getListTracking() {
        return listTracking;
    }

    public void setListTracking(String listTracking) {
        this.listTracking = listTracking;
    }


}