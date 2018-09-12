/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.model;

/**
 *
 * @author ADITYA
 */
public class mst_tbl_user {
    public mst_tbl_user(){}
    private String schema,schemaid;
    
  private Long   id_user ;
  private String signfirstnameadmin ;
  private String signlastnameadmin ;
  private String signemailadmin ;
  private String signpasswordadmin ;
  private String signtlpnadmin ;
  private String  signalamatadmin;
  private String deleted ;
  private String privelage ;
  
  private String verivikasi;

    public String getVerivikasi() {
        return verivikasi;
    }

    public void setVerivikasi(String verivikasi) {
        this.verivikasi = verivikasi;
    }
  
  

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getSchemaid() {
        return schemaid;
    }

    public void setSchemaid(String schemaid) {
        this.schemaid = schemaid;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getSignfirstnameadmin() {
        return signfirstnameadmin;
    }

    public void setSignfirstnameadmin(String signfirstnameadmin) {
        this.signfirstnameadmin = signfirstnameadmin;
    }

    public String getSignlastnameadmin() {
        return signlastnameadmin;
    }

    public void setSignlastnameadmin(String signlastnameadmin) {
        this.signlastnameadmin = signlastnameadmin;
    }

    public String getSignemailadmin() {
        return signemailadmin;
    }

    public void setSignemailadmin(String signemailadmin) {
        this.signemailadmin = signemailadmin;
    }

    public String getSignpasswordadmin() {
        return signpasswordadmin;
    }

    public void setSignpasswordadmin(String signpasswordadmin) {
        this.signpasswordadmin = signpasswordadmin;
    }

    public String getSigntlpnadmin() {
        return signtlpnadmin;
    }

    public void setSigntlpnadmin(String signtlpnadmin) {
        this.signtlpnadmin = signtlpnadmin;
    }

    public String getSignalamatadmin() {
        return signalamatadmin;
    }

    public void setSignalamatadmin(String signalamatadmin) {
        this.signalamatadmin = signalamatadmin;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getPrivelage() {
        return privelage;
    }

    public void setPrivelage(String privelage) {
        this.privelage = privelage;
    }

  
}
