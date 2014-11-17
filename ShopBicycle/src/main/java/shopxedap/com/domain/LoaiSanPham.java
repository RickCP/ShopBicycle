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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LoaiSanPham generated by hbm2java
 */
@Entity
@Table(name = "loai_san_pham")
public class LoaiSanPham implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idLoaiSP", unique = true, nullable = false)
	private Integer idLoaiSp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDM")
	private DanhMuc danhMuc;

	@Column(name = "maLoaiSP", length = 5)
	private String maLoaiSp;

	@Column(name = "tenLoaiSP", length = 50)
	private String tenLoaiSp;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loaiSanPham")
	private Set<SanPham> sanPhams = new HashSet<SanPham>(0);

	public LoaiSanPham() {
	}

	public LoaiSanPham(DanhMuc danhMuc, String maLoaiSp, String tenLoaiSp,
			Set<SanPham> sanPhams) {
		this.danhMuc = danhMuc;
		this.maLoaiSp = maLoaiSp;
		this.tenLoaiSp = tenLoaiSp;
		this.sanPhams = sanPhams;
	}

	public Integer getIdLoaiSp() {
		return this.idLoaiSp;
	}

	public void setIdLoaiSp(Integer idLoaiSp) {
		this.idLoaiSp = idLoaiSp;
	}

	public DanhMuc getDanhMuc() {
		return this.danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	public String getMaLoaiSp() {
		return this.maLoaiSp;
	}

	public void setMaLoaiSp(String maLoaiSp) {
		this.maLoaiSp = maLoaiSp;
	}

	public String getTenLoaiSp() {
		return this.tenLoaiSp;
	}

	public void setTenLoaiSp(String tenLoaiSp) {
		this.tenLoaiSp = tenLoaiSp;
	}

	public Set<SanPham> getSanPhams() {
		return this.sanPhams;
	}

	public void setSanPhams(Set<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}

}
