package org.training.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.format.annotation.DateTimeFormat;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@TypeDef(name="jsonb",typeClass=JsonBinaryType.class)
public class PersonalDetailsEntity {
	
	
	@Id
	private String candidateID;
	private String employeeID;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date dateOfJoining;
	private String religion;
    private String gender;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
	private String designation;
	private String personalEmailID;
	private String maritalStatus;
	@Temporal(TemporalType.DATE)
	private Date dateOfMarriage;
	private String bloodGroup;
	private String placeOfBirth;
	private String stateOfBirth;
	private String passportNumber;
	@Temporal(TemporalType.DATE)
	private Date passportIssueDate;
	@Temporal(TemporalType.DATE)
	private Date passportExpiryDate;
	private String passportIssuePlace;
	private String panCardNumber;
	private String aadharNumber;
	private String nationality;
	private Long personalMobileNumber;
	private String bankName;
	private String ifscCode;
	private String bankAccountNumber;
	private String nameAsPerAccount;
	private String uan;
	private String tShirtSize;
	@Type(type="jsonb")
	@Column(columnDefinition="jsonb")
	private Address permanentAddress;

	@Type(type="jsonb")
	@Column(columnDefinition="jsonb")
	private Address currentAddress;
	@Type(type="jsonb")
	@Column(columnDefinition="jsonb")
	private List<Language> languagesKnown;
	
	public PersonalDetailsEntity() {
		// TODO Auto-generated constructor stub
	}

	public PersonalDetailsEntity(String candidateID, String employeeID, String firstName, String lastName,
			Date dateOfJoining, String religion, String gender, Date dateOfBirth, String designation,
			String personalEmailID, String maritalStatus, Date dateOfMarriage, String bloodGroup, String placeOfBirth,
			String stateOfBirth, String passportNumber, Date passportIssueDate, Date passportExpiryDate,
			String passportIssuePlace, String panCardNumber, String aadharNumber, String nationality,
			Long personalMobileNumber, String bankName, String ifscCode, String bankAccountNumber,
			String nameAsPerAccount, String uanProvidentFund, String tShirtSize, Address permanentAddress,
			Address currentAddress, List<Language> languagesKnown) {
		super();
		this.candidateID = candidateID;
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.religion = religion;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.personalEmailID = personalEmailID;
		this.maritalStatus = maritalStatus;
		this.dateOfMarriage = dateOfMarriage;
		this.bloodGroup = bloodGroup;
		this.placeOfBirth = placeOfBirth;
		this.stateOfBirth = stateOfBirth;
		this.passportNumber = passportNumber;
		this.passportIssueDate = passportIssueDate;
		this.passportExpiryDate = passportExpiryDate;
		this.passportIssuePlace = passportIssuePlace;
		this.panCardNumber = panCardNumber;
		this.aadharNumber = aadharNumber;
		this.nationality = nationality;
		this.personalMobileNumber = personalMobileNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.bankAccountNumber = bankAccountNumber;
		this.nameAsPerAccount = nameAsPerAccount;
		this.uan = uanProvidentFund;
		this.tShirtSize = tShirtSize;
		this.permanentAddress = permanentAddress;
		this.currentAddress = currentAddress;
		this.languagesKnown = languagesKnown;
	}

	public String getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(String candidateID) {
		this.candidateID = candidateID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPersonalEmailID() {
		return personalEmailID;
	}

	public void setPersonalEmailID(String personalEmailID) {
		this.personalEmailID = personalEmailID;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}

	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getStateOfBirth() {
		return stateOfBirth;
	}

	public void setStateOfBirth(String stateOfBirth) {
		this.stateOfBirth = stateOfBirth;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getPassportIssueDate() {
		return passportIssueDate;
	}

	public void setPassportIssueDate(Date passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}

	public Date getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(Date passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getPassportIssuePlace() {
		return passportIssuePlace;
	}

	public void setPassportIssuePlace(String passportIssuePlace) {
		this.passportIssuePlace = passportIssuePlace;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Long getPersonalMobileNumber() {
		return personalMobileNumber;
	}

	public void setPersonalMobileNumber(Long personalMobileNumber) {
		this.personalMobileNumber = personalMobileNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getNameAsPerAccount() {
		return nameAsPerAccount;
	}

	public void setNameAsPerAccount(String nameAsPerAccount) {
		this.nameAsPerAccount = nameAsPerAccount;
	}

	public String getUanProvidentFund() {
		return uan;
	}

	public void setUanProvidentFund(String uanProvidentFund) {
		this.uan = uanProvidentFund;
	}

	public String gettShirtSize() {
		return tShirtSize;
	}

	public void settShirtSize(String tShirtSize) {
		this.tShirtSize = tShirtSize;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public List<Language> getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(List<Language> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	@Override
	public String toString() {
		return "PersonalDetailsEntity [candidateID=" + candidateID + ", employeeID=" + employeeID + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dateOfJoining=" + dateOfJoining + ", religion=" + religion
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", designation=" + designation
				+ ", personalEmailID=" + personalEmailID + ", maritalStatus=" + maritalStatus + ", dateOfMarriage="
				+ dateOfMarriage + ", bloodGroup=" + bloodGroup + ", placeOfBirth=" + placeOfBirth + ", stateOfBirth="
				+ stateOfBirth + ", passportNumber=" + passportNumber + ", passportIssueDate=" + passportIssueDate
				+ ", passportExpiryDate=" + passportExpiryDate + ", passportIssuePlace=" + passportIssuePlace
				+ ", panCardNumber=" + panCardNumber + ", aadharNumber=" + aadharNumber + ", nationality=" + nationality
				+ ", personalMobileNumber=" + personalMobileNumber + ", bankName=" + bankName + ", ifscCode=" + ifscCode
				+ ", bankAccountNumber=" + bankAccountNumber + ", nameAsPerAccount=" + nameAsPerAccount
				+ ", uanProvidentFund=" + uan + ", tShirtSize=" + tShirtSize + ", permanentAddress="
				+ permanentAddress + ", currentAddress=" + currentAddress + ", languagesKnown=" + languagesKnown + "]";
	}
	
	

}
	
		