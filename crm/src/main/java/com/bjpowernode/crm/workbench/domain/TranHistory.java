package com.bjpowernode.crm.workbench.domain;

public class TranHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.id
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.stage
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String stage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.money
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.expected_date
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String expectedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.create_time
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.create_by
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_tran_history.tran_id
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    private String tranId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.id
     *
     * @return the value of tbl_tran_history.id
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.id
     *
     * @param id the value for tbl_tran_history.id
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.stage
     *
     * @return the value of tbl_tran_history.stage
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getStage() {
        return stage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.stage
     *
     * @param stage the value for tbl_tran_history.stage
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.money
     *
     * @return the value of tbl_tran_history.money
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.money
     *
     * @param money the value for tbl_tran_history.money
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.expected_date
     *
     * @return the value of tbl_tran_history.expected_date
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getExpectedDate() {
        return expectedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.expected_date
     *
     * @param expectedDate the value for tbl_tran_history.expected_date
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate == null ? null : expectedDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.create_time
     *
     * @return the value of tbl_tran_history.create_time
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.create_time
     *
     * @param createTime the value for tbl_tran_history.create_time
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.create_by
     *
     * @return the value of tbl_tran_history.create_by
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.create_by
     *
     * @param createBy the value for tbl_tran_history.create_by
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_tran_history.tran_id
     *
     * @return the value of tbl_tran_history.tran_id
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_tran_history.tran_id
     *
     * @param tranId the value for tbl_tran_history.tran_id
     *
     * @mbg.generated Thu Apr 11 12:17:11 JST 2024
     */
    public void setTranId(String tranId) {
        this.tranId = tranId == null ? null : tranId.trim();
    }
}