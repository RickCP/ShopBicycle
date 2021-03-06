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
 * TrangThaiDh generated by hbm2java
 */
@Entity
@Table(name = "trang_thai_dh")
public class TrangThaiDh implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTTDH", unique = true, nullable = false)
	private Integer idTtdh;

	@Column(name = "maTTDH", length = 5)
	private String maTtdh;

	@Column(name = "tenTTDH", length = 50)
	private String tenTtdh;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trangThaiDh")
	private Set<DonDatHang> donDatHangs = new HashSet<DonDatHang>(0);

	public TrangThaiDh() {
	}

	public TrangThaiDh(String maTtdh, String tenTtdh,
			Set<DonDatHang> donDatHangs) {
		this.maTtdh = maTtdh;
		this.tenTtdh = tenTtdh;
		this.donDatHangs = donDatHangs;
	}

	public Integer getIdTtdh() {
		return this.idTtdh;
	}

	public void setIdTtdh(Integer idTtdh) {
		this.idTtdh = idTtdh;
	}

	public String getMaTtdh() {
		return this.maTtdh;
	}

	public void setMaTtdh(String maTtdh) {
		this.maTtdh = maTtdh;
	}

	public String getTenTtdh() {
		return this.tenTtdh;
	}

	public void setTenTtdh(String tenTtdh) {
		this.tenTtdh = tenTtdh;
	}

	public Set<DonDatHang> getDonDatHangs() {
		return this.donDatHangs;
	}

	public void setDonDatHangs(Set<DonDatHang> donDatHangs) {
		this.donDatHangs = donDatHangs;
	}

}
