package shopxedap.com.domain;

// Generated Nov 13, 2014 3:37:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DanhMuc generated by hbm2java
 */
@Entity
@Table(name = "danh_muc")
public class DanhMuc implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idDM", unique = true, nullable = false)
	private Integer idDm;

	@Column(name = "maDM", length = 5)
	private String maDm;

	@Column(name = "tenDM", length = 50)
	private String tenDm;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "danhMuc")
	private Set<LoaiSanPham> loaiSanPhams = new HashSet<LoaiSanPham>(0);

	public DanhMuc() {
	}

	public DanhMuc(String maDm, String tenDm, Set<LoaiSanPham> loaiSanPhams) {
		this.maDm = maDm;
		this.tenDm = tenDm;
		this.loaiSanPhams = loaiSanPhams;
	}

	public Integer getIdDm() {
		return this.idDm;
	}

	public void setIdDm(Integer idDm) {
		this.idDm = idDm;
	}

	public String getMaDm() {
		return this.maDm;
	}

	public void setMaDm(String maDm) {
		this.maDm = maDm;
	}

	public String getTenDm() {
		return this.tenDm;
	}

	public void setTenDm(String tenDm) {
		this.tenDm = tenDm;
	}

	public Set<LoaiSanPham> getLoaiSanPhams() {
		return this.loaiSanPhams;
	}

	public void setLoaiSanPhams(Set<LoaiSanPham> loaiSanPhams) {
		this.loaiSanPhams = loaiSanPhams;
	}

}