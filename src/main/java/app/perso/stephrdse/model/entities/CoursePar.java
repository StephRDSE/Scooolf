package app.perso.stephrdse.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "COURSE_PAR")
public class CoursePar {

	@Id
	@Column(name = "CP_ID")
	@SequenceGenerator(name = "courseParSeq", sequenceName = "courseParSeq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "courseParSeq")	
	private int CparId;
	
	@NotNull
	@Size(max = 30)
	@Column(name = "CP_NAME")
	private String CparName;
	 
	@Column(name = "CP_HOLES")
	private int CparHoles;
	
	@NotNull
	@Column(name = "CP_VALID_DATAS",columnDefinition = "boolean default false")
	private Boolean CparValidDatas;
	
	@Column(name = "CP_HOLE1")
	private int CparH1;
	@Column(name = "CP_HOLE2")
	private int CparH2;
	@Column(name = "CP_HOLE3")
	private int CparH3;
	@Column(name = "CP_HOLE4")
	private int CparH4;
	@Column(name = "CP_HOLE5")
	private int CparH5;
	@Column(name = "CP_HOLE6")
	private int CparH6;
	@Column(name = "CP_HOLE7")
	private int CparH7;
	@Column(name = "CP_HOLE8")
	private int CparH8;
	@Column(name = "CP_HOLE9")
	private int CparH9;
	@Column(name = "CP_HOLE10")
	private int CparH10;
	@Column(name = "CP_HOLE11")
	private int CparH11;
	@Column(name = "CP_HOLE12")
	private int CparH12;
	@Column(name = "CP_HOLE13")
	private int CparH13;
	@Column(name = "CP_HOLE14")
	private int CparH14;
	@Column(name = "CP_HOLE15")
	private int CparH15;
	@Column(name = "CP_HOLE16")
	private int CparH16;
	@Column(name = "CP_HOLE17")
	private int CparH17;
	@Column(name = "CP_HOLE18")
	private int CparH18;
	
	@ManyToOne
	@JoinColumn(name = "FK_GOLF_ID")
	private Golf golf;
	
	@OneToOne
	@JoinColumn(name = "FK_COURSE_HCP_ID")
	private CourseHcp courseHcp;
	
	@OneToOne
	@JoinColumn(name = "FK_COURSE_CW_ID")
	private CourseHcp courseCw;
	
	@OneToOne
	@JoinColumn(name = "FK_COURSE_CY_ID")
	private CourseHcp courseCy;
	
	@OneToOne
	@JoinColumn(name = "FK_COURSE_CB_ID")
	private CourseHcp courseCb;
	
	@OneToOne
	@JoinColumn(name = "FK_COURSE_CR_ID")
	private CourseHcp courseCr;

	public CoursePar() {
		super();
	}

	public CoursePar(@NotNull @Size(max = 30) String cparName, int cparHoles, @NotNull Boolean cparValidDatas,
			int cparH1, int cparH2, int cparH3, int cparH4, int cparH5, int cparH6, int cparH7, int cparH8, int cparH9,
			int cparH10, int cparH11, int cparH12, int cparH13, int cparH14, int cparH15, int cparH16, int cparH17,
			int cparH18, Golf golf, CourseHcp courseHcp, CourseHcp courseCw, CourseHcp courseCy, CourseHcp courseCb,
			CourseHcp courseCr) {
		super();
		CparName = cparName;
		CparHoles = cparHoles;
		CparValidDatas = cparValidDatas;
		CparH1 = cparH1;
		CparH2 = cparH2;
		CparH3 = cparH3;
		CparH4 = cparH4;
		CparH5 = cparH5;
		CparH6 = cparH6;
		CparH7 = cparH7;
		CparH8 = cparH8;
		CparH9 = cparH9;
		CparH10 = cparH10;
		CparH11 = cparH11;
		CparH12 = cparH12;
		CparH13 = cparH13;
		CparH14 = cparH14;
		CparH15 = cparH15;
		CparH16 = cparH16;
		CparH17 = cparH17;
		CparH18 = cparH18;
		this.golf = golf;
		this.courseHcp = courseHcp;
		this.courseCw = courseCw;
		this.courseCy = courseCy;
		this.courseCb = courseCb;
		this.courseCr = courseCr;
	}

	public String getCparName() {
		return CparName;
	}

	public void setCparName(String cparName) {
		CparName = cparName;
	}

	public int getCparHoles() {
		return CparHoles;
	}

	public void setCparHoles(int cparHoles) {
		CparHoles = cparHoles;
	}

	public Boolean getCparValidDatas() {
		return CparValidDatas;
	}

	public void setCparValidDatas(Boolean cparValidDatas) {
		CparValidDatas = cparValidDatas;
	}

	public int getCparH1() {
		return CparH1;
	}

	public void setCparH1(int cparH1) {
		CparH1 = cparH1;
	}

	public int getCparH2() {
		return CparH2;
	}

	public void setCparH2(int cparH2) {
		CparH2 = cparH2;
	}

	public int getCparH3() {
		return CparH3;
	}

	public void setCparH3(int cparH3) {
		CparH3 = cparH3;
	}

	public int getCparH4() {
		return CparH4;
	}

	public void setCparH4(int cparH4) {
		CparH4 = cparH4;
	}

	public int getCparH5() {
		return CparH5;
	}

	public void setCparH5(int cparH5) {
		CparH5 = cparH5;
	}

	public int getCparH6() {
		return CparH6;
	}

	public void setCparH6(int cparH6) {
		CparH6 = cparH6;
	}

	public int getCparH7() {
		return CparH7;
	}

	public void setCparH7(int cparH7) {
		CparH7 = cparH7;
	}

	public int getCparH8() {
		return CparH8;
	}

	public void setCparH8(int cparH8) {
		CparH8 = cparH8;
	}

	public int getCparH9() {
		return CparH9;
	}

	public void setCparH9(int cparH9) {
		CparH9 = cparH9;
	}

	public int getCparH10() {
		return CparH10;
	}

	public void setCparH10(int cparH10) {
		CparH10 = cparH10;
	}

	public int getCparH11() {
		return CparH11;
	}

	public void setCparH11(int cparH11) {
		CparH11 = cparH11;
	}

	public int getCparH12() {
		return CparH12;
	}

	public void setCparH12(int cparH12) {
		CparH12 = cparH12;
	}

	public int getCparH13() {
		return CparH13;
	}

	public void setCparH13(int cparH13) {
		CparH13 = cparH13;
	}

	public int getCparH14() {
		return CparH14;
	}

	public void setCparH14(int cparH14) {
		CparH14 = cparH14;
	}

	public int getCparH15() {
		return CparH15;
	}

	public void setCparH15(int cparH15) {
		CparH15 = cparH15;
	}

	public int getCparH16() {
		return CparH16;
	}

	public void setCparH16(int cparH16) {
		CparH16 = cparH16;
	}

	public int getCparH17() {
		return CparH17;
	}

	public void setCparH17(int cparH17) {
		CparH17 = cparH17;
	}

	public int getCparH18() {
		return CparH18;
	}

	public void setCparH18(int cparH18) {
		CparH18 = cparH18;
	}

	public Golf getGolf() {
		return golf;
	}

	public void setGolf(Golf golf) {
		this.golf = golf;
	}

	public CourseHcp getCourseHcp() {
		return courseHcp;
	}

	public void setCourseHcp(CourseHcp courseHcp) {
		this.courseHcp = courseHcp;
	}

	public CourseHcp getCourseCw() {
		return courseCw;
	}

	public void setCourseCw(CourseHcp courseCw) {
		this.courseCw = courseCw;
	}

	public CourseHcp getCourseCy() {
		return courseCy;
	}

	public void setCourseCy(CourseHcp courseCy) {
		this.courseCy = courseCy;
	}

	public CourseHcp getCourseCb() {
		return courseCb;
	}

	public void setCourseCb(CourseHcp courseCb) {
		this.courseCb = courseCb;
	}

	public CourseHcp getCourseCr() {
		return courseCr;
	}

	public void setCourseCr(CourseHcp courseCr) {
		this.courseCr = courseCr;
	}

	public int getCparId() {
		return CparId;
	}

			
}
