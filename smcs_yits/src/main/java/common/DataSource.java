package common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("dataSource")
@ConfigurationProperties(prefix="db.jdbc")
public class DataSource {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
    private String maxActive;
    private String maxIdle;
    private String minIdle;
    private String maxWait;
    private String initalSize;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(String maxActive) {
        this.maxActive = maxActive;
    }

    public String getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(String maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(String minIdle) {
        this.minIdle = minIdle;
    }

    public String getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(String maxWait) {
        this.maxWait = maxWait;
    }

    public String getInitalSize() {
        return initalSize;
    }

    public void setInitalSize(String initalSize) {
        this.initalSize = initalSize;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", maxActive='" + maxActive + '\'' +
                ", maxIdle='" + maxIdle + '\'' +
                ", minIdle='" + minIdle + '\'' +
                ", maxWait='" + maxWait + '\'' +
                ", initalSize='" + initalSize + '\'' +
                '}';
    }
}
