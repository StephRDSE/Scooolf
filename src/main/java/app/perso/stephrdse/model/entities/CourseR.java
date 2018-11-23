package app.perso.stephrdse.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="COURSE_RED")
public class CourseR {

	@Id
    @Column(name = "CR_ID")
    @SequenceGenerator(name = "courseRSeq", sequenceName = "crSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "courseRSeq")
	private Long CrId;
	
	@Column(name ="CR_SLOPE")
	private int CrSlope;
	
	@Column(name ="CR_SSS")
	private int CrSss;
	
	@NotNull
	@Column(name = "CR_VALID_DATAS",columnDefinition = "boolean default false")
	private boolean CrValidDatas;
	
	@Column(name ="CR_H1")
	private int CrH1;
	@Column(name ="CR_H2")
	private int CrH2;
	@Column(name ="CR_H3")
	private int CrH3;
	@Column(name ="CR_H4")
	private int CrH4;
	@Column(name ="CR_H5")
	private int CrH5;
	@Column(name ="CR_H6")
	private int CrH6;
	@Column(name ="CR_H7")
	private int CrH7;
	@Column(name ="CR_H8")
	private int CrH8;
	@Column(name ="CR_H9")
	private int CrH9;
	@Column(name ="CR_H10")
	private int CrH10;
	@Column(name ="CR_H11")
	private int CrH11;
	@Column(name ="CR_H12")
	private int CrH12;
	@Column(name ="CR_H13")
	private int CrH13;
	@Column(name ="CR_H14")
	private int CrH14;
	@Column(name ="CR_H15")
	private int CrH15;
	@Column(name ="CR_H16")
	private int CrH16;
	@Column(name ="CR_H17")
	private int CrH17;
	@Column(name ="CR_H18")
	private int CrH18;

	public CourseR() {
		super();
	}

	public CourseR(int crSlope, int crSss, @NotNull boolean crValidDatas, int crH1, int crH2, int crH3, int crH4,
			int crH5, int crH6, int crH7, int crH8, int crH9, int crH10, int crH11, int crH12, int crH13, int crH14,
			int crH15, int crH16, int crH17, int crH18) {
		super();
		CrSlope = crSlope;
		CrSss = crSss;
		CrValidDatas = crValidDatas;
		CrH1 = crH1;
		CrH2 = crH2;
		CrH3 = crH3;
		CrH4 = crH4;
		CrH5 = crH5;
		CrH6 = crH6;
		CrH7 = crH7;
		CrH8 = crH8;
		CrH9 = crH9;
		CrH10 = crH10;
		CrH11 = crH11;
		CrH12 = crH12;
		CrH13 = crH13;
		CrH14 = crH14;
		CrH15 = crH15;
		CrH16 = crH16;
		CrH17 = crH17;
		CrH18 = crH18;
	}

	public int getCrSlope() {
		return CrSlope;
	}

	public void setCrSlope(int crSlope) {
		CrSlope = crSlope;
	}

	public int getCrSss() {
		return CrSss;
	}

	public void setCrSss(int crSss) {
		CrSss = crSss;
	}

	public boolean isCrValidDatas() {
		return CrValidDatas;
	}

	public void setCrValidDatas(boolean crValidDatas) {
		CrValidDatas = crValidDatas;
	}

	public int getCrH1() {
		return CrH1;
	}

	public void setCrH1(int crH1) {
		CrH1 = crH1;
	}

	public int getCrH2() {
		return CrH2;
	}

	public void setCrH2(int crH2) {
		CrH2 = crH2;
	}

	public int getCrH3() {
		return CrH3;
	}

	public void setCrH3(int crH3) {
		CrH3 = crH3;
	}

	public int getCrH4() {
		return CrH4;
	}

	public void setCrH4(int crH4) {
		CrH4 = crH4;
	}

	public int getCrH5() {
		return CrH5;
	}

	public void setCrH5(int crH5) {
		CrH5 = crH5;
	}

	public int getCrH6() {
		return CrH6;
	}

	public void setCrH6(int crH6) {
		CrH6 = crH6;
	}

	public int getCrH7() {
		return CrH7;
	}

	public void setCrH7(int crH7) {
		CrH7 = crH7;
	}

	public int getCrH8() {
		return CrH8;
	}

	public void setCrH8(int crH8) {
		CrH8 = crH8;
	}

	public int getCrH9() {
		return CrH9;
	}

	public void setCrH9(int crH9) {
		CrH9 = crH9;
	}

	public int getCrH10() {
		return CrH10;
	}

	public void setCrH10(int crH10) {
		CrH10 = crH10;
	}

	public int getCrH11() {
		return CrH11;
	}

	public void setCrH11(int crH11) {
		CrH11 = crH11;
	}

	public int getCrH12() {
		return CrH12;
	}

	public void setCrH12(int crH12) {
		CrH12 = crH12;
	}

	public int getCrH13() {
		return CrH13;
	}

	public void setCrH13(int crH13) {
		CrH13 = crH13;
	}

	public int getCrH14() {
		return CrH14;
	}

	public void setCrH14(int crH14) {
		CrH14 = crH14;
	}

	public int getCrH15() {
		return CrH15;
	}

	public void setCrH15(int crH15) {
		CrH15 = crH15;
	}

	public int getCrH16() {
		return CrH16;
	}

	public void setCrH16(int crH16) {
		CrH16 = crH16;
	}

	public int getCrH17() {
		return CrH17;
	}

	public void setCrH17(int crH17) {
		CrH17 = crH17;
	}

	public int getCrH18() {
		return CrH18;
	}

	public void setCrH18(int crH18) {
		CrH18 = crH18;
	}

	public Long getCrId() {
		return CrId;
	}
	
	
}
