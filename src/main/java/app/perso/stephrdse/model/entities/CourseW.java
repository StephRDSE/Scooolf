package app.perso.stephrdse.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "COURSE_WHITE")
public class CourseW {

	@Id
    @Column(name = "CW_ID")
    @SequenceGenerator(name = "courseWSeq", sequenceName = "cwSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "courseWSeq")
	private Long CwId;
	
	@Column(name ="CW_SLOPE")
	private int CwSlope;
	
	@Column(name ="CW_SSS")
	private int CwSss;
	
	@NotNull
	@Column(name = "CW_VALID_DATAS",columnDefinition = "boolean default false")
	private boolean CwValidDatas;
	
	@Column(name ="CW_H1")
	private int CwH1;
	@Column(name ="CW_H2")
	private int CwH2;
	@Column(name ="CW_H3")
	private int CwH3;
	@Column(name ="CW_H4")
	private int CwH4;
	@Column(name ="CW_H5")
	private int CwH5;
	@Column(name ="CW_H6")
	private int CwH6;
	@Column(name ="CW_H7")
	private int CwH7;
	@Column(name ="CW_H8")
	private int CwH8;
	@Column(name ="CW_H9")
	private int CwH9;
	@Column(name ="CW_H10")
	private int CwH10;
	@Column(name ="CW_H11")
	private int CwH11;
	@Column(name ="CW_H12")
	private int CwH12;
	@Column(name ="CW_H13")
	private int CwH13;
	@Column(name ="CW_H14")
	private int CwH14;
	@Column(name ="CW_H15")
	private int CwH15;
	@Column(name ="CW_H16")
	private int CwH16;
	@Column(name ="CW_H17")
	private int CwH17;
	@Column(name ="CW_H18")
	private int CwH18;
	
	public CourseW() {
		super();
	}

	public CourseW(int cwSlope, int cwSss, @NotNull boolean cwValidDatas, int cwH1, int cwH2, int cwH3, int cwH4,
			int cwH5, int cwH6, int cwH7, int cwH8, int cwH9, int cwH10, int cwH11, int cwH12, int cwH13, int cwH14,
			int cwH15, int cwH16, int cwH17, int cwH18) {
		super();
		CwSlope = cwSlope;
		CwSss = cwSss;
		CwValidDatas = cwValidDatas;
		CwH1 = cwH1;
		CwH2 = cwH2;
		CwH3 = cwH3;
		CwH4 = cwH4;
		CwH5 = cwH5;
		CwH6 = cwH6;
		CwH7 = cwH7;
		CwH8 = cwH8;
		CwH9 = cwH9;
		CwH10 = cwH10;
		CwH11 = cwH11;
		CwH12 = cwH12;
		CwH13 = cwH13;
		CwH14 = cwH14;
		CwH15 = cwH15;
		CwH16 = cwH16;
		CwH17 = cwH17;
		CwH18 = cwH18;
		
	}

	public int getCwSlope() {
		return CwSlope;
	}

	public void setCwSlope(int cwSlope) {
		CwSlope = cwSlope;
	}

	public int getCwSss() {
		return CwSss;
	}

	public void setCwSss(int cwSss) {
		CwSss = cwSss;
	}

	public boolean isCwValidDatas() {
		return CwValidDatas;
	}

	public void setCwValidDatas(boolean cwValidDatas) {
		CwValidDatas = cwValidDatas;
	}

	public int getCwH1() {
		return CwH1;
	}

	public void setCwH1(int cwH1) {
		CwH1 = cwH1;
	}

	public int getCwH2() {
		return CwH2;
	}

	public void setCwH2(int cwH2) {
		CwH2 = cwH2;
	}

	public int getCwH3() {
		return CwH3;
	}

	public void setCwH3(int cwH3) {
		CwH3 = cwH3;
	}

	public int getCwH4() {
		return CwH4;
	}

	public void setCwH4(int cwH4) {
		CwH4 = cwH4;
	}

	public int getCwH5() {
		return CwH5;
	}

	public void setCwH5(int cwH5) {
		CwH5 = cwH5;
	}

	public int getCwH6() {
		return CwH6;
	}

	public void setCwH6(int cwH6) {
		CwH6 = cwH6;
	}

	public int getCwH7() {
		return CwH7;
	}

	public void setCwH7(int cwH7) {
		CwH7 = cwH7;
	}

	public int getCwH8() {
		return CwH8;
	}

	public void setCwH8(int cwH8) {
		CwH8 = cwH8;
	}

	public int getCwH9() {
		return CwH9;
	}

	public void setCwH9(int cwH9) {
		CwH9 = cwH9;
	}

	public int getCwH10() {
		return CwH10;
	}

	public void setCwH10(int cwH10) {
		CwH10 = cwH10;
	}

	public int getCwH11() {
		return CwH11;
	}

	public void setCwH11(int cwH11) {
		CwH11 = cwH11;
	}

	public int getCwH12() {
		return CwH12;
	}

	public void setCwH12(int cwH12) {
		CwH12 = cwH12;
	}

	public int getCwH13() {
		return CwH13;
	}

	public void setCwH13(int cwH13) {
		CwH13 = cwH13;
	}

	public int getCwH14() {
		return CwH14;
	}

	public void setCwH14(int cwH14) {
		CwH14 = cwH14;
	}

	public int getCwH15() {
		return CwH15;
	}

	public void setCwH15(int cwH15) {
		CwH15 = cwH15;
	}

	public int getCwH16() {
		return CwH16;
	}

	public void setCwH16(int cwH16) {
		CwH16 = cwH16;
	}

	public int getCwH17() {
		return CwH17;
	}

	public void setCwH17(int cwH17) {
		CwH17 = cwH17;
	}

	public int getCwH18() {
		return CwH18;
	}

	public void setCwH18(int cwH18) {
		CwH18 = cwH18;
	}

	public Long getCwId() {
		return CwId;
	}
		
}
