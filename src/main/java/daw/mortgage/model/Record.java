package daw.mortgage.model;

public class Record {
	// Atributes
	private Long id;
	private Float amount;
	private Float interest;
	private Integer term;
	private String frecuency;
	
	public Record() {}
	
	//Contructor with fields
	public Record(Long id, Float amount, Float interest, Integer term, String frecuency) {
		super();
		this.id = id;
		this.amount = amount;
		this.interest = interest;
		this.term = term;
		this.frecuency = frecuency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getInterest() {
		return interest;
	}

	public void setInterest(Float interest) {
		this.interest = interest;
	}
	

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getFrecuency() {
		return frecuency;
	}

	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", amount=" + amount + ", interest=" + interest + ", frecuency=" + frecuency + "]";
	}
	
	
}
