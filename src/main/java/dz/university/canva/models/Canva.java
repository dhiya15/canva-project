package dz.university.canva.models;

import io.swagger.annotations.ApiModelProperty;

public class Canva {
	
	@ApiModelProperty(notes = "unique id and auto generated")
	private String n;
	@ApiModelProperty(notes = "string variable (we will write the description later)")
	private String agregats;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double comptesSCF;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double moisD;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double moisF;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double evolutionval;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double evolutionpro;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double cumulD;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double cumulF;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double evolutionvallast;
	@ApiModelProperty(notes = "double variable (we will write the description later)")
	private double evolutionprolast;

	public Canva(String n, String agregats, double comptesSCF, double moisD, double moisF, double evolutionval,
			double evolutionpro, double cumulD, double cumulF, double evolutionvallast, double evolutionprolast) {
		super();
		this.n = n;
		this.agregats = agregats;
		this.comptesSCF = comptesSCF;
		this.moisD = moisD;
		this.moisF = moisF;
		this.evolutionval = evolutionval;
		this.evolutionpro = evolutionpro;
		this.cumulD = cumulD;
		this.cumulF = cumulF;
		this.evolutionvallast = evolutionvallast;
		this.evolutionprolast = evolutionprolast;
	}
	

	public Canva() {
		super();
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getAgregats() {
		return agregats;
	}

	public void setAgregats(String agregats) {
		this.agregats = agregats;
	}

	public double getComptesSCF() {
		return comptesSCF;
	}

	public void setComptesSCF(double comptesSCF) {
		this.comptesSCF = comptesSCF;
	}

	public double getMoisD() {
		return moisD;
	}

	public void setMoisD(double moisD) {
		this.moisD = moisD;
	}

	public double getMoisF() {
		return moisF;
	}

	public void setMoisF(double moisF) {
		this.moisF = moisF;
	}

	public double getEvolutionval() {
		return evolutionval;
	}

	public void setEvolutionval(double evolutionval) {
		this.evolutionval = evolutionval;
	}

	public double getEvolutionpro() {
		return evolutionpro;
	}

	public void setEvolutionpro(double evolutionpro) {
		this.evolutionpro = evolutionpro;
	}

	public double getCumulD() {
		return cumulD;
	}

	public void setCumulD(double cumulD) {
		this.cumulD = cumulD;
	}

	public double getCumulF() {
		return cumulF;
	}

	public void setCumulF(double cumulF) {
		this.cumulF = cumulF;
	}

	public double getEvolutionvallast() {
		return evolutionvallast;
	}

	public void setEvolutionvallast(double evolutionvallast) {
		this.evolutionvallast = evolutionvallast;
	}

	public double getEvolutionprolast() {
		return evolutionprolast;
	}

	public void setEvolutionprolast(double evolutionprolast) {
		this.evolutionprolast = evolutionprolast;
	}
	
}
