package app.perso.stephrdse.model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


// TEST



@Entity
@Table(name = "GOLF")
public class Golf {

    @Id
    @Column(name = "GOLF_ID")
    @SequenceGenerator(name = "golfSeq", sequenceName = "gSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "golfSeq")
	private Long GId;
	
	@NotNull
	@Size(max = 60)
	@Column(name = "GOLF_NAME")
	private String GName;
	
	@Size(max = 30)	
	@Column(name = "GOLF_COUNTRY_NAME")
	private String GCountryName;

	@Size(max = 10)
	@Column(name = "GOLF_COUNTRY_CODE")
	private int GCountryCode;

	@Size(max = 50)
	@Column(name = "GOLF_CITY_NAME")	
	private String GCityName;

	@Size(max = 150)
	@Column(name = "GOLF_ADRESS")	
	private String GAdress;

	@Size(max = 12)
	@Column(name = "GOLF_PHONE_NUMBER")
	private int GPhoneNumber;

	@NotNull
	@Column(name = "GOLF_VALID_DATAS",columnDefinition = "boolean default false")
	private boolean GValidDatas;
	
	@OneToMany(mappedBy = "golf", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CoursePar> coursePar = new ArrayList<CoursePar>();

	public Golf() {
		super();
	}

	public Golf(String gName, String gCountryName, int gCountryCode, String gCityName, String gAdress,
			int gPhoneNumber, boolean gValidDatas, List<CoursePar> coursePar) {
		super();
		GName = gName;
		GCountryName = gCountryName;
		GCountryCode = gCountryCode;
		GCityName = gCityName;
		GAdress = gAdress;
		GPhoneNumber = gPhoneNumber;
		GValidDatas = gValidDatas;
		this.coursePar = coursePar;
	}

	public String getGName() {
		return GName;
	}

	public void setGName(String gName) {
		GName = gName;
	}

	public String getGCountryName() {
		return GCountryName;
	}

	public void setGCountryName(String gCountryName) {
		GCountryName = gCountryName;
	}

	public int getGCountryCode() {
		return GCountryCode;
	}

	public void setGCountryCode(int gCountryCode) {
		GCountryCode = gCountryCode;
	}

	public String getGCityName() {
		return GCityName;
	}

	public void setGCityName(String gCityName) {
		GCityName = gCityName;
	}

	public String getGAdress() {
		return GAdress;
	}

	public void setGAdress(String gAdress) {
		GAdress = gAdress;
	}

	public int getGPhoneNumber() {
		return GPhoneNumber;
	}

	public void setGPhoneNumber(int gPhoneNumber) {
		GPhoneNumber = gPhoneNumber;
	}

	public boolean isGValidDatas() {
		return GValidDatas;
	}

	public void setGValidDatas(boolean gValidDatas) {
		GValidDatas = gValidDatas;
	}

	public List<CoursePar> getCoursePar() {
		return coursePar;
	}

	public void setCoursePar(List<CoursePar> coursePar) {
		this.coursePar = coursePar;
	}

	public Long getGId() {
		return GId;
	}

	

	
	
}
