package com.example;

import java.util.List;

public class OpenRTBRequest {
    private String id;
    private Publisher publisher;
    private Device device;
    private User user;
    private List<Imp> imp;
    private AppInfo app;
    private Site site;
    private Integer coppa;
    private String test;
    private String at;
    private List<String> cur;
    private Regs regs;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Publisher getPublisher() { return publisher; }
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public Device getDevice() { return device; }
    public void setDevice(Device device) { this.device = device; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public List<Imp> getImp() { return imp; }
    public void setImp(List<Imp> imp) { this.imp = imp; }

    public AppInfo getApp() { return app; }
    public void setApp(AppInfo app) { this.app = app; }

    public Site getSite() { return site; }
    public void setSite(Site site) { this.site = site; }

    public String getTest() { return test; }
    public void setTest(String test) { this.test = test; }

    public String getAt() { return at; }
    public void setAt(String at) { this.at = at; }

    public List<String> getCur() { return cur; }
    public void setCur(List<String> cur) { this.cur = cur; }

    public Regs getRegs() { return regs; }
    public void setRegs(Regs regs) { this.regs = regs; }

    @Override
    public String toString() {
        return "OpenRTBRequest{" +
                "id='" + id + '\'' +
                ", publisher=" + publisher +
                ", device=" + device +
                ", user=" + user +
                ", imp=" + imp +
                ", app=" + app +
                ", site=" + site +
                ", coppa=" + coppa +
                ", test='" + test + '\'' +
                ", at='" + at + '\'' +
                ", cur=" + cur +
                ", regs=" + regs +
                '}';
    }
}

class Publisher {
    private String id;
    private String name;
    private List<String> cat;
    private String domain;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getCat() { return cat; }
    public void setCat(List<String> cat) { this.cat = cat; }

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }

    @Override
    public String toString() {
        return "Publisher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                ", domain='" + domain + '\'' +
                '}';
    }
}

class Device {
    private String ua;
    private Geo geo;
    private String ip;
    private String devicetype;
    private String make;
    private String model;
    private String os;
    private String osv;
    private String language;

    public String getUa() { return ua; }
    public void setUa(String ua) { this.ua = ua; }

    public Geo getGeo() { return geo; }
    public void setGeo(Geo geo) { this.geo = geo; }

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

    public String getDevicetype() { return devicetype; }
    public void setDevicetype(String devicetype) { this.devicetype = devicetype; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getOs() { return os; }
    public void setOs(String os) { this.os = os; }

    public String getOsv() { return osv; }
    public void setOsv(String osv) { this.osv = osv; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    @Override
    public String toString() {
        return "Device{" +
                "ua='" + ua + '\'' +
                ", geo=" + geo +
                ", ip='" + ip + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", osv='" + osv + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

class Geo {
    private Float lat;
    private Float lon;
    private String country;

    public Float getLat() { return lat; }
    public void setLat(Float lat) { this.lat = lat; }

    public Float getLon() { return lon; }
    public void setLon(Float lon) { this.lon = lon; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() {
        return "Geo{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", country='" + country + '\'' +
                '}';
    }
}

class User {
    private String id;
    private String buyeruid;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBuyeruid() { return buyeruid; }
    public void setBuyeruid(String buyeruid) { this.buyeruid = buyeruid; }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", buyeruid='" + buyeruid + '\'' +
                '}';
    }
}

class Imp {
    private String id;
    private Banner banner;
    private Video video;
    private Native nativeAd;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Banner getBanner() { return banner; }
    public void setBanner(Banner banner) { this.banner = banner; }

    public Video getVideo() { return video; }
    public void setVideo(Video video) { this.video = video; }

    public Native getNativeAd() { return nativeAd; }
    public void setNativeAd(Native nativeAd) { this.nativeAd = nativeAd; }

    @Override
    public String toString() {
        return "Imp{" +
                "id='" + id + '\'' +
                ", banner=" + banner +
                ", video=" + video +
                ", nativeAd=" + nativeAd +
                '}';
    }
}

class Banner {
    private Integer w;
    private Integer h;
    private Integer pos;

    public Integer getW() { return w; }
    public void setW(Integer w) { this.w = w; }

    public Integer getH() { return h; }
    public void setH(Integer h) { this.h = h; }

    public Integer getPos() { return pos; }
    public void setPos(Integer pos) { this.pos = pos; }

    @Override
    public String toString() {
        return "Banner{" +
                "w=" + w +
                ", h=" + h +
                ", pos=" + pos +
                '}';
    }
}

class Video {
    private List<String> mimes;
    private Integer minduration;
    private Integer maxduration;
    private List<Integer> protocols;

    public List<String> getMimes() { return mimes; }
    public void setMimes(List<String> mimes) { this.mimes = mimes; }

    public Integer getMinduration() { return minduration; }
    public void setMinduration(Integer minduration) { this.minduration = minduration; }

    public Integer getMaxduration() { return maxduration; }
    public void setMaxduration(Integer maxduration) { this.maxduration = maxduration; }

    public List<Integer> getProtocols() { return protocols; }
    public void setProtocols(List<Integer> protocols) { this.protocols = protocols; }

    @Override
    public String toString() {
        return "Video{" +
                "mimes=" + mimes +
                ", minduration=" + minduration +
                ", maxduration=" + maxduration +
                ", protocols=" + protocols +
                '}';
    }
}

class Native {
    private String request;

    public String getRequest() { return request; }
    public void setRequest(String request) { this.request = request; }

    @Override
    public String toString() {
        return "Native{" +
                "request='" + request + '\'' +
                '}';
    }
}

class AppInfo {
    private String id;
    private String name;
    private String bundle;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBundle() { return bundle; }
    public void setBundle(String bundle) { this.bundle = bundle; }

    @Override
    public String toString() {
        return "AppInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bundle='" + bundle + '\'' +
                '}';
    }
}

class Site {
    private String id;
    private String name;
    private String domain;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }

    @Override
    public String toString() {
        return "Site{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}

class Regs {
    private Integer coppa;
    private Integer gdpr;

    public Integer getCoppa() { return coppa; }
    public void setCoppa(Integer coppa) { this.coppa = coppa; }

    public Integer getGdpr() { return gdpr; }
    public void setGdpr(Integer gdpr) { this.gdpr = gdpr; }

    @Override
    public String toString() {
        return "Regs{" +
                "coppa=" + coppa +
                ", gdpr=" + gdpr +
                '}';
    }
}