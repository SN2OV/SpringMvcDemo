package cn.sn2ov.subsurvey.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SN2OV on 2016/9/24.
 */
@Entity
public class user {
    private int id;
    private String username;
    private String password;
    private String role;
    private String name;
    private String phone;
    private String sfzh;
    private String nfc;
    private int creatorId;
    private int createdAt;
    private int updatorId;
    private int updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 255)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "sfzh", nullable = false, length = 18)
    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    @Basic
    @Column(name = "nfc", nullable = false, length = 30)
    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    @Basic
    @Column(name = "creator_id", nullable = false)
    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updator_id", nullable = false)
    public int getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(int updatorId) {
        this.updatorId = updatorId;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        user user = (cn.sn2ov.subsurvey.Model.user) o;

        if (id != user.id) return false;
        if (creatorId != user.creatorId) return false;
        if (createdAt != user.createdAt) return false;
        if (updatorId != user.updatorId) return false;
        if (updatedAt != user.updatedAt) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (sfzh != null ? !sfzh.equals(user.sfzh) : user.sfzh != null) return false;
        if (nfc != null ? !nfc.equals(user.nfc) : user.nfc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (sfzh != null ? sfzh.hashCode() : 0);
        result = 31 * result + (nfc != null ? nfc.hashCode() : 0);
        result = 31 * result + creatorId;
        result = 31 * result + createdAt;
        result = 31 * result + updatorId;
        result = 31 * result + updatedAt;
        return result;
    }
}
