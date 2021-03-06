package shopxedap.com.domain;

// Generated Nov 13, 2014 3:37:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TonKho generated by hbm2java
 */
@Entity
@Table(name = "ton_kho")
public class TonKho implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idton_kho", unique = true, nullable = false)
	private Integer idtonKho;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSP")
	private SanPham sanPham;

	@Temporal(TemporalType.DATE)
	@Column(name = "soLuongTon", length = 10)
	private Date soLuongTon;

	public TonKho() {
	}

	public TonKho(SanPham sanPham, Date soLuongTon) {
		this.sanPham = sanPham;
		this.soLuongTon = soLuongTon;
	}

	public Integer getIdtonKho() {
		return this.idtonKho;
	}

	public void setIdtonKho(Integer idtonKho) {
		this.idtonKho = idtonKho;
	}

	public SanPham getSanPham() {
		return this.sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public Date getSoLuongTon() {
		return this.soLuongTon;
	}

	public void setSoLuongTon(Date soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

}
