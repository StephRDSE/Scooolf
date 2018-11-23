package app.perso.stephrdse.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="COURSE_YELLOW")
public class CourseY {

	@Id
    @Column(name = "CY_ID")
    @SequenceGenerator(name = "courseYSeq", sequenceName = "cySeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "courseYSeq")
	private Long CyId;
	
	@Column(name ="CY_SLOPE")
	private int CySlope;
	
	@Column(name ="CY_SSS")
	private int CySss;
	
	@NotNull
	@Column(name = "CY_VALID_DATAS",columnDefinition = "boolean default false")
	private boolean CyValidDatas;
	
	@Column(name ="CY_H1")
	private int CyH1;
	@Column(name ="CY_H2")
	private int CyH2;
	@Column(name ="CY_H3")
	private int CyH3;
	@Column(name ="CY_H4")
	private int CyH4;
	@Column(name ="CY_H5")
	private int CyH5;
	@Column(name ="CY_H6")
	private int CyH6;
	@Column(name ="CY_H7")
	private int CyH7;
	@Column(name ="CY_H8")
	private int CyH8;
	@Column(name ="CY_H9")
	private int CyH9;
	@Column(name ="CY_H10")
	private int CyH10;
	@Column(name ="CY_H11")
	private int CyH11;
	@Column(name ="CY_H12")
	private int CyH12;
	@Column(name ="CY_H13")
	private int CyH13;
	@Column(name ="CY_H14")
	private int CyH14;
	@Column(name ="CY_H15")
	private int CyH15;
	@Column(name ="CY_H16")
	private int CyH16;
	@Column(name ="CY_H17")
	private int CyH17;
	@Column(name ="CY_H18")
	private int CyH18;

	public CourseY() {
		super();
	}

	public CourseY(int cySlope, int cySss, @NotNull boolean cyValidDatas, int cyH1, int cyH2, int cyH3, int cyH4,
			int cyH5, int cyH6, int cyH7, int cyH8, int cyH9, int cyH10, int cyH11, int cyH12, int cyH13, int cyH14,
			int cyH15, int cyH16, int cyH17, int cyH18) {
		super();
		CySlope = cySlope;
		CySss = cySss;
		CyValidDatas = cyValidDatas;
		CyH1 = cyH1;
		CyH2 = cyH2;
		CyH3 = cyH3;
		CyH4 = cyH4;
		CyH5 = cyH5;
		CyH6 = cyH6;
		CyH7 = cyH7;
		CyH8 = cyH8;
		CyH9 = cyH9;
		CyH10 = cyH10;
		CyH11 = cyH11;
		CyH12 = cyH12;
		CyH13 = cyH13;
		CyH14 = cyH14;
		CyH15 = cyH15;
		CyH16 = cyH16;
		CyH17 = cyH17;
		CyH18 = cyH18;
	}

	public int getCySlope() {
		return CySlope;
	}

	public void setCySlope(int cySlope) {
		CySlope = cySlope;
	}

	public int getCySss() {
		return CySss;
	}

	public void setCySss(int cySss) {
		CySss = cySss;
	}

	public boolean isCyValidDatas() {
		return CyValidDatas;
	}

	public void setCyValidDatas(boolean cyValidDatas) {
		CyValidDatas = cyValidDatas;
	}

	public int getCyH1() {
		return CyH1;
	}

	public void setCyH1(int cyH1) {
		CyH1 = cyH1;
	}

	public int getCyH2() {
		return CyH2;
	}

	public void setCyH2(int cyH2) {
		CyH2 = cyH2;
	}

	public int getCyH3() {
		return CyH3;
	}

	public void setCyH3(int cyH3) {
		CyH3 = cyH3;
	}

	public int getCyH4() {
		return CyH4;
	}

	public void setCyH4(int cyH4) {
		CyH4 = cyH4;
	}

	public int getCyH5() {
		return CyH5;
	}

	public void setCyH5(int cyH5) {
		CyH5 = cyH5;
	}

	public int getCyH6() {
		return CyH6;
	}

	public void setCyH6(int cyH6) {
		CyH6 = cyH6;
	}

	public int getCyH7() {
		return CyH7;
	}

	public void setCyH7(int cyH7) {
		CyH7 = cyH7;
	}

	public int getCyH8() {
		return CyH8;
	}

	public void setCyH8(int cyH8) {
		CyH8 = cyH8;
	}

	public int getCyH9() {
		return CyH9;
	}

	public void setCyH9(int cyH9) {
		CyH9 = cyH9;
	}

	public int getCyH10() {
		return CyH10;
	}

	public void setCyH10(int cyH10) {
		CyH10 = cyH10;
	}

	public int getCyH11() {
		return CyH11;
	}

	public void setCyH11(int cyH11) {
		CyH11 = cyH11;
	}

	public int getCyH12() {
		return CyH12;
	}

	public void setCyH12(int cyH12) {
		CyH12 = cyH12;
	}

	public int getCyH13() {
		return CyH13;
	}

	public void setCyH13(int cyH13) {
		CyH13 = cyH13;
	}

	public int getCyH14() {
		return CyH14;
	}

	public void setCyH14(int cyH14) {
		CyH14 = cyH14;
	}

	public int getCyH15() {
		return CyH15;
	}

	public void setCyH15(int cyH15) {
		CyH15 = cyH15;
	}

	public int getCyH16() {
		return CyH16;
	}

	public void setCyH16(int cyH16) {
		CyH16 = cyH16;
	}

	public int getCyH17() {
		return CyH17;
	}

	public void setCyH17(int cyH17) {
		CyH17 = cyH17;
	}

	public int getCyH18() {
		return CyH18;
	}

	public void setCyH18(int cyH18) {
		CyH18 = cyH18;
	}

	public Long getCyId() {
		return CyId;
	}
		
}
