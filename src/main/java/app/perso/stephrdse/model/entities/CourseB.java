package app.perso.stephrdse.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="COURSE_BLUE")
public class CourseB {

	@Id
    @Column(name = "CB_ID")
    @SequenceGenerator(name = "courseBSeq", sequenceName = "cbSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "courseBSeq")
	private Long CbId;
	
	
	@Column(name ="CB_SLOPE")
	private int CbSlope;
	
	@Column(name ="CB_SSS")
	private int CbSss;
	
	@NotNull
	@Column(name = "CB_VALID_DATAS",columnDefinition = "boolean default false")
	private boolean CbValidDatas;
	
	@Column(name ="CB_H1")
	private int CbH1;
	@Column(name ="CB_H2")
	private int CbH2;
	@Column(name ="CB_H3")
	private int CbH3;
	@Column(name ="CB_H4")
	private int CbH4;
	@Column(name ="CB_H5")
	private int CbH5;
	@Column(name ="CB_H6")
	private int CbH6;
	@Column(name ="CB_H7")
	private int CbH7;
	@Column(name ="CB_H8")
	private int CbH8;
	@Column(name ="CB_H9")
	private int CbH9;
	@Column(name ="CB_H10")
	private int CbH10;
	@Column(name ="CB_H11")
	private int CbH11;
	@Column(name ="CB_H12")
	private int CbH12;
	@Column(name ="CB_H13")
	private int CbH13;
	@Column(name ="CB_H14")
	private int CbH14;
	@Column(name ="CB_H15")
	private int CbH15;
	@Column(name ="CB_H16")
	private int CbH16;
	@Column(name ="CB_H17")
	private int CbH17;
	@Column(name ="CB_H18")
	private int CbH18;

	public CourseB() {
		super();
	}

	public CourseB(int cbSlope, int cbSss, @NotNull boolean cbValidDatas, int cbH1, int cbH2, int cbH3, int cbH4,
			int cbH5, int cbH6, int cbH7, int cbH8, int cbH9, int cbH10, int cbH11, int cbH12, int cbH13, int cbH14,
			int cbH15, int cbH16, int cbH17, int cbH18) {
		super();
		CbSlope = cbSlope;
		CbSss = cbSss;
		CbValidDatas = cbValidDatas;
		CbH1 = cbH1;
		CbH2 = cbH2;
		CbH3 = cbH3;
		CbH4 = cbH4;
		CbH5 = cbH5;
		CbH6 = cbH6;
		CbH7 = cbH7;
		CbH8 = cbH8;
		CbH9 = cbH9;
		CbH10 = cbH10;
		CbH11 = cbH11;
		CbH12 = cbH12;
		CbH13 = cbH13;
		CbH14 = cbH14;
		CbH15 = cbH15;
		CbH16 = cbH16;
		CbH17 = cbH17;
		CbH18 = cbH18;
	}

	public int getCbSlope() {
		return CbSlope;
	}

	public void setCbSlope(int cbSlope) {
		CbSlope = cbSlope;
	}

	public int getCbSss() {
		return CbSss;
	}

	public void setCbSss(int cbSss) {
		CbSss = cbSss;
	}

	public boolean isCbValidDatas() {
		return CbValidDatas;
	}

	public void setCbValidDatas(boolean cbValidDatas) {
		CbValidDatas = cbValidDatas;
	}

	public int getCbH1() {
		return CbH1;
	}

	public void setCbH1(int cbH1) {
		CbH1 = cbH1;
	}

	public int getCbH2() {
		return CbH2;
	}

	public void setCbH2(int cbH2) {
		CbH2 = cbH2;
	}

	public int getCbH3() {
		return CbH3;
	}

	public void setCbH3(int cbH3) {
		CbH3 = cbH3;
	}

	public int getCbH4() {
		return CbH4;
	}

	public void setCbH4(int cbH4) {
		CbH4 = cbH4;
	}

	public int getCbH5() {
		return CbH5;
	}

	public void setCbH5(int cbH5) {
		CbH5 = cbH5;
	}

	public int getCbH6() {
		return CbH6;
	}

	public void setCbH6(int cbH6) {
		CbH6 = cbH6;
	}

	public int getCbH7() {
		return CbH7;
	}

	public void setCbH7(int cbH7) {
		CbH7 = cbH7;
	}

	public int getCbH8() {
		return CbH8;
	}

	public void setCbH8(int cbH8) {
		CbH8 = cbH8;
	}

	public int getCbH9() {
		return CbH9;
	}

	public void setCbH9(int cbH9) {
		CbH9 = cbH9;
	}

	public int getCbH10() {
		return CbH10;
	}

	public void setCbH10(int cbH10) {
		CbH10 = cbH10;
	}

	public int getCbH11() {
		return CbH11;
	}

	public void setCbH11(int cbH11) {
		CbH11 = cbH11;
	}

	public int getCbH12() {
		return CbH12;
	}

	public void setCbH12(int cbH12) {
		CbH12 = cbH12;
	}

	public int getCbH13() {
		return CbH13;
	}

	public void setCbH13(int cbH13) {
		CbH13 = cbH13;
	}

	public int getCbH14() {
		return CbH14;
	}

	public void setCbH14(int cbH14) {
		CbH14 = cbH14;
	}

	public int getCbH15() {
		return CbH15;
	}

	public void setCbH15(int cbH15) {
		CbH15 = cbH15;
	}

	public int getCbH16() {
		return CbH16;
	}

	public void setCbH16(int cbH16) {
		CbH16 = cbH16;
	}

	public int getCbH17() {
		return CbH17;
	}

	public void setCbH17(int cbH17) {
		CbH17 = cbH17;
	}

	public int getCbH18() {
		return CbH18;
	}

	public void setCbH18(int cbH18) {
		CbH18 = cbH18;
	}

	public Long getCbId() {
		return CbId;
	}
	
	
}
