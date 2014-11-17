package shopxedap.com.domain;

// Generated Nov 13, 2014 3:37:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PhieuNhap generated by hbm2java
 */
@Entity
@Table(name = "phieu_nhap")
public class PhieuNhap implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPN", unique = true, nullable = false)
	private Integer idPn;

	@Temporal(TemporalType.DATE)
	@Column(name = "tgNhap", length = 10)
	private Date tgNhap;

	@Column(name = "ghiChuPN", length = 50)
	private String ghiChuPn;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "phieuNhap")
	private Set<CtPhieuNhap> ctPhieuNhaps = new HashSet<CtPhieuNhap>(0);

	public PhieuNhap() {
	}

	public PhieuNhap(Date tgNhap, String ghiChuPn, Set<CtPhieuNhap> ctPhieuNhaps) {
		this.tgNhap = tgNhap;
		this.ghiChuPn = ghiChuPn;
		this.ctPhieuNhaps = ctPhieuNhaps;
	}

	public Integer getIdPn() {
		return this.idPn;
	}

	public void setIdPn(Integer idPn) {
		this.idPn = idPn;
	}

	public Date getTgNhap() {
		return this.tgNhap;
	}

	public void setTgNhap(Date tgNhap) {
		this.tgNhap = tgNhap;
	}

	public String getGhiChuPn() {
		return this.ghiChuPn;
	}

	public void setGhiChuPn(String ghiChuPn) {
		this.ghiChuPn = ghiChuPn;
	}

	public Set<CtPhieuNhap> getCtPhieuNhaps() {
		return this.ctPhieuNhaps;
	}

	public void setCtPhieuNhaps(Set<CtPhieuNhap> ctPhieuNhaps) {
		this.ctPhieuNhaps = ctPhieuNhaps;
	}

}
