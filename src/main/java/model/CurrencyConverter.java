/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */
package model;

import java.text.DecimalFormat;

/**
 * @author abbyb
 *
 */
public class CurrencyConverter {
	private double usd;
	private double cad;
	private double euro;
	
	private final double CAD_CONVERSION_RATE = 1.3447542;
	private final double EURO_CONVERSION_RATE = 0.93221868;
	
	DecimalFormat df = new DecimalFormat(".00");
	
	public CurrencyConverter() {
		super();
	}
	
	public CurrencyConverter(double usd) {
		super();
		this.usd = usd;
	}
	
	/**
	 * @return the usd
	 */
	public double getUsd() {
		return usd;
	}
	
	/**
	 * @param usd the usd to set
	 */
	public void setUsd(double usd) {
		this.usd = usd;
	}
	
	/**
	 * @return the cad
	 */
	public double getCad() {
		return cad;
	}
	/**
	 * @param cad the cad to set
	 */
	public void setCad(double cad) {
		this.cad = cad;
	}
	/**
	 * @return the euro
	 */
	public double getEuro() {
		return euro;
	}
	/**
	 * @param euro the euro to set
	 */
	public void setEuro(double euro) {
		this.euro = euro;
	}
	
	public String convertUSDtoCAD(double usd) {
		double cadConversion = (usd * CAD_CONVERSION_RATE);
		return df.format(cadConversion);
	}
	
	public String convertUSDtoEURO(double usd) {
		double euroConversion = (usd * EURO_CONVERSION_RATE);
		return df.format(euroConversion);
	}
	
	@Override
	public String toString() {
		return "CurrencyConverter [usd=" + usd + ", cad=" + cad + ", euro=" + euro + "]";
	}
	
}
