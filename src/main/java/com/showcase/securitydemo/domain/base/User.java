package com.showcase.securitydemo.domain.base;

import java.util.Date;

public class User {
    private Long id;

    private String showName;

    private String email;

    private String password;

    private Long departmentId;

    private Boolean activated;

    private Date lastPasswordResetDate;

    private String createdBy;

    private Date createdDate;

    private String lastModifiedBy;

    private Date lastModifiedDate;

    private Boolean flag;

    private Boolean isApp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getIsApp() {
        return isApp;
    }

    public void setIsApp(Boolean isApp) {
        this.isApp = isApp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static User.Builder builder() {
        return new User.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private User obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new User();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.id
         *
         * @param id the value for user.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.show_name
         *
         * @param showName the value for user.show_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder showName(String showName) {
            obj.setShowName(showName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.email
         *
         * @param email the value for user.email
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder email(String email) {
            obj.setEmail(email);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.password
         *
         * @param password the value for user.password
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder password(String password) {
            obj.setPassword(password);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.department_id
         *
         * @param departmentId the value for user.department_id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder departmentId(Long departmentId) {
            obj.setDepartmentId(departmentId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.activated
         *
         * @param activated the value for user.activated
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder activated(Boolean activated) {
            obj.setActivated(activated);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.last_password_reset_date
         *
         * @param lastPasswordResetDate the value for user.last_password_reset_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder lastPasswordResetDate(Date lastPasswordResetDate) {
            obj.setLastPasswordResetDate(lastPasswordResetDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.created_by
         *
         * @param createdBy the value for user.created_by
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createdBy(String createdBy) {
            obj.setCreatedBy(createdBy);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.created_date
         *
         * @param createdDate the value for user.created_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createdDate(Date createdDate) {
            obj.setCreatedDate(createdDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.last_modified_by
         *
         * @param lastModifiedBy the value for user.last_modified_by
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder lastModifiedBy(String lastModifiedBy) {
            obj.setLastModifiedBy(lastModifiedBy);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.last_modified_date
         *
         * @param lastModifiedDate the value for user.last_modified_date
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder lastModifiedDate(Date lastModifiedDate) {
            obj.setLastModifiedDate(lastModifiedDate);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.flag
         *
         * @param flag the value for user.flag
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder flag(Boolean flag) {
            obj.setFlag(flag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column user.is_app
         *
         * @param isApp the value for user.is_app
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder isApp(Boolean isApp) {
            obj.setIsApp(isApp);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public User build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        showName("show_name"),
        email("email"),
        password("password"),
        departmentId("department_id"),
        activated("activated"),
        lastPasswordResetDate("last_password_reset_date"),
        createdBy("created_by"),
        createdDate("created_date"),
        lastModifiedBy("last_modified_by"),
        lastModifiedDate("last_modified_date"),
        flag("flag"),
        isApp("is_app");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}