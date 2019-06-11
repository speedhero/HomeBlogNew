package com.ithome.presistence.beans;

import java.util.Date;
import javax.persistence.*;

@Table(name = "biz_file")
public class BizFile {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "storage_type")
    private String storageType;

    @Column(name = "original_file_name")
    private String originalFileName;

    private Long size;

    private String suffix;

    private Integer width;

    private Integer height;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "full_file_path")
    private String fullFilePath;

    @Column(name = "file_hash")
    private String fileHash;

    @Column(name = "upload_type")
    private String uploadType;

    @Column(name = "upload_start_time")
    private Date uploadStartTime;

    @Column(name = "upload_end_time")
    private Date uploadEndTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return storage_type
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * @param storageType
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType == null ? null : storageType.trim();
    }

    /**
     * @return original_file_name
     */
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**
     * @param originalFileName
     */
    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName == null ? null : originalFileName.trim();
    }

    /**
     * @return size
     */
    public Long getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * @param suffix
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @return file_path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * @return full_file_path
     */
    public String getFullFilePath() {
        return fullFilePath;
    }

    /**
     * @param fullFilePath
     */
    public void setFullFilePath(String fullFilePath) {
        this.fullFilePath = fullFilePath == null ? null : fullFilePath.trim();
    }

    /**
     * @return file_hash
     */
    public String getFileHash() {
        return fileHash;
    }

    /**
     * @param fileHash
     */
    public void setFileHash(String fileHash) {
        this.fileHash = fileHash == null ? null : fileHash.trim();
    }

    /**
     * @return upload_type
     */
    public String getUploadType() {
        return uploadType;
    }

    /**
     * @param uploadType
     */
    public void setUploadType(String uploadType) {
        this.uploadType = uploadType == null ? null : uploadType.trim();
    }

    /**
     * @return upload_start_time
     */
    public Date getUploadStartTime() {
        return uploadStartTime;
    }

    /**
     * @param uploadStartTime
     */
    public void setUploadStartTime(Date uploadStartTime) {
        this.uploadStartTime = uploadStartTime;
    }

    /**
     * @return upload_end_time
     */
    public Date getUploadEndTime() {
        return uploadEndTime;
    }

    /**
     * @param uploadEndTime
     */
    public void setUploadEndTime(Date uploadEndTime) {
        this.uploadEndTime = uploadEndTime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}