package app.perso.stephrdse.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "COURSE_HCP")
public class CourseHcp {

	@Id
	@Column(name = "CHCP_ID")
	@SequenceGenerator(name = "courseHcpSeq", sequenceName = "courseHcpSeq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "courseHcpSeq")	
	private int ChcpId;
	
	@NotNull
	@Column(name = "CHCP_VALID_DATAS",columnDefinition = "boolean default false")
	private boolean ChcpValidDatas;
	
	@Column(name = "CHCP_HOLE1")
	private int ChcpH1;
	@Column(name = "CHCP_HOLE2")
	private int ChcpH2;
	@Column(name = "CHCP_HOLE3")
	private int ChcpH3;
	@Column(name = "CHCP_HOLE4")
	private int ChcpH4;
	@Column(name = "CHCP_HOLE5")
	private int ChcpH5;
	@Column(name = "CHCP_HOLE6")
	private int ChcpH6;
	@Column(name = "CHCP_HOLE7")
	private int ChcpH7;
	@Column(name = "CHCP_HOLE8")
	private int ChcpH8;
	@Column(name = "CHCP_HOLE9")
	private int ChcpH9;
	@Column(name = "CHCP_HOLE10")
	private int ChcpH10;
	@Column(name = "CHCP_HOLE11")
	private int ChcpH11;
	@Column(name = "CHCP_HOLE12")
	private int ChcpH12;
	@Column(name = "CHCP_HOLE13")
	private int ChcpH13;
	@Column(name = "CHCP_HOLE14")
	private int ChcpH14;
	@Column(name = "CHCP_HOLE15")
	private int ChcpH15;
	@Column(name = "CHCP_HOLE16")
	private int ChcpH16;
	@Column(name = "CHCP_HOLE17")
	private int ChcpH17;
	@Column(name = "CHCP_HOLE18")
	private int ChcpH18;
	
	@OneToOne
	@JoinColumn(name = "FK_COURSE_PAR_ID")
	private CoursePar coursePar;

	public CourseHcp() {
		super();
	}

	public CourseHcp(@NotNull boolean chcpValidDatas, int chcpH1, int chcpH2, int chcpH3, int chcpH4, int chcpH5,
			int chcpH6, int chcpH7, int chcpH8, int chcpH9, int chcpH10, int chcpH11, int chcpH12, int chcpH13,
			int chcpH14, int chcpH15, int chcpH16, int chcpH17, int chcpH18, CoursePar coursePar) {
		super();
		ChcpValidDatas = chcpValidDatas;
		ChcpH1 = chcpH1;
		ChcpH2 = chcpH2;
		ChcpH3 = chcpH3;
		ChcpH4 = chcpH4;
		ChcpH5 = chcpH5;
		ChcpH6 = chcpH6;
		ChcpH7 = chcpH7;
		ChcpH8 = chcpH8;
		ChcpH9 = chcpH9;
		ChcpH10 = chcpH10;
		ChcpH11 = chcpH11;
		ChcpH12 = chcpH12;
		ChcpH13 = chcpH13;
		ChcpH14 = chcpH14;
		ChcpH15 = chcpH15;
		ChcpH16 = chcpH16;
		ChcpH17 = chcpH17;
		ChcpH18 = chcpH18;
		this.coursePar = coursePar;
	}

	public boolean isChcpValidDatas() {
		return ChcpValidDatas;
	}

	public void setChcpValidDatas(boolean chcpValidDatas) {
		ChcpValidDatas = chcpValidDatas;
	}

	public int getChcpH1() {
		return ChcpH1;
	}

	public void setChcpH1(int chcpH1) {
		ChcpH1 = chcpH1;
	}

	public int getChcpH2() {
		return ChcpH2;
	}

	public void setChcpH2(int chcpH2) {
		ChcpH2 = chcpH2;
	}

	public int getChcpH3() {
		return ChcpH3;
	}

	public void setChcpH3(int chcpH3) {
		ChcpH3 = chcpH3;
	}

	public int getChcpH4() {
		return ChcpH4;
	}

	public void setChcpH4(int chcpH4) {
		ChcpH4 = chcpH4;
	}

	public int getChcpH5() {
		return ChcpH5;
	}

	public void setChcpH5(int chcpH5) {
		ChcpH5 = chcpH5;
	}

	public int getChcpH6() {
		return ChcpH6;
	}

	public void setChcpH6(int chcpH6) {
		ChcpH6 = chcpH6;
	}

	public int getChcpH7() {
		return ChcpH7;
	}

	public void setChcpH7(int chcpH7) {
		ChcpH7 = chcpH7;
	}

	public int getChcpH8() {
		return ChcpH8;
	}

	public void setChcpH8(int chcpH8) {
		ChcpH8 = chcpH8;
	}

	public int getChcpH9() {
		return ChcpH9;
	}

	public void setChcpH9(int chcpH9) {
		ChcpH9 = chcpH9;
	}

	public int getChcpH10() {
		return ChcpH10;
	}

	public void setChcpH10(int chcpH10) {
		ChcpH10 = chcpH10;
	}

	public int getChcpH11() {
		return ChcpH11;
	}

	public void setChcpH11(int chcpH11) {
		ChcpH11 = chcpH11;
	}

	public int getChcpH12() {
		return ChcpH12;
	}

	public void setChcpH12(int chcpH12) {
		ChcpH12 = chcpH12;
	}

	public int getChcpH13() {
		return ChcpH13;
	}

	public void setChcpH13(int chcpH13) {
		ChcpH13 = chcpH13;
	}

	public int getChcpH14() {
		return ChcpH14;
	}

	public void setChcpH14(int chcpH14) {
		ChcpH14 = chcpH14;
	}

	public int getChcpH15() {
		return ChcpH15;
	}

	public void setChcpH15(int chcpH15) {
		ChcpH15 = chcpH15;
	}

	public int getChcpH16() {
		return ChcpH16;
	}

	public void setChcpH16(int chcpH16) {
		ChcpH16 = chcpH16;
	}

	public int getChcpH17() {
		return ChcpH17;
	}

	public void setChcpH17(int chcpH17) {
		ChcpH17 = chcpH17;
	}

	public int getChcpH18() {
		return ChcpH18;
	}

	public void setChcpH18(int chcpH18) {
		ChcpH18 = chcpH18;
	}

	public CoursePar getCoursePar() {
		return coursePar;
	}

	public void setCoursePar(CoursePar coursePar) {
		this.coursePar = coursePar;
	}

	public int getChcpId() {
		return ChcpId;
	}
	
	
	
	
}
